package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeConcept {
		static WebDriver driver;
		
		public static void main(String[] args) {
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			By forgot_pwd=By.linkText("Forgotten Password");
			
			By first_name=By.id("input-firstname");  //for placeholder : in first name i can type my name and enter then ABHI will be in first name
			//if i refresh then name gets refresh back to same first name
			
			By logoImage=By.className("img-responsive");
			
//			String forgot_pwd_href=driver.findElement(forgot_pwd).getAttribute("href");
//			System.out.println(forgot_pwd_href); // will get link text https://naveenautomationlabs.com/opencart/index.php?route=account/forgotten
//			
//			First name written in Text Field in GREY COLOUR====>PLACE HOLDER ; black colur first name(labels)
//			String fn_Placeholder=driver.findElement(first_name).getAttribute("placeholder");
//			System.out.println(fn_Placeholder); 
			
//			WebElement logo_ele=driver.findElement(logoImage); //since i'm using webelemetn i can use getAttribute directly
//			String srcVal = logo_ele.getAttribute("src");
//			String titleVal = logo_ele.getAttribute("title");
//			String altVal = logo_ele.getAttribute("alt");
//			
//			System.out.println(srcVal);
//			System.out.println(titleVal);
//			System.out.println(altVal);
			
			String srcVal=getElementAttribute(logoImage,"src");
			System.out.println(srcVal);
			
			getElementAttribute(logoImage,"title");
			getElementAttribute(logoImage,"alt");
			getElementAttribute(first_name,"placeholder");
			
			String fn_Placeholder=getElementAttribute(first_name,"placeholder");
			System.out.println(fn_Placeholder);
			
			String forgot_pwd_href=getElementAttribute(forgot_pwd,"href");
			System.out.println(forgot_pwd_href);
			

	}
		
		public static String getElementAttribute(By locator,String attrName) {
			return getElement(locator).getAttribute(attrName);
		}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}

}
