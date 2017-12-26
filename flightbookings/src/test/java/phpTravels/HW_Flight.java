package phpTravels;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW_Flight {
	
	
	
	
	
	WebDriver driver = null;
	
	
	@Before
	public void initialize() {
		
        System.setProperty("webdriver.chrome.driver", "/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
        driver = new ChromeDriver();
        
        
		driver.get("http://www.phptravels.net/");
		System.out.println("navigated to php.net");

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40	, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

		
        
	}
	
	
	
	@Test
	public void testCase002() {
		
		//click flight button to navigate to air flights page
		driver.navigate().to("http://www.phptravels.net/air");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("navigated to phptravel air flight page");
		//enter origin
		driver.findElement(By.xpath(".//input[@id='flights-origin-prepop-whitelabel_en']")).click();
		System.out.println("origin clicked");
		waitForElement(20, By.xpath("//div[@id='tpwl-main-form']/div/div/section/div/form/div[2]/input[1]"));
		driver.findElement(By.xpath("//div[@id='tpwl-main-form']/div/div/section/div/form/div[2]/input[1]")).sendKeys("Washington DC");
		System.out.println("entered origin");
		//click 'WAS'
		driver.findElement(By.xpath("//span[contains(text(),'WAS')]")).click();
		System.out.println("clicked WAS ");
		
		//enter destination
		driver.findElement(By.xpath(".//input[@id='flights-destination-prepop-whitelabel_en']")).sendKeys("New york");
		driver.findElement(By.xpath("//span[contains(text(),'NYC')]")).click();
		System.out.println("entered destination");
		
		//enter depart date
		driver.findElement(By.cssSelector("#flights-dates-depart-prepop-whitelabel_en")).click();
		driver.findElement(By.xpath(".//td[@id='mewtwo-datepicker-2018-1-25']/div")).click();
		System.out.println("entered departure date");
		
		//return date
		driver.findElement(By.cssSelector("#flights-dates-return-prepop-whitelabel_en")).click();
		driver.findElement(By.xpath(".//td[@id='mewtwo-datepicker-2018-2-15']/div")).click();
		System.out.println("entered return date");
		
		//passengers must be 2 passengers
		driver.findElement(By.cssSelector(".mewtwo-flights-trip_class-wrapper")).click();
		driver.findElement(By.xpath("//div[@class='mewtwo-passengers-ages'][1]/div[2]")).click();
		System.out.println("increased adults by 1");
		
		//click search
		driver.findElement(By.xpath("//div[@class='mewtwo-flights-submit_button']/button ")).click();
		System.out.println("clicked search");
		
		
		String title = driver.getTitle();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(currentUrl);
		
	
        
	}
		
	
		@After
		public void tearDown() {
			driver.quit();
			
		}
		
		
		 public WebElement waitForElement(int timeout, By locator) {

		        WebElement element = null;

		        try {
		            //create an element object before action

		            System.out.println("waiting for maximum :: " + timeout + "seconds for the element to be available");
		            WebDriverWait wait = new WebDriverWait(driver, 3);
		            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		            System.out.println("element appeared on the webpage");

		        } catch (Exception e) {

		            System.out.println("element not appeared on the webpage");

		        }
		        return element;

		    }
	
	

}
