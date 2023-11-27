package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test()
	public void loginTest() {
		System.out.println("login to app");
		int i=9/0;	  // will fail AE
	}
	
	
	// this won't run = so, empty pattern(bad approach) writing (we won't use and not standard one) ==>SKIPPED Test cases
	@Test(dependsOnMethods="loginTest")  // for dependencies
	public void appSearchTest() {
		System.out.println("search Test");
	}
	
	@Test(dependsOnMethods="appSearchTest")
	public void SelectProductTest() {
		System.out.println("SelectProductTest");
	}
	
	//CRUD
	// we won't use dependencies
	// so we'll create login method as generic
	//bad approach for parallel execution
	
	//follow workflow as: login-->home page-->search-->cart-->payment ---test
}
