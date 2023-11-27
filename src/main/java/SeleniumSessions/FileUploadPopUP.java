package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP {  // work only type="file" should be there

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//typr=file
		driver.findElement(By.name("upfile")).sendKeys("path name");
		
		//by.name("up file").sendKeys("c://user:abhi:document:filename");
		
		
		// INTERVIEW QUE
		
		// if type=file not there means?
		//1. Ask your DEV team to add this attribute  ==VALID
		//2. NOT RECOMMENDED = Robot class(WINDOWS)
		//3. autoIt tool (3rd party lib) = NOT RECOMMENDED only in (WINDOWS) . not in grid,headless & in other os like linux,mac....
		//4. sikuli   --NOT RECOMMENDED  = becz it's image based(need to capture ss)
		
		//Advertising Pop ups (not js alert) --comes in e commerece appln  .  -qa/stage/dev/uat
		// 1. it'll come in prod env==> talk to dev and close this .
		// 2. don't use switch to  alert
		// 3. Random BEHAVIOUR OF  Pop up - shd we automate THIS -> it can come in 5 sec or it won't come : can't predict =CANNOT AUTOMATE
			
		
		// Browser window pop  ups
		

	}

}
