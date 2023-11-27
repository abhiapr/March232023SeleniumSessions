package SeleniumSessions;


import java.util.List;

import org.openqa.selenium.By;
//naveen page://label[text()='First Name']/following-sibling::div/input [ mandatory field] ; (pseudo code)::before [*]
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		By langLinks=By.xpath("//div[@id='SIvCob']/a"); // a( for all lang links) but every lang are text
		
		clickOnElement(langLinks,"தமிழ்"); // linktext
		
//			Total links : 9
//			हिन्दी
//			বাংলা
//			తెలుగు
//			मराठी
//			தமிழ்
//			ગુજરાતી
//			ಕನ್ನಡ
//			മലയാളം
//			ਪੰਜਾਬੀ

		}
        
	
	//generic
	public static void clickOnElement(By locator,String linkText) {
		
        List<WebElement> langLinks=driver.findElements(locator);  
        System.out.println("Total no. of links : "+langLinks.size());
		
		//for loop
		for(WebElement e:langLinks) {
			String Text=e.getText(); //capturing text
			System.out.println(Text);
			if(Text.equals("தமிழ்")) {
				e.click(); // google page will be in tamil
				break;
			}
		}
	}

}
