package com.github.factorsofx.dmmedit.persistence;

import com.github.factorsofx.dmmedit.dmi.DMIIcon;
import com.github.factorsofx.dmmedit.tree.AtomTree;

import java.util.Map;

/**
 * This is an object that contains all the data neccesary to read and write maps for a given project.
 * It can be considered a "snapshot" of the sprites, object tree, and vars in a project at the time the
 * mapenv is generated. This will improve load times and make it easier to jump into mapping.
 */
public class MapEnv
{
    private Map<String, DMIIcon> iconCache; // Map of full filename to dmi
    private AtomTree tree;
}
