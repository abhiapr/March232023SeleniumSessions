package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("mainpanel");//imp
		driver.findElement(By.linkText("CONTACTS")).click();  //shd be caps
		//to come out of frame
		 // driver.switchTo().defaultContent()  it'll go to html  // in this appln don't need to come out we hv everyhting inside frame 
	
		//frames are deprecated
		// now iframe in order to prevent security of elemenets at ui level
		

	}	
		

}
