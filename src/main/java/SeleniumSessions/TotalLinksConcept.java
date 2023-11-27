package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//open any url
		//get the counts of link on the page
		//print the text of each link on the console
		//but ignore blank text = thr r blank text, like if i remove any text field name in link of amazon page. and enter it'll remove in ui but can be visible
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com"); //links will be in <a tag
		
		//FIND ELEMENTS  => return type is List of web element .NOT STRING
		By links=By.tagName("a"); // since <a tag is for all the links
		
		// passing wrong locator in FIND ELEMENTS: Return empty list  ( INTERVIEW QUESTION -100%)
		// By links=By.tagName("a11"); // IT'LL RETURN EMPTY LIST . But EXCEPTION in FIND ELEMENT

		// list is dynamic ;order based collection

		List<WebElement> linksList=driver.findElements(links);  
		int linksCount=linksList.size();
		System.out.println("Total Links :"+ linksCount); //233 links
		
		//for loop-index based
//		for(int i=0;i<linksCount;i++) {  //i<233
//			String Text=linksList.get(i).getText(); //getting index and TEXT
//			System.out.println(Text); //now 220
//			if(!Text.isEmpty()) { //false-!- True 
//				System.out.println(i+ ":" +Text); //330 index with link name
//			}
//		}
		
		//for each loop
		int count=0;
		for (WebElement e:linksList) {
			String Text=e.getText();
			if(!Text.isEmpty()) {
				System.out.println(count+ ":" +Text);	
			}
			count++;
		}
		
	}

}
