package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		
		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));		
		
//		System.out.println(langLinks.size());
//		
//		for (WebElement ele : langLinks) {
//			
//			System.out.println(ele.getText());
//			
//			if (ele.getText().equals("తెలుగు")) {
//				
//				ele.click();
//				break;
//			}
//			
//		}
		
		doLinkClick(langLinks, "తెలుగు");
		
		

	}
	
	public static void doLinkClick(List<WebElement> linkList, String value) {
		
	System.out.println(linkList.size());
		
		for (WebElement ele : linkList) {
			
			System.out.println(ele.getText());
			
			if (ele.getText().equals(value)) {
				
				ele.click();
				break;
			}
			
		}
		
	}
	
	
	

}
