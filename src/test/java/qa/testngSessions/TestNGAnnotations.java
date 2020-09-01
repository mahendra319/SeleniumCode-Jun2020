package qa.testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	//TestNg plugIn: to run testng scripts in eclipse
	//TestNg dependency: to run test scripts from maven or jenkins...
	
	//@Test : tests execute based on Alphabet order of test name (if we not mention priority of test case)
/**
 *  BS----Connect to DataBase
	BT----Create user in DB
	BC---launch Browser
	
	BM----login to Application
		home Page Advanced Search test
	AM---LogOut of application
	
	BM----login to Application
		home Page Profile Test
	AM---LogOut of application
	
	BM----login to Application
		home page search test
	AM---LogOut of application
	
	BM----login to Application
		home page title test
	AM---LogOut of application
	
	AC----Close Browser
	AT---Delete user in DB
	AS---Disconnect DB
 */
	//1
	@BeforeSuite
	public void connectDataBase() {
		System.out.println("BS----Connect to DataBase");
	}
	//2
	@BeforeTest
	public void createUserinDB() {
		System.out.println("BT----Create user in DB");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---launch Browser");
	}
	//4//7/10/13
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM----login to Application");
	}
	
	
	//14
	@Test
	public void homePageTitleTest() {
		
		System.out.println("home page title test");
	}
	//11
	@Test
	public void homePageSearchTest() {
		
		System.out.println("home page search test");
	}
	//5
	@Test
	public void homePageAdvSearchTest() {
		System.out.println("home Page Advanced Search test");
	}
	//8
	@Test
	public void homePageProfileTest() {
		System.out.println("home Page Profile Test");
	}
	//6//9/12/15
	@AfterMethod
	public void logoutApp() {
		System.out.println("AM---LogOut of application");
	}
	//16
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC----Close Browser");
	}
	//17
	@AfterTest
	public void deleteUserInDB() {
		System.out.println("AT---Delete user in DB");
	}
	//18
	@AfterSuite
	public void disConnectDB() {
		System.out.println("AS---Disconnect DB");
	}
}
