package rest.rest.Utils;

import java.io.File;

public class Utils {

    public static File getJobsConfigFile(String filename){

        filename+=".json";

        File configDir = new File(System.getProperty("user.dir"));

        configDir = new File(configDir, "config");
        configDir = configDir.getAbsoluteFile();

        configDir = configDir.getParentFile();
        configDir = new File(configDir, "config");
        configDir = new File(configDir, "dependency");
        configDir = new File(configDir, "jobs");

        assert (configDir.exists() && configDir.isDirectory());

        File config = new File(configDir, filename);

        assert (config.exists() && config.isFile());

        return config;
    }

    public static File getConfigFile(String filename){

        File configDir = new File(System.getProperty("user.dir"));

        configDir = new File(configDir, "config");
        configDir = configDir.getAbsoluteFile();

        assert (configDir.exists() && configDir.isDirectory());

        File config = new File(configDir, filename);

        assert (config.exists() && config.isFile());

        return config;

    }

}
