package com.automation.StepDef;

import java.awt.AWTException;

import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.UsermngtPage;
import com.automation.Test.LoginTest;

import io.cucumber.java.en.Then;

public class AddUserSteps {
	@Then("Click on Admin button")
	public void click_on_admin_button() throws InterruptedException, AWTException {
		LoginTest lt = new LoginTest();
		lt.VerifysuccessfulLogin();
		UsermngtPage up = new UsermngtPage();
		up.Perform_ACT();
		Thread.sleep(5000);
		up.uRole();
		up.enterEname(PropertyReader.getProperty("Ename"));
		up.enterUname(PropertyReader.getProperty("Uname"));
		up.status();
		up.enterPassword(PropertyReader.getProperty("Password"));
		up.enterConPassword(PropertyReader.getProperty("Password"));
		Thread.sleep(2000);
		up.clickAdd();
	}
}
