package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeActionScroll {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		//Thread.sleep(2000);
//		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();

//		
		Actions act=new Actions(driver); //for action DRIVER
		Thread.sleep(1000);
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.PAGE_UP).perform();
//		//act.scrollToElement()
		
		
		//scroll to element
		act.scrollToElement(driver.findElement(By.linkText("Shop with Points")))
			.click(driver.findElement(By.linkText("Shop with Points")))
				.build()
					.perform();
		
	

	}

}
