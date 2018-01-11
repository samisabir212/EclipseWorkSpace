package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import generic.Common_API;
import junit.framework.Assert;
import util.Lib;

public class DealStepDefinition extends Common_API {

	public Lib lib = new Lib();

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When(value = "^title of login page is Free CRM$")
	public void LoginPageTitle() {

		// verifyTitle("#1 Free CRM for Any Business: Online Customer Relationship
		// Software");
		String title = driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
		System.out.println("title");

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) throws Throwable {

		//working with datatable **Use List**
		List<List<String>> data  = credentials.raw();
		
		// enter username
		typeBy(By.name("username"),data.get(0).get(0));
		
		System.out.println("username");
		// enter password
		typeBy(By.name("password"), data.get(0).get(1));
		//driver.findElement(By.name("password")).sendKeys(password);
		System.out.println("password");
		sleepFor(5);

	}

	@Then(value = "^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();

		System.out.println(" clicked ");
		Thread.sleep(5000);

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		
		String title = driver.getTitle();
		
		System.out.println("user is on hoome page :: "+  title);
		
		
		
		
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws Throwable {
		
		
		driver.switchTo().frame("mainpanel");
		//Actions actions = new Actions(driver);
		//WebElement contactElement = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		//actions.moveToElement(contactElement).build().perform();
		mouseHoverByXpath("//a[contains(text(),'Deals')]");
		click(By.xpath("//a[@title='New Deal']"));
		//driver.findElement(By.xpath("//a[@title='New Contact']")).click();
		System.out.println("navigated to new contacts page");
		

	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealsData) throws Throwable {

		typeBy(By.cssSelector("#title"), value);
		typeBy(By.cssSelector("#amount"), value);
		typeBy(By.cssSelector("#probability"), value);
		typeBy(By.cssSelector("#commission"), value);

		
		
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
