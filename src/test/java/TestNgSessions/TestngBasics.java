package TestNgSessions;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//No main method needed testng will handle internally 
// it's java class only

public class TestngBasics {
	
	//Global Pre-condition if available (like : system is up n running)	
	//Pre-condition 
	//Test steps - act Vs Exp -->assertion =P/F
    // post steps (close browser)
	//Testng- everything is void in nature no return
	
	
	
	
	
	
	//==============
//	BS---ConnectWithDB
//	BT ---createUser
//	BC ---LaunchBrowser
//	BM---longToApp
//	SearchTest
//	AT---logout
	
//	BM---longToApp
//	cartTest
//	AT---logout
//	BM---longToApp
//	orderTest
//	AT---logout
//	AC---closeBrowser
//	AT---deleteUser
	
	
	//1 . order number while running ==> IMP INT QUE
	@BeforeSuite 
	//import comes from testng
	public void ConnectWithDB() {
		System.out.println("BS---ConnectWithDB");		
	}
	
	//2.
	@BeforeTest
	public void createUser() {
		System.out.println("BT ---createUser");	
	}
	
	//3.
	@BeforeClass
	public void LaunchBrowser() {
		System.out.println("BC ---LaunchBrowser");		
	}
	
	//4. //7. //10.
	//this method will run before each & every TEST CASES. so, BM method will run 3 times
	@BeforeMethod
	public void longToApp() {
		System.out.println("BM---longToApp");
	}
	
	 // these are test cases ; This will run based on Alphabetical Order
	
	//11.
	@Test 
	public void SearchTest() {
		System.out.println("SearchTest");
		Assert.assertEquals("Google", "Google"); //like act vs exp [validation]	
	}
	
	//5.
	@Test 
	public void cartTest() {
		System.out.println("cartTest");
		Assert.assertEquals("macbook","macbook"); 	
	}
	
	//8.
	@Test 
	public void orderTest() {
		System.out.println("orderTest");
		Assert.assertEquals(1000,1000); //pricing
		
	}
	
	// this method will run AFTER each TEST CASES like Before method
	//6. //9. //12.
	@AfterMethod
	public void logout() {
		System.out.println("AT---logout");	
	}
	
	//13.
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---closeBrowser");	
	}
	
	//14.
	@AfterTest
	public void deleteUser() {
		System.out.println("AT---deleteUser");		
	}
	
	//15.
	@AfterSuite
	public void disConnectWithDB() {
		System.out.println("AS---disConnectWithDB");
		
	}
	
	//so order doesn't matter while writing code .Testng will perform in order
	//if i change act vs exp value = error ; diff will be shown in red color
	// if i comment test cases => NO TEST CASES FOUND
	
	
	

}
