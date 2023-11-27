package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementHandle {  //not important for interview

	public static void main(String[] args) {
		
	   //Pseudo elements does not have any attributes displayed in the DOM
       //Pseudo element always written with pseudo classes
       //Pseudo classes are starting with :: & doesn't have any information
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//to check mandatory fields
		//::before/::after
		
		//JS:
		String script="window.getComputedStyle(Document.querySelector(\"label[for='input-telephone']\"),'::before').getPropertyValue('content')";
		
		//JavaScriptExecutor :Interface
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String mandatory_text=js.executeScript(script).toString();  //equivalent java script
		System.out.println(mandatory_text);
		if(mandatory_text.contains("*")) {
			System.out.println("ele is mandatory");
		}

		
		//Ass= generic function ;just replace and append telephone
	}

	
	//how to handle hidden ele in sel =>itself a wrong question as its hidden to us,users also
}
