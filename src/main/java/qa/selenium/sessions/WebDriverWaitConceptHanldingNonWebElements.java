package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptHanldingNonWebElements {

	static WebDriver driver;
	public static void main(String[] args) {

		//Non-WebElements : like Title, alert, URL...
		
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	
				
		driver.get("https://app.hubspot.com/login");
		//System.out.println(driver.getTitle()); // display wrong title: 'Checking Browser'
		String pageTitle = waitForTitle("HubSpot Login", 10); //WebDriverWait method for Non-WebElements
		System.out.println(pageTitle);
		
		By uName = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");
		By firstName = By.id("uid-firstName-5");
		
		
		driver.findElement(signUpLink).click();
		
		if(WaitForURL("signup", 5)) {
			
			System.out.println("Sign UP URL is correct");
		}
		
	}
	
	
	public static String waitForTitle(String title, int timeOutSecs) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOutSecs);
		wait.until(ExpectedConditions.titleIs(title));
		return driver.getTitle();
	}
	
	public static boolean WaitForURL(String url, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		
		return wait.until(ExpectedConditions.urlContains(url));
	}

}
