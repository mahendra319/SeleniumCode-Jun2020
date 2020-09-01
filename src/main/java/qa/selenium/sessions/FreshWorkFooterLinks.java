package qa.selenium.sessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshWorkFooterLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://freshworks.com");
		
		//List<WebElement> footerLInks = driver.findElements(By.xpath("/html/body/footer/div/div/div/div/div/div/ul/li/a"));
		//List<WebElement> footerLInks = driver.findElements(By.xpath("//footer//div//ul[@class='footer-nav' or 'footer-nav social-connect-nav']/li/a"));
		//List<WebElement> footerLInks = driver.findElements(By.xpath("//footer//div//ul/li/a"));
		List<WebElement> footerLInks = driver.findElements(By.xpath("//footer//div[@class='footer-main']//ul/li/a"));
		
		//xPath: //footer//div//ul[@class='footer-nav' or 'footer-nav social-connect-nav']/li/a
		//xPath: //footer//div//ul/li/a
		//xPath: //footer//div[@class='footer-main']//ul/li/a

		System.out.println(footerLInks.size());
		
		for (int i =0; i<footerLInks.size(); i++) {
			
			System.out.println(i+" ---> "+footerLInks.get(i).getText());
			System.out.println(footerLInks.get(i).getAttribute("href"));
		}
		
		
		
		
		driver.quit();
		
	}

}
