package com.automation.StepDef;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("Open the browser")
	public void open_the_browser() {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("Enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.enterUsername(PropertyReader.getProperty("username"));
		lp.enterPassword(PropertyReader.getProperty("password"));
		Thread.sleep(2000);
		lp.clickbtnLogin();
	}

	@Then("execute successfully")
	public void execute_successfully() {
		System.out.println(DriverUtils.getDriver().getTitle());
	}

}
