package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select3Practice {
	static WebDriver driver;
	public static void main(String[] args)throws InterruptedException {
		
		// WITHOUT select METHODS :// without select methods: Index,Value,Text

			driver=new ChromeDriver();
			driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
			By country=By.id("Form_getForm_Country");
			Thread.sleep(4000);	 
			doWithoutSelect(country,"Albania"); //break after albania

			//for xpath
			By Country_Option=By.xpath("//select[@id='Form_getForm_Country']/option");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doWithoutSelect(By locator,String DropDownValue) {
		Select select =new Select(getElement(locator));
		List<WebElement> optionList=select.getOptions();
		
		for (WebElement e:optionList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals(DropDownValue)){
				e.click();
				break;  //must
			}
		}
		
		
	}
	
	//without SELECT CLASS ITSLEF  :USE XPATH
	public static void doWithoutSelectClass(By locator,String DropDownValue) {
		
		List<WebElement> optionList=driver.findElements(locator);
		
		for (WebElement e:optionList) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals(DropDownValue)){
				e.click();
				break;  //must
			}
		}
		
		
	}
	
	

}
