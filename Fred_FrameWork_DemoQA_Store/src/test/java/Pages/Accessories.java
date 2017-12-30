package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;

public class Accessories extends Lib{
	
	
	public static void search(WebDriver driver) {
		//WebElement Search= driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		
		//WebElement Search= findelement(driver, ".//*[@id='main-nav']/form/fieldset/input[1]");
		
		WebElement search = findelement(driver, ".//*[@id='main-nav']/form/fieldset/input[1]");
		
		
		//Actions ac=new Actions(driver);
		
		search.sendKeys("Apple Watch"+"\n");
		
	}

}
