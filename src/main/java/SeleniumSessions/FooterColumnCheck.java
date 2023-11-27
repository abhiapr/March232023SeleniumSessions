package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//INTERVIEW QUESTIONS

public class FooterColumnCheck {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		Thread.sleep(5000);
		
		//calling and print
		System.out.println(getFooterHeaderTest("Blog")); //passing footerText
		System.out.println(getFooterHeaderTest("Amazon Device"));
		System.out.println(getFooterHeaderTest("Careers"));
		System.out.println(getFooterHeaderTest("Shop with Points"));
		System.out.println(getFooterHeaderTest("Sell apps on Amazon"));
		
		
		// to verify AMAZON SCIENCE footer column:
		
		//from xpath going to grand parent and fetching text and go to his child
		//a[text()='Amazon Science']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div
		
		// 1. path=> //a[text()='Shop with Points']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div =>replacing footer name

		// System.out.println(footerText); // =>GET TO KNOW ABOUT US will print after 5 sec
		// i can change Amazon devices/ blog we'll get ancestor (GET TO KNOW ABOUT US)
		
		// 2. path => //a[text()='Amazon Science']/ancestor::ul/parent::div/div
		
		//3. =>  //a[text()='Amazon Science']/parent::li/parent::ul/parent::div/div
		
		//4. =>Sibling to sibling : a.PRECEDING(before)  b. P
		//ul is following sibling of DIV and div is PRECEEDING sibling of ul
		// //a[text()='Amazon Science']/ancestor::ul/preceding-sibling::div  =>( sib name)

		// we can also use child: /child::input
	}
	
	//Creating utility: appending footerText with Xpath
	
	public static String getFooterHeaderTest(String footerText) { //appending footer text by concatenate (for all footers name it'll work)
		
		String footerHeaderText=driver.
				findElement
						(By.xpath("//a[text()='"+footerText+"']/ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
								.getText();
		//will goto ancestor=> navFooterLinkCol navAccessibility(GET TO KNOW ABOUT US)==> /div (direct child)
		return footerHeaderText;
	}

	
	//id- selectorshub ; id is dynamic  
	//id="ohrmList_chkSelectRecord_21"; //Joe
	//id="ohrmList_chkSelectRecord_14"; //Jordan
	
	//WEBTABLE
	
	// 1. path //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']  ==> for EXACT CHECK BOX
	//2. path //a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
	//3. FOLLOWING SIBLING:  //a[text()='Joe.Root']/parent::td/following-sibling::td  (JOE : user role,emp name,status)


}
