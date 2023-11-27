package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {  //for security purpose as iframe

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        Thread.sleep(5000);
        
        //browser-page-shadowDom-shadowDom-ele
        
        //  browser-page-shadowDom- we hv iframe- shadowDom-ele  //DESTINY
		
		//driver.findElement(By.id("pizza")).sendKeys("veg Pizza");  //it's not under iframe
		//but under shadow dom and it should be always(OPEN) else we can't automate	
		//ask dev team to open it
		
		//xpath won't work
		//copy js path->paste it in console
		//use JS Executor
		
		String script="document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\");";
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//converting html element  to web element else we can't perform send keys
		
		WebElement pizza_ele=(WebElement)js.executeScript(script); //script is giving html dom of that element
		pizza_ele.sendKeys("Veg Pizza");
		
	//======================================================================================================================================

		//INTERVIEW QUE for chrome seting search box
	
		
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		Thread.sleep(6000);
//		driver.get("chrome://settings/");
//		WebElement search=(WebElement)js.executeAsyncScript("document.querySelector(\"body > settings-ui\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\");");
//		search.sendKeys("Notifications");
		
	}
	

}
