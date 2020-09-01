package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeBrowserLaunch {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		/*
		 * Edge Browser launch
		 */
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		/*
		 * IE browser launch
		 */
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
		
		//driver.close();

	}

}
