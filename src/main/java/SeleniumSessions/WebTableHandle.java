package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		//WEBTABLE
		// 1. path //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']  ==> for EXACT CHECK BOX
		//2. path //a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		//3. FOLLOWING SIBLING:  //a[text()='Joe.Root']/parent::td/following-sibling::td  (JOE : user role,emp name,status)
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(6000);
		SelectEmp("Joe.Root");
		SelectEmp("Jasmine.Morgan");
		
		System.out.println(getEmpInfo("Joe.Root"));
		System.out.println(getEmpInfo("Jasmine.Morgan"));
		
//3
//[ESS, Joe Root, Enabled]
//3
//[ESS, Jasmine Morgan, Enabled]

	}
	
	//utility
	
	public static void SelectEmp(String empName) {
		driver
		.findElement
			(By.xpath("//a[text()='"+empName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();
		
	}
	
	//we can't use indexing for loop : nt gcp indexing many times.
	
	public static List<String> getEmpInfo(String empName) {
		List<WebElement> infoList=
				driver.findElements(By.xpath("//a[text()='"+empName+"']/parent::td/following-sibling::td"));
		
		System.out.println(infoList.size());
		List<String> InfoValList=new ArrayList<String>();
		for(WebElement e: infoList) {
			String text=e.getText();  //getting text and storing it in Array List
			InfoValList.add(text);
		}
		return InfoValList;
	}
		

}
