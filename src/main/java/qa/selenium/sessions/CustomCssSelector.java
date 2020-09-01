package qa.selenium.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomCssSelector {

	static WebDriver driver; 
	public static void main(String[] args) {

		//id: #id
		//class: .classname
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://app.hubspot.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//parent to child: 
		// syntax: parent htmltag.classname>childhtmltag
			//ex: div.private-form__input-wrapper>input -hubspot
			//ex: ul.footer-nav>li>a - freshworks
					//OR
		//syntax: parent htmltag.classname childhtmltag
			//ex: div.private-form__input-wrapper input
			//ex: ul.footer-nav li a
		
	//contains():  In CssSelector contains() function represents with *
		//syntax: htmltag[attribute*='value']
			//ex: input[id*='user']
		
	//starts-with: In CssSelector starts-with() function represents with ^
		//syntax: htmltag[attribute^='value']
			//ex: input[id^='user']
		
	//ends-with(): In CssSelector ends-with() functions represents with $
		//syntax: htmltag[attribute$='value']
			//ex: input[id$='name']
		
	//comma in CssSelector: is used for collection of different elements
		//syntax: htmltag#id, htmltag#id, htmltag#id OR #id, #id, #id
			//ex: #username, #password, #loginBtn
					//OR
		//syntax: htmltag.classname, htmltag.classname, htmltag.classname  OR .classname, .classname, .classname
			//ex: input.login-email, input.login-password, input.login-submit  - hubspot
		
		int mandatoryFieldsCount = driver.findElements(By.cssSelector("#username, #password, #loginBtn,.private-checkbox__text")).size();
		System.out.println(mandatoryFieldsCount);
		if(mandatoryFieldsCount==4) {
			
			System.out.println("Login form is displayed with username, password ,login button and remember me elements");
		}
		
		
		//nth-of-type :
			//ex: ul.footer-nav>li:nth-of-type(3) -freshworks
			//ex: ul.footer-nav>li:nth-of-type(3)>a
		
		//following sibling: only following sibling possible in CssSelector. preceding-sibling is not possible
			//ex: div.private-form__input-wrapper + div
		
		//not operator in CssSelector: 
			//ex: input.form-control.private-form__control:not(#password)   - it will exclude password element from collection
			//ex: input.form-control.private-form__control:not(.login-email) - it will exclude username element from collection
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
