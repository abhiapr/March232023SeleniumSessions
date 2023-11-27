package SeleniumSessions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectClass {
	static WebDriver driver;
	public static void main(String[] args) {
		
		// WITHOUT SELECT CLASS

		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		//xpath
		//By CountryOptions=By.xpath("//select[@id='Form_getForm_Country']/option");
		//css
		By CountryOptionsCss=By.cssSelector("select#Form_getForm_Country > option");
		
		doSelectDropDownValueUsingLocator(CountryOptionsCss,"Brazil");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); // find element return type is web element		
	}
	
	public static void doSelectDropDownValueUsingLocator(By locator,String DropdownValue) { 
		
		List<WebElement>OptionList=driver.findElements(locator);
		
		//8yrs back we don't hv index,value,Visible methods . so we use iterative approach
		
		for(WebElement e:OptionList) {
			String text=e.getText();
			System.out.println(text);
			if(text.equals(DropdownValue)) {  // DropdownValue  =INDIA
				e.click();
				break;
			}
		}

}
}
