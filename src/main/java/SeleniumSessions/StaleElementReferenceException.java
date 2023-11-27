package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {  // V.IMP INTERVIEW QUE  :STALE = EXPIRED (ele gets expired)

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //DOM  V1
		
		WebElement username=driver.findElement(By.id("input-email"));//ele created from DOM v1 version
		username.sendKeys("naveen@gmail.com");
		
		driver.navigate().refresh();// after refreshing  = > DOM V2 . while refreshing new dom is created so, re initialise WE
		//for v1 we'lll get different web element id
		
		//ASS- back,forward - reg page enter name and if i click on back ;page will get refresh same ele won't work if i try to enter email
		
		//Thread.sleep(1000);
		
		//Re-Initialising Web element : coming from v2  DOM version
		
		username=driver.findElement(By.id("input-email"));   //f989dc0b1a315ac2bc88b9e96494f53f  v2 web element id
		
		//so use 22 line to avoid SEE
		
		//(f989dc0b1a315ac2bc88b9e96494f53f) -- DOM V2 version 
		username.sendKeys("neha123@gmail.com");//initially created from e1 (v1) version ---> v2 but using in DOM v2 version =>WON'T WORK
       // so re initialize and use version v2 
		
		//StaleElementReferenceException: stale element reference: stale element not found
	}

	
	//Learning is :
	// 1. Avoid REFRESH better RE-INITIALZE the web element
	// 2. if i don't
	
	
	//@FindBy ==> Almost deprecated in all except Java soon it'll also and this is major cause for stale element.We WON'T USE
	// @FindBy(How.ID ="naveen")
	//WebElement e1;   ==> equivalent to driver.findelement(By.id) 
	//these r Page Factories  -DON'T USE
}
