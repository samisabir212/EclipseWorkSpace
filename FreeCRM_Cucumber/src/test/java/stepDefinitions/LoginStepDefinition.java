package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	
	WebDriver driver;
	
	@Given("^user is already on the login page$")
	public void initialize() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
		 
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	   
	}

	@When(value ="^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		System.out.println("title");
	    
	}

	@Then(value ="^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException  {

		//enter username
		 driver.findElement(By.name("username")).sendKeys(username);
		 System.out.println("username");
		 //enter password
		 driver.findElement(By.name("password")).sendKeys(password);
		 System.out.println("password");
		 Thread.sleep(7);
	 

	}

	@Then(value = "^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();

		System.out.println(" clicked ");
		
	}

	@Then(value ="^user is on the home page$")
	public void user_is_on_the_home_page() {
		
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		
		System.out.println("verify homepage");
	 
	}
	
	@Then("^user closes the browser$")
	public void user_closes_the_browser() throws Throwable {
		driver.quit();
		
	}



	
}
