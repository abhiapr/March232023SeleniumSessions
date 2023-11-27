package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select1Practice {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		Thread.sleep(4000);
		
		By country=By.id("Form_getForm_Country");
		
		doSelectbyIndex(country,1); //Afganisthan is getting selected
		
		doSelectbyVisibleText(country,"India");
		
		doSelectbyValue(country,"Bolivia");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);	
	}
	
	// select country drop down by index
	public static void doSelectbyIndex(By locator,int index) { //
		if(index<0) {
			System.out.println("pls pass positive index...");
			return;
		}
		//creating select class
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);		
	}
	
	// select country drop down by VisibleText
	
	public static void doSelectbyVisibleText(By locator,String VisibleText) {
		if(VisibleText==null) {
			System.out.println("pls pass right value...");
			return;
		}
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);	
		
	}
	
	//select country drop down by VALUE
	
	public static void doSelectbyValue(By locator,String Value) {
		if(Value==null) {
			System.out.println("pls pass right value and cannot be null...");
			return;
		}
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(Value);	
		
	}
	
}