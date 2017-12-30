package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testUtil.Lib;

public class UpsellcrosssellPage extends Lib {
	
	
	//proceed to checkout
	@FindBy(xpath = "//button[@class='button btn-checkout']")
	WebElement btnProceedToCheckout;
	
	
	
	
	

}
