package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvgElementHandle {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Scalar Vector Graph
		// Normal xpath won't work ; for xpath: use //* [local -Name] function is pre-defined already as "Parent"
		//for child element=>// *name : for SVG it'll be in form of svg only	
		//SVG does NOT support CSS selector but we can use id,....
		
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		Thread.sleep(6000);
		
		//51 states of US=>WebElements 
		//driver.findElemets will not give any EXCEPTION=> just it'll print size of list as "0"
		//as it's present inside IFRAME =use switch to iframe else xpath alone won't work
		//child is present inside graph g
		//since every state in under PATH using path as child
		
		//how many svg ele's =>//*[local-name()='svg']//*[name()='g']
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		List<WebElement> StateList=
				driver.findElements(By.xpath("//*[local-name()='svg'and @id='map-svg']//*[name()='g'and @id='regions']//*[name()='path']"));
		
		System.out.println(StateList.size());
		
		Actions act=new Actions(driver); // clicking on each state so actions and move to element
		
		   //for loop
		   //move to element
		   //passing state list e which contains all web elements
		
			for(WebElement e:StateList) {
				act.moveToElement(e).build().perform();
			    Thread.sleep(500);
			    
			    String text=e.getAttribute("name"); // since all r in names\
			    System.out.println(text);
			    
			    if(text.equals("Maryland")) {
			    	e.click();
					break; // after maryland nothing will print
			    }
			}
	}
}
			
							
			