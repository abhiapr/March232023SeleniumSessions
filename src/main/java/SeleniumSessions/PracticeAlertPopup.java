package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		//1 . ALERT  = js alert/pop up  
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Thread.sleep(3000);
		
//		Alert alert=driver.switchTo().alert();  //switching to alert
//		String text=alert.getText();
//		System.out.println(text); //I am a JS Alert
//		alert.accept();
//		Thread.sleep(2000);
//		String res=driver.findElement(By.id("result")).getText();
//		System.out.println(res);  //You successfully clicked an alert
		
		//2.Confirm
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert=driver.switchTo().alert();
//		String text=alert.getText();
//		System.out.println(text);  //I am a JS Confirm
//		alert.accept();
//		 //alert.dismiss();   =>NO SUCH ALERT EXCEPTION
//		Thread.sleep(2000);
//		String res=driver.findElement(By.id("result")).getText();
//	    System.out.println(res);  //You clicked: Ok
		
		//3.PROMPT
	    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		
		Alert alert=driver.switchTo().alert();
		String text=alert.getText(); //capture the alert
		System.out.println(text); //I am a JS prompt
		Thread.sleep(2000);
		
		alert.sendKeys("AbhithaAPR");
		alert.accept();
		Thread.sleep(2000);
		String res=driver.findElement(By.id("result")).getText();
	    System.out.println(res); //You entered: AbhithaAPR
	    
	   String msg= res.split(":")[1].trim();
	   System.out.println(msg); //AbhithaAPR
		

	}

}
