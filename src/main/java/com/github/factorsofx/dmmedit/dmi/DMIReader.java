package com.github.factorsofx.dmmedit.dmi;

import ar.com.hjg.pngj.PngReader;
import ar.com.hjg.pngj.chunks.ChunkHelper;
import ar.com.hjg.pngj.chunks.PngChunk;
import ar.com.hjg.pngj.chunks.PngChunkTextVar;

import java.io.File;

public class DMIReader
{
    public DMIIcon read(File file)
    {
        PngReader reader = new PngReader(file);

        reader.readSkippingAllRows();

        for(PngChunk pngChunk : reader.getChunksList().getChunks())
        {
            if(!ChunkHelper.isText(pngChunk)) continue;

            PngChunkTextVar text = (PngChunkTextVar) pngChunk;

            String key = text.getKey();
            String val = text.getVal();

            System.out.println(key + ":" + val);
        }

        reader.end();

        return null;
    }
}
