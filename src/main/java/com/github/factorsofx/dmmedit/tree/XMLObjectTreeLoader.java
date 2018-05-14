package com.github.factorsofx.dmmedit.tree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.*;
import java.util.*;

/**
 * Loads the atom tree from the XML outputted by {@code DreamMaker -o}
 */
public class XMLObjectTreeLoader implements ObjectTreeLoader
{
    private File xmlFile;

    private static XPathExpression varExpr;
    private static XPathExpression varValExpr;
    private static XPathExpression subtypeExpr;

    private static final Logger log = LoggerFactory.getLogger(XMLObjectTreeLoader.class);

    static
    {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xPath = xPathFactory.newXPath();

        try
        {
            varExpr = xPath.compile("var");
            varValExpr = xPath.compile("val[text()]");
            subtypeExpr = xPath.compile("object | obj | area | mob | turf");
        }
        catch(XPathExpressionException e)
        {
            throw new RuntimeException(e); // Fail if these don't compile for whatever reason
        }
    }

    public XMLObjectTreeLoader(File xmlFile)
    {
        this.xmlFile = xmlFile;
    }

    public AtomTree load() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException
    {
        log.info("Beginning XML read and parse");

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        Document doc = builder.parse(new InputSource(new ValidXMLCharsReader(new InputStreamReader(new FileInputStream(xmlFile), "UTF-8"))));

        log.info("Object tree read and parsed, beginning node transformation");

        // The code that follows un-fucks the DM object tree
        // Present:
        // dm
        //   datum
        //   obj
        //   mob
        //   atom
        //   area
        //   turf

        // Desired:
        // datum
        //   atom
        //     movable
        //       mob
        //       obj
        //     turf
        //     area

        Element dmNode = doc.getDocumentElement();

        IterableNodeList rootNodes = new IterableNodeList((NodeList)subtypeExpr.evaluate(dmNode, XPathConstants.NODESET));

        Map<String, ObjectNode> nodeMap = new HashMap<>();

        for(Node xmlNode : rootNodes)
        {
            ObjectNode objectNode = recursivelyGenerateNode(xmlNode);
            nodeMap.put(objectNode.getName(), objectNode);
        }

        ObjectNode datum   = nodeMap.get("datum");
        ObjectNode atom    = nodeMap.get("atom");
        ObjectNode movable = atom.getSubtype("movable");
        ObjectNode mob     = nodeMap.get("mob");
        ObjectNode obj     = nodeMap.get("obj");
        ObjectNode turf    = nodeMap.get("turf");
        ObjectNode area    = nodeMap.get("area");

        atom.parent(datum);

        mob.parent(movable);
        obj.parent(movable);

        turf.parent(atom);
        area.parent(atom);

        return new AtomTree(datum);
    }

    private static ObjectNode recursivelyGenerateNode(Node xmlNode) throws XPathExpressionException
    {
        ObjectNode thisNode = collectNodeShallow(xmlNode);
        for(Node childXmlNode : new IterableNodeList((NodeList)subtypeExpr.evaluate(xmlNode, XPathConstants.NODESET)))
        {
            ObjectNode childNode = recursivelyGenerateNode(childXmlNode);
            childNode.parent(thisNode);
        }

        return thisNode;
    }

    private static ObjectNode collectNodeShallow(Node xmlNode) throws XPathExpressionException
    {
        String nodeName = xmlNode.getFirstChild().getTextContent();

        ObjectNode node = new ObjectNode(nodeName);

        IterableNodeList varNodeList = new IterableNodeList((NodeList)varExpr.evaluate(xmlNode, XPathConstants.NODESET));

        for(Node varNode : varNodeList)
        {
            String varName = varNode.getFirstChild().getTextContent();
            String varVal = (String) varValExpr.evaluate(varNode, XPathConstants.STRING);
            node.addVar(new Var(varName, varVal));
        }

        return node;
    }

    private static Var getVarFromNode(Node varNode)
    {
        return null;
    }
}

class IterableNodeList implements Iterable<Node>
{
    private NodeList proxy;

    IterableNodeList(NodeList proxy)
    {
        this.proxy = proxy;
    }

    @Override
    public Iterator<Node> iterator()
    {
        return new Iterator<Node>()
        {
            private int pos = 0;
            private int len = proxy.getLength();

            @Override
            public boolean hasNext()
            {
                return pos < len;
            }

            @Override
            public Node next()
            {
                return proxy.item(pos++);
            }
        };
    }
}

// Whoever wrote the name of the syndicate drone on goonstation, you suck, this was a pain in the ass.
class ValidXMLCharsReader extends FilterReader
{
    ValidXMLCharsReader(Reader in)
    {
        super(in);
    }

    @Override
    public int read() throws IOException
    {
        int res = super.read();

        if(res == -1) return -1;

        if( !( (res >= '\u0020' && res <= '\uD7FF') || res == '\n' || res == '\t' || res == '\r' || (res >= '\uE000' && res <= '\uFFFD') ) )
        {
            res = '\uFFFD'; // Unknown symbol
        }
        return res;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException
    {
        int res = super.read(cbuf, off, len);
        validateCBuf(cbuf);
        return res;
    }

    private void validateCBuf(char[] cbuf)
    {
        for(int i = 0; i < cbuf.length; i++)
        {
            if( !( (cbuf[i] >= '\u0020' && cbuf[i] <= '\uD7FF') || cbuf[i] == '\n' || cbuf[i] == '\t' || cbuf[i] == '\r' || (cbuf[i] >= '\uE000' && cbuf[i] <= '\uFFFD') ) )
            {
                cbuf[i] = '\uFFFD'; // Unknown symbol
            }
        }
    }
}