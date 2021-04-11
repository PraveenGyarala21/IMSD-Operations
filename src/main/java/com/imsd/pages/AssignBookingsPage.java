package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class AssignBookingsPage extends TestBase {
	
	
	//Page Factory
	@FindBy(xpath = "//ul[@class=\"sidebarMenu\"]/li[7]")
	WebElement myAssignmentsLink;
	
	
	//Initializing the page objects
	public AssignBookingsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String verifyAssignBookingsPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public MyAssignmentsPage clickMyAssignmentsLink() {
		
		myAssignmentsLink.click();
		
		return new MyAssignmentsPage();
	}
	
	

}
