package qa.selenium.sessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By uName = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		
		
		waitForElementWithFulentWait(uName, 10, 2).sendKeys("mahi@gmail.com");
		driver.findElement(pwd).sendKeys("test123");
		driver.findElement(loginBtn).click();

	}

	public static WebElement waitForElementWithFulentWait(By locator, int timeOut, int interval) {
		
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeOut))
				.pollingEvery(Duration.ofSeconds(interval))
				.ignoring(NoSuchElementException.class); 
				// we can send multiple exceptions by cama separator
				//.ignoring(NoSuchElementException.class, NullPointerException.class);
		
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
}
