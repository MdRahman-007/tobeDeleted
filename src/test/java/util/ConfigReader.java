package util;

import framework.TestRunner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Md Ziaur Rahman
 *     Spring_2018
 */

public class ConfigReader {

    TestRunner testRunner=new TestRunner();

    private String url;
    private String chromeDriverPath;

    public ConfigReader() {

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out

            this.url = prop.getProperty("url_DarkSky");
            this.chromeDriverPath = prop.getProperty("chrome_driver_path");

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String getUrl() {

        return url;
    }

    public String getChromeDriverPath() {

        return chromeDriverPath;
    }
}
