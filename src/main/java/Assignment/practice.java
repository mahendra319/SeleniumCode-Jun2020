package Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
//		Iterator<String> it =getWindowHandle();
//		String parentWindowId = it.next();
//			System.out.println("Parent Window Id: "+parentWindowId);
//		String childWindowId = it.next();
//			System.out.println("Child Window Id: "+childWindowId);
//			System.out.println("Child Window Id: "+switchToChildBrowserWindow(childWindowId));
//			System.out.println("Parent Window Id: "+switchToParentBrowserWindow(parentWindowId));
		
		List<String>handleList=browserWindowHandle();
		String pWindowId = handleList.get(0);
			System.out.println(pWindowId);
		String cWindowId = handleList.get(1);
			System.out.println(cWindowId);
			
			System.out.println("Child Window Id: "+switchToChildBrowserWindow(cWindowId));
			System.out.println("Parent Window Id: "+switchToParentBrowserWindow(pWindowId));
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
		
		public static List<String> browserWindowHandle() {
			Set<String> windowHandles = driver.getWindowHandles();
			List<String> arList=new ArrayList<String>(windowHandles);
			return arList;
			
		}

	}


