package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {  // (Or)MODAL DIALOG:	IMP INTERVIEW QUE : it was not provided by sel. sel has to handle the alert .

	public static void main(String[] args) throws InterruptedException {
		//ALERT  = js alert/pop up  
		
//		1. ALERT 2.PROMPT(enter user id ) 3.CONFIRM  (are yu sure want to close this=>T/F): on console we can write these methods , inspect won't work on alerts 
		//not in sel but in all browsers js alerts r there
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//once i enter the url ,we hv the Driver. we can access/capture the pop up. i.e, move the driver from page to alert handle
        //only page is freeze not driver.
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(2000);
//		
//		Alert alert=driver.switchTo().alert();  //it returns alert as ref variable. As, driver.fe returns Webelement
//		String text=alert.getText(); //capture the alert
//		System.out.println(text);
//		alert.accept(); // accept the alert
//     	alert.dismiss(); // if there is not no alert for DISMISS then, will give you =>NoAlertPresentException: no such alert
//		if comment 24 line :then also same NSA
		
		//2. CONFIRM
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(2000);
//		Alert alert=driver.switchTo().alert();
//		String text=alert.getText(); //capture the alert
//		System.out.println(text);
//		alert.accept();
//		
		//3.PROMPT
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String text=alert.getText(); //capture the alert
		System.out.println(text);
		Thread.sleep(2000);
		alert.sendKeys("TestAutomation") ;// sending keys to enter in prompt tab ; we can't capture this text . i can inspect from RESULT and use getText
		alert.accept(); //for click OK
		
		//driver will come and capture
		Thread.sleep(2000);
		String msg=driver.findElement(By.id("result")).getText();  //capturing the entered valueit'll come from result
		System.out.println(msg);   // You entered: TestAutomation
		
		String ActText=msg.split(":")[1].trim() ;//for spilt return type is STRING ARRAY
		System.out.println(ActText);  //TestAutomation
		
	}

}
