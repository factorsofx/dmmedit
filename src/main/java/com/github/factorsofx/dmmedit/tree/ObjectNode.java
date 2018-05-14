package com.github.factorsofx.dmmedit.tree;

import java.util.HashMap;
import java.util.Map;

public class ObjectNode
{
    private String name;
    private ObjectNode parent = null;
    private Map<String, Var> vars;
    private Map<String, ObjectNode> children;

    public ObjectNode(String name)
    {
        this.name = name;
        this.vars = new HashMap<>();
        this.children = new HashMap<>();
    }

    public String getName()
    {
        return name;
    }

    public ObjectNode getParent()
    {
        return parent;
    }

    /**
     * Sets this object's parent node, and adds this node to the parent's children.
     * @param parent The parent of this node
     */
    public void parent(ObjectNode parent)
    {
        if(this.parent != null)
        {
            throw new IllegalStateException("Node already has parent");
        }
        this.parent = parent;
        if(parent != null)
        {
            parent.children.put(this.name, this);
        }
    }

    public Var getVar(String name)
    {
        return vars.getOrDefault(name, parent == null ? null : parent.getVar(name));
    }

    public ObjectNode getSubtype(String name)
    {
        return children.get(name);
    }

    public void addVar(Var var)
    {
        vars.put(var.getName(), var);
    }
}
