package com.github.factorsofx.dmmedit.tools;

import org.antlr.v4.gui.TestRig;

public class DMParserTest
{
    public static void main(String... args) throws Exception
    {
        TestRig.main(new String[] {"com.github.factorsofx.dmmedit.generated.DM", "objectBlock", "-tokens", "-gui"});
    }
}
