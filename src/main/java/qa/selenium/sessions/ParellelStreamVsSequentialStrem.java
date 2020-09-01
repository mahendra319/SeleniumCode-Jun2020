package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelStreamVsSequentialStrem {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> linksList=driver.findElements(By.tagName("a"));
		
		System.out.println("Total No. of Links are: "+linksList.size());

		
		long startTime = System.currentTimeMillis();
		linksList.stream().forEach(ele -> System.out.println(ele.getText()));
		//linksList.stream().parallel().forEach(ele -> System.out.println(ele.getText()));
		long endTime = System.currentTimeMillis();
		
		System.out.println("Total Time Taken: "+ (endTime-startTime));
		
		
		
		
		
	}

}
