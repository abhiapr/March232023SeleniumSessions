package SeleniumSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2Practice {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		// select class with OPTION
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		Thread.sleep(4000);	
		By country=By.id("Form_getForm_Country");
		
		// check point using contains
		if(getDropdownText(country).contains("Brazil"));
		System.out.println("Pass");
		
		//asList and ALL CONTAINS
		List<String> expectedOptionList=Arrays.asList("India","Austria","China");
		if(getDropdownText(country).containsAll(expectedOptionList)) {
			System.out.println(expectedOptionList + " is present");
		}

	}
	
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	// interview ques using SELECT CLASS
		public static int getoptionCount(By locator) {  // counting the options
			Select sel=new Select(getElement(locator));
			return  sel.getOptions().size();  // total no of elements in drop down 
		}
		
	
	
	public static List<String> getDropdownText(By locator) {
		
		Select select=new Select(getElement(locator));
		List<WebElement> OptionList=select.getOptions();   // don't print list of web elements
		List<String> optionList_Text=new ArrayList<String>(); //storing in array list (stores list of string)
		
		for (WebElement e:OptionList) {
			String text=e.getText(); //capture text
			optionList_Text.add(text);		
		}
		return optionList_Text;
		
		
	}

}
