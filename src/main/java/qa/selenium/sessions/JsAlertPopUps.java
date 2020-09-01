package qa.selenium.sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsAlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		
		Alert alert= driver.switchTo().alert();
		
		String alertText =alert.getText(); // return text available on alert popup
		System.out.println(alertText);
		alert.accept(); // click on OK button on alert popup
		//alert.dismiss(); // click on Cancel/dismiss button on alert popup
		
		driver.switchTo().defaultContent(); //come back to default webpage
		
		
		driver.quit();
		

	}

}
