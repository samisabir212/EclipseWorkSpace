package stepDefinitions;

import java.io.IOException;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.testBase.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ValidLoginStepDefinitions extends TestBase {

	public ValidLoginStepDefinitions() throws IOException {
		super();
	}
	
	
	LoginPage loginPage;
	HomePage homePage;
	

	@Before
	@Given("^user opens browser and navigates to FreeCrm web page$")
	public void user_opens_browser_and_navigates_to_FreeCrm_web_page() throws Throwable {

		TestBase.initialization();
	}

	@Then("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		String validation = loginPage.validateLoginPageTitle();
		Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", validation);
		
		
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		loginPage.login(username, password);
		

	}

	@Then("^clicks login button$")
	public void clicks_login_button() throws Throwable {

	}


	@Then("^validate home page$")
	public void validate_home_page() throws Throwable {

	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
