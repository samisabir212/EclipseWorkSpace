package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class ProductCat extends Lib {
	
	
	//print title
	public static void printProductCat_PageTitle(WebDriver driver) {
		System.out.println("product category page title is ::  "+ printTitle(driver));
		
		
	}
	
	//print cat
	public static void printCategoryTest(WebDriver driver) {
		WebElement proCat= driver.findElement(By.xpath("//h1[contains(text(),'Product Category')]"));
		
		System.out.println(proCat.getText());
	}
	
	
	
	//click all products
	public static void clickallProducts(WebDriver driver) throws InterruptedException {
		//WebElement allpro=driver.findElement(By.xpath("//a[text()='All Product']"));
		
		WebElement allpro=findelement(driver, "//a[text()='All Product']");
		allpro.click();
		Thread.sleep(3000);
	}
	
	public static void clickipads(WebDriver driver) throws InterruptedException {
		
		Actions ac=new Actions(driver);
		ac.moveToElement(findelement(driver, "//a[text()='Product Category']")).build().perform();
		
		
		sleep(driver, 2);
		//Thread.sleep(2000);

		
		findelement(driver, "//a[text()='iPads']").click();
		//driver.findElement(By.xpath("//a[text()='iPads']")).click();
		sleep(driver, 2);
		//Thread.sleep(2000);
		
	}
	
	

}
