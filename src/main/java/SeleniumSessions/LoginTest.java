package SeleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
	
	public static void main(String[] args) {
		
		//browser related work
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.LaunchBrowser("chrome"); // add return driver in LaunchBrowser class and remove void and add WEBDRIVER
		br.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//By locators should be created in TEST/CALLER CLASS
		
		By email_Id=By.id("input-email");
        By pass_id=By.id("input-password");
        
        //ele related work
        
		ElementUtil ele= new ElementUtil(driver);
		ele.doSendKeys(email_Id,"123@gmail.com");
		ele.doSendKeys(pass_id, "123");
		
		br.quitBrowser(); //browser related
		
		

}
}
