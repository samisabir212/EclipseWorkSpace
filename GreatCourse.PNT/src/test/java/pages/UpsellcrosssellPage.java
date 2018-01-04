package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testUtil.Lib;

public class UpsellcrosssellPage extends Lib {
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	

	
	public void clickProceedtocheckout(WebDriver driver) {
		
		WebElement lnk = findelement(driver, "//button[@class='button btn-checkout']");
		lnk.click();
		
	}
	
	
	

}
