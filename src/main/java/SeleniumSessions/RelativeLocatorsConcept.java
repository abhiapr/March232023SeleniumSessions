
package SeleniumSessions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class RelativeLocatorsConcept {  //popular feature of  selenium 4.x ; Interview Ques
	public static void main(String[] args) {
		//            //Above
		// Left <----Element----->Right
                    //Below
		// Near
			
		//RelativeBy is child of BY
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.aqi.in/dashboard/canada");
	WebElement ele=driver.findElement(By.linkText("Sudbury, Canada"));
	
	//right of ele  : WITH	 is Static with class
	String RightIndex=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();  //passing options p for right side label
	System.out.println(RightIndex); //82
	
	//with return type is by but in the form of  RELATIVE BY
	
	//left of ele:
	String leftRank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftRank); //3
	
	//below ele
	String belowCity=driver.findElement(with(By.tagName("p")).below(ele)).getText();// if i capture p it'll also give child along with parent
	System.out.println(belowCity); //Fort St John, Canada
	
	//Above
	String AboveCity=driver.findElement(with(By.tagName("p")).above(ele)).getText();// if i capture p it'll also give child along with parent
	System.out.println(AboveCity); //Smithers, Canada
	
	//near of ele  : default distance is 100 PIXELS
	String NearCity=driver.findElement(with(By.tagName("p")).near(ele)).getText();
	System.out.println(NearCity);   // nearer will be above to particular ele whether it's child/parent 
	//just print same 
	
	//find Elements
	List<WebElement> belowElements=driver.findElements(with(By.tagName("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
	System.out.println(belowElements.size());   //drawback is it'll search all ele below 
	for(WebElement e:belowElements) {
		//String text=e.getText();
		System.out.println(e.getText()); //print all names
		
		
		
		
		
		//for check box things: always choose RIGHT OF PRIVACY POLICY NOT left of CONTINUE button
		// continue can shifted over anywhere
	}


	}

}
