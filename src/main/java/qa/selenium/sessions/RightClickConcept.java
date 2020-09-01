package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	By contextList = By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]");
	By rightClick = By.xpath("//span[text()='right click me']");
	
	WebElement rightClickElement = getElement(rightClick);
	getRightclickListElements(rightClickElement, contextList, "Copy");
	
	Thread.sleep(2000);
	quitBrowser();
	
	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void getRightclickListElements(WebElement element, By locator, String value) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		List<WebElement> rightClickList = driver.findElements(locator);
		
		System.out.println(rightClickList.size());
		//stream() with lambda
		//rightClickList.stream().forEach(ele -> System.out.println(ele.getText()));
		for (WebElement ele : rightClickList) {
			
			String contextText = ele.getText();
			System.out.println(contextText);
			if(contextText.equals("Copy")) {
				ele.click();
				break;
			}
			
		}
		
	}
	
	public static void quitBrowser() {
		
		driver.quit();
	}
	
	
	
	
	
	
}
