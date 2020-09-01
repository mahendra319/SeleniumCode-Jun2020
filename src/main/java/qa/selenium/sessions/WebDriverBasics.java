package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//open browser
		//enter url
		//verify title
		//close the browser
		
		System.setProperty("webdriver.chrome.driver", "K:\\Naveen's_Selenium_Sessions\\chromedriver83\\chromedriver.exe");
		//WebDriver is a Interface and we can't create object
		//top casting - ChromeDriver is a child class. child class object is referred by parent interface(WebDriver) reference variable
		WebDriver driver = new ChromeDriver(); //launch the browser
		driver.manage().window().maximize();
		//driver.get("www.google.com");//InvalidArgumentException - url must specify with http or https
		
		driver.get("https://www.google.com"); // enter URL
		
		System.out.println("Browser title is: "+driver.getTitle());
		
		String bTitle = driver.getTitle(); // return title - actual value
		
		
		
		//validation / check point
		if(bTitle.equals("Google")) {
			
			System.out.println("CorrectTitle");
		}
		else {
			System.out.println("Title is not correct");
		}
			
		System.out.println("Current URL is: "+driver.getCurrentUrl());
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("google")) {
			
			System.out.println("Correct URL");
			
		}
		else
		{
			System.out.println("Incorrect URL");
		}
		
		//driver.getPageSource();// return complete page source
		
		
		driver.quit(); // close the browser
		

	}

}
