package qa.apptest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	
	@Test(priority=1)
	public void googleTitleTest() {
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void gooleUrlTest() {
		//driver.get("https://www.google.com");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.google.com/");
	}
	
	
	
	
}
