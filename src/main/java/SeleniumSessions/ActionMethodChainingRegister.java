package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

  //interview ques but not real time
public class ActionMethodChainingRegister {
static WebDriver driver;

	public static void main(String[] args) {
		 driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fn=driver.findElement(By.id("input-firstname"));
		
		// fills the way user does
		Actions act=new Actions(driver);
		act.sendKeys(fn,"abhi")
		.sendKeys(Keys.TAB)
		.pause(1000)  // pause for 1sec
		.sendKeys("automation")
		.sendKeys(Keys.TAB)
		.sendKeys("automation@gmail.com")
		.pause(1000) 
		.sendKeys(Keys.TAB)
		.sendKeys("987654321")
		.pause(1000) 
		.sendKeys(Keys.TAB)
		.sendKeys("automation@123")
		.pause(1000) 
		.sendKeys(Keys.TAB)
		.sendKeys("automation@123")
		.pause(1000) 
		.sendKeys(Keys.TAB)
		.pause(1000) 
		.sendKeys(Keys.TAB)
		.pause(1000) 
		.sendKeys(Keys.TAB)
		.pause(1000) 
		.sendKeys(Keys.SPACE)
		.build().perform();
	}
}
