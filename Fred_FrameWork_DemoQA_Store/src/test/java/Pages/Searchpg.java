package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Searchpg extends Lib{
	
	
	public static void printerr(WebDriver driver) {
		//WebElement err=driver.findElement(By.xpath(".//*[@id='content']/p"));
		
		WebElement err=findelement(driver, ".//*[@id='content']/p");
		System.out.println("here is error message:::::: "+err.getText());
	}

}
