package alertHandling;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.Selenium_Helper;

public class Alert_handling extends Selenium_Helper{
	
	public WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        

		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
        
	}

	
	@Test
	public void alert_popUP() throws InterruptedException {
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		
		element.click();
		
		sleepFor(3);
		
		  Alert alert = driver.switchTo().alert();
	      alert.accept();
	      
	      sleepFor(3);
	      
			WebElement confirmPopElement = driver.findElement(By.xpath("//button[text()='Confirm Pop up']"));
			
			confirmPopElement.click();
			sleepFor(3);

			String text = alert.getText();
			System.out.println(text);
			alert.dismiss();
			
			
			WebElement promptPopup = driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		
			promptPopup.click();
			
			
			sleepFor(3);
			alert.sendKeys("hellow world");
			sleepFor(3);

			alert.dismiss();
			sleepFor(3);
			
			

		
		
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

	

}
