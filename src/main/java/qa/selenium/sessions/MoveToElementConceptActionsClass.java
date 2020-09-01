package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConceptActionsClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://mrbool.com/");
		
		Thread.sleep(5000);
		
		By contentLink = By.className("menulink");
		By listContent = By.xpath("//ul[@class='submenu']/li");
		
		WebElement contentElement = getElement(contentLink);
				
		//WebElement contentElement = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		act.moveToElement(contentElement).perform();
		
		Thread.sleep(3000);
		//driver.findElement(By.linkText("COURSES")).click();
		
		//clickContentMenu(listContent, "COURSES");
		//clickContentMenu(listContent, "ARTICLES");
		clickContentMenu(listContent, "SINGLE VIDEOS");
		
		
		

	}
	
	public static WebElement getElement(By locator) {
		
		WebElement element =driver.findElement(locator);
		return element;
	}
	
	public static void clickContentMenu(By locator, String value) throws InterruptedException {
		
		List<WebElement> contentList = driver.findElements(locator);
		
		System.out.println(contentList.size());
		Thread.sleep(3000);
		
		for (WebElement ele : contentList) {
			
			String contentText = ele.getText();
			System.out.println(contentText);
			
			if(contentText.equals(value)) {
				
				ele.click();
				break;
			}
		}
		
		
	}
	
	
	
	
	
	
	

}
