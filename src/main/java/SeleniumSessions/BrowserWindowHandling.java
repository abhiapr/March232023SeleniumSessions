package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //window 1
		Thread.sleep(5000);
		//if  opening orangeCRm link (Parent page) in one page and opening twitter link of same page.(Child page)
		//to close child page (DRIVER.CLOSE)
		//to close parent page (DRIVER.QUIT)
		//need to switch child to parent;parent to child
		
		//TARGET='-BLANK' means => Target will open in new window
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();  //twitter link
		
		//1. fetching window id
		//when u handle more than 1 windows =>getWindowHandles
		Set<String> handles=driver.getWindowHandles();
		//Set :doesn't maintain any order ; it won't allow duplicate values
		//where array/List maintains order
		
		//ITERATOR=>iterates set of object  // return type is STRING
		Iterator<String> it =handles.iterator();
		//iterator points to 1st segment 
		
		//to move iterator use NEXT();
		String ParentWindowID =it.next();//move to next set in the memory & also returning value 
		System.out.println("parent window id :"+ParentWindowID);
		
		String ChildWindowID =it.next();//move to next set in the memory & also returning value 
		System.out.println("child window id :"+ChildWindowID);
//		parent window id :32EBF403747164A7B312C584A41E385A
//		child window id :ABB7E3949EF6EACDE423BD2ADDE0A09D  =store each id in 2 segments
		
		//switch
		driver.switchTo().window(ChildWindowID);
		System.out.println("child window id:"+driver.getCurrentUrl());
		driver.close();  //close child window(Twitter)
		
		//come back to parent window
		driver.switchTo().window(ParentWindowID);
		System.out.println("parent window id :"+driver.getCurrentUrl());  
		driver.quit();  //quit parent window
		
		//if  driver is lost in 47,& i comment line 50,without coming back to parent window and getting url =>NO SUCH WINDOW EXCEPTION
		}

}
