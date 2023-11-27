package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	String name;
	
	@Test(expectedExceptions= {ArithmeticException.class,NullPointerException.class}) // now PASS
	public void searchTest() {
		System.out.println("searchTest");
		int i=9/0;  //Arithmetic exception =FAIL
		
		ExpectedExceptionConcept obj=new ExpectedExceptionConcept();  //create obj class
		obj=null;
		obj.name="naveen"; //NPE
		
		//this can be for emergency situation if client ask we can show green report. but at prod it'll show error
		// we can write 100 exception for 100 test cases it'll show as =Pass
		
		
	}
	

}
