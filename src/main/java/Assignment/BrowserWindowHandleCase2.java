package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleCase2 {

	static WebDriver driver;
	static String parentWindowId;
	static Iterator<String> it;
	public static void main(String[] args) throws InterruptedException {
		
	
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.get("http://popuptest.com/goodpopups.html");
				
				driver.findElement(By.linkText("Good PopUp #1")).click();
				System.out.println("*********First popup******************************");
				it=getWindowHandles();
				parentWindowId=it.next();
				System.out.println("Parent Window Id: "+parentWindowId);
				String child1WindowId=it.next();
				System.out.println("Child 1 Window Id: "+child1WindowId);
				driver.switchTo().window(child1WindowId);
				System.out.println("Child 1 Window url is: "+driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(parentWindowId);
				System.out.println("Parent Window url is: "+driver.getCurrentUrl());
				Thread.sleep(3000);
				System.out.println("****************Thrid popup*********************************");
				driver.findElement(By.linkText("Good PopUp #3")).click();
				it=getWindowHandles();
				parentWindowId=it.next();;
				System.out.println("Parent Window Id: "+parentWindowId);
				String child2WindowId=it.next();
				System.out.println("Child 2 Window Id: "+child2WindowId);
				driver.switchTo().window(child2WindowId);
				System.out.println("child 2 winow url is: "+driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(parentWindowId);
				System.out.println("Parent Window url is: "+driver.getCurrentUrl());
				System.out.println("********************Fourth popup***********************");
				driver.findElement(By.linkText("Good PopUp #4")).click();
				it=getWindowHandles();
				parentWindowId=it.next();
				System.out.println("Parent Window Id: "+parentWindowId);
				String child3WindowId=it.next();
				System.out.println("Child 3 Window Id: "+ child3WindowId);
				driver.switchTo().window(child3WindowId);
				System.out.println("child 3 Window url is: "+driver.getCurrentUrl());
				driver.close();
								
				driver.switchTo().window(parentWindowId);
				System.out.println("Parent Window url is: "+driver.getCurrentUrl());
				driver.quit();
				
	}
	
	public static Iterator<String> getWindowHandles() {
		
		Set<String> windowHanldes =driver.getWindowHandles();
		Iterator<String> iterator = windowHanldes.iterator();
		return iterator;
		
	}

}
