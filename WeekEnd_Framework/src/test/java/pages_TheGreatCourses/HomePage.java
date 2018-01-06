package pages_TheGreatCourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Lib_Fred;

public class HomePage extends Lib_Fred  {
	
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	


	
	public void searchFor(WebDriver driver) {
		
		//lnkSearch.sendKeys(item);
		WebElement lnkSearch = findelement(driver, ".//input[@id='search']");
		lnkSearch.sendKeys("zero to infinity");
		
	}
	
	public void clickSearchButton(WebDriver driver) {
		WebElement searchBtn = findelement(driver, ".//*[@id='search_mini_form']/div/button");
		searchBtn.click();

	}
	
	
	public void clickonloginbutton() {
		
		
	}
	
	
	
	
	
}
