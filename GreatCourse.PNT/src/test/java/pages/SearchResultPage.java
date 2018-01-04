package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testUtil.Lib;

public class SearchResultPage extends Lib  {
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	
	
		public void clickZeroToInfinityLink(WebDriver driver) {
			WebElement lnk = findelement(driver, "//h2[contains(text(),'Zero to Infinity: A History of Numbers')]");
			lnk.click();
		}

}
