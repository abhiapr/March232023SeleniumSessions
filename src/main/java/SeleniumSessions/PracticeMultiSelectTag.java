package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeMultiSelectTag {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		WebElement DropdownEle=driver.findElement(By.xpath("//select[@multiple]"));
		Select sel=new Select(DropdownEle);
		
		//isMultiple()
		if(sel.isMultiple()) {
			System.out.println("multi select is possible");
			sel.selectByVisibleText("American flamingo");
			sel.selectByVisibleText("Chilean flamingo");
			sel.selectByVisibleText("James's flamingo");		
		}
		
		//DESELECT
		sel.deselectByVisibleText("American flamingo");
		sel.deselectAll();  // toDeselect All
		

	}

}
