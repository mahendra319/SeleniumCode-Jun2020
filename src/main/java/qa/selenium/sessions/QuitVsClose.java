package qa.selenium.sessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle()); // google
		
		//driver.quit();
		driver.close();
		
		System.out.println(driver.getTitle());
		//quit()-org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//NoSuchSessionException: invalid session id - close()

	}

}
