package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Macbooks extends Lib{

	
	
	public static void clickonaccess(WebDriver driver) throws InterruptedException {
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		
		Thread.sleep(2000);
		
		findelement(driver, "//a[text()='Accessories']").click();

		//driver.findElement(By.xpath("//a[text()='Accessories']")).click();
		
		Thread.sleep(2000);
	}
}
