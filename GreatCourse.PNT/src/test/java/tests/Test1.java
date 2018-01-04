package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.UpsellcrosssellPage;
import pages.Zero_to_InfinityPage;


public class Test1  {
	
	public static WebDriver driver;
	public static Properties prop;

	
	
	
	@Before
	public void Initialize() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("/Users/sami/eclipse-workspace/"
					+ "WeekEnd_Framework/src/main/java/com/qa/config/configuration.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		
		}
			
		
		
		
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
		driver.get("https://www.thegreatcourses.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	@Test
	public void test_ProductPurchase_Item_Zero_to_infinity() throws InterruptedException {
		
		HomePage hp = new HomePage();
		SearchResultPage srp = new SearchResultPage();
		Zero_to_InfinityPage zeroInfinityPage = new Zero_to_InfinityPage();
		UpsellcrosssellPage upsell = new UpsellcrosssellPage();
		CheckOutPage checkOut = new CheckOutPage();
		

		hp.getTitle(driver);
		hp.searchFor(driver);
		System.out.println("searchFor");
		hp.clickSearchButton(driver);
		System.out.println("clickSearchButton");
		srp.getTitle(driver);
		srp.clickZeroToInfinityLink(driver);
		System.out.println("clickZeroToInfinityLink ");
		zeroInfinityPage.getTitle(driver);
		zeroInfinityPage.clickBtnDVDFormat(driver);
		System.out.println("clickBtnDVDFormat");
		zeroInfinityPage.clickBtnAddtoCart(driver);
		System.out.println("clickBtnAddtoCart");
		upsell.getTitle(driver);
		upsell.clickProceedtocheckout(driver);
		System.out.println("clickProceedtocheckout");
		checkOut.getTitle(driver);
		checkOut.enterEmailaddress(driver);
		System.out.println("enterEmailaddress");

		
		
	}

	
	
	@After
	public void tearDown() {
		driver.quit();
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
