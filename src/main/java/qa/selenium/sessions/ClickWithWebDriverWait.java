package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickWithWebDriverWait {

static WebDriver driver;
	
	public static void main(String[] args) {

		//ExplicitlyWait -->WebDriverWait, FluentWait -->Wait(parent Interface)
		// is used for both WebElement and non WebElement
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
			
		driver.get("https://app.hubspot.com/login");
				
		By uName = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");
		By firstName = By.id("uid-firstName-5");
		
		//waitForElementToBeClickable(signUpLink, 10).click();
		clickWhenReady(signUpLink, 10);

	}

	
	public static WebElement waitForElementToBeClickable(By locator,int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void clickWhenReady(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element =wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}
	
	
	
	
	
}
