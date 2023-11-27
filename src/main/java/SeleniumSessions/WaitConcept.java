package SeleniumSessions;

public class WaitConcept {

	public static void main(String[] args) {
		
		// Wait: selenium script <--->Browser app
		// sync between client script u hv written and  ur browser which is running the app  ==>SYNCHRONIZATION
		
		//1.static wait :Thread.sleep(5000) . thread is class , sleep is a method .this is JAVA method
		//2.Dynamic wait: if page is loading within 2 sec , but we put wait for 10 sec then DW'll nullify remaining 8 sec 
		//so after 10 sec ele is  cmng it'll throw NSE(no such ele exception)
		
		// 2.Dynamic wait: provided by selenium library
		  //a.Implicitly wait
		  //b.Explicitly wait: b=> 1. WebDriver wait  //2.FluentWait 
          
		
		
	}

}
