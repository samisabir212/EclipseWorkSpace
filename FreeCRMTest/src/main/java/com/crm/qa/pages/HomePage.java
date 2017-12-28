package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	//campro logo at homepage right side
	@FindBy(xpath="//td[contains(text(),'CRMPRO')]")
	WebElement crmPRO_Logo_homePage;
	
	//validate user logged in 
	@FindBy(xpath="//td[contains(text(),'User: sami sabir-idrissi')]")
	WebElement username_Text;
	
	
	//deals button link
	@FindBy(xpath="//ul[@class='mlddm']/li[5]")
	WebElement dealsLink;

	//contacts button link
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	//calender button link
	@FindBy(xpath="//td[@class='headertable']//div[@id='navmenu']/ul/li[2]")
	WebElement calenderLink;
	//tasks button link
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	//validateCRMLogo
	public boolean validate_CRMLOGO() {
		return crmPRO_Logo_homePage.isDisplayed();
	}
	
	//validate login page title
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	
	//validate user name that is logged in
	public boolean validateUserByText() {
		
		return username_Text.isDisplayed();
		
	}

	
	
	

	public ContactsPage clickContacts() throws IOException {
		contactsLink.click();
		return new ContactsPage();
	}

	public CalenderPage clickCalender() {
		calenderLink.click();
		return new CalenderPage();
	}

	public TasksPage clickTasks() {
		tasksLink.click();
		return new TasksPage();
	}

	public DealsPage clickDeals() {
		dealsLink.click();
		return new DealsPage();	
	}
	
	
	
 }


