package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.util.TestUtil;


public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	
	public TestBase() throws IOException {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/sami/git/EclipseWorkSpace/POM_BDDcucumber/src/main/java/com/qa/config/configuration.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
		}
			
		
	}
	
	
	//initialization method 'this is called in every "BeforeMethod" Method'
	public static void initialization() throws IOException {
		
		
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
	        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
	        	driver = new ChromeDriver();
	        	
		}else if(browserName.equalsIgnoreCase("firefox")){
	       //System.setProperty("webdriver.firefox.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/geckodriverMAC");
	       driver = new FirefoxDriver();
	       
		}
	
		
		 
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("appURL"));

	}
	
	

}
