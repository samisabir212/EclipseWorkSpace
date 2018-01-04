package pages_TheGreatCourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Lib_Fred;

public class Zero_to_InfinityPage extends Lib_Fred  {
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	
	
	
	//method to click btndvd format
	public void clickBtnDVDFormat(WebDriver driver) {
		WebElement btn = findelement(driver, ".//*[@id='media-format-radio']/div/label");
		btn.click();
	}
	
	//method to click add to cart
	public void clickBtnAddtoCart(WebDriver driver) {
		
		WebElement btn = findelement(driver, ".//*[@id='add-to-cart-btn']");
		btn.click();
	}
	
		

}
