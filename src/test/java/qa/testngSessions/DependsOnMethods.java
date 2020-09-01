package qa.testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	
	@Test
	public void loginTest() {
		System.out.println("login test");
		//int i=9/0;
	}
	//if login pass then only these will execute.
	//if login fail then remaining test will skip from execution
	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("home page test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods= {"loginTest","homeTest"})
	public void searchTest() {
		System.out.println("search page test");
	}
	@Test(dependsOnMethods="loginTest")
	public void userInfoTest() {
		System.out.println("user info test");
	}
	
	
	
	

}
