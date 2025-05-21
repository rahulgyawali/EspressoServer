package org.example.httpserver.config;

public class ConfigurationManager {

    private static ConfigurationManager configurationManager;
    private static Configuration configuration;

    private ConfigurationManager(){

    }

    public static ConfigurationManager getInstance(){
        if(configurationManager == null){
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void loadConfigFile(String filePath){

    }

    public void getCurrentConfig(){

    }

}
