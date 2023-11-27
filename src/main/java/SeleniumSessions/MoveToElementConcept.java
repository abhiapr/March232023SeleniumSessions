package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {  // interview question
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
		
		//css = a.menulink
		
//		WebElement ParentMenu=driver.findElement(By.className("menulink")); //instead of By =>WEB ELEMENT
		Thread.sleep(1000);
		
		//ACTION = supply DRIVER
		//SELECT = supply WEBELEMENT
		Actions act=new Actions(driver);  //action class
		
		// movetoelement ==>acc to w3c move to MIDDLE OF ELEMENT
		//act.moveToElement(ParentMenu).build().perform(); // build will capture from action and perform will do that action
		//Thread.sleep(1500); 
		
		// but here just building not performing . son INVALID
		// act.moveToElement(ParentMenu).build(); => INVALID
		// act.moveToElement(ParentMenu);          ==>INVALID
		
       // if we have only one ACTION TO PERFORM  - we can use below
		// act.moveToElement(ParentMenu).perform();          => VALID
		// act.moveToElement(ParentMenu).build().perform();  => VALID
		
		// driver.findElement(By.linkText("Courses")).click();  // No such element becz= COURSES is in caps.
		
		// driver.findElement(By.linkText("COURSES")).click(); //click after 1 sec
		
		By ParentMenu=By.className("menulink");
		By ChildMenu=By.className("ARTICLES"); 
		twoLevelMenuHandle(ParentMenu,ChildMenu);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//MenuLevel Handle   ==INTERVIEW QUESTION
	
	public static void twoLevelMenuHandle(By level1MenuLocator,By level2MenuLocator) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(getElement(level1MenuLocator)).perform();  //passing locator 
		Thread.sleep(1000);
		getElement(level2MenuLocator).click(); // clicking next menu
		
	}

}
