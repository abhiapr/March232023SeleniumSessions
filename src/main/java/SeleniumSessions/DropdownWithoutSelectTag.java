package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelectTag {
	
	// BLUR :responsible for blur and disappear for inspecting DROPDOWN values= EVENT LISTER 

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[(text()='Select Option')]")).click();  // arrow of select value
		
		List<WebElement>optionList=driver.findElements(By.xpath("//div[contains(@id,'react-select-2-option')]"));  // dropdown value
		Thread.sleep(2000);
		System.out.println(optionList.size());
		
		for(WebElement e:optionList) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains("Group 1, option 2")) {
				e.click();
				break;
				
			}
			System.out.println(e.getText());
			
		}
		

	}

}
