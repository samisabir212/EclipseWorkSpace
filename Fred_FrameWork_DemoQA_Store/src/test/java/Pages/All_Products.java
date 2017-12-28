package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class All_Products extends Lib{
	
	
	
	public static void clickAllProducts(WebDriver driver) {
		
		WebElement allProductsLink = findelement(driver, "//a[contains(text(),'All Product')]");
		
		allProductsLink.click();
		
				
	}
	
	public static void printAllProductsPageTitle(WebDriver driver) {
		String allproTitle = printTitle(driver);
		System.out.println("all products page title is :: " + allproTitle);
		
		
	}
	
	

}


