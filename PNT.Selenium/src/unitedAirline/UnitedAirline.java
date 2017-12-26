package unitedAirline;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Selenium_Helper;

public class UnitedAirline extends Selenium_Helper{
	
	public static WebDriver driver = null;

	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        

		driver.get("https://www.united.com/ual/en/us/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
        
	}

	@Ignore
	@Test
	public void calender() throws InterruptedException {
		
	WebElement from = driver.findElement(By.id("Origin"));	

	
	
	from.sendKeys("WAS");
	sleepFor(1);
	driver.findElement(By.xpath("//div[@data-code='BWI']")).click();
	sleepFor(1);
	driver.findElement(By.xpath("//input[@id='Destination']")).sendKeys("miami");
	driver.findElement(By.xpath("//div[@data-code='MIA']")).click();
	sleepFor(1);
	driver.findElement(By.xpath(".//*[@id='specificDateSection']/div[1]/label")).click();
	sleepFor(1);

	driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//table[@class='ui-datepicker-calendar']//a[text()='1']")).click();
	sleepFor(3);
	driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar']//td[@class='end-select-after-start']//a[text()='18']")).click();
	sleepFor(5);
	

	driver.findElement(By.cssSelector("#travelers-selector")).click();
	
	driver.findElement(By.xpath(".//*[@id='travelers-select']/div/ul/li[3]/div/a[2]")).click();
	
	sleepFor(7);
	}
	
	@Ignore
	@Test
	public void checkbox() throws InterruptedException {
		
		
		
		driver.findElement(By.cssSelector("#AwardTravel")).click();
		
		

		WebElement checkbox = driver.findElement(By.cssSelector("#AwardTravel"));
		
		System.out.println(checkbox.isSelected());
		
	
	}
	
	@Ignore
	@Test
	public void validationForTextBox() throws InterruptedException {
		
		WebElement checkbox = driver.findElement(By.cssSelector("#AwardTravel"));

		if(checkbox.isSelected()==false) {
			checkbox.click();
			sleepFor(2);
			
			if(checkbox.isSelected()==true) {
				System.out.println("i have already checked this box");
			}else {
				System.out.println("i am NOT able to check this box");
			}
		} else {
			System.out.println("check box is already checked");
		}

	}
	

	@Ignore
	@Test
	public void validationForTextBox2() throws InterruptedException {
		
		WebElement checkbox = driver.findElement(By.cssSelector("#AwardTravel"));
		
		verifyCheckBox(checkbox);

	
	}
	
	@Ignore
	@Test
	public void hotelTest() {
		
		WebElement toHotelTXTField = driver.findElement(By.cssSelector("#ui-id-9"));
		
		
		//verify if hotel "to" is displayed
		System.out.println(toHotelTXTField.isDisplayed());
		
		//click hotel button
		toHotelTXTField.click();
		
		//verify if hotel "to" is displayed
		System.out.println(toHotelTXTField.isDisplayed());

		
		//send some keys to "to" hotel txt field
	}
	
	@Ignore
	@Test
	public void test() throws InterruptedException {
		
		sleepFor(5);
		
		Selenium_Helper sh = new Selenium_Helper();
		//sh.clickByCss("#AwardTravel");
		sh.clickById("AwardTravel");
		
		sleepFor(5);
				
		
		
	}
	
	
	@Ignore
	@Test
	public void navigatetoandBack() {
		
		driver.navigate().to("Http://facebook.com");
		driver.navigate().back();
	}
	
	@Test
	public void investerRelation() {
		
		String text = driver.findElement(By.xpath(".//*[@id='quicklinks-1']/div/div[1]/ul/li[3]")).getText();
		
		System.out.println(text);
		
	}
	
	
	
	
	
	@After
	public void tearDown() {
		
		driver.quit();
	}
	
	
	public static void verifyCheckBox(WebElement e) throws InterruptedException {
		

		if(e.isSelected()==false) {
			e.click();
			sleepFor(2);
			
			if(e.isSelected()==true) {
				System.out.println("i have already checked this box");
			}else {
				System.out.println("i am NOT able to check this box");
			}
		} else {
			System.out.println("check box is already checked");
		}

	}
	
	
	
	public static void checkSize(String x) {
		
		if(driver.findElements(By.xpath(x)).size()==0) {
			
			System.out.println("this element does not existx");
			
		}
	}
	

	

}
