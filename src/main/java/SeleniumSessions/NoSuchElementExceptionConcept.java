package SeleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
	  	By forgotpwd= By.linkText("Forgotten Password1");   //deliberately giving wrong Locator
	  	
	  	driver.findElement(forgotpwd).click();  // NO SUCH ELEMENT EXCEPTION not (element nt found is no where exist) 
	  	
	  	//or use try catch just to bypass exception not solving pblm
	  	try {
	  		driver.findElement(forgotpwd).click();	
	  	}catch(NoSuchElementException e){
	  		System.out.println("getting element excpetion... plz check ur locator again");
	  		e.printStackTrace();

	  	}
	  	//while creating web element it'll throw exception. it'll not go to CLICK
	  	System.out.println(driver.getTitle()); // it'll not come to this line
	}

}
