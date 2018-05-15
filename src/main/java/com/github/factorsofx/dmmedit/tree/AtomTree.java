package com.github.factorsofx.dmmedit.tree;

import java.util.Arrays;

/**
 * Wrapper class for {@link ObjectNode}s with convenience methods to get types and such.
 */
public class AtomTree
{
    private ObjectNode datum;

    private ObjectNode atom;
    private ObjectNode area;
    private ObjectNode turf;
    private ObjectNode obj;
    private ObjectNode mob;

    AtomTree(ObjectNode datum)
    {
        if(!datum.getName().equals("datum"))
        {
            throw new IllegalArgumentException("Node passed should be named \"datum\".");
        }
        this.datum = datum;

        this.atom = datum.getSubtype("atom");
        this.area = atom.getSubtype("area");
        this.turf = atom.getSubtype("turf");

        ObjectNode movable = atom.getSubtype("movable");

        this.obj = movable.getSubtype("obj");
        this.mob = movable.getSubtype("mob");
    }

    /**
     * Gets the node given by this absolute path
     * @param path Absolute path, with optional forward slash, of the node in question
     * @return An {@link ObjectNode} of the given object, or {@code null} if it doesn't exist.
     */
    public ObjectNode getNode(String path)
    {
        String[] pathFrags = path.split("/");
        if(pathFrags[0].isEmpty())
        {
            pathFrags = Arrays.copyOfRange(pathFrags, 1, pathFrags.length);
        }

        ObjectNode currentNode;

        switch(pathFrags[0])
        {
            case "datum":
                currentNode = datum;
                break;
            case "atom":
                currentNode = atom;
                break;
            case "area":
                currentNode = area;
                break;
            case "turf":
                currentNode = turf;
                break;
            case "obj":
                currentNode = obj;
                break;
            case "mob":
                currentNode = mob;
                break;
            default:
                currentNode = datum;
        }

        for(int i = 1; i < pathFrags.length; i++)
        {
            currentNode = currentNode.getSubtype(pathFrags[i]);
            if(currentNode == null)
            {
                return null;
            }
        }

        return currentNode;
    }
}
