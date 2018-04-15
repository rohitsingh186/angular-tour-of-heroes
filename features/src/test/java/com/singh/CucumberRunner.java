package com.singh;

/**
 * File: CucumberRunner
 * Created by Rohit Singh on 15-04-2018.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHtmlReport"},
        //pretty:target/cucumber-json-report.json
        features = "classpath:features",
        glue = {"com.singh.stepdefinitions"}
)
public class CucumberRunner {
}
