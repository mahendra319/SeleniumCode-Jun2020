package qa.selenium.sessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConceptForAlertNonWebElement {

	static WebDriver driver;
	
	public static void main(String[] args) {

		//Non-WebElements : like Title, alert, URL...
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
					
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		String alertText =alert.getText();
//		System.out.println(alertText);
//		alert.accept();
		
		Alert alert =waitForAlertToBePresent(10);
		String alertText =alert.getText();
		System.out.println(alertText);
		alert.accept();
	}

	
	public static Alert waitForAlertToBePresent(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		return alert;
	}
}
