package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		WebElement country = driver.findElement(By.id("Form_submitForm_Country"));
		//country.sendKeys("India");
		
		
		//select html tag: for drop down -- we need to use Select class
		
//		Select select = new Select(country);
//		
//		select.selectByVisibleText("India");
//		Thread.sleep(3000);
//		select.selectByValue("Angola");
//		Thread.sleep(3000);
//		select.selectByIndex(3);
		
		By countryList = By.id("Form_submitForm_Country");
		By industryList = By.id("Form_submitForm_Industry");
		By employeesList = By.id("Form_submitForm_NoOfEmployees");
		
		
		
		selectDropDownValueByVisibleText(countryList, "India");
		selectDropDownValueByValue(industryList, "Aerospace");
		selectDropDownValueByIndex(employeesList, 5);
	}
	
	public static WebElement  getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static void selectDropDownValueByVisibleText(By locator, String value) {
		
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
	}
	
	public static void selectDropDownValueByIndex(By locator, int index) {
		
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropDownValueByValue(By locator, String value) {
	
	Select select = new Select(getElement(locator));
	select.selectByValue(value);
}
	
	
	
	
	

}
