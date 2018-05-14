package com.github.factorsofx.dmmedit;

import com.github.factorsofx.dmmedit.persistence.FileSystemPersistenceManager;
import com.github.factorsofx.dmmedit.persistence.NoOpPersistenceManager;
import com.github.factorsofx.dmmedit.persistence.PersistenceManager;
import org.apache.commons.cli.*;

import java.io.File;
import java.io.IOException;

public class DMMEdit
{
    public static void main(String... args) throws IOException, ParseException
    {
        Options options = new Options();
        options.addOption("q", "quiet", false, "Don't load or save persistence data");
        options.addOption("d", "data-dir", true, "Load persistence data from the given location instead of the default");

        CommandLine commandLine = new DefaultParser().parse(options, args);

        PersistenceManager persistenceManager;

        if(commandLine.hasOption("quiet"))
        {
            persistenceManager = new NoOpPersistenceManager();
        }
        else
        {
            File dataDir;
            if(commandLine.hasOption("data-dir"))
            {
                dataDir = new File(commandLine.getOptionValue("data-dir"));
            }
            else
            {
                dataDir = new File(System.getProperty("user.home") + File.pathSeparator + "dmmedit" + File.pathSeparator + "persistence");
            }

            if(!(dataDir.exists() && dataDir.isDirectory()))
            {
                System.out.println("Generating new persistence folder");
                if(!dataDir.createNewFile())
                {
                    System.err.println("Unable to create persistence folder, no data will be saved.");
                    persistenceManager = new NoOpPersistenceManager();
                }
                else
                {
                    persistenceManager = new FileSystemPersistenceManager();
                }
            }
            else
            {
                persistenceManager = new FileSystemPersistenceManager();
            }
        }

        int width = persistenceManager.getIntOpt("lastWidth", 1440);
        int height = persistenceManager.getIntOpt("lastHeight", 900);
    }
}
