package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		//TAB/new window both are different
		//to open NEW TAB
		
		String ParentWindow=driver.getWindowHandle();
		
		// driver.switchTo().newWindow(WindowType.TAB);  //new TAB
		
		driver.switchTo().newWindow(WindowType.WINDOW);  //new window
		
		
		
		driver.get("https://www.google.com");  //open new TAB
		System.out.println(driver.getTitle());
		
		driver.close();  //store parent window else how we'll come back
		
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		
		//cross origin = switching from 1 domain to another domain  walmart to amazon (not allowed in cypress,xpath also not allowed)
		
		

	}

}
