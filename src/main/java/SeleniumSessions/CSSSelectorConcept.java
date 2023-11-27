package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// CSS and Xpath both have good performance in modern browser nowadays. (old css is CSS1,2)

public class CSSSelectorConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login/beta");
		Thread.sleep(5000);
		//https://app.hubspot.com/login/beta
		
		
		//INSPECTING naveen's website (email)
		//id : #id
		//tag:#id  ===> #input-email  or with tag name :  input#input-email
		
		//class-->.class
		//tag.class  ==> input.form-control
		//By.cssSelector("input.form-control");
		
		//multiple class : c1.c2.c3.....cn  ==>
		//tag .1.c2.c3..cn
		//input.form-control.private-form_control.login-email   ==>remove space and use .
		//input.form-control.login-email   // in any sequence
		//inout.login-email ==> unique one becz other classes can be duplicated (c1,c2)
		
		//id and class: we can write as below
		// #id,.class  =  #username.login-email
		// .class, #id = .login-email#username 
		// tag#id,.class 
		// tag.class, #id
		//.form-control.private-form_control.login-email#username (practically we won't use) just combination 
		// or username at 1st : #username.form-control.private-form_control.login-email
        // input#username.form-control.private-form_control.login-email  =>using tag  name (more readable with tag)
		//input.login-emailt#username.form-control.private-form_control => no sequence
		
		//other attributes : naveen website (email)
		// tagname[attr='value']
		// input[placeholder='Search'] = CSS
		// input[@placeholder='Search']= xpath
		
		//more than one attributes
		// tagname[attr1='value'] [attr2='value'] [attr3='value']  // but in xpath @id='' and @placeholder=''
		// input[placeholder='E-Mail Address'][name='email'][type='text'] = 1 of 1
		// input[placeholder][name][type]  ==  but it gives 1 of 3
		
		// how many elements are thr without wiritng any code = INTERVIEW QUES 
		// CSS- [id] ==>will give u no.of id's in the page  = 1 of 15
		// or for specific tag: input[id] == 1of 2 with tag inputs
		
		//xpath  :  giving all elements id ( 1 of 15) => //*[@id] 
		
		//LIMITATIONS: Text in CSS =>NA (CSS3 is modern browsers we r using)
		
		//CONTAINS in Css : INTERVIEW QUES ( which special char we r using ==> *) 
		//tag[attr*='value']  ==> input[placeholder*='E-Mail Address']  = css
		
		// input[placeholder*='E-Mail Address'][id='input-email']
		
		//input[contains(@class,'Address')]  == xpath
		
		//Starts with  -css ==>^
		// input[attr^=value]  
		// input[placeholder^='E-Mail'] but input[placeholder^='Address']
		
		//xpath : //input[starts-with(@placeholder,'E-Mail')]
		
		//ends with only in modern css  = $
		// input[attr$=value]  
		// input[placeholder$='Address']
		
		// xpath : //input[ends-with(@placeholder,'Address')]  ==>ENDS WITH  is REMOVED IN XPATH 
		
		//combining all
		// input[placeholder='E-Mail Address'][id^='input'][class$='control']
		//input[placeholder='E-Mail Address'][class$='control']#input-email  ==>tag is id 
		
		//Parent to child
		// '>' ==> direct child elements => select#Form_getForm_Country>option
		// SPACE==> Direct and Indirect elements ==> select#Form_getForm_Country option  ( 1of 233) 
		
		// form>div (gives 2  directly associated child) 1 of 2
		//form div -Direct and Indirect elements  1 of 14
		//table#resultTable > tbody > tr > td :hub
		
		//child to parent : BACKWARD TRAVERSING  = NA
		//child to grand parent/ancestor: NA 
		//Preceding sibling  - NA
		// we can't handle webTable in Css: becz we can't able to move with joy route eg: previous side = NA
		
		// IMMEDIATE FOLLOWING SIBLING - '+'   => label[for='input-email'] + input
		// ~ = all following sibling:  label[for='input-email'] ~ input
		
		//INDEXING in Css ; but postion can be change. But in some cases like MONTH is always fixed (COUNTRY)
		
		
		// select#Form_getForm_Country option:first-child = FIRST CHILD
		// select#Form_getForm_Country option:last-child  = LAST CHILD
		// select#Form_getForm_Country option:nth-child(5) = 5th child
		// select#Form_getForm_Country option:nth-last-child(2)  = from last 2nd element
		// select#Form_getForm_Country option:nth-child(odd)  =odd
		// select#Form_getForm_Country option:nth-child(even) =Even
		// select#Form_getForm_Country option:nth-child(n) = all child elements
		// select#Form_getForm_Country option:nth-child(n+4) = starts from 4th element 
		// select#Form_getForm_Country option:nth-child(4n)  = multiply of 4 , 5,6,
		
		// NOT IN Css
		
		// form-control input-lg  - search inspect 
		// input.form-control:not(.input-lg)  ==>excluding search  and including only email ,pwd
		// input.form-control:not(.input-lg):not(#input-password)  ==>pwd also excluded
		
		// we can't capture text in Css
		// webtable is limited 
		
		//COMMA in Css  :  multiple elements with different  tags 
		
		// #input-username, button#loginBtn, input#remember , div.signup-link  = 4 elements
		By ImpElements =By.cssSelector("#username, button#loginBtn");
		
		if(driver.findElements(ImpElements).size()==2) {
			System.out.println(" imp elements are present on the page.. PASS");	
		}
		else {
			System.out.println(" imp elements are not  present on the page.. FAIL");		
		}
		
	}

}
