package TestNgSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest { //Invocation =RUN . 
	
	@Test(invocationCount=10,priority=1) //so how many times we want to run the test ; run 10 times
	
	 // @Test(invocationCount=10,priority=1,expectedExceptions.class)  // we'r Expecting some exception but not so all 10 TC will fail
	public void searchTest() {
		System.out.println("searchTest");
		Assert.assertEquals("Google", "Google"); // it'll run 1/10...10/10 = 10 times
	}
	
	@Test (priority=2)  // run 1 time
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook","macbook"); 	
	}

}
