package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownMultiSelection {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		List<WebElement> cList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		System.out.println(cList.size());
		for (WebElement ele : cList) {
			String text =ele.getText();
			if(text.equals("choice 6")) {
				
				ele.click();
			}
			
		}
		
		
		
	}

	

}
