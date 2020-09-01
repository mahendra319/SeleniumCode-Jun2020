package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Actions actions = new Actions(driver);
		
		//actions.moveToElement(driver.findElement(By.tagName("b")));
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.name("photofile")).sendKeys("K:\\Naveen's_Selenium_Sessions\\apple.png");
		

	}

}
