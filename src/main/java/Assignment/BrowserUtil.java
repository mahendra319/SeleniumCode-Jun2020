package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	
	public WebDriver driver;
	
	public BrowserUtil(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public  WebDriver launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public void quitBrowser() {
		
		driver.quit();
	}
	
	public void launchURL(String URL) {
		
		driver.get(URL);
	}
}
