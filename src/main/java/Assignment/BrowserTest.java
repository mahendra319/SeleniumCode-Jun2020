package Assignment;

import org.openqa.selenium.WebDriver;


public class BrowserTest {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {

				
		BrowserUtil br = new BrowserUtil(driver);
		driver = br.launchBrowser();
		
		br.launchURL("https://www.freshworks.com");
		
		br.quitBrowser();
		
	}

}
