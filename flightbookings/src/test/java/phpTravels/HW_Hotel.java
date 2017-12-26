package phpTravels;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HW_Hotel {
	
	
	WebDriver driver = null;
	
	
	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        
		driver.get("http://www.phptravels.net/");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		
        
	}
	
	
	
	@Test
	public void testCase002() {
		
		
		boolean location_isDisplayed = driver.findElement(By.id("citiesInput")).isDisplayed();
		if(location_isDisplayed == true) {
			System.out.println("location_isDisplayed:: PASSED");
		}else {
			System.out.println("location_isDisplayed:: FAILED (ELEMENT NOT DISPLAYED)");
		}
		
		driver.findElement(By.id("citiesInput")).clear();
		driver.findElement(By.id("citiesInput")).sendKeys("Miami");
		
		WebElement checkInTEXT = driver.findElement(By.xpath("//label[contains(text(),'Check in')]"));
		
		boolean verifyCheckIn_isDisplayed = checkInTEXT.isDisplayed();
		if(verifyCheckIn_isDisplayed == true) {
			System.out.println("verifyCheckIn_isDisplayed:: PASSED");
		}else {
			System.out.println("verifyCheckIn_isDisplayed:: FAILED (ELEMENT NOT DISPLAYED)");
		}
		
		
		
		//check in field
		WebElement txtCheckIn = driver.findElement(By.xpath(".//div[@id='dpean1']/input"));
		txtCheckIn.sendKeys("01/20/2017");
		
		//checkout field
		WebElement txtCheckOut = driver.findElement(By.xpath(".//div[@id='dpd2']/input"));
		txtCheckOut.sendKeys("02/1/2018");
		
		//child dropdownfield
		WebElement child_DropdownList = driver.findElement(By.id("child"));
        Select select = new Select(child_DropdownList);
        select.selectByVisibleText("2");
        
        
        WebElement btnSearch = driver.findElement(By.xpath("//div[@class='row']/div[4]/button"));
        
        
        boolean btnSearch_isDisplayed = btnSearch.isDisplayed();
        if(btnSearch_isDisplayed == true) {
			System.out.println("btnSearch_isDisplayed:: PASSED");
		}else {
			System.out.println("btnSearch_isDisplayed:: FAILED (ELEMENT NOT DISPLAYED)");
		}
        
        
        clickJavaScriptActionsClick(By.xpath("//div[@class='row']/div[4]/button"));
        //btnSearch.click();
        
        
        
        String nextPageTitle = driver.getTitle();
        
        System.out.println(nextPageTitle);
        

        
//   		WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable((locator)));
//        
//        
//        driver.findElement(By.xpath(".//div[@id='EXPEDIA']/form/div[2]/div[4]/button")).click();
//        
        
	}
		
	
		@After
		public void tearDown() {
			driver.quit();
			
		}
		
		
		 public void clickJavaScriptActionsClick(By locator) {

		        WebElement element = driver.findElement(locator);
		        Actions actions = new Actions(driver);
		        actions.moveToElement(element).click().perform();

		        /*
		        * 1. The element is not visible to click.
		        * 2. The page is getting refreshed before it is clicking the element.
		        * 3. The element is clickable but there is a spinner/overlay on top of it

		            in some cases this will happen and we have to us the Javascript Actions class
		        * */
		    }

		
		
		
		
		
		
		
	
	
	
	

}
