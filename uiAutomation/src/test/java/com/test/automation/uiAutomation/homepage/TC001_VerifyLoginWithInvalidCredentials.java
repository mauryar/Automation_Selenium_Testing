package com.test.automation.uiAutomation.homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;



public class TC001_VerifyLoginWithInvalidCredentials extends TestBase{

	
	WebDriver driver;
	HomePage homepage;
	
	@BeforeTest
	public void setUp(){
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rajan\\Desktop\\Testing\\FirefoxDriver\\geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		//log.info("navigating to:- "+OR.getProperty("url"));
		driver.get("http://automationpractice.com/index.php");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials() throws InterruptedException {
		homepage = new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "password");
		
		Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
	}
	
	@AfterClass
	public void endTest(){
		driver.quit();
	}
	
}
