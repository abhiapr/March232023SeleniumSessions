package SeleniumSessions;

import java.util.List;

//ctrl ,shift,o = imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {  // or CONTEXT MENU
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		
		// ctrl+shift+2 ==> for WebElement ,List<>
//		WebElement rightClickEle=driver.findElement(By.xpath("//span[text()=right click me]"));
//		Actions act=new Actions(driver);
//		
//		act.contextClick(rightClickEle).perform() ; //choose 2nd suggestion 
		
//		List<WebElement> optionList=driver.findElements
//					(By.cssSelector("ul.context-menu-list.context-menu-root span")); // space span = indirect child
//		
//		System.out.println(optionList.size());
//		for (WebElement e:optionList) {
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("Edit")) {
//				e.click();
//				break;
//			}
//			
//		}
		
		//or 
		// driver.findElement(By.xpath("//span[text()='Copy']")).click();

		By ContextMenulocator=By.xpath("//span[text()='Copy']");
		SelectRightClickOption(ContextMenulocator,"Copy");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	//generic
	public static void SelectRightClickOption(By ContextMenulocator,String optionsValue) { //optionsValue= copy,edit
		Actions act = new Actions(driver);
		act.contextClick(getElement(ContextMenulocator)).perform();
		By optionLocator=By.xpath("//*[text()='"+optionsValue+ "']");  //copy  ==> option value  ; //span is tag so its hard coded it may change also
		//rspan with * =contains
		getElement (optionLocator).click();
	}

}
