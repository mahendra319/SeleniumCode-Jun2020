package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrickInfoScoreCard {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/8674/scorecard/1187714/new-zealand-women-vs-south-africa-women-1st-odi-icc-womens-championship-2017-18-2021");
		Thread.sleep(5000);
		
		ArrayList<String> scoreCard = getBatsmanScoreCard("KT Perkins");
		for(int i=2;i<scoreCard.size();i++) {
			
			System.out.println(scoreCard.get(i));
		}

	}
	
	//xPath: 
	
	//   (//a[text()='"+playerName+"']//parent::td//following-sibling::td)[position()="+i+"]
										//OR
	//   (//a[text()='"+playerName+"']//parent::td//following-sibling::td)["+i+"]
									//OR
	//   (//a[text()='"+playerName+"']//ancestor::tr//td)["+i+"]
	
	public static ArrayList<String> getBatsmanScoreCard(String playerName) {
					
		ArrayList<String> ar = new ArrayList<String>();
		List<WebElement> element= driver.findElements(By.xpath("//a[text()='"+playerName+"']//ancestor::tr/td"));
		int tdCount=element.size();
		for(int i =1 ; i<=tdCount;i++) {
			//String score= driver.findElement(By.xpath("(//a[text()='"+playerName+"']//parent::td//following-sibling::td)[position()="+i+"]")).getText();
			//String score= driver.findElement(By.xpath("(//a[text()='"+playerName+"']//parent::td//following-sibling::td)["+i+"]")).getText(); //this will give us from wicketTaker
			String score= driver.findElement(By.xpath("(//a[text()='"+playerName+"']//ancestor::tr//td)["+i+"]")).getText(); //this will give starting from Name of the batsman
			ar.add(score);
			//System.out.println(score);
		}
		return ar;
	}
}
