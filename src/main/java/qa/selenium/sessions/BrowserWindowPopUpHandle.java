package qa.selenium.sessions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpHandle {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		//browser window pop ups
		//advertisements pop ups
		//tabs 
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.get("http://popuptest.com/goodpopups.html");
	
	driver.findElement(By.linkText("Good PopUp #3")).click();
	
	
//getWindowHandles return Set of strings (BrowserWindow Ids). Set always holds/contains unique values
//Set is always non-Order based collection
	//Set<String> wHandles = driver.getWindowHandles();
	//System.out.println(wHandles.size());
//whenever to fetch values from non-orderbased collection, iterator() will use
	//Iterator<String> it=wHandles.iterator();
	//String parentWindowId = it.next();
			
//	driver.switchTo().window(childWindowId); //driver move to child window from parent window
//	System.out.println("Child Window Title is: "+driver.getTitle());
//	driver.close();
//	driver.switchTo().window(parentWindowId); //driver come back to parent window
//	System.out.println("Parent Window Title is: "+driver.getTitle());
//	driver.quit();
	
	Iterator<String> it =getWindowHandle();
	String parentWindowId = it.next();
		System.out.println("Parent Window Id: "+parentWindowId);
	String childWindowId = it.next();
		System.out.println("Child Window Id: "+childWindowId);
		System.out.println("Child Window Id: "+switchToChildBrowserWindow(childWindowId));
		System.out.println("Parent Window Id: "+switchToParentBrowserWindow(parentWindowId));
	driver.quit();
		
	}
	public static Iterator<String> getWindowHandle() {
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		return iterator;
	}
	public static String switchToChildBrowserWindow(String childWindId) {
		driver.switchTo().window(childWindId);
		String title= driver.getTitle();
		driver.close();
		return title;		
	}
	public static String switchToParentBrowserWindow(String parentWindId) {
		driver.switchTo().window(parentWindId); //driver come back to parent window
		return driver.getTitle();
				
	}
}