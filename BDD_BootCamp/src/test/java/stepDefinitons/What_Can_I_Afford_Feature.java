package stepDefinitons;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.CommonAPI;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class What_Can_I_Afford_Feature extends CommonAPI {

	@Before
	public void setUp() throws IOException {

		log.info(
				"****************************** Starting test cases execution  *****************************************");
		log.debug("lauching test");

		localEnv();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
		driver.get(getConfig_PropertiesFile().getProperty("url"));

	}

	@Given("^user navigates to the Edmunds Calculator webapp page$")
	public static void userNavigatesToCalcApp() throws Throwable {

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Auto Calculators", "Expected title does not match actual title");

	}

	@Then("^user enters \"([^\"]*)\" in the what can i afford field$")
	public static void userEntersMonthlyPayment(String monthly_payment) throws Throwable {

		enterMonthlyPayment(monthly_payment);
	}

	@Then("^user clicks the Go button$")
	public void userClicksGo() throws Throwable {

		clickGoButton();

		System.out.println("clicked go button");
	}

	@And("^user is navigated to the calculators affordability$")
	public void user_is_navigated_to_the_calculators_affordability() throws Throwable {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("navigated to calc afford page");

	}

	@Then("^user enters the \"([^\"]*)\"$")
	public void user_enters_Zipcode(String zipcode) throws Throwable {

		enterZipCode(zipcode);
		System.out.println("entered zipcode");

	}

	@Then("^user enters \"([^\"]*)\"$")
	public void userEntersCashDownPayment(String cash_down_payment) {

		enterCashDownPayment(cash_down_payment);
	}

	@Then("^user clicks calculate button$")
	public void user_clicks_calculate_button() throws Throwable {
		clickCalculateButton();

	}

	public static String getLocator_PropertiesFile(String key) {

		File file = new File(
				"/Users/sami/git/EclipseWorkSpace/BDD_BootCamp/src/main/java/properties/locators.properties");

		String a = null;
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
			a = prop.getProperty(key);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return a;

	}

	@After
	public void tearDown() {
		System.out.println("quit");
		driver.quit();
	}

	// action methods

	public static void enterMonthlyPayment(String monthly_payment) {

		clearInputField(By.xpath(getLocator_PropertiesFile("monthlypaymentfield")));
		typeBy(By.xpath(getLocator_PropertiesFile("monthlypaymentfield")), monthly_payment);

	}

	public static void clickGoButton() {

		click(By.xpath(getLocator_PropertiesFile("goBtn")));

	}

	public static void enterZipCode(String zipcode) {

		clearInputField(By.xpath(getLocator_PropertiesFile("zipcode")));
		typeBy(By.xpath(getLocator_PropertiesFile("zipcode")), zipcode);
	}

	public static void enterCashDownPayment(String cash_down_payment) {

		typeBy(By.xpath(getLocator_PropertiesFile("cashDownPayment")), cash_down_payment);
	}

	public static void clickCalculateButton() {
		clickJavaScriptActionsClick(By.xpath(getLocator_PropertiesFile("calculateBtn")));
	}

}
