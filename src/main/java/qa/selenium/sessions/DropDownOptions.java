package qa.selenium.sessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By countryList = By.id("Form_submitForm_Country");
		By industryList = By.id("Form_submitForm_Industry");
		By employeesList = By.id("Form_submitForm_NoOfEmployees");
		
		//WebElement countryEle= driver.findElement(countryList);
		
		//WebElement countryEle = getElement(countryList);
		
		
//		Select select = new Select(countryEle);
//		
//		List<WebElement> ctryOptions = select.getOptions();
//		
//		System.out.println(ctryOptions.size());
		
		System.out.println(getDropdownOptionsCount(countryList));
		List<String> countryOptions = getDropdownOptionsValue(countryList);
		for (String countryName : countryOptions) {
			
			System.out.println(countryName);
			
		}
		
		

				
				
		driver.quit();		
				
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	public static int getDropdownOptionsCount(By locator) {
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		return optionsList.size();
		
	}
	
	public static List<String> getDropdownOptionsValue(By locator) {
		//top cast: List is parent interface for ArrayList class. 
		List<String> textList= new ArrayList<String>();
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		//optionsList.stream().forEach(ele -> System.out.println(ele.getText()));
		
		for (WebElement ele : optionsList) {
			
			String value = ele.getText();
			textList.add(value);
		}
		return textList;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
