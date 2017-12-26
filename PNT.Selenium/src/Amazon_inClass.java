import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_inClass {
	
	
	
	

	public WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();

		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
	}
	
	@Ignore
	@Test
	public void testtwitter() throws InterruptedException {
		
		
		
		driver.findElement(By.xpath("//input[@autocomplete='off']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("alexa");
		
		driver.findElement(By.xpath("//input[@tabindex='20']")).click();
		
		
		String title = driver.getTitle();
		
			
		System.out.println(title);
		
		
	

		
	}
	
	
	@Test
	public void getLastMinuteDeal() {
		
		String text = driver.findElement(By.xpath(".//a[text()='Last-Minute Deals']")).getText();
		
		
		System.out.println(text);
		
		
		
	}
	
	
	
	
	
	
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

}
