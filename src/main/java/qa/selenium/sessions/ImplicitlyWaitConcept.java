package qa.selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//implicitlyWait: is global wait and applied for all WebElements - findElement/findElements
		//it will apply to all the WebElements by default
		//not applicable for non-WebElements - title, url, alerts
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login/");
		driver.findElement(By.id("username")).sendKeys("mahi@gmail.com");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS); //nullify implicitlyWait - but still implicitlyWait logic will be executed
		driver.findElement(By.id("password")).sendKeys("mahi@gmail.com");
		driver.findElement(By.id("loginBtn")).click();

		
		
		
		
	}

}
