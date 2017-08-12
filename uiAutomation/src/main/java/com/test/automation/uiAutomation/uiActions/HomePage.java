package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath= ".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath= ".//*[@id='email']")
	WebElement loginEmailAddress;
	
	@FindBy(xpath= ".//*[@id='passwd']")
	WebElement loginPassword;
	
	@FindBy(xpath= ".//*[@id='SubmitLogin']")
	WebElement submitButton;
	
	@FindBy(xpath= ".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String emailAddress, String password) throws InterruptedException {
		Thread.sleep(2000);
		signIn.click();
		Thread.sleep(2000);
		loginEmailAddress.sendKeys(emailAddress);
		loginPassword.sendKeys(password);
		submitButton.click();
		Thread.sleep(2000);
	}
	
	
	public String getInvalidLoginText() {
		return authenticationFailed.getText();
	}
	
}
