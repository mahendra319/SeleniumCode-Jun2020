package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * this is browser util having different browser related functions
 * @author Mahendra
 *
 */
public class BrowserUtil {
	
	public WebDriver driver;
	
	/**
	 * this method is use to launch the browser on the basis of given browser name
	 * @param browserName
	 * @return driver
	 */
	public WebDriver launchBrowser(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			
			System.out.println("Please pass correct browser Name: "+ browserName);
		}
		
		return driver;
	}
	
	/**
	 * this method is used to launch specified url
	 * @param url
	 */
	public void launchURL(String url) {
		
		driver.get(url);
		
	}
	
	/**
	 *  this is used to get title
	 * @return page title
	 */
	public String getPageTitle() {
		
		return driver.getTitle();
	}
	
	/**
	 * this method used to get current URL
	 * @return page URL
	 */
	public String getPageURL() {
		
		return driver.getCurrentUrl();
	}
	/**
	 * this method is used to close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}
	
	/**
	 * this is used to close the browser
	 */
	public void quitBrowser() {
		driver.quit();
	}
	
	
	

}
