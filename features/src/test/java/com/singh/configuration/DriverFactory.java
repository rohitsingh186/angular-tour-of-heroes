package com.singh.configuration;

import com.singh.exception.BrowserStackDriverInitializationException;
import com.singh.exception.ProperyLoadingException;
import com.singh.exception.WebDriverInitializationException;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * File: DriverFactory
 * Created by Rohit Singh on 15-04-2018.
 */

public class DriverFactory {

    private Properties properties;

    public DriverFactory() throws ProperyLoadingException {
        try {
            FileReader reader = new FileReader("src/test/resources/application.properties");
            properties = new Properties();
            properties.load(reader);
        } catch (IOException e) {
            throw new ProperyLoadingException("Error loading property file:application.properties");
        }
    }

    public WebDriver setUpDriver() throws WebDriverInitializationException {
        try {
            return properties.getProperty("testing.environment").equals("BrowserStack") ?
                    BrowserStackDriverConfiguration.setUpDriver() : LocalChromerDriverConfiguration.setUpDriver();
        } catch (BrowserStackDriverInitializationException e) {
            e.printStackTrace();
            throw new WebDriverInitializationException("Failed to load remote driver!");
        }
    }

    public void cleanupDriver(WebDriver driver) {
        driver.quit();
    }
}
