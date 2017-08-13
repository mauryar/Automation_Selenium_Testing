package com.test.automation.uiAutomation.testBase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
	public WebDriver driver;
	String url = "http://automationpractice.com/index.php";
	String browser = "firefox";
	
	public void init() throws InterruptedException {
		selectBrowser(browser);
		getUrl(url);
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

	

	private void selectBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\rajan\\Desktop\\Testing\\FirefoxDriver\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			log.info("Creating object of "+browser);
			driver = new FirefoxDriver();
		}
		
	}
	
	
	private void getUrl(String url) throws InterruptedException {
		log.info("navigating to:- "+url);
		driver.get(url);
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
}
