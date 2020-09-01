package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsConceptOnWebElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		
		By uName = By.name("username");
		By pwd = By.name("password");
		By loginBtn = By.xpath("//input[@type='submit']");
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(uName), "mahi@gmail.com");
//		act.sendKeys(driver.findElement(pwd), "Test@123");
//		act.click(driver.findElement(loginBtn)).perform();
		doActionsSendKeys(uName, "mahi@gmail.com");
		doActionsSendKeys(pwd, "test@123");
		doActionsClick(loginBtn);

	}
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	
	
	
	
	
	
}
