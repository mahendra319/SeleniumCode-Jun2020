package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthenticationPopUpHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//to handle Authentication PopUps we need to send user name and password along with url
		//ex: https://username:password@domainname.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		WebElement ele =driver.findElement(By.tagName("p"));
		System.out.println(ele.getText());
		
		
		
		
		driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
