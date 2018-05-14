package com.github.factorsofx.dmmedit.tools;

import com.github.factorsofx.dmmedit.dmi.DMIReader;

import javax.swing.*;
import java.io.File;

public class DMIUtil
{
    public static void main(String... args)
    {
        JFileChooser jfc = new JFileChooser(new File(System.getProperty("user.home")));
        jfc.showDialog(null, "Open");
        File img = jfc.getSelectedFile();
        new DMIReader().read(img);
    }
}
