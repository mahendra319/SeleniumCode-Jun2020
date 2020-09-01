package qa.testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionsConcept {
	
	//expectedExceptions makes test pass i.e. bypassing exception
	@Test(expectedExceptions = ArithmeticException.class)
	//we can use Exception.class or throwable.class both are super class of ArithmeticException
	//but we can't use NullPointerException in this scenario, since we are expecting ArithmeticException but giving NullPointerException
	//we cann't use Error...since we are expecting Exception but giving Error
	public void myTest() {
		System.out.println("my test");
		int i =7/0;
	}

	
	
	
	
	
	
	
	
	
}
