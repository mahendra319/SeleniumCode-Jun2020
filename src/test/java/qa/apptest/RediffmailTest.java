package qa.apptest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffmailTest extends BaseTest{

	
	@Test(priority=1)
	public void rediffMailTitleTest() {
		driver.get("https://www.rediff.com/");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
	}
	
	@Test(priority=2)
	public void rediffMailUrlTest() {
		//driver.get("https://www.rediff.com/");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.rediff.com/");
	}
	
	

}
