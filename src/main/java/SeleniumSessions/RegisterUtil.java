package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterUtil {
	private WebDriver driver; //else anyone can create obj and start accessing if it's public and get default value is NULL :NPE=>ENCAPSULATION
	
	//Private vars can be access by public layers constructor/getter setter
	
	//constructor
	public RegisterUtil (WebDriver driver) {
		this.driver=driver;
	}
	
	public void SendingKeys(By locator, String value) { //DON'T SUPPLY DRIVER TO METHOD AS PARAMETER . so created constructor
		gettingElement(locator).sendKeys(value);
	}
	 
	public WebElement gettingElement(By locator) {
		return driver.findElement(locator);
	}

	
}
