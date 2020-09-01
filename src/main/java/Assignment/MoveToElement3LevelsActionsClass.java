package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement3LevelsActionsClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		By signLink = By.id("ctl00_HyperLinkLogin");
		By spiceCludMember = By.xpath("//a[text()='SpiceClub Members']");
		By memberMenu = By.xpath("//a[text()='Member Login' or text()='Sign up']");
		
		//getMenuLitThreeLevel(getElement(signLink), getElement(spiceCludMember), memberMenu, "Sign up");
		getMenuLitThreeLevel(getElement(signLink), getElement(spiceCludMember), memberMenu, "Member Login");
		Thread.sleep(2000);
		quitBrowser();
		
			}
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	public static void getMenuLitThreeLevel(WebElement element1, WebElement element2, By locator, String value) throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(element1).perform();
		Thread.sleep(2000);
		action.moveToElement(element2).perform();
		Thread.sleep(2000);
		List<WebElement> signList = driver.findElements(locator);
		System.out.println(signList.size());
		for (WebElement ele : signList) {
			if(! ele.getText().isEmpty()) {
				
				String text = ele.getText();
				if(text.equals(value)) {
					ele.click();
					break;
				}
			}
			
			
		}
		
	}
	public static void quitBrowser() {
		driver.quit();
	}
}
