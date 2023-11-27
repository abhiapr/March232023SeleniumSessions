package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YatraExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yatra.com");  //page
		Thread.sleep(5000);
		
		//driver.switchTo().frame("") //inspect frame
		driver.findElement(By.className(null)).click(); //inspect the cross symbol
		
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Ok,I Agree']")).click(); //ok i agree button
		

	}

}
