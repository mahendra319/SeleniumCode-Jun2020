package Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandleCaseStudy1 {

	public static void main(String[] args) {

		//case 1: open multiple child browser windows and then jump to child to child then finally come to parent
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #1")).click();
		driver.findElement(By.linkText("Good PopUp #3")).click();
		driver.findElement(By.linkText("Good PopUp #4")).click();
		
		Set<String> windowHanldes =driver.getWindowHandles();
		System.out.println(windowHanldes.size());
		
		Iterator<String> iterator = windowHanldes.iterator();
		
		String parentWindowId =iterator.next();
		System.out.println("Parent Window Id: "+parentWindowId);
		
		String child1WindowId =iterator.next();	
		System.out.println("Child 1 Window Id: "+child1WindowId);
		
		String child2WindowId = iterator.next();
		System.out.println("Child 2 Window Id: "+child2WindowId);
		
		String child3WindowId = iterator.next();
		System.out.println("Child 3 Window Id: "+ child3WindowId);
		
		driver.switchTo().window(child3WindowId);
		System.out.println("child 3 Window url is: "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(child2WindowId);
		System.out.println("child 2 winow url is: "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(child1WindowId);
		System.out.println("Child 1 Window url is: "+driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window url is: "+driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
