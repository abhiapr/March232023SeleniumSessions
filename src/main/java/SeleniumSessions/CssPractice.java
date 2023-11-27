package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		Thread.sleep(5000);
		
//		By.cssSelector("input.text");
//		By.cssSelector("input#Form_getForm_Email");
//		By.cssSelector("input.text ,#Form_getForm_Email");
		
		
		// Css: [placeholder='Business Email*']
		//xpath: //input[@placeholder='Business Email*']
		
		// input[placeholder*='Email*'] =  CONTAINS
		// By.cssSelector("input[placeholder*='Email*']");
		
		//legacy-group-status optanon-status-checkbox
		// input[class*='legacy']
		
		// Starts with => input[id^='chk']
		//ends with => input[class$='checkbox']
		
		//combining all 
		By elements=By.cssSelector("#chkMain,#Form_getForm_Contact");
		if(driver.findElements(elements).size()==2) {
			System.out.println("Pass");
		}
		else {
			System.out.println("fail");
		}
		

	}
	
}
