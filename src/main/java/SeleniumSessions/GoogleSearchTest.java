package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		// inspect search bar
		//name="q" ; b is bold
		
		//driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");  //By.name==> search locator
		//Thread.sleep(5000);
		
		//if i apply GETTEXT() of  parent tag will also get text of child 
		//inspecting the suggestion : sometimes in <ul: thr will be div in one and will not be thr in another ul dom it's fine np
		
		By search=By.name("q");
		By suggestionList=By.xpath("//ul[@role='listbox']//div[@role='presentation' and @class='wM6W7d']/span");  // SearchSuggLocator
		
		 doSearch(search, suggestionList,"Naveen Automation Labs","youtube");
	}
	
	//generic search
	
	public static void doSearch(By Searchlocator,By SearchSuggLocator,String searchKey,String suggName) throws InterruptedException {
		
		driver.findElement( Searchlocator).sendKeys(searchKey);  // instead of "Naveen Automation Labs" =search key
		List<WebElement> suggList = driver.findElements(SearchSuggLocator);
		Thread.sleep(5000);
		System.out.println(suggList.size()); // 10

		// for
		for (WebElement e : suggList) { // it'll go to 27 and span shd hv text ; every span will hv a TEXT
			String Text = e.getText();
			System.out.println(Text); // will print 10 text from span
			
			// youtube  ==>suggName
			if (Text.contains(suggName)) { // it'll go to youtube suggestion in 5th and click ;print naveen suggestion list							// list
				e.click();
				break;
			}
		}
		
	}

}
