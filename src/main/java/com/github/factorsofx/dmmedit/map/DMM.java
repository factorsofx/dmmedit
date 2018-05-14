package com.github.factorsofx.dmmedit.map;

import java.util.HashSet;

public class DMM
{
    private HashSet<CellType> cellTypes;

    //               z  y  x
    private CellType[ ][ ][ ] map;

    private int width;
    private int height;
    private int zlevels;

    public CellType[][] getZLevel(int z)
    {
        return map[z];
    }
}
