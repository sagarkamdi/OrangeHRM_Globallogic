package com.automation.Test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.UsermngtPage;

public class UsermngtTest extends BaseTest {
	@Test

	public void VerifyUsermngt() throws InterruptedException, AWTException {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		LoginTest lt = new LoginTest();
		lt.VerifysuccessfulLogin();
		UsermngtPage up = new UsermngtPage();
		up.Perform_ACT();
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
