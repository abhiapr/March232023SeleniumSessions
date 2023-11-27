package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldValue {  //==>Interview question

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By firstname=By.id("input-firstname");
		
		driver.findElement(firstname).sendKeys("naveenautomationlabs"); // this is the value not text of the element
		
		// GET TEXT will NOT WORK
		
//		String fn=driver.findElement(firstname).getText();
//		System.out.println(fn); 
		
		//In inspect we'll have VALUE Attribute use that
		String fn=driver.findElement(firstname).getAttribute("value");
		System.out.println(fn); //naveenautomationlabs
		

	}

}
