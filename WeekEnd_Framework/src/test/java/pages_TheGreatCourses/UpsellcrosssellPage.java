package pages_TheGreatCourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Lib_Fred;

public class UpsellcrosssellPage extends Lib_Fred {
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	

	
	public void clickProceedtocheckout(WebDriver driver) {
		
		WebElement lnk = findelement(driver, "//button[@class='button btn-checkout']");
		lnk.click();
		
	}
	
	
	

}
