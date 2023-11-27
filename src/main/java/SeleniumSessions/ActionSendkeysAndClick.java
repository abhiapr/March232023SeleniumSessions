package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeysAndClick {
	static WebDriver driver;
	
	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");	
	
		By emaiId=By.xpath("input-email");
		By pwd=By.xpath("input-password");
		By loginBtn=By.xpath("//input[@value='Login']");
		
		// but normally in web element , it'll enter the values it'll not click 
		Actions act=new Actions(driver);
		
		// it'll 1st find the element , click the first name then enter the value
		
//		act.sendKeys(driver.findElement(emaiId),"test@gamil.com").perform();
//		act.sendKeys(driver.findElement(pwd),"test@123").perform();
//		act.click(driver.findElement(loginBtn)).perform();
		
		//practice
		act.sendKeys(driver.findElement(emaiId),"naveen@gamil.com").perform();
		act.sendKeys(driver.findElement(pwd),"naveen02").perform();
		act.sendKeys(driver.findElement(loginBtn)).perform();
		
		
//		Equivalent to calling: Actions.click(Element).sendkeys(KeysToSend)
//		Sends keys to the active element.
//		This differs from calling WebElement.sendKeys(CharSequence)  
		
//		Clicks in the middle of the given element.
//		Equivalent to: Actions.moveToElement(onElement).click()

	}
	
	

	// two ways of click element 
	// 1. webelement .click
	// 2. actions.click
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator) {
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();   // passing value for SEND KEYS method
	}
	
	
//	public static void doActionsClick(By locator) {
//		Actions act=new Actions(driver);
//		act.click(getElement(locator)).perform();
//	}
//	
//	public static void doActionsSenKeys(By locator) {
//		Actions act=new Actions(driver);
//		act.click(getElement(locator),value ).perform();
//	}
	
	

}
