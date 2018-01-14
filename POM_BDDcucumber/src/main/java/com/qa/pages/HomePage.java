package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() throws IOException{
		super();	
	}
	
	
	//~~~~~~~~PAGE ELEMENTS~~~~~~~
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
	//'new contact' link from contact drop down after mouse hover
	@FindBy(xpath=".//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")
	WebElement newContactLink;

}
