package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIDConceptApproach5 {

	// This is the best approach for real time and frame work design
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//By locators:
		By uName = By.id("username");
		By pwd = By.id("password");
		By btn = By.id("loginBtn");
		
		//Actions perform on WebElements
		doSendKeys(uName, "Test@gmail.com");
		doSendKeys(pwd, "test123");
		doClick(btn);
		

	}
	
	public static WebElement getElement(By locator) {
		
		WebElement element = driver.findElement(locator);
		return element;
	}

	public static void doSendKeys(By locator, String value) {
		
		getElement(locator).sendKeys(value);
		
	}
	
	public static void doClick(By locator) {
		
		getElement(locator).click();
	}
	
	public static String doGetText(By locator) {
		
		return getElement(locator).getText();
	}
	
	public static boolean doIsDisplayed(By locator) {
		
		return getElement(locator).isDisplayed();
	}
	
	
	
	
}
