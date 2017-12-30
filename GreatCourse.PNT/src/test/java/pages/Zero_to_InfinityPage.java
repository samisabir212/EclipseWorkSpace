package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testUtil.Lib;

public class Zero_to_InfinityPage extends Lib  {
	

	//click DVD radio button
	@FindBy(xpath = ".//*[@id='media-format-radio']/div/label")
	WebElement btnDVD_Format;
	
	//click add to cart button
	@FindBy(id = "add-to-cart-btn")
	WebElement btnAddToCart;
	
	
		

}
