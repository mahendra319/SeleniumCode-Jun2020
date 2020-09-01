package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TootTipCapture {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("#age")).sendKeys("30");
//capturing tooltip text
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.id("age"))).perform();
		String tooltipText=driver.findElement(By.className("ui-tooltip-content")).getText();
		
		System.out.println(tooltipText);
		
		
		
		
		
		
		
	driver.quit();
	
	
	}

}
