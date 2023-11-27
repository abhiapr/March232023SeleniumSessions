package MyTestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {
	WebDriver driver;
			
	@Test(priority=1)
	
	public void TitleTest() {
		//driver.get("https://www.orangehrm.com/30-day-free-trial/");
		Assert.assertEquals(driver.getTitle(),"OrangeHRM"); 	
	}
	
	@Test(priority=2)
	public void UrlTest() {
		Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial"));		
	}
	
//	@AfterTest
//    public void tearDown() {
//	    driver.quit();
//	}
//	
}
	
	// any kind of non java file like xml will be under RESOURCES
	//every test block shd hv test class like open cart,orangetES

