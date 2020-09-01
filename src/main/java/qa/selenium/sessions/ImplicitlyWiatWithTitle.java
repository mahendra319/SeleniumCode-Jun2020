package qa.selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWiatWithTitle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		String title = driver.getTitle();
		System.out.println(title); //Checking Browser: wrong title captures
	
		//since Title is a non-WebElement we cant handle with implicitlyWait
		//to solve this probleme we have to use ExplicitlyWait
	
	
	
	
	
	
	
	
	
	
	}

}
