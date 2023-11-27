package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWithFluentWaitFeatures {
	static WebDriver driver;
	//WebDriver wait (Class) [extending]--->FluentWait(C)[implements wait]---->Wait(Parent Interface) :Until(); [withput any method body]
    //inherit from Fluent                    // until{} (override this method with some method body done by sel)
	                                        // +other methods

	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");	
		By email=By.id("input-email11");
	
		// WDW inherting all methods of FW =>Every BMW(WDW) is car class(FW)
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait. 
		    pollingEvery(Duration.ofSeconds(2))
		    	.ignoring(NoSuchElementException.class) //if we face any Exception in btwn so using Ignoring
		    		.withMessage("-----time out is done element is not found---" +email)
		              .until(ExpectedConditions.presenceOfElementLocated(email))  // becz WD can access FW methods also & it's OVERRIDDEN
		             	.sendKeys("testing");
		             
		             //WaitForElementAndEnterValue(email,10,2,"abhi@gamil.com");
	}
	
	//generic WaitForElementAndEnterValue
//	
//	public static  void WaitForElementAndEnterValue(By locator,int timeout,int Pollingtime,String value) {
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
//		wait. 
//		    pollingEvery(Duration.ofSeconds(Pollingtime))
//		    	.ignoring(NoSuchElementException.class) //if we face any Exception in btwn so using Ignoring
//		    		.withMessage("-----time out is done element is not found---" +locator);
//		             .until(ExpectedConditions.presenceOfElementLocated(locator))
//		             	.sendKeys(value);	
//		
//	}
//	
//	//WaitForElementAndClick
//	
//	public static  void WaitForElementAndClick(By locator,int timeout,int Pollingtime) {
//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
//	wait. 
//	    pollingEvery(Duration.ofSeconds(Pollingtime))
//	    	.ignoring(NoSuchElementException.class) //if we face any Exception in btwn so using Ignoring
//	    		.withMessage("-----time out is done element is not found---" +locator);
//	             .until(ExpectedConditions.presenceOfElementLocated(locator))
//	             	.click();	
//	
//}

}
