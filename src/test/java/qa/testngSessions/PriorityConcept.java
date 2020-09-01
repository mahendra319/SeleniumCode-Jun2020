package qa.testngSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	
	//priority can be Zero and Negative but in real time it is not recommended.
	
	@Test(priority=0) //Zero priority
	public void a_test() {
		System.out.println("a test");
	}
	
	@Test //No Priority
	public void b_test() {
		System.out.println("b test");
	}
	@Test(priority=1) //positive number
	public void c_test() {
		System.out.println("c test");
	}
	@Test(priority=-2) //Negative Number
	public void d_test() {
		System.out.println("d test");
	}
	@Test //No Priority
	public void e_test() {
		System.out.println("e test");
	}
	@Test(priority=-1) //Negative Number
	public void f_test() {
		System.out.println("f test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
