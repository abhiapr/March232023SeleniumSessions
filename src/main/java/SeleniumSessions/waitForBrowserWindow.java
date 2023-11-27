package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitForBrowserWindow {
	//static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // window 1-parent
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click(); // twitter link -child

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean flag = wait.until(ExpectedConditions.numberOfWindowsToBe(2)); // boolean return type
		System.out.println(flag);//TRUE // driver will be at parent window only becz we r not switching here

	}
	
	//generic
//	public static boolean  waitForNumberOfBrowserWindow(int timeout,int NumOfWindows) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));//10
//		return wait.until(ExpectedConditions.numberOfWindowsToBe(NumOfWindows));//2
//		
//	}

}
