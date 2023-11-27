package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pollingWaitConcept {

	public static void main(String[] args) { //Interval Time between two request
		
		//DEFAULT POLLING TIME is: 500ms   / 0.5 sec =>INTERVIEW QUES 
		
		//10 secs, polling/interval time = 2 sec
		//0 sec --->e1  - NA
		//2 sec --->e1  - NA
		//4 sec --->e1  - NA
		//6 sec --->e1  - NA
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email11");  //just failing test case
		
		//By.id: input-email11 (tried for 10 second(s) with 2000 milliseconds interval)
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));  // next req interval will be  at 2 sec
		wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys("testing");
		
		//if we give back to back request ==>Performance issue

	}
	
//	//generic
//	public WebElement waitforElementPresenceBy(By locator,int timeout,int Pollingtime) {
//		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout),Duration.ofSeconds(Pollingtime)); //instead of 10 sec
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));//Username
//	}

}
