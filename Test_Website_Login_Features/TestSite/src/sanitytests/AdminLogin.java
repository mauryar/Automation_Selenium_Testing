package sanitytests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rajan\\Desktop\\Testing\\FirefoxDriver\\geckodriver.exe");
		//WebDriver driver = new InternetExplorerDriver(); //Launches IE Browser with blank url
		WebDriver driver = new FirefoxDriver();
	
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("nav-link-accountList")).click();
		//Thread.sleep(5000);
		//waitForLoad(driver);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("implicit");
		WebElement myDynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
		driver.findElement(By.name("email")).sendKeys("barbosa.el@husky.neu.edu");
		driver.findElement(By.name("password")).sendKeys("Ronaldo@7");
		driver.findElement(By.id("signInSubmit")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("signin")){ // Verification
		System.out.println("Login Successful -Passed"); 
		}
		else
		{
		System.out.println("Login Unsuccessful -Failed");  
		}
		
		driver.quit(); //Closes the Browser
		
		
		
	}

	
	public static void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
}
