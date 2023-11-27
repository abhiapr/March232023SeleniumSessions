package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisableTextField { //can't enter value in DISABLED FIELD

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		boolean flag=driver.findElement(By.id("pass")).isEnabled();
		System.out.println(flag);  // FALSE 
		
		boolean flag1=driver.findElement(By.id("pass")).isDisplayed();
		System.out.println(flag1);  // TRUE
		
		String disable_val=driver.findElement(By.id("pass")).getAttribute("disabled");
		System.out.println(disable_val);// True becz it's disabled
		
		//ELEMENT NOT INTERACTABLE EXCEPTION :  element not interactable
		//driver.findElement(By.id("pass")).sendKeys("abhi");
	}
	
	public static boolean CheckElementIsDisplayed(By locator) {
		String disable_val=getElement(locator).getAttribute("disabled");
		if(disable_val.equals("true")) {
			return true;
		}
		return false;
		
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
