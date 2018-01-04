package tests_TheGreatCourses;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

import pages_TheGreatCourses.CheckOutPage;
import pages_TheGreatCourses.HomePage;
import pages_TheGreatCourses.SearchResultPage;
import pages_TheGreatCourses.UpsellcrosssellPage;
import pages_TheGreatCourses.Zero_to_InfinityPage;

@Listeners(util.ExtentReporterNG.class)

public class Test1 extends TestBase{
	
	public Test1() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	HomePage hp = new HomePage();
	SearchResultPage srp = new SearchResultPage();
	Zero_to_InfinityPage zeroInfinityPage = new Zero_to_InfinityPage();
	UpsellcrosssellPage upsell = new UpsellcrosssellPage();
	CheckOutPage checkOut = new CheckOutPage();

	
	@BeforeMethod
	public void Initialize() throws IOException {
		initialization();
	
	}
	
	
	@Test
	public void test_ProductPurchase_Item_Zero_to_infinity() throws InterruptedException {
		
		
		

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

	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
