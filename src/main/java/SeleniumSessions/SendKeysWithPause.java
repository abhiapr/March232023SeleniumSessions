package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithPause {
static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		
		
		// Interview questions : Print letter by letter	
		
		//driver=new ChromeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement fn=driver.findElement(By.id("input-firstname"));	
//		Actions act=new Actions(driver);
//		
//		String value="NaveenAutomationLabs";  // hard coded
//		char ch[]=value.toCharArray();    // static array
//		
//		for(int i=0;i<=ch.length;i++) {
//			act.sendKeys(fn,String.valueOf(ch[i]) ).pause(500).perform();  //i can't give character index ch[i]. so changing to string
//			
//			//ch[i]+" "  = for space
		
		// *********practice
		
		    driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			WebElement fn=driver.findElement(By.id("input-firstname"));
			Actions act=new Actions(driver);
			String name="ABHITHA PANNEER";
			char ch[]=name.toCharArray();
			
			for(int i=0;i<ch.length;i++) {
				act.sendKeys(fn,String.valueOf(ch[i]+" ")).pause(500).perform();  // changing ch to string 
				//print A wait for 1sec then print letter by letter
			
		}	

	}

}
