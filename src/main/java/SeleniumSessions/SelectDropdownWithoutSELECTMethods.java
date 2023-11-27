package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSELECTMethods { //interview but it's not needed (Becz, we hv select methods index,value,text)
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		By Country=By.id("Form_getForm_Country");
		doSelectDropDownValue(Country,"Brazil"); ; //print till Brazil 
		Thread.sleep(4000);
		
		// without select methods: Index,Value,Text
		doSelectDropDownValue(Country,"India");   // then, it'll print from 1st till INDIA then,break
		}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); // find element return type is web element		
	}
	
		
		public static void doSelectDropDownValue(By locator,String DropdownValue) { 
			
			//Select sel=new Select (driver.findElement(Country));
			Select sel=new Select (getElement(locator)); // calling get element to pass country locator
			List<WebElement>OptionList=sel.getOptions();
			
			for(WebElement e:OptionList) {
				String text=e.getText();
				System.out.println(text);
				if(text.equals(DropdownValue)) {  // DropdownValue  =INDIA
					e.click();
					break; //break if it reaches India
					
				}
			
		}

	}

}
