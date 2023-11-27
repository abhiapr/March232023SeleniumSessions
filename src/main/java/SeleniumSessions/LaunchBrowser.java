package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	static WebDriver driver; //else i need to create object of aboce class also
	
	//AFTER 4.6.0 we don't need to add exe PATH FILE.
	//=> in C:Abhi:.cache:Selenium:Win31:113.=>under exe file will be thr(SEL MANAGER WILL DO THIS)
	
	public static void main(String[] args) {
		// launch chrome browser
		//selenium will create replica of current browser
		//selenium will pick the latest version in automated latest browser
		
		//chrome
		 
		//ChromeDriver driver=new ChromeDriver();  // this opened browser we can't interact after getting url
		//this is constructor
		
		//firefox
		//FirefoxDriver driver=new FirefoxDriver();
		
		//Edge
		//EdgeDriver driver=new EdgeDriver(); 
		//Above all are browser specific
		
		WebDriver driver=new ChromeDriver();
		
		//enter url
		//driver.get("www.google.com");  -- error// must use protocol https/http
		driver.get("https://www.google.com"); 
		
		//ChromeDriver->Chromium->RemoteWebDriver(is class .so it'll access/inherit all the methods.) ->WebDriver->SearchContext
		//get is Implemeted by REmote WD
		//Inherited by the ChromeDriver(chrome driver is getting url,title)
		
		// get method is coming from remote webdriver
		
		//driver is ref var of chrome driver
		
		
		//get the title
		String title=driver.getTitle(); // tab name
		System.out.println("get title :" + title);
		
		//verify title  => actual vs expected
		
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
			
		}
 //automation testing --> automation test + check point (verification) point act vs exp
		//SELENIUM IS NOT DOING ANY TESTING JUST IMPLEMENTING WITH JAVA CODE
		driver.getPageSource();// source code for browser in JS
		driver.quit(); // to close browser automatically
		// we can also use CLOSE
		
	}

}
