package JunitMasterTest;

import org.junit.Test;

import generic.Junit_Common_API;

public class LaunchBrowser extends Junit_Common_API {
	
	
	@Test
	public void test() throws InterruptedException {
		
		sleepFor(5);

		String title = driver.getTitle();
		System.out.println(title);
	
		
	}

}
