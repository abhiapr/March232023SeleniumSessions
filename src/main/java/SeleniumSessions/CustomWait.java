package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait { //converting static into Dynamic wait without using wait Lib. only use Thread.sleep
	
	//IMP INTERVIEW QUESTION 
	
static WebDriver driver;

	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By email=By.id("input-email");  //input_email11 [INVALID] means it'll go to CATCH block with NSE
		
		//1--4--6--8 :ele can come in sec
				//While loop	
		
		retryingElement(email,10,2000).sendKeys("abhi@gmail.com");
	}
		
	
	//calling getElement
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public static WebElement retryingElement(By locator,int timeout) { //Vustom
		
		WebElement element =null;
		int attempts=0;
		
		while(attempts<timeout) {  //0<10
			try {
			element=getElement(locator);  //element is assigned with locator 
			System.out.println("element is found..." +locator+ "in attempt" +attempts);  //element is found...By.id: input-emailin attempt0
			break;
			
		}catch(NoSuchElementException e) {  //if element is not found after 10 seconds
			System.out.println("element is not found..." +locator+ "in attempt" +attempts);
			
			try {
				Thread.sleep(500);  //for thread using try/catch instead of throws
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			
		}
		attempts++;
			
		} 
		if(element==null) {
			System.out.println("element is not found..." +locator+ "in attempt" +attempts);		
		}
		return element;
	}
	
	//Polling time is overloaded
	
	public static WebElement retryingElement(By locator, int TimeOut, int PollingTime) {  //2000ms -PT

		WebElement element = null;
		int attempts = 0;

		while (attempts < TimeOut) { // 0<10
			try {
				element = getElement(locator); // element is assigned with locator
				System.out.println("element is found..." + locator + "in attempt" + attempts); 
																								
				break;

			} catch (NoSuchElementException e) { // if element is not found after 10 seconds
				System.out.println("element is not found..." + locator + "in attempt" + attempts);

				try {
					Thread.sleep(PollingTime);    // default polling time=custom value
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			
		}
		attempts++;
			
		} 
		if(element==null) {
			System.out.println("element is not found..." +locator+ "in attempt" +attempts);		
		}
		return element;
	}
}
	
	//INTERVIEW QUE =>V.IMP
	
	

