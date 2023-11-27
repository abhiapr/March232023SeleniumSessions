package MyTestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginPageNegativeTestCase {
	
	//Data driven approach is an approaches not framework OR TEST PARAMETERIZATION  => drive the data from source :method,excel 
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		
	}
	
	@DataProvider  // always  return 2D array ; obj is Non Primitive (we'r using for different combinations)
	public Object[][] loginTestData() {
		return new Object[][] { //it'lll hold any data str,double,long,int
			
			// -ve Test data
			{"test1231@gmail.com", "test@1234231"},
			{"naveeeeenanime@gmail.com", "test123@12"},
			{"teset12.@2@1213.@gmail.com", "testst12121121"},
			{"  ","  "},
			{"!@#!@#!@#","test121212"}
		};
		
	}
	
	@Test(dataProvider ="loginTestData")  //providing data ;creating mapping between DataProvider and Test
	public void loginWithWrongData(String userName,String password) { //it'll running 5 times since we hv 5 rows
		
		driver.findElement(By.id("input-email")).clear(); //else all r getting appended
		driver.findElement(By.id("input-email")).sendKeys(userName);  //naveeen@12123
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);  //testt2134@
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String ErrorMsg=driver.findElement(By.cssSelector("alert alert-danger ")).getText();
		System.out.println(ErrorMsg);
		
		AssertJUnit.assertTrue(ErrorMsg.contains(" Warning: No match for E-Mail Address and/or Password."));
		
	}
	

}
