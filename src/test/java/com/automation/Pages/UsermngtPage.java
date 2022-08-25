package com.automation.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.management.relation.Role;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class UsermngtPage extends BasePage{

	// declaration
		@FindBy(xpath = "//span[text()='Admin']")
		private WebElement admin;

		@FindBy(xpath = "(//span[@class='oxd-topbar-body-nav-tab-item'])[1]")
		private WebElement usermanagement;

		@FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-link']")
		private WebElement users;
		
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
		private WebElement btnadd;
		
		@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
		private WebElement urole;
		
		@FindBy(xpath = "//div[text()='Admin']")
		private WebElement urole_admin;
		
		@FindBy(xpath = "//div[text()='ESS']")
		private WebElement urole_ess;
		
		@FindBy(xpath = "(//div[@tabindex='0'])[2]")
		private WebElement status;
		
		@FindBy(xpath = "//input[@placeholder='Type for hints...']")
		private WebElement ename;
		
		@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
		private WebElement uname;
		
		@FindBy(xpath = "(//input[@type='password'])[1]")
		private WebElement pwd;
		
		@FindBy(xpath = "(//input[@type='password'])[2]")
		private WebElement confirmPwd;
		
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement addbutton;
		
		
		
		public void Perform_ACT() throws InterruptedException {
			Actions act= new Actions(driver);
			//act.moveToElement(admin).perform();
			//act.moveToElement(usermanagement).perform();
			admin.click();
			usermanagement.click();
			users.click();
			Thread.sleep(2000);
			
			btnadd.click();
		}
		
		public void uRole() throws InterruptedException, AWTException {
			/*urole.click();
			Robot robot =new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);*/
			
			urole.click();
			Actions act = new Actions(driver);
		    act.sendKeys(Keys.DOWN).perform();
		    Thread.sleep(1000);
		    act.sendKeys(Keys.ENTER).perform();
			
		}
		
		public void status() throws InterruptedException {
			status.click();
			Actions act = new Actions(driver);
		    act.sendKeys(Keys.DOWN).perform();
		    Thread.sleep(1000);
		    act.sendKeys(Keys.ENTER).perform();
		}
		
		public void enterEname(String str) {
			ename.sendKeys(str);
		}
		
		public void enterUname(String str) {
			uname.sendKeys(str);
		}
		
		public void enterPassword(String str) {
			pwd.sendKeys(str);
		}
		
		public void enterConPassword(String str) {
			confirmPwd.sendKeys(str);
		}

		public void clickAdd() {
			addbutton.click();
			//System.out.println("clicked");
		}
}
