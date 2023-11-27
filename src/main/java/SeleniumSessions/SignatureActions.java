package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SignatureActions {  //not imp for real time use cases; not for interview also.
	//just what is OFFSET?
	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromeDriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://signature-generator.com/draw-signature/");
		Thread.sleep(5000);
		
		//Canvas =>html tech kind of image we can't come inside canvas
		WebElement canvas=driver.findElement(By.id("signature-pad"));
		
		Actions act=new Actions(driver);
		
		Action signature= act.click(canvas)
		.moveToElement(canvas, 3, 3)
		// y offset:-ve= an offset left of the point ; y offset - A negative value means an offset above the point.
		.clickAndHold(canvas)
		.moveToElement(canvas, -200, -50)
		.moveByOffset(50, -50)   // only for moving the mouse
		.moveByOffset(50, -50)   // 
		.moveByOffset(3, 3)
		.release(canvas)
		.build();

		signature.perform();	
	}
}
