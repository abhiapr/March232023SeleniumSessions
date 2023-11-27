package SeleniumSessions;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		//Actually all these copy path address will be used for before version 4.5.0.
		//But for 4.9.1 latest version we don't need to download exe file.
		//just webdriver driver=new chromedriver(); // this will fetch latest version==>SELENIUM MANAGER WILL MANAGE
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhi\\Documents\\MY DRIVER\\chromedriver.exe");
		
		// sel 4.5.0->in proxml entering before version
		//Exception in thread "main" java.lang.IllegalStateException: 
		//The path to the driver executable
		//The path to the driver executable must be set by the webdriver.chrome.driver system property; 
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//get title
		String title=driver.getTitle(); 
		System.out.println("get title :" + title);

	}

}
