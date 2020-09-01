package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyElement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://freshworks.com");
		
		WebElement platformLink =driver.findElement(By.linkText("Platform"));
		
		
		if(platformLink.isDisplayed()) {
			
			String txt = platformLink.getText();
			System.out.println(txt);
			platformLink.click();
		}
	}

}
