package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new  ChromeDriver();
		//or i can comment driver.get() and directly use driver.navigate().to("enter google url); ==>same process
		
		driver.get("https://www.google.com");  // good practice
		driver.navigate().to("https://www.google.com");  // we can use both place GET and both place TO
		System.out.println(driver.getTitle()); 
		
		//Both GET and  TO are same ==>Synonym for org.openqa.selenium.WebDriver.Navigation.to(String). 
		//To will call get method internally
		
		//TO contains ==> 1.STRING URL
		//driver.navigate().to("https://www.amazon.com");//navigate to amazon page(everything in same tab)
		
		//2.URL  url  class with import also add exception
		driver.navigate().to(new URL("https://www.amazon.com")); //to is overloaded(same method name with diff parameter)
		System.out.println(driver.getTitle());
		//or 
		//driver.get("https://www.amazon.com");
		
		 
		driver.navigate().back();  //come back to google and print
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();  //go forward  to amazon and print
		System.out.println(driver.getTitle());
		
		driver.navigate().back();  //come back to google and print
		System.out.println(driver.getTitle());
		
		//refresh page
		driver.navigate().refresh(); // if some elements are missing we can use this method
		
		
		// if i'm passing URL url plain
		//need to convert url to string=> valueof ( WILL CONVERT ANYTHING TO STRING)
		
		//with get method we can't do BACK,FORWARD
		// with TO we can back/forward
		

	}

}
