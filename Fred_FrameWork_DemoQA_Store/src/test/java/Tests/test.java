package Tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Accessories;
import Pages.All_Products;
import Pages.Home;
import Pages.Ipads;
import Pages.Macbooks;
import Pages.ProductCat;
import Pages.Searchpg;

public class test {
	
	
	
	WebDriver driver = null;
	
	
	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        
		driver.get("http://store.demoqa.com/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		
        
	}
	
	@Ignore
	@Test
	public void test001() {
		
		driver.getTitle();
		
	}
	


	@Test
	public void testing() throws InterruptedException {

	Home hm = new Home();
	hm.printtitle1(driver);
	hm.myaccount(driver);
	hm.clickproca(driver);
	System.out.println("clicked product category");


	ProductCat pc = new ProductCat();
//	pc.printtile2(driver);
//	pc.printcat(driver);
//	pc.clickipads(driver);
	pc.printCategoryTest(driver);
	System.out.println("printed 'Product category' text");

	
	Ipads ip = new Ipads();
	ip.clickonmacbooks(driver);
	System.out.println("hovered over product category and clicked on macbooks link ");

	

	Macbooks mb = new Macbooks();
	mb.clickonaccess(driver);
	System.out.println("hovered over pc and clicked accessories link");


	Accessories as = new Accessories();
	as.search(driver);
	System.out.println("typed applewatch in the search input field on the search page");



	Searchpg srp = new Searchpg();
	srp.printerr(driver);
	System.out.println("verified 'error' text from looking for apple watch");


	
	All_Products ap = new All_Products();
	ap.clickAllProducts(driver);
	System.out.println("clicked on all products");

	
	ap.printAllProductsPageTitle(driver);
	System.out.println("printed 'all products' page title");

	

}
	
	
	
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
}
