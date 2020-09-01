package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting {
	
	public static WebDriver driver;

	public static void main(String[] args) {
				
		//Chrome driver
		String browser = "firefox";
		/*
		 * if(browser.equalsIgnoreCase("chrome")) {
		 * System.setProperty("webdriver.chrome.driver",
		 * "K:\\Naveen's_Selenium_Sessions\\chromedriver83\\chromedriver.exe"); driver =
		 * new ChromeDriver(); }
		 * 
		 * else if (browser.equalsIgnoreCase("firefox")) { //firefox
		 * //System.setProperty("webdriver.gecko.driver",
		 * "K:\\Naveen's_Selenium_Sessions\\GeckoDriver\\geckodriver.exe"); //driver =
		 * new FirefoxDriver(); } else if(browser.equals("edge")) {
		 * System.setProperty("webdriver.edge.driver",
		 * "K:\\Naveen's_Selenium_Sessions\\EdgeDriver\\msedgedriver.exe"); driver = new
		 * EdgeDriver();
		 * 
		 * } else { System.out.println("Please pass the correct browser name"); }
		 */
		
		//OR
		
		switch(browser){
			
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "K:\\Naveen's_Selenium_Sessions\\chromedriver83\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","K:\\Naveen's_Selenium_Sessions\\GeckoDriver\\geckodriver.exe");
			driver =new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver","K:\\Naveen's_Selenium_Sessions\\EdgeDriver\\msedgedriver.exe"); 
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass correct browser name:");
			break;
		}
		
		
		
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("title is correct");
		}else {
			System.out.println("incorrect title");
		}
		
		driver.quit();

	}

}
