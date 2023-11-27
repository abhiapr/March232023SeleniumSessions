package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTesting {
	public class GoogleTest {
		WebDriver driver;
		
		//AAA - for unit test Arrange, Act, Assert.  we should follow => 1 test- 1 Assert
		
		@BeforeMethod // for each 3 test it'll launch browser every time  ==>INT QUE
		public void setup() {
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies(); 
			
		}
		@Test(priority=1)
		
		public void googleTitleTest() {
			Assert.assertEquals(driver.getTitle(),"Google"); 	
		}
		
		@Test(priority=2)
		public void googleUrlTest() {
			Assert.assertTrue(driver.getCurrentUrl().contains("google"));		
		}
		
		@Test(priority=3)
		
		
		public void googleSearchTest() {
			Assert.assertEquals(driver.getTitle(),"Google");  // act Vs exp		
			Assert.assertTrue(driver.getCurrentUrl().contains("google"));
			
			//Perform search
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("q")).submit();
			
			Assert.assertTrue(driver.getTitle().contains("Selenium"));  //Alphabetically it's running 1st 
			// and title= Selenium then checking 1st TC so it's Google => so it's failing
			//java.lang.AssertionError: expected [Google] but found [Selenium - Google Search]
	       // So giving Priority
		}
		
		  
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
			
		}
	}
		


}
