package qa.selenium.sessions;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.crmpro.com");
		
		/*
		 * PageTitle: using JavascriptExceution - equivalent method in selenium 'driver.getitle()'
		 */
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		String title =js.executeScript("return document.title;").toString();
//		System.out.println(title);
		
		
		//above JavaScript code is wrapping into reusable method : getTitleByJS
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getTitleByJS(); //
		System.out.println(title);
		
		//jsUtil.refreshBrowserByJS(); //"history.go(0)" - Equivalent in Selenium: driver.navigateTo().refresh();
		
		//jsUtil.generateAlert("This is JavaScriptExecutor Alert");
		
		//String pageInnerText = jsUtil.getPageInnerText(); //this is not available in Selenium
		//System.out.println(pageInnerText);
		
		
		
		WebElement uName=driver.findElement(By.name("username"));
		WebElement passwd = driver.findElement(By.name("password"));
		WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		//jsUtil.drawBorder(login); //draw border for given webelement
		
		//String browserInfo = jsUtil.getBrowserInfo();
		//System.out.println(browserInfo);
		
//		jsUtil.flash(uName);
//		uName.sendKeys("mahi@gmail.com");
//		jsUtil.flash(passwd);
//		passwd.sendKeys("test@123");
//		jsUtil.flash(login);
//		login.click();
		
		//uName.sendKeys("mahi@gmail.com");//selenium sendkeys
		//passwd.sendKeys("test123");
		//jsUtil.sendKeysUsingJSWithId("username", "test123"); // Javascript sendKeys
		//jsUtil.clickElementByJS(login); // javascript click
		
		jsUtil.scrollPageDown();
		
		//jsUtil.scrollIntoView(element);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
