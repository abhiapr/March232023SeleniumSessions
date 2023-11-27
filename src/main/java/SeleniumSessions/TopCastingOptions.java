package SeleniumSessions;

//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chromium.ChromiumDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//0. valid and NOT recommended  -> only for specific browser
		// ChromeDriver driver=new ChromeDriver();
		
		//let's try with different varities of top casting(child class obj ref by parent class)
		
		//1.  SearchContext - Valid not recommended  [kinda child inheriting properties from grand parent)
		//SearchContext sc=new ChromeDriver();
		
		//LOCAL EXECUTION -2,3
		//2. WebDriver- Valid and recommended -> we can access all the methods via RemoteDriver (url,title,quit,find element,close)
		//WebDriver driver=new ChromeDriver();
		
		//3.RemoteDriver - valid and recommended (but people r not aware of concept so not using)
		//ChromeDriver driver=new ChromeDriver();
		//all these methods are overridden from remoteDriver
		
		//4.Chromium driver  -- i can use only chromium based browser [ Edge,firefox ] ==>valid and recommended
		//ChromiumDriver driver=new ChromeDriver();
		//driver=new EdgeDriver();
	   //driver=new FirefoxDriver();
		
		//5.valid and recommended - used for remote execution (selenium gird/aws,cloud/browser stack,docer)
		//WebDriver driver=new RemoteWebDriver(remoteAddress,capabilities);
		
		//6..valid and NOT recommended 
		//SearchContext sc=new RemoteWebDriver(remoteAddress,capabilities);
		//only for fe,fe's
		
		
		
		
		
		
		
		
		
		

	}

}
