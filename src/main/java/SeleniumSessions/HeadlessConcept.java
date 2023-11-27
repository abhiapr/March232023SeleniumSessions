package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		//Headless: no browser/invisible/without UI
		//testing behind the scene without using any browser=>so faster than normal(browser)
		//WHEN TO USE? Linux OS,Jenkins,Docker,NON UI
		//might not work for complex html, navigation, responsive testing (appln shd work on different screens/sizes  of windows)
		//like tv,androids etc\
	
		ChromeOptions co= new ChromeOptions();
		//co.setHeadless() -DON'T USE THIS .it's DEPRICATED(striked)
		co.addArguments("--headless"); // our version is 113.
		//("--headless=new");
		
		//FirefoxOptions fo=new FirefoxOptions();
		//fo.addArguments("--headless";)
		//WebDriver driver=new FirefoxDriver(fo);
		
		//Deprecated.  Use addArguments(String).Recommended to use '--headless=chrome' as argument for browsers v94-108.
		//Recommended to use '--headless=new' as argument for browsers v109+.
		//Example: `addArguments("--headless=new")`.
		
		WebDriver driver=new ChromeDriver(co);// must pass co else it'll open browser 
		//WebDriver driver=new ChromeDriver(co);
		driver.get("https://ww.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit(); //without opening browser it'll print details
		
		//edge headless
		//EdgeOptions eo=new EdgeOptions();
		//eo.addArguments("--headless");
		//driver.get("https://ww.amazon.com");
		
		
		//safari- no support for headless mode 
		
		

	}

}