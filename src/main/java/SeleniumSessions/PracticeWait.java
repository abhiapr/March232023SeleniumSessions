package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class PracticeWait {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// <Select> tag Drop down:
		// select class
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Country_Options=By.xpath("//select[@id='Form_getForm_Country'/option]");
		
//	1.	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		List<WebElement> option=wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Country_Options)); //all country list
//        System.out.println(option.size());
		
		//2.Wait for element and click (only for enable/clickable)
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("abhi123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("abhi123");
		
		By LoginButton=By.className("btn btn-primary");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();  //passing login button locator
		
		
		//2.
		WaitForElementAndClickable(LoginButton,10);
	}
	
	//generic
	
	public static List<WebElement> WaitForPresenceofElement(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)); //check all 233 ele
		 //An expectation for checking that there is at least one element present on a web page.
		
	}
	
	//visibility
	public static List<WebElement> WaitforVisibilityElement(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));  
		
		//An expectation for checking that all elements present on the web page that match the locator are visible. 
//		 * Visibility means that the elements are not only displayed 
//		 * but also have a height and width that is greater than 0.
}
	
	//2. generic for click able
	public static void WaitForElementAndClickable(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
		
	

}
