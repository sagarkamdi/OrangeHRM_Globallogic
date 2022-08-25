package com.automation.Test;

import org.testng.annotations.Test;

import com.automation.GenericUtils.DriverUtils;
import com.automation.GenericUtils.ExcelData;
import com.automation.GenericUtils.PropertyReader;
import com.automation.Pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test

	public void VerifysuccessfulLogin() throws InterruptedException {

		String Username = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\OrangeHRM_Globallogic\\src\\test\\resources\\Data\\OHRM_data.xlsx",
				"Sheet1", 0, 0);
		String Password = ExcelData.getData(
				"C:\\Users\\sagar.kamdi\\eclipse-workspace\\OrangeHRM_Globallogic\\src\\test\\resources\\Data\\OHRM_data.xlsx",
				"Sheet1", 0, 1);
		//System.out.println(Username+Password);
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		LoginPage lp = new LoginPage();
		lp.enterUsername(Username);
		lp.enterPassword(Password);
		Thread.sleep(2000);
		lp.clickbtnLogin();

	}
}
