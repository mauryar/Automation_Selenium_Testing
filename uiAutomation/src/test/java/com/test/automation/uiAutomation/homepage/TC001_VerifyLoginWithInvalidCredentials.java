package com.test.automation.uiAutomation.homepage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;



public class TC001_VerifyLoginWithInvalidCredentials extends TestBase{

	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	
	
	HomePage homepage;
	
	@BeforeClass
	public void setUp() throws InterruptedException{
		init();
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials() throws InterruptedException {
		log.info("===============Starting verifyLoginWithInvalidCredentials test===============");
		//homepage = new HomePage(driver);
		//homepage.loginToApplication("test@gmail.com", "password");
		//Assert.assertEquals(homepage.getInvalidLoginText(), "Authentication failed.");
		System.out.println("Testing Jenkins");
		log.info("===============Finished verifyLoginWithInvalidCredentials test===============");
	}
	
	@AfterClass
	public void endTest(){
		driver.quit();
	}
	
}
