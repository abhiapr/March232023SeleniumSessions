package TestNgSessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUD {  // FAM INT QUE
	//int UserId;
	//  CRUD - Add/Get/Update/Delete
	
	//so creating generic for USER ID
	public int addUser() {
		System.out.println("adding user");
		int userid=123; // for ex ;. for QA env not for STAGE env
		return userid;
	}
	
	
	@Test(priority=1)
	public void addUserTest() {
		
		int userId= addUser(); //calling here
		Assert.assertEquals(userId, 123);
		
		
		
//		System.out.println("Adding an user"); // if i'm getting server error ; User id can be BLANK/couldn't generated or any issue exists
//		int i=9/0; // AE making exception here
		//UserId=123; // for ex: default user id will be  = 0		
	}
	
	// it'll fail both 1,2 Test cases
	@Test(priority=2)
	public void getUserTest() {
		int userId= addUser();
		System.out.println("get the user for User Id: " +userId );  // User ID will not be taken it'll be 0
	}
	
//	Adding an user
//	get the user for User Id: 0
//	PASSED: getUserTest
//	FAILED: addUserTest
	@Test(priority=3)
	public void updateUserTest() {
		int userId= addUser();
		System.out.println("update the user for User Id: " +userId );  // User ID will not be taken it'll be 0
	}
	
	@Test(priority=4)
	public void DeleteUserTest() { // what if same user id got Deleted. then all will fail.so Not work on UAT/PROD.
		// Never hard code .
		int userId= addUser();
		System.out.println("Delete the user for User Id: " +userId );  // User ID will not be taken it'll be 0
	}

// all will fail ; if i add dependencies => then remaining all will be skipped
	
//DON'T USE DEPENDENCIES TC SHOULD BE INDEPENDENT
}
