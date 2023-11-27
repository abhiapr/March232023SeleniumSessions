package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricinfoSession {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/west-indies-in-united-arab-emirates-2023-1376996/united-arab-emirates-vs-west-indies-2nd-odi-unofficial-odi-1377006/full-scorecard");
		
		Thread.sleep(5000);
		
		//with score=> //span[text()='Johnson Charles']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')] => for all 7 : scores(td)
		getWkTakerName("Johnson Charles");
		

	}
	
	//generic
	
	public static String getWkTakerName(String batsmanName) {
		
		System.out.println( "batsman Name : " +  batsmanName);
		return driver.findElement(By.xpath("//span'"+batsmanName+"'/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"))
				.getText();
		
		// //span[text()='Johnson Charles']/ancestor::td/following-sibling::td[contains(@class='ds-text-right')]
		// //span[text()='Dominic Drakes']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
	}

}
