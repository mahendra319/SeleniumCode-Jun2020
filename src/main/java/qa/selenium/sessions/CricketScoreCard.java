package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricketScoreCard {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187714/new-zealand-women-vs-south-africa-women-1st-odi-icc-womens-championship-2017-18-2021");
		
		Thread.sleep(5000);
		System.out.println(getWicketTakerName("B Bezuidenhout"));
		System.out.println(getWicketTakerName("SW Bates"));
		
		
		
	}

	public static String getWicketTakerName(String batsmanName) {
		
		return driver.findElement(By.xpath("//a[text()='"+batsmanName+"']//parent::td//following-sibling::td/span")).getText();
	}
	
	
}
