package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.homepage.TC001_VerifyLoginWithInvalidCredentials;

public class HomePage {

	public static final Logger log = Logger.getLogger(HomePage.class.getName());
	
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
		
		signIn.click();
		log.info("clicked on signIn and object is:-"+signIn.toString());
		
		Thread.sleep(2000);
		loginEmailAddress.sendKeys(emailAddress);
		log.info("entered emailAddress id:-"+emailAddress+" and object is:- "+loginEmailAddress.toString());
		
		loginPassword.sendKeys(password);
		log.info("entered password:-"+password+" and object is:- "+loginPassword.toString());
		
		submitButton.click();
		log.info("clicked on submit Button and object is:-"+submitButton.toString());
		Thread.sleep(2000);
	}
	
	
	public String getInvalidLoginText() {
		log.info("error message is:-"+authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
}
