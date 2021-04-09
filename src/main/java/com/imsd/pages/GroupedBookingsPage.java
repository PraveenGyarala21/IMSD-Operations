package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class GroupedBookingsPage extends TestBase {
	
	
	
	//Page Foctory
	@FindBy(xpath = "//ul[@class=\"sidebarMenu\"]/li[4]")
	WebElement addbookinglink;
	
	//Initializing the page objects
	public GroupedBookingsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Actions
	public AddBookingPage clickAddBookingsLink() {
		addbookinglink.click();
		
		return new AddBookingPage();
	}
	
	

}
