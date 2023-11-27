package MyTestPackage;

//right click-->Organize the imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest  { 
	WebDriver driver;
	// go to base test and then perform google test Test cases

	// AAA - for unit test Arrange, Act, Assert. we should follow => 1 test- 1
	// Assert

	// OPTIMIZING-removing setup and move it to Base test also after test


@Test(priority=1)
	
	public void googleTitleTest() {  //if i run this it'll go to base test and go to setup method then interact with .xml
	
	//adding url in xml
	 //  driver.get("https://www.google.com");
	   Assert.assertEquals(driver.getTitle(),"Google"); 	
	}

	@Test(priority = 2)
	public void googleUrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
	}

@Test(priority=3)
	
	public void googleSearchTest() {		
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	driver.findElement(By.name("q")).submit();
	Assert.assertTrue(driver.getCurrentUrl().contains("Selenium"));
}

//@AfterTest
//    public void tearDown() {
//	    driver.quit();
//}
}

// so it'll run all 3  Google test,open cart test,hrm test in browser



//	@BeforeTest
//	public void setup() {
//		driver=new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//	}
//	@Test(priority=1)
//	
//	public void googleTitleTest() {
//		Assert.assertEquals(driver.getTitle(),"Google"); 	
//	}
//	
//	@Test(priority=2)
//	public void googleUrlTest() {
//		Assert.assertTrue(driver.getCurrentUrl().contains("google"));		
//	}
//	
//	@Test(priority=3)
//	
//	
//	public void googleSearchTest() {
//		Assert.assertEquals(driver.getTitle(),"Google");  // act Vs exp		
//		Assert.assertTrue(driver.getCurrentUrl().contains("google"));
//		
//		//Perform search
//		driver.findElement(By.name("q")).sendKeys("Selenium");
//		driver.findElement(By.name("q")).submit();
//		
//		Assert.assertTrue(driver.getTitle().contains("Selenium"));  //Alphabetically it's running 1st 
//		// and title= Selenium then checking 1st TC so it's Google => so it's failing
//		//java.lang.AssertionError: expected [Google] but found [Selenium - Google Search]
//       // So giving Priority
//	}
//	
//	  
//	
	
	


