package com.crm.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	
	static WebDriver driver;
	static Properties prop;
	
	
	public TestBase() throws IOException {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/sami/eclipse-workspace/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
		}
			
		
		
		
	}
	
	
	public static void initialization() {
		//read the properties
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
	        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
	        	driver = new ChromeDriver();
	        	
		}else if(browserName.equalsIgnoreCase("firefox")){
	       System.setProperty("webdriver.firefox.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/geckodriverMAC");
	       driver = new FirefoxDriver();
	       
		}
		
		 
		driver.get(prop.getProperty("url));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
	}

}
