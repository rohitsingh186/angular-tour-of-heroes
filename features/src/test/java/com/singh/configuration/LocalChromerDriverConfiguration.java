package com.singh.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * File: LocalChromerDriverConfiguration
 * Created by Rohit Singh on 15-04-2018.
 */

public class LocalChromerDriverConfiguration {

    public static WebDriver setUpDriver() {
        setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, SECONDS);
        return driver;
    }
}
