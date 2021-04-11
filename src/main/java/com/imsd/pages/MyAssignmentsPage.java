package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class MyAssignmentsPage extends TestBase {
	
	//Page Factory
	@FindBy(xpath = "//ul[@class=\"sidebarMenu\"]/li[8]")
	WebElement manageAssignmentsLink;
	
	//Initializing the Page Objects
	public MyAssignmentsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	
	public String verifyMyAssignmentsPageTitle() {
		
		return driver.getTitle();
	}
	
	
	public MyAssignmentsPage clickManageAssignmentsLink() {
		
		manageAssignmentsLink.click();
		
		return new MyAssignmentsPage();
		
	}

}
