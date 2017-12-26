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

public class Amazon_click_SignIN extends Selenium_Helper {
	
	

	public WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        

		driver.get("https://amazon.com");
		
	}
	
	
	@Test
	public void clickSignin() throws InterruptedException {

		
		sleepFor(4);

		
		//mouseHoverFred("//a[@id='nav-link-accountList']");
		
		
	  	
		WebElement element = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

		
		sleepFor(3);
		
		driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
		
		//click(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span"));
		
		
		
		/*
		mouseHover(By.xpath(".//a[@id='nav-link-accountList']"), By.xpath(".//a[@id='nav-link-accountList']"));
		sleepFor(3);

		click(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span"));
		//clickJavaScriptActionsClick(By.xpath(".//a[@class='nav-action-button']//span[@class='nav-action-inner']"));
		
		sleepFor(3);
		
		*/
		
	}
	
	
	@Test
	public void keyUP_BackSpace() {
		
		
		
	}
	
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

}
