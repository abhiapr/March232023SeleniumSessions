package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleUrl {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");

		// wait for right title
//		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		 //util return type is web element but here boolean becz of title contains
//		if( wait.until(ExpectedConditions.titleContains("Free CRM"))) {
//			System.out.println(driver.getTitle());//Free CRM - CRM software for customer relationship management, sales, and support.
//		}
		// waiting for title sometime it gives after 10 sec=> new tab, loading,.....

		WaitForTitleContains("Free CRM", 5);

	}

	// Generic

	public static String WaitForTitleContains(String TitleFraction, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));// 10 sec
//	OR	 return wait.until(ExpectedConditions.titleContains(TitleFraction)); //Free CRM  =>boolean is return type

		// if title is not available after 5 sec => we can use TRY/CATCH
		try {

			if (wait.until(ExpectedConditions.titleContains(TitleFraction))) {  //=>pass whole value  [titleIs]
				return driver.getTitle(); // =>String is return type
			} else {
				System.out.println(TitleFraction + " title value is not present..");
				return null;
			}

		} catch (Exception e) {  //we can also write else cond here
			e.printStackTrace();
			System.out.println(TitleFraction + " title value is not present..");
			return null;
		}
	
	}
}
