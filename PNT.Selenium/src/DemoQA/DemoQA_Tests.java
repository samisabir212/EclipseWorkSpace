package DemoQA;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Selenium_Helper;

public class DemoQA_Tests {
	
	
	public static WebDriver driver = null;
	Selenium_Helper sh = new Selenium_Helper();
	

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        

		driver.get("http://demoqa.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	
	
	@Test
	public void navigate() {
		
		
		//click registration link
		driver.findElement(By.cssSelector("#menu-item-374")).click();
		
		//navigate back to home
		driver.navigate().back();
		//go back to registration page
		driver.navigate().forward();
		
		//come back to home
		driver.navigate().back();
		//refresh the browser
		driver.navigate().refresh();
		
		
		
		
		
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
