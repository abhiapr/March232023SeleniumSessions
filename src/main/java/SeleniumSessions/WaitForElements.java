package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// <Select> tag Drop down:
		// select class
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By options=By.cssSelector("select#Form_getForm_Country >option"); //we can use xpath also
		
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		 
//		 //return type of until is List<web ele>
//	 	 List<WebElement> option_List= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(options));  //check atleast one option is available
//	 	 System.out.println(option_List.size()); //233
//	 	  
	}
	
	//generic  -ELEMENTS -presence
	/**An expectation for checking that there is at least one element present on a web page. not ABOUT DOM
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public  List<WebElement> waitforElementsPresenceBy(By locator,int timeout) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)); //just check atleast 1 element(PERFORMANCE IS BETTER)
	}
	
	//visibility -ELEMENTS
	/**An expectation for checking that all elements present on the web page that match the locator are visible. 
	 * Visibility means that the elements are not only displayed 
	 * but also have a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public List<WebElement>waitforElementsVisiblity(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));  //it'll check all 233 elements
	}
	

}
