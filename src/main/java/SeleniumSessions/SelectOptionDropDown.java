package SeleniumSessions;


// CTRL+O  = gives no.of methods 
//green = methods ; red= private vars
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOptionDropDown {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		// <Select> tag Drop down:
		// select class with OPTION
		
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/hris-hr-software-demo/");
		Thread.sleep(4000);
		
		//html tag=select
		By Country=By.id("Form_getForm_Country");
		
		// using contains
		if(getDropdownTextList(Country).contains("India"));
		System.out.println("Pass");
		
		// asList => stores list of string in Array asList : we don't need arrays.toString => we can directly print the list
		
		List<String> expCountryOptionList=Arrays.asList("Brazil","India","Aruba");
		if(getDropdownTextList(Country).containsAll(expCountryOptionList)) {
			System.out.println(expCountryOptionList+ " is present");  
		}
	}
	
	//Generic
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator); // find element return type is web element		
	}
	
	// interview ques using SELECT CLASS
	public static int getOptionCount(By locator) {
		Select sel=new Select(getElement(locator));
		return  sel.getOptions().size();  // total no of elements in drop down 
	}
	
	
	public static List<String> getDropdownTextList(By locator) {
				
		Select sel=new Select(getElement(locator));
		List<WebElement> OptionsList=sel.getOptions(); // get option return type is web element
//	    System.out.println(OptionsList.size());  // no.of drop downs in country =>233
		List<String>OptionList_Text=new ArrayList<String>();
		
		for (WebElement e:OptionsList) {
			String text=e.getText(); //capture text
			OptionList_Text.add(text);
			//System.out.println(text);
		}
		return OptionList_Text;
		
		//int count=0;
		//System.out.println("count is : " + text);  //print all country name
		//count++;
		//for attribute: value="Albania" .getAttribute
		//for text : Albania . getText();	
		//count=0; append count
		
		
}

}
