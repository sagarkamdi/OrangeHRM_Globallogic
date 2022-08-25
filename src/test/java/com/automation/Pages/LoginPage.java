package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement userInput;

	@FindBy(xpath =  "//input[@name='password']")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginButton;

	public void enterUsername(String username) {
		userInput.sendKeys(username);

	}

	public void enterPassword(String password) {
		passwordInput.sendKeys(password);

	}

	public void clickbtnLogin() {
		loginButton.click();
	}

}
