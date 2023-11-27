package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		
		//inject js  script/code with selenium-Java with JavaScript Executor
		
		//RWD--WD
		//RWD--JSE--executorscript();
		
		//fh=new USMedical();//fh can access us medical properties
		//USMedical uk=(UKMedical)fh;//with the help of uk we can access UKMedical

		JavascriptExecutor js=(JavascriptExecutor)driver;  //casting one interface to another interface
		
		//js.executeScript("alert('hi this is abhi')"); //injecting js
		
		//different ways of getting title: 1.driver.title(); 2. document.title
		
		String title=js.executeScript("return document.title;").toString(); //converting to string
		System.out.println(title);//Google
		
		//browser only understand JS not python,java,ruby
		//selenium will call js exe in the form of API .// will return document.title in the form of js
		
		//histroy.go(-1) ==>move to back page
		//history.go(+1)==>move to forward page
		
		//instead of all these below
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		String title=js.executeScript("return document.title;").toString(); //converting to string
//		System.out.println(title);//Google
//		
//		 JavaScriptUtil jsutil=new  JavaScriptUtil(driver);
//		 System.out.println(jsutil.getTitleByJs());  //calling util here by creating object
//		 
//		 //alert msg
//		 jsutil.generateJSAlert("hi this is my alert");  //practical use case like: we can gen own like this our search page landing like that
		 
		 //for inner Text
//		driver.get("https://classic.crmpro.com/");
//		JavaScriptUtil jsutil=new  JavaScriptUtil(driver);
//		
//		String PageText=jsutil.getPageInnerText();
//		System.out.println(PageText);
//		if(PageText.equals("Calls & Voice")) {
//			System.out.println("Pass");
//		}
		
		// Page scrolling
		
		 //this wont work in linkedin ,fb becz it has INFINITE SCROLLING (no end)
		
		//below r STATIC SCROLLING
//		driver.get("https://classic.crmpro.com/");
//		JavaScriptUtil jsutil=new JavaScriptUtil(driver);
//		
//		jsutil.scrollPageDown();
//		Thread.sleep(1000);
//		jsutil.scrollPageUp();
//		Thread.sleep(1000);
//		jsutil.scrollPageDown("800"); //passing height
//		
		//jsutil.scrollPageDownMiddlePage();
		
		//driver.get("https:www.amazon.com");
		//JavaScriptUtil jsutil=new JavaScriptUtil(driver);
		 //WebElement element=driver.findElement(By.xpath("//span[text()='International top sellers']"));
		//jsutil.scrollIntoView(element);	
		//jsutil.DrawBorder(element);

		//search
//		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
//		jsutil.DrawBorder(search);
//		jsutil.DrawBorder(element);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavaScriptUtil jsutil=new JavaScriptUtil(driver);
		WebElement reg_ele=driver.findElement(By.cssSelector(".form-horizontal"));
		jsutil.DrawBorder(reg_ele);
	}
	
	

}
