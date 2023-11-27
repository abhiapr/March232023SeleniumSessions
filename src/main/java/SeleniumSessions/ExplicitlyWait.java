package SeleniumSessions;

public class ExplicitlyWait {

	public static void main(String[] args) {
		// 1. WebDriver wait  //2.FluentWait 
		
		//WebDriver wait (Class) [extending]--->FluentWait(C)[implements wait]---->Wait(Parent Interface) :Until(); [withput any method body]
        //inherit from Fluent                    // until{} (override this method with some method body done by sel)
		                                        // +other methods
		//(Immediate Child)flu wait will access properties of Wait
		
		//ExplicitlyWait : 1. not for global wait
		// 2. will be applied for specific web element(login,pwd..)
		//un - 10 sec (5 sec ele will come rem is 5 sec ignored)
		//pwd, - 0 sec (no wait here)
		//login button - 0 sec
		// can be applied for non web ele:title,url,alerts,frame also
		//Expected condition (class in sel)
		//webdriver wait is child of flu wait so fw can access all methods for WD wait (every BMW is car class)
		
	}

}
