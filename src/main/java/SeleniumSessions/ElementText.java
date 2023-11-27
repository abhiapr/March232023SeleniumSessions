package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementText {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
    	By registerHeader=By.tagName("h1");        // Register account - tag name (h)
     	By forgotpwd= By.linkText("Forgotten Password");    //<a ,href = link text
     	
//		System.out.println(getElementText(registerHeader));  // or we can use string then print it
//		System.out.println(getElementText(forgotpwd));
		
		//IS DISPLAYED  - Boolean
//		boolean flag=driver.findElement(registerHeader).isDisplayed(); 
//		System.out.println(flag);
     	
     	if(checkElementIsDisplayed(registerHeader)) {//passing locator
     		System.out.println("Register account header is displayed");
     		String regheader= getElementText(registerHeader);
     		if(regheader.equals("Register Account")) {
     			System.out.println("Register account --PASS");
     		}
     		else {
     			System.out.println("Register account --FAIL");
     			
     		}
     		
     	}	
	}

 	// generic for display
	
	public static boolean checkElementIsDisplayed(By locator){
		return getElement(locator).isDisplayed();
	}
	
	//generic text method
	
	public static String getElementText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println("Element text is : "+ eleText);	
		return eleText;	
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}