package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BackForwardAndRefresh {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.amazon.com");
		System.out.println("navigated to amazon.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println("back to google.com");
		
		driver.navigate().forward();
		System.out.println("forward to amazon.com");
		
		driver.navigate().refresh();
		System.out.println("Refreshed amazon page");
		
		driver.navigate().back();
		System.out.println("back to google.com");
		
		driver.quit();

	}

}
