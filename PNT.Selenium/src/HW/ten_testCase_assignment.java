package HW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Selenium_Helper;

public class ten_testCase_assignment extends Selenium_Helper{
	
	public WebDriver driver = null;
	
	
	
	@Before
	public void initialize() {
		

		String url = "Http://facebook.com";
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_25");
        driver = new ChromeDriver();
                
        
        driver.get(url);
        
		
		
	}
	

	
	@Test
	public void testCase001(){
		
	
	}
	
	@Test
	public void testCase002(){
		
	
	}
	@Test
	public void testCase003(){
		
	
	}
	@Test
	public void testCase004(){
		
	
	}
	@Test
	public void testCase005(){
		
	
	}
	@Test
	public void testCase006(){
		
	
	}
	@Test
	public void testCase007(){
		
	
	}
	@Test
	public void testCase008(){
		
	
	}
	
	
	@Test
	public void testCase009(){
		
	
	}
	
	@Test
	public void testCase010(){
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
		
	}
	


}
