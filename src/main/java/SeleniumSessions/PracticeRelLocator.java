package SeleniumSessions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeRelLocator {

	public static void main(String[] args)  {
		
		//left,right,above,below element
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		
        WebElement ele=driver.findElement(By.linkText("Joe Root"));
		
		
		String leftStatus =driver.findElement(with(By.linkText("ESS")).toLeftOf(ele)).getText();
		System.out.println(leftStatus);
	
		
//		WebElement ele=driver.findElement(By.linkText("Lile Perrot, Canada"));
//		//using WITH 
//		String RightIndex=driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(RightIndex);  //158
//		
//		String LeftRank=driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(LeftRank); //7
//		
//		String abovecity=driver.findElement(with(By.linkText("North Bay, Canada")).above(ele)).getText();
//		System.out.println(abovecity); //North Bay, Canada
//		
//		String belowName=driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(belowName);//Dorval, Canada
		
		//near of ele  : default distance is 100 PIXELS
		//String NearCity=driver.findElement(with(By.tagName("p")).near(ele)).getText();
		//System.out.println(NearCity); // nearer will be above to particular ele whether it's child/parent
//		
//		//FE'S
//		List<WebElement> belowEle=driver.findElements(with(By.tagName("//div[@id='most_pollutedCitiesRank']/p")).below(ele));
//		for (WebElement e:belowEle) {
//			String text=e.getText();
//			System.out.println(text);
//		}
//		Assignment===================================================================================================
		
		//driver.findElement(by.id)
		
		

	}

}
