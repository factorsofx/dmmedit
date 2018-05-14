package com.github.factorsofx.dmmedit.map;

import com.github.factorsofx.dmmedit.generated.DMMBaseVisitor;
import com.github.factorsofx.dmmedit.generated.DMMLexer;
import com.github.factorsofx.dmmedit.generated.DMMParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DMMLoader
{
    private CharStream charStream;

    public DMMLoader(Path dmm) throws IOException
    {
        charStream = CharStreams.fromChannel(FileChannel.open(dmm, StandardOpenOption.READ));
    }

    public DMM load()
    {
        DMMLexer lexer = new DMMLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        DMMParser parser = new DMMParser(tokenStream);

        return new DMMLoaderVisitor().visitMap(parser.map());
    }
}

class DMMLoaderVisitor extends DMMBaseVisitor
{
    @Override
    public DMM visitMap(DMMParser.MapContext ctx)
    {
        Map<String, CellType> keys = this.visitAssignSection(ctx.assignSection());
        String[][][] map = this.visitMapSection(ctx.mapSection());
        return null;
    }

    @Override
    public Map<String, CellType> visitAssignSection(DMMParser.AssignSectionContext ctx)
    {
        Map<String, CellType> cellTypeMap = new HashMap<>();

        for(DMMParser.KeyAssignContext keyAssignContext : ctx.keyAssign())
        {
            String name = keyAssignContext.STR().getText();
            List<AtomInstance> instances = new ArrayList<>();
            for(DMMParser.ObjDeclContext objDeclContext : keyAssignContext.objDecl())
            {
                instances.add(this.visitObjDecl(objDeclContext));
            }
            CellType cellType = new CellType(instances);

            cellTypeMap.put(name, cellType);
        }
        return cellTypeMap;
    }

    @Override
    public String[][][] visitMapSection(DMMParser.MapSectionContext ctx)
    {
        for(DMMParser.MapAssignContext mapAssignContext : ctx.mapAssign())
        {
            int x = Integer.parseInt(mapAssignContext.coords().NUM(0).getText());
            int y = Integer.parseInt(mapAssignContext.coords().NUM(1).getText());
            int z = Integer.parseInt(mapAssignContext.coords().NUM(2).getText());
        }
        return null;
    }

    @Override
    public AtomInstance visitObjDecl(DMMParser.ObjDeclContext ctx)
    {
        return null;
    }
}