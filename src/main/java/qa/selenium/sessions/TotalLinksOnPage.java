package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinksOnPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		
		System.out.println("Total No. of Links are: "+linksList.size());
		
//		for (int i=0; i<linksList.size(); i++) {
//			String linkText = linksList.get(i).getText();
//						
//			if (!linkText.isEmpty()) {
//				
//				System.out.println(i+"--->"+linkText);
//				System.out.println(linksList.get(i).getAttribute("href"));
//				}
//		}
//		
//		for (WebElement ele : linksList) {
//			
//			if(!ele.getText().isEmpty()) {
//				System.out.println(ele.getText());
//				//System.out.println(ele.getSize()); // return dimension width and height of the element
//				System.out.println(ele.getAttribute("href"));
//					
//			}
//			
//		}
		
		linksList.stream()
						
						.filter(ele -> !ele.getText().isEmpty())
						.forEach(ele -> System.out.println(ele.getText()+" \n"+ ele.getAttribute("href")));
						
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
