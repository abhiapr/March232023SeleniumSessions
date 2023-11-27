package SeleniumSessions;


//ctrl ,shift,o = imports
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeRightElement {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			 driver=new ChromeDriver();
			 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			 
//			WebElement rightclickEle=driver.findElement(By.xpath("//span[text()='right click me']"));
//			Actions act=new Actions(driver);
//			act.contextClick(rightclickEle).perform(); // moving to right click BUTTON
			 
//*		Performs a context-click at middle of the given element. First performs a mouseMoveto the location of the element.
//			List<WebElement> Value= driver.findElements(By.xpath("//span[text()='Cut']"));
//			
//			for(WebElement e:Value) {
//				String text=e.getText();
//				System.out.println(text);
//				if(text.equals("Cut")) {
//					e.click();
//					break; 
//				}
//				
//			}
			
			By ContextMenulocator=By.xpath("//span[text()='right click me']");
			RightClickElement(ContextMenulocator,"Cut");

	}
		
		//generic 
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		
		// just do generic lien by line by referring above 
		public static void RightClickElement(By ContextMenulocator,String Value ) { //value= cut,edit...
			Actions act=new Actions(driver);   //action return type is driver
			act.contextClick(getElement(ContextMenulocator)).perform();   // by act class we r passing  get element ,locator
			By ValueLocator=By.xpath("//*[text()='" + Value+"']");   // removing span since it's hardcoded
			getElement(ValueLocator).click();
					
		}

}
