package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefWithFindElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login"); //DOM  v1
		
		//From footer: click About us and come back  then click Privacy policy and come back
		
		List<WebElement> footerList=driver.findElements(By.cssSelector("footer a")); //v1 
		System.out.println(footerList.size()); //16
		
		for(int i=0;i<footerList.size();i++) {
			footerList.get(i).click(); //click happened from v1 DOM  //click about us
			
			driver.navigate().back(); // come back have another version v3
			
			//After few clicks it gives Stale element Exception ; footer list also gets expired after one click
			//so re-initialize List also
			footerList=driver.findElements(By.cssSelector("footer a"));  //so this list created from vs DOM not from expired v1
		}
	}
       
	// Adding in Fluent Wait after NO such element exception because return type is Web Element
	//.ignoring (StaleElementReferenceException.class)
	
	
}
