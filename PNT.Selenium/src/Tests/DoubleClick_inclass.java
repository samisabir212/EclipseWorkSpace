package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.Selenium_Helper;

public class DoubleClick_inclass extends Selenium_Helper {
	
	
	
	public WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        

		driver.get("https://facebook.com");
		
	}
	
	
	@Test
	public void doubleClick() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath(".//h2[text()='Sign Up']"));
	  	
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();
		//ac.contextClick(element).build().perform();
		
		//rightClick(By.xpath(".//h2[text()='Sign Up']"));
		
			
		
		
		sleepFor(5);
		
 
		
	}
	
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	

}
