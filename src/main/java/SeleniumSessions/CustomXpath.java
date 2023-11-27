package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login?loginRedirectUrl=https%3A%2F%2Fapp.hubspot.com%2Fsignup-hubspot%2Fcrm%3Fhubs_signup-url%3Dwww.hubspot.com%252Fproducts%252Fcrm%26hubs_signup-cta%3Dcrmpersona-salesleader%26uuid%3D8d61f56c-e5cf-4139-8e06-c5947426cd97%26step%3Demail_only_landing_page");
		
		//Xpath : address of an element
		//1. Absolute xpath: /htm//div/div/div[2]/ul/li[4]/a
		//2. Relative /custom xpath:  using attributes, using xpath functions
		
		//htmltag[@attribute ='value']
		//input[@name='username']
		//button[@type='submit']
		
		//input -14
		//input[@id]-16
		//input[@id='input - firstname']---1
		//input-firstname--id---- recommended
		
		//input[@placeholder='Username']
		
		//for multiple attributes
		
		//htmltag[@attr1=value and @attr2=value]
		//input[@name='username' and @placeholder='Username']
		//input[@name='username' and @placeholder='Username' and @class='oxd-input--active']
		
		//htmltag[@attr1 and @attr2 and @attr3]
		
		//input[@class and @name and @placeholder]-2
		//input[@class='form-control private-form__control login-email']
		
		By e1=By.xpath("//input[@class='form-control private-form__control login-email']");  //===>VALID
		By e2=By.className("login-email");  //===>VALID (in class name we can use only one also)
		
		//INVALID SELECTOR EXCEPTION ==>multiple compounds(multiple classes) are not allowed
		//By e3=By.className("form-control private-form__control login-email"); // cannot use multiple classes in BY CLASS //===>INVALID
		
		By e4=By.xpath("//input[contains(@class,'login-email')]"); //===>VALID
		By e5=By.xpath("//input[(@class,'login-email')]"); //===>INVALID : without contains it's not valid
		
		driver.findElement(e1).sendKeys("test@gmail.com"); // value is entering in url for e1,e2
		
		
		//CONTAINS() as function in Xpath :pass full/partial value ==>//htmltag[contains(@attr,'val')]
		//input[contains(@data-test-id,'email-input')]
		//input[contains(@data-test-id, 'field')] ==>email inspect
		//input[contains(@class,'login-email')]  ===>among class attribute's one part 
		
		//LONG VALUE: use CONTAINS()
		//DYNAMIC ATTRIBUTES/ids
//		<input id ="test 123">  //once refresh id is getting changing
//		<input id ="test 456"> 
//		<input id ="test 900"> 
		
       //input[contains(@id, 'test_')]

	//Contains() with attr1 and without contains attr2	
	//htmltag[contains(@attr1 ,'value') and @attr2="value"]
	//input[contains(@data-test-id,'email-login') and @type='email']
	//input[@type='email' and contains(@data-test-id,'email-input')and @id='username']
		
		
		//text() in xpath ==>HEADERS
		//htmltag[text()='value']
		//h1[text()='Register Account'] <h tag will be thr and text
		
		//contains() with text() ==>htmltag[contains(text(),'value']
		//Trusted by 60,000+ businesses of all sizes
		//span[contains(text(),'60,000+ businesses of all sizes']
		
		
		//text() with @attr:
		//htmltag[text()='value' and @attr='value']
		
		//class="list-group-item">Login</a>:
		//a[text()='Login' and @class='list-group-item']
		
		//text() with contains() and attr with with contains() and attr without contains()
		//htmltag[contains(text(),'value' and conatins(@attr,'value') and @attr='value']
		
		//<a href="https://naveenautomationlabs.com/opencart/index.php?route=account/address" class="list-group-item">Address Book</a>
		
		//contains-->Comma ; without contains==> =
		////a[contains(text(),'Address' and contains(@href,'account/address') and @class='list-group-item']
		
		
	// INDEX/POSITION :if position is changing then, it'll be risky
	// CAPTURE GROUP = using brackets  : for indexing use capture group
    // (//input[@class='form-control'])[1] : first element [1]= will be like hardcoded
		
	// POSITION FUNCTION => (//input[@class='form-control'])[1] [position(1)]
		By.xpath("(//input[@class='form-control'])[1]");
		
	//for last position ==>LAST()
		// (//input[@class='form-control']) [last()] => it'll show Confirm password
		// (//input[@class='form-control']) [last()-1] => password
		// (//input[@class='form-control']) [last()-(last()-1)] // 6- 5=1(FIRST NAME) = but we can use directly [1] also 
		
		//for amazon :UNDER LET US HELP YOU => HELP
		
		//In >div under this, if we hv anything then it's child (DIRECT PARENT CHILD); if its under 2nd div> <a href = then it'll be grandchild
		
		//for direct child : / a ; for indirect child 
		// ((//div[@class='navFooterLinkCol navAccessibility']) [last()]//a) [last()]  //HELP
		// ((//div[@class='navFooterLinkCol navAccessibility']) [last()]//a) [last()-1] // AMAZON ASSISTANT
		
		
		// Parent to child:
		// parent/child: direct child (single slash)
		// parent//child:gives you  direct child +indirect child
		
		// //input[@id='Form_getForm_Country]/option
		
		//direct + indirect : orange footer - about us
		// //div[@class='footer-main']//a  =20
		
		//hotspot: under form 
		// //form//input[@id='username'] :  input (//) under form user name is not direct input
		
		//Child to Parent:
		//immediate parent (use /...) of input id is above DIV ;sibiling is:UIFormControl__LabelWrapper
		//for DIV parent is: private-form__control-wrapper
		////input[@id='username']/../..//..  ==>going in backward traversing so that reaching node  : child/..
		
		//parent: imediate parent
		//  //input[@id='username']/parent::div  ==> will goes to form 
		
		//Grand parent:
		//input[@id='username']/ancestor::form
		
		//Orange CRM : country drop down country
		// //option[contains(text(),'Country')]
		// //option[contains(text(),'Country')]/parent::select  => for parent
		// //option[contains(text(),'Country')]/ancestor::div   => Grand parent 10
		// //option[contains(text(),'Country')]/ancestor::form/.. => from ancestor to immediate parent
		
		
		
	}
	
	
	

}
