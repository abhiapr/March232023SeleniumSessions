package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {  //from xml it'll come to here , Base test and pick  browser  , url then perform Search Test method
	WebDriver driver;
	
//	@BeforeTest
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		
//	}
		
@DataProvider(name="searchdata")  //we can provide name or method name  to below Test
public Object[][] SearchTestData() {
	return new Object[][] {
		{"macbook",3}, // if i need to know how many results r coming after search; [DATA PROVIDER MISMATCH ERROR ] if i don't define parameter
		{"imac",1},
		{"samsung",2},
		{"canon",1},  // Expected test data will be defined by TESTER
		{"naveen",0}
	};
	
	//xml is for configuring environment
}

@Test(dataProvider="searchdata")
public void SearchTest(String searchkey,int ExpsearchCount) {
	
	driver.findElement(By.name("search")).clear();
	driver.findElement(By.name("search")).sendKeys(searchkey); //macbook
	driver.findElement(By.cssSelector("div#search button")).click();  //or CSS div#search button= search button	
	
	String header=driver.findElement(By.cssSelector("div#content h1")).getText(); //for SEARCH macbook content
	System.out.println(header);
	Assert.assertTrue(header.contains(searchkey));  //macbook
	
	//for exp data
	int ActualsearchCount=driver.findElements(By.cssSelector("div.product-layout")).size();
	System.out.println(searchkey + "count ===> " + ActualsearchCount);
	Assert.assertEquals(ExpsearchCount,ActualsearchCount);
}

}
