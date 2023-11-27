package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import CustomException.FrameworkException;

public class BrowserUtil {
	private WebDriver driver; //make as pvt else dev will get NPE also they'll write in amazontest to call
	
	public WebDriver LaunchBrowser(String BrowserName) { //from main come to here
		System.out.println("Browser name : " + BrowserName);
		
		// browser name =NULL , to avoid NPE =>use check point
		if(BrowserName==null) {
			System.out.println("browser cannot be null");
			throw new FrameworkException("BROWSER CANNOT BE NULL");
				
		}
			
		//switch case
		switch (BrowserName.toLowerCase().trim()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "Firefox":
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;

		default: // we can use this for empty string
			System.out.println("pls pas right browser..." +BrowserName );
			//break; - i can write custom exception
			throw new FrameworkException("NOT VALID BROWSER");
		}
		
		return driver;
			
		}
	//for url
	public void enterUrl(String Url) {
		if(Url.contains("http")) {
			driver.get(Url);
		}
		else {
			throw new FrameworkException("INVALID URL ");
			
		}
	}

		
	//title
	public String pageTitle() {
		return driver.getTitle();	
	}
	
	
	//pageurl
	public String pageUrl () {
		return driver.getCurrentUrl();
	}
	
	//close
	public void quitBrowser() {
		driver.quit();
	}
	
	//close
	
	public void closeBrowser() {
	  driver.close();
	}
	
			
		
	
	
	 
		
		
	}

