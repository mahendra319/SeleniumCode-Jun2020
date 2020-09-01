package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIDConceptApproach4 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//By locators:
		By usrName = By.id("username");
		By pwd1 = By.id("password");
		By btn1 = By.id("loginBtn");
		//remember actions always perform on WebElemets
		getElement(usrName).sendKeys("Test@gmail.com");
		getElement(pwd1).sendKeys("test12");
		getElement(btn1).click();
		//driver.findElement(usrName).sendKeys("Test@gmail.com");
		//driver.findElement(pwd1).sendKeys("test123");
		//driver.findElement(btn1).click();
		
		
	}
	
	/**
	 * this is used to create WebElement on basis of given By locator
	 * @param locator
	 * @return WebElement
	 */
	public static WebElement getElement(By locator) {
		
		WebElement ele=driver.findElement(locator);
		return ele;
		
	}
	
	
	
	
	

}
