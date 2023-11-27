package MyTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseTest {
	WebDriver driver;
	ChromeOptions co;
	
	  // Parameter will interact with testng.xml file and perform; same browser name is present in .xml file
	
	//AAA - for unit test Arrange, Act, Assert.  we should follow => 1 test- 1 Assert
	//@BeforeTest// for each 3 test it'll launch browser every time  ==>INT QUE
// 	1st execute parent class before test and then child class test methods
	
	@Parameters({ "browser","url", "headless" })
	@BeforeTest
	public void setup(String browserName,String url,String headless) {

		System.out.println("running browser: "+browserName);
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			co=new ChromeOptions();  //true then add headless and open in headless mode		
			if(Boolean.parseBoolean(headless)) {  //use only When it's HEADLESS mode ,also headless is TRUE we'll add below 
				co.addArguments("--healdess=new");		 //TRUE -it won't open in browser		
			}			
			driver=new ChromeDriver(co);
			break;  // if i break come to 41 and maximize
						
		case "firefox":
			driver=new FirefoxDriver();
			break;	
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":  // headless wont' work
			driver=new SafariDriver();
			break;
		default: 
			System.out.println("pls pas right browser...");	
			break;
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();		
	}
}

//public void setup() {
//	driver=new ChromeDriver();
//	// driver.get("https://www.google.com"); -removing from here this WON'T WORK FOR OPEN CART /HRM .so pasting in each test 
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies(); 
//}
//
//@AfterTest
//public void tearDown() {
//	driver.quit();		
//}

//to run parallely - use thread count  and parallel ; testng's thread  will decide which has to be pick first 


//	will be copy/pasting template from testng report

//	Verbose: 3/4 is enough else un neccesary info will be displayed
//  min is : 1; if we need more info we can increase number
//	INTERVIEW QUE =>MAX NUM =10; MIN =10	
	
	//  <test name ="Google Test"> //Test block name
	//  <class name="MyTestPackage.GoogleTest"/>  ==>package name .class name


//Headless , value='true'



//===================================================================
//<test ="Google Test_chrome">
// <parameter name="browser" value="chrome"/>
// <classes>
//    <class name="MyTestPackage.GoogleTest"/>
// <classes>   
//</test>









//================================================
//	 Page Object Model (POM) is DESIGN TOOL Pattern. we can use any language in POM

//	Maintaining a framework is very important

// 1. PAGE LAYER is for: page class and for By LOCATORS (driver code only in page class NO ASSERTIONS) i.e,driver.
// 2. TEST CASE LAYER is for: test cases handle by TESTNG using assert  
// 3. Test case EXTENDS BaseTest ( where we can write pre-conditions, setup method)
// 4. Driver Factory: is for initializing driver browser (extends by base test)
// 5. a)config.Properties  ; b) Test runners(.xml file) [for running bulk files)
// 6. Utility
// 7. DATA DRIVEN APPROACH  => deriving data from another source
//  Test data from EXCEL file : sel/testng won't read test cases written in excel file ==>using APACHE POI
// getData sheet using Data Provider(DP)
// TestNG Listeners
// Above are MAVEN project (pom file)
// jenkin will take the code from Git hub repository
// jenkin will generate report from Allure/extent report
// UI env requires execution environment like different browsers
 
// Zelenium is DEPRECATED from market

// execution grid setup in cloud 

//	There are NO types of FW (10,000 lines of code but not written  in one main class) 
// 	FW is code written  in different classes using internally oops concept static,n.s methods.
// 	FW is Segregation of code [following some pattern; designing some components,and they r interacting with each other]
// 	Seleinum is library NOT tool. to interact with element
// 	selenium is fw but not Testing FW
// 	TestNG is  Unit Testing FW helps to design Test cases

// =====================================

// In which directory maven stores all the jar files  =>M2  -INTERVIEW QUE
// it's hidden folder. under that it'll manage all the repositories

// we can down grade using dependencies maven repository