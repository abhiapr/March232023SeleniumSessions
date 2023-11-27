package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandleWithList {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click(); 
		
		Set<String> handles=driver.getWindowHandles();//fetch
		
		//converting to non order base to ORDER base collection
		List<String>  handleList=new ArrayList<String>();
		String ParentWindowId=handleList.get(0);
		String ChildWindowId=handleList.get(0);
		
		//switch
		driver.switchTo().window(ChildWindowId);
		System.out.println("child window id:"+driver.getCurrentUrl());
		driver.close();  //close child window(Twitter)
		
		//come back to parent window
		driver.switchTo().window(ParentWindowId);
		System.out.println("parent window id :"+driver.getCurrentUrl());  
		
		driver.quit();
		
		//Ass- convert set to LIST
		
		//SWITCH:alert,window,frame
		

	}

}
