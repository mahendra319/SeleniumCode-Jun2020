package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jQueryDropDownHandle {

	public static WebDriver driver;
	
	public static final String all_values = "all"; //static constant variable
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		Thread.sleep(2000);
		
		
		Thread.sleep(3000);
		
		////span[@class='comboTreeItemTitle']
		
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//single value selection
		//selectChoiceValue(choices, "choice 3");
		
		//Multiple values selection
		//selectChoiceValue(choices, "choice 1","choice 2","choice 6 2 1","choice 7");
		
		//all selection
		selectChoiceValue(choices, jQueryDropDownHandle.all_values);
		
		Thread.sleep(8000);
		driver.quit();
		
		}
	
	public static void selectChoiceValue(By locator, String... value) {
		
		
		
		List<WebElement> choiceList = driver.findElements(locator);

		if (! value[0].equalsIgnoreCase(jQueryDropDownHandle.all_values)) {
			
		
			for(int i=0; i<choiceList.size(); i++) {
			
				String choiceText = choiceList.get(i).getText();
			
				System.out.println(choiceText);
			
				for (int j=0; j<value.length;j++) {
				
					if(choiceText.equals(value[j])) {
					
						choiceList.get(i).click();
						break;
					}
				}
			
			}
		
		}
		
		//for all values:
		else {
			try {
					
				for(int all=0; all<choiceList.size();all++) {
					
					choiceList.get(all).click();
				}
			} catch (Exception e) {
			
						}
		
		
		}
	}
}
