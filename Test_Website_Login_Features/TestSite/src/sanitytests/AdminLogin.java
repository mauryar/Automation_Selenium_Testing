package sanitytests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AdminLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\rajan\\Desktop\\Testing\\FirefoxDriver\\geckodriver.exe");
		//WebDriver driver = new InternetExplorerDriver(); //Launches IE Browser with blank url
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/admin/login.php");
		Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		
		if (url.equals("http://www.gcrit.com/build3/admin/index.php")){ // Verification
		System.out.println("Login Successful -Passed"); 
		}
		else
		{
		System.out.println("Login Unsuccessful -Failed");  
		}
		
		driver.quit(); //Closes the Browser
	}

}
