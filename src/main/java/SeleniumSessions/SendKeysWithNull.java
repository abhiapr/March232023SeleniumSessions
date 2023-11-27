package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNull {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstname=By.id("input-firstname");
		driver.findElement(firstname).sendKeys("null"); // null will get enter in first name field
		
		//ILLEGAL ARGUMENT EXCEPTION Keys to send should not be a null charSequence
		driver.findElement(firstname).sendKeys(null); // nothing will enter
		
		//blank value - first name will blink no exception also => no need to put check point in element util
		//driver.findElement(firstname).sendKeys(""); 
		
		//space (" ") ==>space will be entered in first name
		//numeric - compilation error
		//driver.findElement(firstname).sendKeys(123); but "123" is allowed
		
		//Character Sequence ia a interface. String buffer,string builder,string are child of char sequence
		
		String str="Naveen";
		StringBuilder sb= new StringBuilder("Automation");
		StringBuffer sf= new StringBuffer("labs");
		
		driver.findElement(firstname).sendKeys(str+sb+sf);  //without space 
		driver.findElement(firstname).sendKeys(str+" "+sb+" "+sf);//with space
		driver.findElement(firstname).sendKeys(sb); //it'll take sb alone also  
		driver.findElement(firstname).sendKeys(str,sb,sf); //comma separated also
	}

}
