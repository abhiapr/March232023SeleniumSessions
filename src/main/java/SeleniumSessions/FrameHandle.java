package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) {
		//Frame 
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/insex.html");
		
		// using frame index
	//	driver.switchTo().frame(2);  //index  // 0,1,2  : 2nd index , 3rd frame
		
		// sometimes frames can be added , so positions can be changed 
		driver.switchTo().frame("main");  //name 
		
		//total no of frames=xpath (frame) .size();//8
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		String header=driver.findElement(By.tagName("h2")).getText(); // if webelement is inside Frame it wont' work.so use frame
		System.out.println(header);  // Title bar (top.html)
		
		driver.switchTo().defaultContent(); // Come back to main page
//		Selects either the first frame on the page, or the main document when a page containsiframes
		
	
	}

}
