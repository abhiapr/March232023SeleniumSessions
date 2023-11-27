package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLoadTimeoutConcept {  // IMP INT QUE
static WebDriver driver;
	public static void main(String[] args) {
	   driver=new ChromeDriver();
	   // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(25)); //dynamic wait : wait for 25 sec
	   
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //DOM  V1
		
		// on console : there is JS ===> document.readyState shows Page is COMPLETE
		
		if(isPageLoaded(10)) {
			System.out.println("page is fully loaded");
			
		}
	}
	
	//Generic using EXP Wait  : we can check in complex url like crmpro
	public static boolean isPageLoaded(int timeout) { //10
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		//jsReturnsValue  -An expectation for String value from java script . so converting to string
		String flag=wait.until(ExpectedConditions.jsReturnsValue("retrun document.readyState =='complete'")).toString();  // until will become -->Boolean
		return Boolean.parseBoolean(flag); // wrapper class
	}

	// IMP INT QUE : 3 states of pages
	
	//1. Loading
	//2. Interactive
	//3. Complete  ===>document.readyState
	
}
