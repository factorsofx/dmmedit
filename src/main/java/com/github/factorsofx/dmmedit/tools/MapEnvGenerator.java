package com.github.factorsofx.dmmedit.tools;

import com.github.factorsofx.dmmedit.tree.XMLObjectTreeLoader;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import java.io.File;
import java.io.IOException;

public class MapEnvGenerator
{
    public static void main(String... args) throws IOException, SAXException, ParserConfigurationException, XPathExpressionException
    {
        /*String xml = FileUtils.readFileToString(new File(args[0]), Charsets.UTF_8);

        System.out.println("File read");

        Pattern badXMLPattern = Pattern.compile("[\u0009\u0020-\uD7FF\uE000-\uFFFD\ud800\udc00-\udbff\udfff]");
        String goodXml = badXMLPattern.matcher(xml).replaceAll("");*/

        XMLObjectTreeLoader loader = new XMLObjectTreeLoader(new File(args[0]));
        loader.load();
    }
}
