package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class CaseStudyCloseVSQuit {
	
	public static void main(String args[]) {
		WebDriver driver=new  ChromeDriver();
		
		// Case 1: QUIT()
		//driver.get("https://www.google.com");
		//("https://www.google.com"); 
		String title=driver.getTitle();
		driver.quit();  // from open to quit same Session id:123a
		
		//if i again fetch title then SID: NULL
		//String title=driver.getTitle();
		
		//CASE 2: CLOSE()
		//String title=driver.getTitle();
		driver.close();  // same session id 
		//String title=driver.getTitle();  //INVALID SESSION ID 
		}
	
	
	
}

	
	


