package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestediFrameHandle {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");  //page
		Thread.sleep(3000);
		
		//Nested iframe : 1st iframe  :f1
		driver.switchTo().frame("pact1");
		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("First crush");  //use by. id also
		
		//2nd iframe :Basically 2nd iframe will be present in 1st iframe also but indirectly :f2
		// so in order to move to 2nd iframe use SWITCH
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("current crush");
		
		//3rd iframe :f3
		driver.switchTo().frame("pact3");
		driver.findElement(By.id("glaf")).sendKeys("Destiny crush");
		
		//going back  : added in sel 4.x version
		//pact2
		driver.switchTo().parentFrame();  //go to imeediate parent frame (1 level back)
		driver.findElement(By.id("jex")).sendKeys("crush2-updated");  //just write along with current crush
		
		//pact1
		driver.switchTo().parentFrame(); 
		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("drush 1 -updated");
		
		
//		// we can't jump/switch from pac3 to pac1 (f3 : f1) //no child to grandparent /not from pac 1 to pac 3 also
//		driver.switchTo().frame("pact1");
//		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("back to First crush");
//		
		
		//back to page /BROWSER CONTEXT
		//driver.switchTo().parentFrame(); OR
		
		driver.switchTo().defaultContent();  //used to come OUT OF ENTIRE FRAME HIRERACHY.always go to main page
		String h3Text=driver.findElement(By.tagName("h3")).getText();//back to page if there is no parent inside frame then INTERACT with element.
		System.out.println(h3Text);   // Memory Test
		
		//it wont work
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//input[@id='inp_val']")).sendKeys("First crush");  



	}

}
