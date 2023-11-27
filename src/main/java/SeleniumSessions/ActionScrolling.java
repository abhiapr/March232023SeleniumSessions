package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrolling {  // not that important becz we hv javascript for scrolling down
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		Actions act=new Actions(driver);
//		act.sendKeys(Keys.PAGE_DOWN).perform();  // scroll to footer of the page
//		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_UP).perform();  // scroll top/home of the page
//		Thread.sleep(1000);
		
		//ctrl /Command +KEY DOWN
		//act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();  //END - FooterThread.sleep(1000);
		Thread.sleep(1000);
		//ctrl /Command +KEY UP
		//act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).build().perform();
		Thread.sleep(1000);
		
		//Scroll to element
		act.scrollToElement(driver.findElement(By.linkText("Help")))
			.click(driver.findElement(By.linkText("Help")))
				.build()
					.perform();
		
		//Refresh = f5 to refresh  (pre defined in keys class)  => don't use .Just use driver.navigate.refresh()
		act.keyDown(Keys.COMMAND).sendKeys(Keys.F5).keyUp(Keys.COMMAND).build().perform();
		// not pressing f5 in keyboard just sending keys f5 and 
		// key down = press it
		// key up=  release it
		
//		 driver.navigate().refresh();

	}

}
