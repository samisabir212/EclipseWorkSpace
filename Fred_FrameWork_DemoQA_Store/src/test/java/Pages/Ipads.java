package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Ipads extends Lib {
	
	public static void clickonmacbooks(WebDriver driver) throws InterruptedException {
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		
		sleep(driver, 2);
		//Thread.sleep(2000);
		findelement(driver, "//a[text()='MacBooks']").click();

		//driver.findElement(By.xpath("//a[text()='MacBooks']")).click();
		sleep(driver, 2);
		//Thread.sleep(2000);
	}

}
