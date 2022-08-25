package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		"C:\\Users\\sagar.kamdi\\eclipse-workspace\\OrangeHRM_Globallogic\\src\\test\\resources\\Feature\\verifyLogin.feature" }, glue = "com.automation.StepDef", plugin = {
				"html:reports/reports.html", "json:target/cucumber.json", "rerun:target/rerun.txt" })

public class Testrunner {

}
//add group in test runner
