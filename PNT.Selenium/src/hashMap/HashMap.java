package hashMap;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Selenium_Helper;

public class HashMap {
	
	

	static String myurl = "http://toolsqa.com/automation-practice-switch-windows/"; 
	
	public static WebDriver driver = null;
	public static Selenium_Helper sh = new Selenium_Helper();

	@Before
	public void initialize() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(myurl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}


	
	@Test
	public void clickfromChildWindow() throws InterruptedException {
		
		driver.findElement(By.id("button1")).click();
		
		sh.switchParentToChildWindow();
		sh.sleepFor(4);		
		
		
	}
	

	@After
	public void tearDown() {
		driver.quit();

	}
	

}
