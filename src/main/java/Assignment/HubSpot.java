package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpot {
	public static WebDriver driver;
	
	static By dealType = By.xpath("//div[@data-selenium-test='property-input-dealtype']//span[@class='private-dropdown__item__label']");
	
	public static void main (String [] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		
//		private By header = By.tagName("h1");
//		private By accountName = By.cssSelector(".account-name ");
//		private By settingIcon = By.cssSelector("a#navSetting");
//		private By contactsPageParentMenu=By.id("nav-primary-contacts-branch");
//		private By contactsPageSubMenu= By.id("nav-secondary-contacts");
//		private By salesPageMenu=By.id("nav-primary-sales-branch");
//		private By dealsPageLink = By.xpath("(//a[@id='nav-secondary-deals'])[position()=1]");
		
//		By header = By.cssSelector("h1[class*='IndexPageRedesignHeader']");
//		By createDeal = By.xpath("//span[text()='Create deal']");
//		By dealName = By.xpath("//input[@data-field='dealname']");
//		By amount = By.xpath("//input[@data-field='amount']");
		//By dealType = By.xpath("//div[@data-selenium-test='property-input-dealtype']");
//		By create = By.xpath("//span[text()='Create']");
//		By dealsBackLink = By.xpath("(//*[text()='Deals'])[position()=1]");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");
		
		driver.findElement(By.id("username")).sendKeys("mahi.cheers@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Boseji@jan23");
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("nav-primary-sales-branch")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@id='nav-secondary-deals'])[position()=1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create deal']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@data-field='dealname']")).sendKeys("Auto");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-field='amount']")).sendKeys("500");
		Thread.sleep(2000);
		//selectValueFromDropdown(dealType);
		//driver.findElement(dealType).sendKeys("New Business");
		driver.findElement(dealType).click();
		Thread.sleep(2000);
		List<WebElement> List = driver.findElements(dealType);
		System.out.println(List.size());
		
		for (WebElement ele : List) {
			
			String text = ele.getText();
			System.out.println("Value is: "+text);
		}
		
		
		
		
		
		
//		List<WebElement> elements = driver.findElements(By.xpath("//a[@id='nav-secondary-contacts']"));
//		for (WebElement ele : elements) {
//			
//			String str = ele.getText();
//			System.out.println(str);
//			if(str.equals("Contacts")) {
//				ele.click();
//				break;
//			}
//			
//		}
//		
		
		
		
		
		
		
		
	}
	
public static void selectValueFromDropdown(By locator) {
		
		List<WebElement> countryList = driver.findElements(locator);
		
		for (WebElement ele : countryList) {
			
			String text = ele.getText();
			System.out.println(text);
			
//			if(text.equals(value)) {
//				
//				ele.click();
//				break;
//			}
		}
		
		
	}

}
