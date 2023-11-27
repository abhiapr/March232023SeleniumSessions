package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdwonWithSelectTag { // it'll be present only along with SELECT TAG 

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		WebElement Dropdownele=driver.findElement(By.xpath("//select[@multiple]"));
		Select sel=new Select(Dropdownele);  // return type is web element
		
		//isMultiple method  :INTERVIW
		
		if(sel.isMultiple()) {  // boolean
			System.out.println("multi select is possible");
			sel.selectByVisibleText("American flamingo");
			sel.selectByVisibleText("Greater flamingo");
			sel.selectByVisibleText("Lesser flamingo");
			sel.selectByVisibleText("James's flamingo");  // if james"s then use back slash	=?james\"s		
		}
		
		sel.deselectByVisibleText("Lesser flamingo");
		sel.deselectAll(); // it'll deselect all

	}

}
