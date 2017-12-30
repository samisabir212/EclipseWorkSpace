package testUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	
	//lib is for reusable methods across page class and test class
	
	
	static WebDriver driver;

	
	public static WebElement findelement(WebDriver driver, String xpath) {

		WebElement a = driver.findElement(By.xpath(xpath));

		return a;
	}

	public static void sleep(WebDriver driver, int sec) throws InterruptedException {

		Thread.sleep(sec * 1000);
	}
	
	public static String printTitle(WebDriver driver) {
		String a=driver.getTitle();
		
		return a;
		
	}

}
