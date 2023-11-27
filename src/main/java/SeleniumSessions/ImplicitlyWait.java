package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		//use DURATION method : once driver is intialised we hv to put wait
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //==>sel 4.0
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //Global wait - it's applicable for all web elements by default
		
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  ==>DEPRECATED SEL 3.0
	  
	  //login page)
	 driver.findElement(By.name("username")).sendKeys("admin");  // 2 sec only .if i pass correct loc with wait , rem 8 sec is nullifed
	   // if i pass wrong locator "username123" and comment 16 line then NSE 
	  //if i  pass wrong locator and put wait for 10 sec then,after 10 sec NSE
	 
	 //for ele 2 =10
	 //e3=10
	 //e100=10 sec . SO EACH TIME GOING & CHECKING IMP WAIT(performance issue)
	 
	 //home page-20 nned to wait for 20 sec.see below
	 //he1 -10 for each it'll wait for 10 sec
	 //he2-10 
	 
	 //over writting again to 20 sec
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // now 20 sec it'll wait
	 //he1 -20
	 //he2-20  //logout 
	 
	 //registra.page :0 secs :nullification of imp wait
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	 
	 //WON'T work for non web elements :title,url,alert
	 
	 

	}

}
