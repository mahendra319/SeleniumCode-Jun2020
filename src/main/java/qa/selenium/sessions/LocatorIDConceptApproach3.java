package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIDConceptApproach3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(5000);
		//By locators
		By uName = By.id("username");
		By pwd = By.id("password");
		By btn = By.id("loginBtn");
		
		driver.findElement(uName).sendKeys("Test@gmail.com");
		driver.findElement(pwd).sendKeys("password");
		driver.findElement(btn).click();

	}

}
