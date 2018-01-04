package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.Common_API;
import util.Lib_Fred;

public class HomePage extends Common_API {
	
	public HomePage() throws IOException{
		super();
		
	}
	
	static Lib_Fred lf = new Lib_Fred();
	
	public static void sendDataToSearchField(WebDriver driver, String data) {
		
		WebElement searchField = lf.findelement(driver, "//input[@id='page-word-search-query']");
		searchField.sendKeys(data);
		
	}
	
	
	public static void clickSearchButton(WebDriver driver) {
		
		WebElement btnSearch = lf.findelement(driver,".//*[@id='page-word-search-button']" );
		btnSearch.click();
		//Thread.sleep(5000);
	}
	
	
	public static void searchByArttist() {
		
		click(By.xpath(".//div[@id='page-word-search-ops']/div[2]/label"));
		typeBy(By.xpath(".//*[@id='page-word-search-query']"), "nas");
		click(By.xpath(".//*[@id='page-word-search-button']"));
	}


	
}
