package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImageCount {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		By images=By.tagName("img"); 
		List<WebElement> imagesList=driver.findElements(images);
		System.out.println("Total Images : " +imagesList.size()); // total images =206
		
	for(WebElement e:imagesList) { //images will have SRC ,ALT value
			String srcVal=e.getAttribute("src");
			String altVal=e.getAttribute("alt");
			System.out.println(srcVal+ ":"+altVal);
			
		}

	}
}

