package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathWebtableTdCount {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187714/new-zealand-women-vs-south-africa-women-1st-odi-icc-womens-championship-2017-18-2021");
		
		Thread.sleep(5000);
		
		List<WebElement> element= driver.findElements(By.xpath("//a[text()='B Bezuidenhout']//ancestor::tr/td"));
		System.out.println(element.size());

	}

}
