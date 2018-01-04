package pages_TheGreatCourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Lib_Fred;

public class SearchResultPage extends Lib_Fred  {
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	
	
		public void clickZeroToInfinityLink(WebDriver driver) {
			WebElement lnk = findelement(driver, "//h2[contains(text(),'Zero to Infinity: A History of Numbers')]");
			lnk.click();
		}

}
