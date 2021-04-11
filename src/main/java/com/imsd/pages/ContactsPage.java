package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class ContactsPage extends TestBase {
	
	// Page Factory
	@FindBy(xpath = "//ul[@class=\"sidebarMenu\"]/li[6]")
	WebElement assignBookingsLink;
	
	
	
	//Initializing the Page Objects
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
    public String verifyContactsPageTile() {
		
		return driver.getTitle();
	} 
    
    
    
    public void navigateBack() {
    
    	driver.navigate().back();
    
    }
    
	
	public AssignBookingsPage clickAssignBookingsLink() {
		
		assignBookingsLink.click();
		
		return new AssignBookingsPage();
	}

}
