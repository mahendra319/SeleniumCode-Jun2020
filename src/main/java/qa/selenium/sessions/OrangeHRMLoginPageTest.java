package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPageTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		//https://opensource-demo.orangehrmlive.com/
		String bName = "chrome";
		
		By uName = By.id("txtUsername");
		By pwd = By.id("txtPassword");
		By btn = By.id("btnLogin");
		
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.launchBrowser(bName);
		br.launchURL("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		String pTitle = br.getPageTitle();
		System.out.println("Page Title is: "+pTitle);
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(uName, "Admin");
		eleUtil.doSendKeys(pwd, "admin123");
		eleUtil.doClick(btn);
		
		
		  Thread.sleep(5000); 
		  System.out.println(br.getPageTitle()); 
		  br.closeBrowser();
		 
		
		
		
		

	}

}
