package ToolsQA;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Selenium_Helper;

public class ToolsQA_Tests {
	
	
	
	public static WebDriver driver = null;
	Selenium_Helper sh = new Selenium_Helper();
    public Logger log = Logger.getLogger(ToolsQA_Tests.class);

	
	

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        

		driver.get("http://toolsqa.com/iframe-practice-page/");
		log.debug("navigated to tools qa iframe practice page");
		
        driver.manage().timeouts().pageLoadTimeout(40	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	
	
	
	@Test
	public void iframe1() throws InterruptedException {
		
		
		driver.switchTo().frame(0);
		//enter firstname
		driver.findElement(By.name("firstname")).sendKeys("Sami");
		
		//enter lastname
		driver.findElement(By.name("lastname")).sendKeys("sabir");
			
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("IF2");
		
		
		driver.findElement(By.cssSelector("#ui-id-1")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		
		sh.sleepFor(3);
		driver.findElement(By.cssSelector("#datepicker")).sendKeys("323123");
		
	
		
		
		
		
		
		countIframeHandles("iframe");
	
		
		
		
	}
	
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	
	//counting iframe handles
    public static void countIframeHandles(String tagNameLocator) {

        int iFrameElements = driver.findElements(By.tagName(tagNameLocator)).size();

        System.out.println("total count of iframes on this page is : " + iFrameElements);

    }
	

}
