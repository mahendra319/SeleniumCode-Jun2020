package qa.testngSessions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvocationCountConcept {

	@BeforeTest(enabled=false)
	public void setUp() {
		System.out.println("launch browser");
	}
	
	@Test(invocationCount=5,priority=3,enabled=false)
	public void creatUserTest() {
		System.out.println("create user test...");
	}
	
	@Test(priority=4)
	public void a_test() {
		System.out.println("a test");
	}
	
	@Test(priority=1)
	public void b_test() {
		System.out.println("b test");
	}
	@Test(priority=2,enabled=false)
	public void c_test() {
		System.out.println("c test");
	}
}
