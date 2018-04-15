package com.singh.configuration;

import com.singh.exception.BrowserStackDriverInitializationException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * File: BrowserStackDriverConfiguration
 * Created by Rohit Singh on 15-04-2018.
 */

public class BrowserStackDriverConfiguration {

    public static final String USERNAME = "USERNAME";
    public static final String AUTOMATE_KEY = "ACCESS_KEY";
    public static final String BROWSER_STACK_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static WebDriver setUpDriver() throws BrowserStackDriverInitializationException {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browserstack.local", "true");
            caps.setCapability("browserstack.debug", "true");
            caps.setCapability("browserstack.video", "true");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "44.0");
            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "7");
            caps.setCapability("resolution", "1280x1024");

            RemoteWebDriver driver = new RemoteWebDriver(new URL(BROWSER_STACK_URL), caps);
            driver.manage().timeouts().implicitlyWait(30, SECONDS);
            return driver;
        } catch (MalformedURLException | WebDriverException e) {
            throw new BrowserStackDriverInitializationException("Failed to load BroserStack remote driver!");
        }
    }
}
