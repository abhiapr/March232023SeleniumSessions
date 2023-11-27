package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForFrame {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		By frameLocator=By.name("mainpanel");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//we don;t need to switch to frame directly using method
		//return type is web driver
		
		 //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator)); // driver will be on page not frame 
		 
		waitforFrameByFrameNameOrId(10,"mainpanel");  //we can comment 23
		waitforFrameByLocator(10,frameLocator);
		
		 driver.findElement(By.linkText("CONTACTS")).click();
	}
	
	//generic
	public static void waitforFrameByLocator(int timeout,By frameLocator) {
 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
 	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));

}
	
	//by Index
	public static void waitforFrameByIndex(int timeout,int frameIndex) {
 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
 	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

}
	
	//frameNameOrId
	
	public static void waitforFrameByFrameNameOrId(int timeout,String frameNameOrId) {
 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
 	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameNameOrId));

}
	
	// FrameElement
	public static void waitforFrameElement(WebElement FrameElement,int timeout) {
 	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
 	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(FrameElement));

}
}
