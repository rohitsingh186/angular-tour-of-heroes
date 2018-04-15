package com.singh.stepdefinitions;

import com.singh.configuration.DriverFactory;
import com.singh.exception.ProperyLoadingException;
import com.singh.exception.WebDriverInitializationException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertNotNull;

/**
 * File: HeroDetailsStepDefinitions
 * Created by Rohit Singh on 15-04-2018.
 */

public class HeroDetailsStepDefinitions {

    private DriverFactory driverFactory;
    private WebDriver driver;

    @Before
    public void setUp() throws ProperyLoadingException, WebDriverInitializationException {
        driverFactory = new DriverFactory();
        driver = driverFactory.setUpDriver();
    }

    @Given("^I am on the home page \"(.*)\"$")
    public void goToHomePage(String homePageURL) {
        driver.get(homePageURL);
    }

    @When("^I click on \"(.*)\"$")
    public void clickOnHeroCard(String heroName) {
        WebElement heroCard = driver.findElement(By.xpath("//*[contains(text(), '" + heroName + "')]"));
        heroCard.click();
    }

    @Then("^I should see the hero detail page for \"(.*)\"$")
    public void shouldSeeHeroDetailsPage(String heroName) {
        WebElement heroCard = driver.findElement(By.xpath("//*[contains(text(), '" + heroName + " details!')]"));
        assertNotNull(heroCard);
    }

    @After
    public void cleanUp() {
        driverFactory.cleanupDriver(driver);
    }
}
