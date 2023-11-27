package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentBigBasket {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
//		Thread.sleep(2000);
//		
//		WebElement Level1Locator=driver.findElement(By.xpath("//a[@qa='categoryDD']")); 
//		Actions act=new Actions(driver);
//		act.moveToElement(Level1Locator).perform();  // i can pass level1 locator 
//		Thread.sleep(1000);
//		
//		WebElement Level2Locator=driver.findElement(By.linkText("Beverages")); 
//		act.moveToElement(Level2Locator).perform(); 
//		Thread.sleep(1000);
//		
//		WebElement Level3Locator=driver.findElement(By.linkText("Tea")); 
//		act.moveToElement(Level3Locator).perform(); 
//		Thread.sleep(1000);
//		
//		WebElement Level4Locator=driver.findElement(By.linkText("Green Tea")); 
//		Level4Locator.click();
		
		By Level1locator=By.xpath("//a[@qa='categoryDD']");  //=>SHOP BY CATEGORY
		MultiLevelLocators(Level1locator,"Beauty & Hygiene","Skin Care","Face Care");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement getLinkTextValue(String LinkText) {
		return driver.findElement(By.linkText(LinkText));  // passing link text locator in generic 
	}
	
	// multi level locators 
	
	public static void MultiLevelLocators(By Level1Locator,String Level2,String Level3,String Level4) throws InterruptedException {
		
		Actions act=new Actions(driver);
		act.moveToElement(getElement(Level1Locator)).perform(); // passing get element. so it'll pass level1Locator
		Thread.sleep(2000);
		
		List<WebElement> Level2Value=driver.findElements(Level1Locator);
	
		for(WebElement e:Level2Value) {
			String text=e.getText();
			System.out.println(text);		
		}
		
		act.moveToElement(getLinkTextValue(Level2)).perform();  //calling link text value here
		System.out.println(Level2);
		Thread.sleep(1000);
	
		act.moveToElement(getLinkTextValue(Level3)).perform();
		System.out.println(Level3);
		Thread.sleep(1000);
		
		getLinkTextValue(Level4).click();
		System.out.println(Level4);
		
			
		}
	}



