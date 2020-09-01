package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleCaseStudy2 {

	static WebDriver driver;
	static String parentWindowId;
	static Set<String> windowHanldes;
	static Iterator<String> iterator;
	public static void main(String[] args) throws InterruptedException {
		
		//case 2: open one child browser window at time  and then come back to parent then jump to child ....
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.get("http://popuptest.com/goodpopups.html");
				System.out.println("*************First Popup*************************");
				driver.findElement(By.linkText("Good PopUp #1")).click();
				windowHanldes =driver.getWindowHandles();
				iterator = windowHanldes.iterator();
				parentWindowId =iterator.next();
				System.out.println("Parent Window Id: "+parentWindowId);
				String child1WindowId =iterator.next();	
				System.out.println("Child 1 Window Id: "+child1WindowId);
				driver.switchTo().window(child1WindowId);
				System.out.println("Child 1 Window url is: "+driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(parentWindowId);
				System.out.println("Parent Window url is: "+driver.getCurrentUrl());
				Thread.sleep(3000);
				System.out.println("*************Third Popup*************************");
				driver.findElement(By.linkText("Good PopUp #3")).click();
				windowHanldes =driver.getWindowHandles();
				iterator = windowHanldes.iterator();
				parentWindowId =iterator.next();
				parentWindowId=getWindowHandles(driver).next();
				System.out.println("Parent Window Id: "+parentWindowId);
				String child2WindowId = iterator.next();
				System.out.println("Child 2 Window Id: "+child2WindowId);
				driver.switchTo().window(child2WindowId);
				System.out.println("child 2 winow url is: "+driver.getCurrentUrl());
				driver.close();
				driver.switchTo().window(parentWindowId);
				System.out.println("Parent Window url is: "+driver.getCurrentUrl());
				System.out.println("*************Fourth Popup*************************");
				driver.findElement(By.linkText("Good PopUp #4")).click();
				windowHanldes =driver.getWindowHandles();
				iterator = windowHanldes.iterator();
				parentWindowId =iterator.next();
				System.out.println("Parent Window Id: "+parentWindowId);
				String child3WindowId = iterator.next();
				System.out.println("Child 3 Window Id: "+ child3WindowId);
				driver.switchTo().window(child3WindowId);
				System.out.println("child 3 Window url is: "+driver.getCurrentUrl());
				driver.close();
								
				driver.switchTo().window(parentWindowId);
				System.out.println("Parent Window url is: "+driver.getCurrentUrl());
				driver.quit();
				
	}
	
	public static Iterator<String> getWindowHandles(WebDriver driver) {
		
		Set<String> windowHanldes =driver.getWindowHandles();
		Iterator<String> iterator = windowHanldes.iterator();
		return iterator;
		
	}

}
