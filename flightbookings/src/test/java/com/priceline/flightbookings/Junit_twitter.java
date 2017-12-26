package com.priceline.flightbookings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_twitter {
	
	public WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
	}
	
	
	@Test
	public void testtwitter() {
		
		driver.get("https://expedia.com");
		
		
	}
	
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	

}
