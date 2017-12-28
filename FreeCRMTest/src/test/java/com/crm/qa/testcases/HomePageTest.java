package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	
	
	public HomePageTest() throws IOException {
		super();
		
	}
	

	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		homePage = new HomePage(); 
		
	}
	
	
	@Test(priority=1, enabled = true)
	public void veridyHomePageTitle() {
		
		boolean validateLogo = homePage.validate_CRMLOGO();
		if(validateLogo == true) {
			System.out.println("crm logo pass");
		}else {
			System.out.println("crm logo fail");
		}
		
		
		
		
	}
	
	@Test(priority=2,enabled=true)
	public void verifyHomePageTitle() {
		String title = homePage.verifyHomePageTitle();
		Assert.assertEquals(title, "CRMPRO");
		
	}
	
	@Test(priority=3, enabled = true)
	public void veridyLoggedInUser() {
		boolean user = homePage.validateUserByText();
		if(user == true) {
			System.out.println("user: pass");
		}else {
			System.out.println("user: fail");
		}
	}
	
	
	@Test(priority=4,enabled=true)
	public void clickDeals() {
		homePage.clickDeals();
		
		
	}
	
	
	
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	}

}



































