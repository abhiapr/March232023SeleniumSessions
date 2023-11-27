package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckPresenceofElement {
	static  WebDriver driver;
	public static void main(String[] args) {
		
         driver=new ChromeDriver();
	  
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      By Username=By.name("username");
	      By pwd=By.name("passsword");
	      By loginBtn=By.xpath("//button[@type='submit']");
	      
	      By forgotPwdLink=By.linkText("Forgot your password?");
	      //wait for 10 sec
	    //  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); //we can create object of WDW and FW
	      
	    //  WebElement username_ele=wait.until(ExpectedConditions.presenceOfElementLocated(Username)); //wait for 10 sec //to check presence of ele
	      //username_ele.sendKeys("admin");
	      //return type of until is:WEBELEMENT 
	      //out of 3 ele we are applying wait to USERNAME ele alone .this is NOT applicable in IMP wait
	      
	      
	      //no wait for below ele
      driver.findElement(pwd).sendKeys("admin");
      driver.findElement(loginBtn).click();
//	      
	      //forgot link check
	      waitforElementPresenceBy(Username,10).sendKeys("admin");
	      
	//      waitforElementPresenceBy(forgotPwdLink,5).click();
	      
	      waitforElementVisiblity(forgotPwdLink,5).click();
	      

	}
	/**
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does notnecessarily mean that the element is visible.
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	 //both r interview
	/// generic cut cpoy pasting 24,26,27  //check presence of ele
	public static WebElement waitforElementPresenceBy(By locator,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout)); //instead of 10 sec
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));//Username
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	
	//visibility -check presence also visible in the DOM : will give gurantee that elem in dom and also present in the page.
	public static WebElement waitforElementVisiblity(By locator,int timeout) {
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout)); 
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
	


