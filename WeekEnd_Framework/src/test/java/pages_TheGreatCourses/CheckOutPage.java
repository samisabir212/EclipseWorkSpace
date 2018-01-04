package pages_TheGreatCourses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Lib_Fred;


public class CheckOutPage extends Lib_Fred{
	
	public void getTitle(WebDriver driver) {
		String title = printTitle(driver);
		System.out.println(title);
	}
	


	//email
	public void enterEmailaddress(WebDriver driver) throws InterruptedException {
		WebElement emailField = findelement(driver, ".//*[@id='login-email']");
		emailField.sendKeys("samisabir212@gmail.com");		
		sleep(driver, 5);
	}
	//click new customer rdobtn
	//continue
	
	
	}
	
	
	
	
	
	
