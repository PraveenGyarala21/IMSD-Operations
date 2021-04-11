package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class AddBookingPage extends TestBase {
	
	// Page Factory
	@FindBy(xpath = "//ul[@class=\"sidebarMenu\"]/li[5]")
	WebElement contactsLink;
	
	
	//Initializing the page objects
	public AddBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String verifyAddBookingPageTile() {
		
		return driver.getTitle();
	}
	
	
	public void navigateBack() {
		
		driver.navigate().back();
	}
	
	
	
	public ContactsPage clickContactsLink() {
		
		contactsLink.click();
		
		return new ContactsPage();
	}
	
	

}
