package SeleniumSessions;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarouselHandling {  //IMP INT QUE
static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		
//		//h2[text()='Recommended for you']/../../following-sibling::div//div[@data-qa='product-name']
		// from recommended going back to ancestor and following sibling for other carousel
		
		String xpath="//h2[text()='Recommended for you']/../../following-sibling::div//div[@data-qa='product-name']";
		
		//at end of carousel : arrow will be Disabled
		String next_xpath="//h2[text()='Recommended for you']/../../following-sibling::div//div[contains(@class,'swiper-button-next')]";
		
		List<WebElement> Product_List=driver.findElements(By.xpath(xpath)); //38
		
		
		//Hash set doesn't maintain order
		Set<String> prodSet= new TreeSet<String>();
		
		//no order = HashSet
		//LinkedHashSet = with order
		//TreeSet= alphabetical order
		//ArrayList = don't use it'll allow all
		
		//Tree set does not allow duplicate but it'll store all data in alphabetical order
		
		//checking for disabled condition
		while(!driver.findElement(By.xpath(next_xpath)).getAttribute("class").contains("swiper-button-disabled")) { //since, no of iterations are not fixed use while loop
			
			for(WebElement e:Product_List) {
				// e.getText(); or		
				String title=e.getAttribute("title");
				//System.out.println(title);
				prodSet.add(title);
			}
			
			//click on next
			
			driver.findElement(By.xpath(next_xpath)).click();
		}
		
		//iterate prod set
		for(String e:prodSet) {
			System.out.println(e);
		}
	}
}


