package SeleniumSessions;

public class Amazontest {//caller/user class

	public static void main(String[] args) {
		
		BrowserUtil br=new BrowserUtil();
		String BrowserName="chrome";
		br.LaunchBrowser(BrowserName); //go to util and call
		br.enterUrl("https:www.amazon.com");
		
		
		//br.driver.get("https://www.google.com");
		
		//if i wirte this here=same is written in util
		//br.driver=new ChromeDriver(); // launch the chrome but not good practice cross browser
		//will get NPE since,string is NULL
		
		String title=br.pageUrl();
		System.out.println(title);
		if(title.contains("amazon")) {
			System.out.println("correct title");
		}else {
			System.out.println("Incorrect title");
		}
		
		//
		
		String pageurl=br.pageUrl();
		System.out.println(pageurl);
		if(pageurl.contains("amazon")) {
			System.out.println("correct url");
		}else {
			System.out.println("Incorrect url");
		}
		
		
		
		

	}

}
