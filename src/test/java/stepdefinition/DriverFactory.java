package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.ConfigReader;

import java.util.concurrent.TimeUnit;

/**
 * Md Ziaur Rahman
 *     Spring_2018
 */

public class DriverFactory {

        private static WebDriver driver = null;

        @Before ("@temp")
        public static void before() {

            ConfigReader configReader = new ConfigReader();
            System.setProperty("webdriver.chrome.driver",
                    "/Users/mdrahman/Downloads/Selenium/Chrome/chromedriver");
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get(configReader.getUrl());
        }

        @After ("@temp")
        public static void after() {
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
            }
        }

        public static WebDriver getDriver() {
            return driver;
        }
    }

