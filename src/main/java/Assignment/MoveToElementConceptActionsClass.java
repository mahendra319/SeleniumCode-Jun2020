package Assignment;

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
		driver.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		
		By addOnList = By.xpath("//ul[@class='add-ons-tab']/li");
		By addOn = By.id("highlight-addons");
		
		getMenuListTwoLevels(getElement(addOn),addOnList, "Covid Insurance");
		//getMenuListTwoLevels(driver.findElement(By.id("highlight-addons")),addOnList, "SpiceMAX");
		Thread.sleep(5000);
		closeBrowser();
		}
	
	public static WebElement getElement(By locator) {
		
		WebElement addEle = driver.findElement(locator);
		return addEle;
	}
	
	public static void getMenuListTwoLevels(WebElement element, By locator, String value) throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		List<WebElement> addonList = driver.findElements(locator);
		System.out.println(addonList.size());
		for (WebElement ele : addonList) {
				if(! ele.getText().isEmpty()) {
				String addonText = ele.getText();
				System.out.println(addonText);
					if(addonText.equals(value)) {
						ele.click();
						break;
					}
			}
		}
		
	}
	public static void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	

}
