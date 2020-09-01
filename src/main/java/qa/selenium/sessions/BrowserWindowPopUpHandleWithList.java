package qa.selenium.sessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandleWithList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		List<String> windowList = new ArrayList<String>(handles);
		
		String parentWindowId =windowList.get(0);
		System.out.println("Parent Window Id: "+parentWindowId);
		
		String childWindowId =windowList.get(1);
		System.out.println("Child Window Id: "+childWindowId);
		
		driver.switchTo().window(childWindowId);
		System.out.println("Child Window Title is: "+driver.getTitle());
		driver.close();
		
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title is: "+driver.getTitle());
		driver.quit();
		//driver.close();
		
		
		
		
		
	}

}
