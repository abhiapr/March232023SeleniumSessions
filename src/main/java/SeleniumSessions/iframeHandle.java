package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");  //page
		Thread.sleep(3000);
		
		//Vehicle Registration Form :inspecting image
		driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();
		Thread.sleep(2000);
		
		//switch to frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		//id /result value both r same here
		
		//frame element
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Test");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("1990-02-13");
		driver.findElement(By.name("RESULT_TextArea-5")).sendKeys("Manual");
		//	driver.findElement(By.name("RESULT_TextField-9")).sendKeys("Kumar");
		driver.findElement(By.id("RESULT_TextField-10")).sendKeys("No:1 Giri Nagar");
		driver.findElement(By.name("RESULT_TextField-12")).sendKeys("Avd");
		driver.findElement(By.id("RESULT_RadioButton-13")).sendKeys("TN");
		driver.findElement(By.name("RESULT_TextField-14")).sendKeys("600054");
		driver.findElement(By.name("RESULT_TextField-15")).sendKeys("1234557890");
		driver.findElement(By.name("RESULT_TextField-16")).sendKeys("123@gmail.com");
		
		//coming back to main page
		driver.switchTo().defaultContent();
		
		//Assignment fill entire form
		
		//page element
		String info=driver.findElement(By.id("tooltip")).getText();  //capturing text of : on top of page element 
		System.out.println(info);  //Interactive form loaded. Try filling out below.
		
		
		

	}

}
