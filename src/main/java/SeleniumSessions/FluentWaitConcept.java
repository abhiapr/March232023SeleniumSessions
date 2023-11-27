package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		//WebDriver wait (Class) [extending]--->FluentWait(C)[implements wait]---->Wait(Parent Interface) :Until(); [withput any method body]
        //inherit from Fluent                    // until{} (override this method with some method body done by sel)
		                                        // +other methods
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver) //<T> T is type, we hv to give some input type
		//RHS ==>object of fluent wait
		//driver is passed as argument
		//child class object(FLU WAIT) is reference by parent(WAIT) Interface reference variable -->TOP CASTING
		
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class) //if we face any Exception in btwn so using Ignoring
				.withMessage("-----time out is done ,Element is not found---"+email);  //our own custom message
		
		//above is kind of builder pattern also i can ignore 32 no sequence
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("testing");
		
//		waitforElementPresenceWithFluentWait(email,10,2).sendKeys("testing");

	}
	
	//generic element visible  with Fluent wait
	public static WebElement waitforElementVisibleWithFluentWait(By locator,int timeout, int pollingtime) {
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class) //if we face any Exception in btwn so using Ignoring
				.withMessage("-----time out is done ,Element is not found---"+locator);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	// generic element presence with Fluent wait
	public static WebElement waitforElementPresenceWithFluentWait(By locator,int timeout, int pollingtime) {
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoSuchElementException.class) //if we face any Exception in btwn so using Ignoring
				.withMessage("-----time out is done ,Element is not found---"+locator);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	//Alert with Fluent wait
	
   public Alert waitforJSAlertWithFluentWait(int timeout, int pollingtime) {
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(pollingtime))
				.ignoring(NoAlertPresentException.class) //if we face any Exception in btwn so using Ignoring
				.withMessage("-----time out is done Js Alert is not found---");
		return wait.until(ExpectedConditions.alertIsPresent());
		
	}
	
	

}
