package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleTogether {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //window 1
		Thread.sleep(5000);
		
		//interview que:all the windoes at one shot
		//ASS: comeback ad click for each parent window
		
		String ParentWindowId=driver.getWindowHandle();		
		WebElement TwEle=driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement FBEle=driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement YTEle=driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement LIEle=driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		TwEle.click();
		FBEle.click();
		YTEle.click();
		LIEle.click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		//instead of next 4 times  => loop
		while(it.hasNext()) {
			String WindowId=it.next(); // will give window id
			driver.switchTo().window(WindowId);
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1500);
			
			if(!WindowId.equals(ParentWindowId)) {
				driver.close();			
			}
			  //close window one by one			
			//But BUG is closing the PARENT WINDOW also  : use check point
		}
		driver.switchTo().window(ParentWindowId); //after while loop going back to parent  window that's y we'r storing
		System.out.println("parent window url :"+driver.getCurrentUrl());
		
		driver.quit();
		

	}

}
