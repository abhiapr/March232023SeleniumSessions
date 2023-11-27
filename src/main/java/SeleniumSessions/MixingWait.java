package SeleniumSessions;

public class MixingWait {

	public static void main(String[] args) {
		
		//NEVER APPLY BOTH THE WAITS: both mechanism are different
		//imp wait= for all elements
		//WebDriver wait=15 sec - for username
		
		//username
		//imp:    10 sec= 2 ->2 sec
		//WDw:   15 sec=5  ->wait for 5 sec
		//total time  = 2+5=> 7 sec
		

	}

}
