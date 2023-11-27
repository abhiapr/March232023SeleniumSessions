package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeActionChaining {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fn=driver.findElement(By.id("input-firstname"));
		
		Actions act=new Actions(driver);
		act.sendKeys(fn,"abhi")
		.sendKeys(Keys.TAB)
		.pause(1000)
		.sendKeys("P")
		.sendKeys(Keys.TAB)
		.sendKeys("abhi@gmail.com")
		.pause(1000)
		.sendKeys(Keys.TAB)
		.sendKeys("987654321")
		.pause(1000)
		.sendKeys(Keys.TAB)
		.sendKeys("abhi@123")
		.pause(1000)
		.sendKeys(Keys.TAB)
		.sendKeys("abhi@123")
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
