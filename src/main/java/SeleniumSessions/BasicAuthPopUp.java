package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopUp {  // authentication pop up like user name/pwd with two pop up not as JS ALERT
	// we can't inspect pop up will freeze the page

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");  // need to give user name/pwd after protocol
		// Congratulations! You must have the proper credentials.
		
		// if pwd as "admin@123" it'll take it as url after @ =>value won't enter in the pop up. Use @ only once
		
		//appending
		String username="admin";
		String pwd="admin";
		driver.get("https://"+username+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//Basic Auth -INTERVIEW QUES(BTOA METHOD) 
		//username:password => encoded string
		//btoa method("username:pwd")  =>browser automatically generate encoded string  ERWDGSJK@#==
//		 cancel the pop up -> inspect-> console ==> btoa("username:password");  pass name/pwd
//		'dXNlcm5hbWU6cGFzc3dvcmQ='
		
		//we can decode by encoder to decoder  via online =>will get username /pwd 
//		String username="admin";
//		String pwd="admin123";
//		driver.findElement("https://"+username+":"+pwd+"@"+"the-internet.herokuapp.com/basic_auth");

	}

}
