package SeleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By links=By.tagName("a");
		
		By images=By.tagName("img");
		
		//to avoid these use GENERIC
		//List<WebElement> linkList=driver.findElements(links);
		//List<WebElement> imageList=driver.findElements(images);
		
//		System.out.println(getTotalElementsCount(links));
//		System.out.println(getElements(images));
//		
		List<String>actualEleTexList=getElementsTextList(links);
		System.out.println(actualEleTexList);
		
		// validation
		if(actualEleTexList.contains("Privacy Policy")) { //contains we can use for list/string
			System.out.println("Privacy Policy- PASS");
		}
		if(actualEleTexList.contains("Terms & Conditions")) {
			System.out.println("Terms & Conditions- PASS");
		}
		
	}
	// for loop generic : work for all applns
	public static List<String> getElementsTextList(By locator){
		 List<WebElement> eleList= getElements(locator); //calling last one .// fetching all the text name
		 List<String> eleTextList = new ArrayList<String>(); // array list is child of List (TOP CASTING) .// and storing  text in a list.//pc=0
		 for(WebElement e:eleList) {
			 String text=e.getText();// capturing text . for images: e.getAttributes
			 if(!text.isEmpty()) {
				 eleTextList.add(text);// text will get added
				 
			 }
		 }
		 return  eleTextList;
		 	
	}
	
	
	public static int getTotalElementsCount(By locator) {
		return getElements(locator).size();	
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	}

}
