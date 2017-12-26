package Facebook;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_inClass {
	
	

	public WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        

		driver.get("https://facebook.com");
		
        
	}
	
	@Ignore
	@Test
	public void facebooktest() throws InterruptedException {
		
		
		driver.get("https://facebook.com");
	
		
		//enter first name
		
		//enter lastname
		//enter phone number 
		//enter password
		//select birthdate
		
		//click radio button male
		driver.findElement(By.xpath("//input[@value='2']")).click();
		
		//click radio button female by css
		
		driver.findElement(By.cssSelector("#u_0_3")).click();
		Thread.sleep(3000);
		
		
	}
	
	
	@Test
	public void sendKeys_thenBackspace() {
		
		driver.findElement(By.id("email")).sendKeys("hahahha");
		
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).keyUp(Keys.CONTROL).build().perform();
		
		
		
	}
	
	//ac.keyDown(keys.control.sendkeys(keys.backspace).keyup(keys.control).build.perform
	
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

}
