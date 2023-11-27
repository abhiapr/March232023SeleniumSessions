package MyTestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
	WebDriver driver;
	
//	@BeforeTest
//	public void setup() {	
//	driver=new ChromeDriver();
//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies(); 
//}
//	
	
	@Test(priority=1)	
	public void TitleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Assert.assertEquals(driver.getTitle(),"Account Login"); 	
	}
	
	@Test(priority=2)
	public void UrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("account/login"));		
	}
	
//	@AfterTest
//    public void tearDown() {
//	    driver.quit();
//	}
	
	
	//Thread count=10; 10 threads will handle 3 Test cases i.e, it'll handle 3 blocks  and 3 browsers will run parallel
	// if one thread got free it'll take another thread and perform  
	//
}

