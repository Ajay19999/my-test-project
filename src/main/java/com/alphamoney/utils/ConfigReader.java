package com.alphamoney.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;
    private final String propertiesFilePath = "src/test/resources/config.properties";  // Path to the properties file

    public ConfigReader() {
        try {
            FileInputStream fileInputStream = new FileInputStream(propertiesFilePath);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.err.println("Error reading configuration file: " + e.getMessage());
        }
    }

    public String getURL() {
        return properties.getProperty("url");
    }

    public String getUsername() {
        return properties.getProperty("username");
    }

    public String getPassword() {
        return properties.getProperty("password");
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public int getWaitTimeout() {
        return Integer.parseInt(properties.getProperty("waitTimeout"));
    }
}
