package qa.selenium.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopUp {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//condition: type ="file" - attribute should be available otherwise sendkeys method won't work
		//99% cases type="file" attribute available. if not available we can request to developer to add 'type' attribute
		driver.findElement(By.name("upfile")).sendKeys("K:\\Naveen's_Selenium_Sessions\\exFile.txt");
		
		//AutoIT : is a third party utility to upload documents. But it is works only for window. it won't works on Linux machines and could. so forgot about AutoIt

	}

}
