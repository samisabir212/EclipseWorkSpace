package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.Lib;


public class Home extends Lib {
	
	
	//get text of 'my account' text
	public static void myaccount(WebDriver driver) {
		//WebElement myacc=driver.findElement(By.xpath(".//*[@id='account']/a"));
		
		WebElement myacc = findelement(driver, "//*[@id='account']/a");
	
		
		System.out.println("here is text ::::"+myacc.getText());
	}
	
	
	public static void clickproca(WebDriver driver) throws InterruptedException {
		//WebElement ProdCa=driver.findElement(By.xpath("//a[text()='Product Category']"));
		
		WebElement ProdCa=findelement(driver, "//a[text()='Product Category']");
		
		ProdCa.click();
		sleep(driver, 2);
		//Thread.sleep(2000);
	}
	
	
	//click all products
		public static void clickallProducts(WebDriver driver) throws InterruptedException {
			//WebElement allpro=driver.findElement(By.xpath("//a[text()='All Product']"));
			
			WebElement allpro=findelement(driver, "//a[text()='All Product']");
			allpro.click();
			Thread.sleep(3000);
		}
		
	public static void printtitle1(WebDriver driver) {
		System.out.println("here is my first page title :::"+driver.getTitle());
	}

	
	

}
