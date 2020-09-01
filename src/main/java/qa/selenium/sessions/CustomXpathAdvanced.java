package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpathAdvanced {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		// single slash '/' - will give direct child elements
			//ex: //body/div --->give 5 - hubspot 
		
		// double slash '//' - will give direct + indirect elements
			//ex: //body//div - give 30 - hubspot
		
		
	//backword traversing: it is available in xPath only
			//ex: //input[@id='username']/../../../../ - Each /.. will take you one step back
		
		
	// xPath with Child keyword: 
			//div[@class='private-form__input-wrapper']//child::input[@id='username']
		
		
	//xPath with parent keyword: 
			//ex: //input[@id='username']//parent::div - Backward Traversing - reaching immediate parent
			// ex: //input[@id='username']//parent::div/.. 
		
	//ancestor keyword: it will give you all the ancestors including parent, grandparent and great grandparent
			//ex: //input[@id='username']//ancestor::div
	
		
	driver.get("https://app.hubspot.com/login");
	Thread.sleep(5000);
	driver.findElement(By.id("username")).sendKeys("kamm.mahi@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Selenium@2020");
	driver.findElement(By.id("loginBtn")).click();
	
	Thread.sleep(3000);
	driver.navigate().to("https://app.hubspot.com/contacts/8230918/contacts/list/view/all/");
	Thread.sleep(5000);
		
//preceding-sibling: 
	// //span[text()='Brian Halligan (Sample Contact)']//ancestor::td//preceding-sibling::td//input[@type='checkbox']
		
//	driver
//	.findElement(By.xpath("//span[text()='Brian Halligan (Sample Contact)']//ancestor::td//preceding-sibling::td//input[@type='checkbox']"))
//	.click();	// xPath won't work (not clickable) since it is trying to click side of check box not exact text box. 'input' is not correct. span (parent of input) is the correct so we can
				//Achieve this using backward .. like below
	
//	driver
//		.findElement(By.xpath("//span[text()='Brian Halligan (Sample Contact)']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
//		.click(); //now it is working ...since 'span is correct'
//		
		
	selectContact("Cool Robot (Sample Contact)");
	selectContact("Brian Halligan (Sample Contact)");
		
//following-sibling: 
	//ex: //span[text()='Brian Halligan (Sample Contact)']//ancestor::td//following-sibling::td/a
		
		
	System.out.println(getContactEmailId("Brian Halligan (Sample Contact)"));
	
			
		
		
		
	}

	public static void selectContact(String name) {
		
		driver
		.findElement(By.xpath("//span[text()='"+name+"']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/.."))
		.click(); 
		
	}
	public static String getContactEmailId(String name) {
		
		return driver.findElement(By.xpath("//span[text()='Brian Halligan (Sample Contact)']//ancestor::td//following-sibling::td/a")).getText();
		
	}
}
