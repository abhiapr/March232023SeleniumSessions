package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterTest {
	
	public static void main(String[] args) {
		//browser related
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.LaunchBrowser("chrome"); 
		br.enterUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By First_Name=By.id("input-firstname");
		By Last_Name=By.id("input-lastname");
		By Email_Id=By.id("input-email");    
		By Phone_Num=By.id("input-telephone");
		By Password=By.id("input-password");   
		By Confirm_pwd=By.id("input-confirm");  
		
		   //ele related work
		RegisterUtil reg=new RegisterUtil(driver);
		reg.SendingKeys(First_Name, "Abhi");
		reg.SendingKeys(Last_Name, "P");
		reg.SendingKeys(Email_Id, "abhi1232@gmail.com");
		reg.SendingKeys(Phone_Num, "987654321");
		reg.SendingKeys(Password, "abhi123");
		reg.SendingKeys(Confirm_pwd, "abhi123");
		
		
		
		//br.quitBrowser();
		
		
		
	}

}
