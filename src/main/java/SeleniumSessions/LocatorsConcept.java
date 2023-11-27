package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	 static WebDriver driver ;

	public static void main(String[] args) {
		
		//Create a webElement + perform actions(click,sendKeys(type),getTexts (to capture texts),isDisplayed)
		//if we refresh=>DOM API(all html body) will get REFERESHED 1st
		
		//we can inspect only WEB ELEMENT NOT Browser Element (url,title)
		//Attribute- key and value pair ; <a= links ; only text it doesn't hv any attribute (without any key value)
		
		//instead of WebDriver in class level making it as GLOBAL
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//FE coming from Search Context Interface
		
		//1.id
		//driver.findElement(By.id("input-email")).sendKeys("123@gmail.com"); //always send string
		//driver.findElement(By.id("input-password")).sendKeys("123"); //always send string
		
		//2.another method - better than 1st
		
		//WebElement emailId=driver.findElement(By.id("input-email"));//not performing any action
		//WebElement password=driver.findElement(By.id("input-password"));
		
		//emailId.sendKeys("123@gmail.com");  //becz we can send keys for multiple times as we need
		//password.sendKeys("1234");
		
		//3.BY LOCATOR =>we r not hitting server
		//ele is created with driver.fe; fe will return web element
		
		//By email_Id=By.id("input-email"); //we r not hitting server . and not creating web element each time 
		//By pass_id=By.id("input-password");
		
		//WebElement emailId=driver.findElement(email_Id);
		//WebElement password=driver.findElement(pass_id);
		
		//emailId.sendkeys("123@gmail.com");
		//password.sendkeys("123");
		
		
		//4.By Locator with webElement generic method
		
//		By email_Id=By.id("input-email");
//		By pass_id=By.id("input-password");
		
//		getElement(email_Id).sendKeys("123@gmail.com");
//		getElement(pass_id).sendKeys("1234");
		
		//5..By Locator with webElement and action generic method => don't need to write send keys and find element
		
//		By email_Id=By.id("input-email");
//        By pass_id=By.id("input-password");
        
        //calling send keys
//        doSendKeys(email_Id,"123@gmail.com");
//        doSendKeys(pass_id,"123");
		
		//6..By Locator with webElement and action generic method  with utility
		
		By email_Id=By.id("input-email");
        By pass_id=By.id("input-password");
		
		ElementUtil ele= new ElementUtil(driver); //chrome driver ; sid=123 // so same driver will pass in constructor ELEMENT UTIL TAB
		ele.doSendKeys(email_Id,"123@gmail.com");
		ele.doSendKeys(pass_id, "123");
		
		
		
		
		
		//7.By Locator with webElement and action generic method  with utility ,with caller class brow util,ele util 
		
	}
	
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value); // call below method
		
	}
	//4.make webdriver as static
	
	public static WebElement getElement(By locator) {// if u give me locator i'll return WebElement
		return driver.findElement(locator);  // even if we hv 100 web elements . we'll be writing one time fe
		
		
	}

}
