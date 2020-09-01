package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		//ExplicitlyWait -->WebDriverWait, FluentWait -->Wait(parent Interface)
		// is used for both WebElement and non WebElement
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
		//Custom Wait with WebDriverWait for a specific element
		
		driver.get("https://app.hubspot.com/login");
		//System.out.println(driver.getTitle()); // display wrong title: 'Checking Browser'
		String pageTitle = waitForTitle("HubSpot Login", 10);
		System.out.println(pageTitle);
		
		By uName = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");
		By firstName = By.id("uid-firstName-5");
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(uName));
		
		//driver.findElement(uName).sendKeys("mahi@gmai.com");
		
		waitForElementPresent(uName, 10).sendKeys("mahi@gmail.com");
		driver.findElement(pwd).sendKeys("test123");
		driver.findElement(loginBtn).click();
		driver.findElement(signUpLink).click();
		//driver.findElement(firstName).sendKeys("Mahendra");
		waitForElementPresent(firstName, 5);
		
	
	
	
	}
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresent(By locator,int timeOutSecs) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutSecs);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	//An expectation for checking that an element, known to be present on the DOM of a page, isvisible. 
	//Visibility means that the element is not only displayed but also has a height andwidth that is greater than 0.
	
	public static WebElement waitForElementToBeVisible(By locator,int timeOutSecs) {
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, timeOutSecs);
		return wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	
	
	
	
	
	
	
	public static String waitForTitle(String title, int timeOutSecs) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutSecs);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
