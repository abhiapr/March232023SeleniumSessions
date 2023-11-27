package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertWait {
static WebDriver  driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//: waiting for alert to be present (tried for 10 second(s) with 500 milliseconds interval) ==>If i i comment above line
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		//we DON'T need to use alert.switchto(). to  Move
//		//we don't need to write any Thread.sleep
//		
//	  Alert alert=wait.until(ExpectedConditions.alertIsPresent()); //check whether alert is present atleast for 10 sec .
//	  //also SWITCH TO particular alert
//      String text= alert.getText();
//      System.out.println(text);
//      alert.accept();  //if i comment 18 : throw exception after 10 sec
		
		Alert alert=WaitforJSAlert(10);
		System.out.println(alert.getText());  //I am a JS Alert
		alert.accept(); 
	}
	
	
	//can we handle wait for non web-ele? YES above title/url/alert waits are the examples
	//Generic
	public static Alert WaitforJSAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());  // if i return then it'll be Alert in return type
		
	}

}
