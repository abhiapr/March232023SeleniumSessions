package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Practice
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		//switch to frame
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("FEATURES")).click();
		//driver.switchTo().defaultContent();
		
		
		//FRAMES
		driver.get("http://www.londonfreelance.org/courses/frames/insex.html");
		driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html'")));
		
		driver.switchTo().frame(2);  //index  // 0,1,2  : 2nd index , 3rd frame
		
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		driver.switchTo().defaultContent(); // Come back to main page
			}

	}


