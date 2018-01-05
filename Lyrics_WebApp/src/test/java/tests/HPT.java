package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.Common_API;
import pages.HomePage;

public class HPT extends Common_API {
	
	public HPT() throws IOException{
		super();
		
	}
	
	public HomePage hp = new HomePage();

	
	
	@Test(enabled = false)
	public void searchForLyrics(){
		//enter method from pages class that has a function to send data to lyrics searchfield
		
		
		hp.sendDataToSearchField(driver,"cream");
		hp.clickSearchButton(driver);
		
	}
	
	
	@Test(enabled = true)
	public void testCommonAPIMethods() {
		
		hp.searchByArttist();
	}
	

}
