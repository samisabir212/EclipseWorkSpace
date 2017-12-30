package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testUtil.Lib;

public class SearchResultPage extends Lib  {
	
		//item link 'Zero to inifnity: a history of numbers'
		@FindBy(xpath = "//h2[contains(text(),'Zero to Infinity: A History of Numbers')]")
		WebElement lnkzero_to_infinity;

}
