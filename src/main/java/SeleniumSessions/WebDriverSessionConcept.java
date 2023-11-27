package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverSessionConcept {

	public static void main(String[] args) {
		
		//CASE 1:QUIT
		
		//if i launch browser SESSION ID will be created
//		WebDriver driver=new ChromeDriver(); //sid=123
//		
//		//to debug=>  double click line no 13, it's break point after that it won't perform 
//		driver.get("https://www.google.com"); //sid=123
//		
//		//enter url
//		
//		String title=driver.getTitle(); // tab name
//		System.out.println("get title :" + title);//sid=123
//		
//		driver.getCurrentUrl();//sid=123
//		//browser will launch then error
//		driver.quit(); //sid=123 // till quit it'll use SAME SESSION ID for all the above methods
//		//SID becomes 123=>NULL
//		
//		//After QUIT, we need to open again
//		driver=new ChromeDriver();//sid=456 // like int i=10; then i=10 NOT INT
//		driver.get("https://www.google.com");//sid=456
//		 
//		//if i launch browser again ==>Exception is NoSuchSessionException: Session ID is null. 
//		//Using WebDriver after calling quit()?  =>SID= NULL
//		System.out.println(driver.getTitle());  // here session id will be NULL
		
		
		//CASE 2 : CLOSE = sid will remain same 123
		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("get title :" + title);
		driver.close(); //same sid  
		
		////NoSuchSessionException: invalid session id
		//System.out.println(driver.getTitle());  //here sid will become same or expired session
		
		//QUIT(sid=123) =>After quit, if we call: SID=NULL 
		//CLOSE(sid=123) ==> After close, same sid=>but INVALID SID.
		
		//we need to open browser again and call but get title (46) shd be commented after close
		 driver=new ChromeDriver(); 
		 driver.get("https://www.google.com");
		 System.out.println(driver.getTitle());  //opening 1st and close . again open and print title google
		
		
	}

}
