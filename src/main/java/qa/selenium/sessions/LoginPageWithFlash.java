package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithFlash {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.launchBrowser("chrome");
		
		br.launchURL("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
		By uName = By.id("username");
		By pwd = By.id("password");
		By loginBtn = By.id("loginBtn");
		By signUpLink = By.linkText("Sign up");
		By googleBtn = By.className("buttonText");
		
		ElementUtil eUtil = new ElementUtil(driver);
		
		eUtil.doIsDisplayed(uName);
		eUtil.doIsDisplayed(pwd);
		eUtil.doIsDisplayed(loginBtn);
		eUtil.doIsDisplayed(signUpLink);
		eUtil.doIsDisplayed(googleBtn);
		
		eUtil.doSendKeys(uName, "Mahi@gmail.com");
		eUtil.doSendKeys(pwd, "test@123");
		eUtil.doClick(loginBtn);
	
	
	}

}
