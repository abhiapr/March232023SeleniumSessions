package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// we'll use very rare DragAndDrop not in real time
public class DragAndDrop {  //possible only in WEB ELEMENT TO WEB ELEMENT (not local driver)
	
	// 1.click and hold
	// 2.drop the element
	// 3.release

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement SourceEle=driver.findElement(By.id("draggable"));
		WebElement TargetEle=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
//		//builder pattern 
		
		// 1. without drag drop method  use Composite Action  methods means : interview question
//		act.clickAndHold(SourceEle)
//			.moveToElement(TargetEle)
//				.release()  // will not work without perform
//				      .build().perform();  //without build also it'll work but perform should be there
		
//		2.ANOTHER METHOD: single actions
		act.dragAndDrop(SourceEle, TargetEle).perform();
		
		
		

	}
}
