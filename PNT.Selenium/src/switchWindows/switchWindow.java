package switchWindows;

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

public class switchWindow {

	static String myurl = "http://toolsqa.com/automation-practice-switch-windows/"; 
	
	public static WebDriver driver = null;
	Selenium_Helper sh = new Selenium_Helper();

	@Before
	public void initialize() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(myurl);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Ignore
	@Test
	public void navigate() throws InterruptedException {

		//get name of window
		//get pop up window name
		//get main so we can go back to the main window
		
		String mainWin = driver.getWindowHandle();
		
		driver.findElement(By.id("button1")).click();
		
		Thread.sleep(2000);
		
		Set<String> wins = driver.getWindowHandles();
		
		for (String a : wins) {
			if(!a.equalsIgnoreCase(mainWin))

				driver.switchTo().window(a);
			
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("id(\"primary-menu\")/li[7]")).click();
				
	
		}
		driver.switchTo().window(mainWin);

	}
	
	@Test
	public void clickfromChildWindow() throws InterruptedException {
		
		driver.findElement(By.id("button1")).click();
		
		sh.switchParentToChildWindow();
		sh.sleepFor(5);
		
		
		
	}
	

	@After
	public void tearDown() {
		driver.quit();

	}

}
