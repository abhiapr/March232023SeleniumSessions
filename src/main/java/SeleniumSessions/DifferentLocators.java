package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {//look & feel
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		// 1. ID :unique locator (attribute) (every button has unique id)=>Most Preferable --------------------I
		// ele1=naveen, ele2 = selenium
		//driver.findElement(By.id("selenium")).sendKeys("naveen@gmail.com"); //inspect id name
		
		// 2. NAME: it can be Duplicate /unique (two buttons have same name) but 99% unique -------------------II
		// ele1=naveen, ele2=naveen. = >by default SELENIUM WILL INTERACT WITH 1ST ELEMENT
		//driver.findElement(By.id("Naveen")).sendKeys("naveen@gmail.com");
		
		//3. CLASS NAME: can be duplicate at most of the time(90%) --------III
		// driver.findElement(By.className("form-control")).sendKeys("Naveen"); // it'll enter in top Search box not in name field
		
		//above 3 r attributes
		
		//4. Xpath: Not an attribute , It's address of an element in html DOM
		
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Abhi"); // Copy Xpath
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("apr");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("abhi123");
//		driver.findElement(By.name("agree")).click(); // for Check box
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click(); // clicking Continue button
//		will get since all fields are not filled since continue button is clicking
		// ============================================================================
		
		// Generic way
		
//		By first_name=By.xpath("//*[@id=\"input-firstname\"]"); //giving by reference
//		By last_name=By.xpath("//*[@id=\"input-lastname\"]");
//		By pass_word=By.xpath("//*[@id=\"input-password\"]");
//		By Privacypolicy_xpath=By.name("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continuebutton_xpath=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		//sending keys
		
//		doSendKeys(first_name,"abhi");
//		doSendKeys(last_name,"apr");
//		doSendKeys(pass_word,"apr123");
//		doClick(Privacypolicy_xpath);
//		doClick(continuebutton_xpath);
//		
		// ============================================================================
		
		//5 .CSS Selector (based on CSS properties)
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("naveen") ;// copy SELECTOR
//		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("987654321") ;
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();  // for button like this
		
		//6. Link Text : is BETTER ( only for links) with the text of links : can also be duplicate ( 2times forgot pwd)
		//html tag =<a>
		//attributes, link text ; href- hyperReference
		//driver.findElement(By.linkText("Delivery Information")).click();
		//By deliverLink = By.linkText("Delivery Information");
		//doClick(deliverLink);
		
		//7.Partial links : only for links with partial text of link
		//driver.findElement(By.partialLinkText("Forgotten")).click(); // use when we hv many wordings long text
		//forgot username 
		//forgot password
		
		//8. TAG NAME: html tag , Not an attribute. use only when Tagname is Unique
		// driver.findElement(By.tagName("input")).sendKeys("naveen");  // Element not interactable 
		String header=driver.findElement(By.tagName("h1")).getText(); //fetch header value
		System.out.println(header);
 
	}
	
	//Making click also Generic
	public static WebElement getElement(By locator) { //give me locator 
		return driver.findElement(locator);
		
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}

}
