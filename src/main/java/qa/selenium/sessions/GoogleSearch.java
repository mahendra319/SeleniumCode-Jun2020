package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("slenium testing");
		
		Thread.sleep(3000);
		
		List<WebElement> searchList = driver.findElements(By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']/span"));
		
		System.out.println(searchList.size());
		
		//findFirst returns Optional WebElement, so converting WebElement 'ele' into Optional<WebElement> is not recommended. Hence added '.orElse(null) method' along with findFirst() method
		
		WebElement ele = searchList.stream().filter(sList -> sList.getText().equals("selenium testing framework")).findAny().orElse(null);
											//.filter(sList -> sList.getText().equals("selenium testing framework")).findFirst().orElse(null);
											//.forEach(suggessionList -> System.out.println(suggessionList.getText()));
		ele.click();
								
//		for(int i =0; i<searchList.size(); i++) {
//			
//			System.out.println(i+ "--->"+searchList.get(i).getText());			
//			String text = searchList.get(i).getText();
//						
//			if(text.equals("selenium testing framework")) {
//				
//				searchList.get(i).click();
//				break;
//			}
//			
//		}

//		
//		for (WebElement suggessionList : searchList) {
//			
//			String text = suggessionList.getText();
//			System.out.println(text);
//			
//			if(text.equals("selenium testing framework")) {
//				
//				suggessionList.click();
//				break;
//			}
//			
//		}
		
		
		
		
	}

}
