package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testUtil.Lib;

public class HomePage extends Lib  {

	
	//search
	@FindBy(id = "search")
	WebElement lnkSearch;

	//search button
	@FindBy(xpath = ".//*[@id='search_mini_form']/div/button")
	WebElement btnSearch;
	
	//item link 'Zero to inifnity: a history of numbers'
	@FindBy(xpath = "//h2[contains(text(),'Zero to Infinity: A History of Numbers')]")
	WebElement lnkzero_to_infinity;
	
	
	//click DVD radio button
	@FindBy(xpath = ".//*[@id='media-format-radio']/div/label")
	WebElement btnDVD_Format;
	
	
	
	
	
	
}
