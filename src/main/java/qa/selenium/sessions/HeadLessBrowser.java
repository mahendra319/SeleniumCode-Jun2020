package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//running in headless mode
		//testing happening in the background
		//fast 
		
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver(co);
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
