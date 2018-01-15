//package stepDefinitions;
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import generic.Common_API;
//import junit.framework.Assert;
//import util.Lib;
//
//public class DealStepMapDefinition extends Common_API {
//
//	public Lib lib = new Lib();
//
//	//Data table with maps : for parameteriztion for test cases
//
//	@Given("^user is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//
//		System.setProperty("webdriver.chrome.driver",
//				"/Users/sami/Desktop/RocketLauncher/Mac/Drivers/chromedriver2_26");
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com/index.html");
//
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//	}
//
//	@When(value = "^title of login page is Free CRM$")
//	public void LoginPageTitle() {
//
//		// verifyTitle("#1 Free CRM for Any Business: Online Customer Relationship
//		// Software");
//		String title = driver.getTitle();
//		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
//		System.out.println("title");
//
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enters_username_and_password(DataTable credentials) throws Throwable {
//
//		// working with datatable **Use Map**
//		for(Map<String,String> data : credentials.asMaps(String.class, String.class)) {
//			// enter username
//			sleepFor(5);
//			//driver.findElement(By.name("username")).sendKeys(data.get("username"));
//			typeBy(By.name("username"), data.get("username"));
//			System.out.println("username");
//			// enter password
//			typeBy(By.name("password"), data.get("password"));
//			System.out.println("password");
//		}
//			
//
//		
//	}
//
//	@Then(value = "^user clicks on login button$")
//	public void user_clicks_on_login_button() throws InterruptedException {
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
//
//		System.out.println(" clicked ");
//		Thread.sleep(5000);
//
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() throws Throwable {
//
//		String title = driver.getTitle();
//
//		System.out.println("user is on hoome page :: " + title);
//
//	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() throws Throwable {
//		
//		driver.switchTo().frame("mainpanel");
//		mouseHover("//a[contains(text(),'Deals')]");
//		click(By.xpath("//a[@title='New Deal']"));
//		System.out.println("navigated to new contacts page");
//
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable dealsData) throws Throwable {
//
//		// working with datatable **Map**
//		for(Map<String,String> data : dealsData.asMaps(String.class, String.class)) {
//			
//			typeBy(By.cssSelector("#title"), data.get("title"));
//			typeBy(By.cssSelector("#amount"), data.get("amount"));
//			typeBy(By.cssSelector("#probability"), data.get("probability"));
//			typeBy(By.cssSelector("#commission"), data.get("commission"));
//			
//			click(By.xpath(".//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")); //save button
//			sleepFor(5);
//			//driver.switchTo().frame("mainpanel");
//			mouseHover("//a[contains(text(),'Deals')]");
//			click(By.xpath("//a[@title='New Deal']"));
//			
//			
//			
//			
//		}
//
//
////		typeBy(By.cssSelector("#title"), data.get(0).get(0));
////		typeBy(By.cssSelector("#amount"), data.get(0).get(1));
////		typeBy(By.cssSelector("#probability"), data.get(0).get(2));
////		typeBy(By.cssSelector("#commission"), data.get(0).get(3));
//
//	}
//
//	@Then("^Close the browsers$")
//	public void close_the_browsers() throws Throwable {
//
//		driver.quit();
//	}
//
//}
