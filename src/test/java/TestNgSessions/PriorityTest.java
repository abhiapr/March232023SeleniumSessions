package TestNgSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {  // no before no after ; but it'll run at alphabetical order
	
	@Test(priority=1)  // to test specific test we can make it as PRIORITY
	public void SearchTest() {
		System.out.println("SearchTest");
		Assert.assertEquals("Google", "Google"); //like act vs exp [validation]	
	}
	
	
	@Test (priority=2)
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook","macbook"); 	
	}
	
	
	@Test (priority=3) 
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000,1000); //pricing
		
	}
	
	@Test (priority=0)  //(priority=0) then this will be 1st priority ; We can Also give -ve priority just stupid INT QUES but practically we won't use
	public void paymentTest() {
		System.out.println("paymentTest");
		Assert.assertEquals(100,100);
	}
	
	@Test (priority=-1)  //(priority=-1) or -90
	public void emailTest() {
		System.out.println("emailTest");
		Assert.assertEquals("email is sent","email is sent");
	}
	
	// if 1st 3 TC are assigned with priority then , remaining 2 are non priority then it'll follow alphabetical order
	// email,payment then 1,2,3
	// if all 3 TC are same 3,3,3 then also alphabetical order. these r not in real  time
	// 1,2,3  then 30,31 it'll pick 

}
