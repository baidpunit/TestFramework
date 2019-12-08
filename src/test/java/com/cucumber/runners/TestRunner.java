package com.cucumber.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com/cucumber/stepdefinations", features = "src/test/resources/com/cucumber/features", tags = "@tag1", plugin = {
		"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json",
		"html:target/cucumber-reports" })

public class TestRunner {

}
