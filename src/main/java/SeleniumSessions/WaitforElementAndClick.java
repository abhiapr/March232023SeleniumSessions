package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforElementAndClick {  // FOR CLICKABLE/ENABLED elements (don't need to use by enable/disable/visible methods)

static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			driver=new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			Thread.sleep(4000);
			
			driver.findElement(By.name("username")).sendKeys("newautomation");
			driver.findElement(By.name("password")).sendKeys("Selenium@12345");
			
			//by loc for login button
			By loginLoc=By.xpath("//input[@value='Login']"); // not using driver .find ele becz below lines will return web ele
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	 	    wait.until(ExpectedConditions.elementToBeClickable(loginLoc)).click();
	 	    
	 	    //1. Visible
	 	    //2. Enable
			ClickElementWhenReady(loginLoc,10);
	}
		
		//generic for click able
		//*An expectation for checking an element is visible and enabled such that you can click it.
		
		public static void ClickElementWhenReady(By locator,int timeout) {
	 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
	 	    wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
		}

}
