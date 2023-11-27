package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelHandle {   //Angular js application ,everything will be in ng . we can't  inspect  on mouse over things. so freeze it

		// Inspect  -> source-> fn+f8		
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");	
		Thread.sleep(3000);
		
//	   WebElement  Level1=driver.findElement(By.xpath("//a[@qa='categoryDD']"));
//	   Actions act=new Actions(driver); 
//	   act.moveToElement(Level1).perform();  // since beverages like specific names wont change we can use LINK TEXT (tag name will be a)
//	   Thread.sleep(1500);
//	   
//	   WebElement  Level2=driver.findElement(By.linkText("Beverages"));
//	   act.moveToElement(Level2).perform(); 
//	   Thread.sleep(1500);
//	   
//	   WebElement  Level3=driver.findElement(By.linkText("Tea"));
//	   act.moveToElement(Level3).perform(); 
//	   Thread.sleep(1500);
//	   
//	   WebElement  Level4=driver.findElement(By.linkText("Green Tea"));
//	   Level4.click();  // just click since it;s last level
	  
	   By Level1Locator=By.xpath("//a[ ']");
	   MultiLevelMenuHandling(Level1Locator,"Beverages","Tea","Green Tea");  //passing l2,l3,l4 as String
	   
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	// for link text generic (tea, green tea)
	
	public static WebElement getLinkTextValue(String LinkText) {
		return driver.findElement(By.linkText(LinkText));		
	}
	
	//multi-level handling - naveen's assignment to print all the names like beverages but  not printing
	
	public static void MultiLevelMenuHandling(By Level1Locator,String level2, String level3,String level4) throws InterruptedException {
		 Actions act=new Actions(driver); 
		 
		 act.moveToElement(getElement(Level1Locator)).perform();  // passing level 1 locator
		 Thread.sleep(1500);
		 act.moveToElement( getLinkTextValue(level2)).perform();  // level 2 Beverage
		 Thread.sleep(1500);
		 act.moveToElement( getLinkTextValue(level3)).perform();  // level 3  Tea
		 Thread.sleep(1500);
		 getLinkTextValue(level4).click();  //click green tea just click
	}

}
