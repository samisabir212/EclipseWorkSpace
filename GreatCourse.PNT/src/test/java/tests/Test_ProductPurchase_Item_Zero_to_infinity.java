package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Test_ProductPurchase_Item_Zero_to_infinity {
	
	static WebDriver driver;
	
	
	
	
	@Before
	public void Initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        
		driver.get("https://www.thegreatcourses.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void test_ProductPurchase_Item_Zero_to_infinity() {
		
		
		
		
	}

	
	
	@After
	public void tearDown() {
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
