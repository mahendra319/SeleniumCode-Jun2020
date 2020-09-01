package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIDConceptApproach2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		
		WebElement emailId =driver.findElement(By.id("username"));
		emailId.sendKeys("Test@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("test@123");
		
		WebElement btn = driver.findElement(By.id("loginBtn"));
		btn.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
