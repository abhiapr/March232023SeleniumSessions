package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// <Select> tag Drop down:
		// select class
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		Thread.sleep(4000);
		
		By Country=By.id("Form_getForm_Country");
		// WebElement Country_ele=driver.findElement(Country); // passing id locator
		
		// creating Select Class
		// Select sel= new Select(Country_ele); 
		
		// from country it'll take as 0  - 4 (5 th is ANDORRA)
		// sel.selectByIndex(5); // not Good Practice  (if country is getting added, position will change)
		
		// By using visible text: 
//		sel.selectByVisibleText("India");  // directly passing text 
		
		//By using value : passing attribute value
//		sel.selectByValue("Austria");
		//sometimes value and text will not be same ==> <option value="Albania">Albania
		
		// if 10 dropdown are there: then, 10 select classes with different web elements
		// for eg: state drop down
//		By State=By.id("Form_getForm_Country");
//		WebElement State_ele=driver.findElement(Country);
//		Select sel1= new Select(State_ele); 
		
		doSelectDropdownByIndex(Country,5); // if thr are 233 countries and i'm passing 500 ==> Cannot locate option with index: 500
		
		doSelectDropdownByVisible(Country,"India");  // if :"India123" ==> nothing will print
		}
	
	//By Index Generic 
	
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator); // find element return type is web element		
	}
	
	public static void doSelectDropdownByIndex(By locator, int index) {
		
		// check point for index<0 (-ve scenarios)
		if(index<0) {
			System.out.println("pls pass right positive index.."); 
			
			//IF IS A CONIDTION NOT LOOP
			//break; // cannot be used  outside of a loop
			return; //  return means : returning void only 
		}
		Select sel=new Select(getElement(locator)); // passing get element method 
		sel.selectByIndex(index);
	}
	
	//By visible Generic
	public static void doSelectDropdownByVisible(By locator, String VisibleText) {
		// String - NULL check
	if (VisibleText == null) {
		System.out.println("pls pass visible text and it cannot be NULL...");
		return; 
		}
		Select sel = new Select(getElement(locator)); // passing get element method
		sel.selectByVisibleText(VisibleText);
	}
	
	//By Value Generic
		public static void doSelectDropdownByValue(By locator, String value) {
		if (value == null) {
			System.out.println("pls pass right value and it cannot be NULL...");
			return; 
			}
			Select sel = new Select(getElement(locator)); // passing get element method
			sel.selectByVisibleText(value);
		}
	
	

}
