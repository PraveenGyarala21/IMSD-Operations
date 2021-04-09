package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.imsd.base.TestBase;


public class DashboardPage extends TestBase {
	
	// Page Factory
	@FindBy(xpath ="//div[@class=\"tiles\"]/a[6]/span[2]")
	WebElement operationsTile;
	
	
	
	//Initializing the Page Objects:
	public DashboardPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public BookingSearchPage clickOperationTile() throws InterruptedException {
		
		System.out.println("Before Click");
		
		operationsTile.click();
		
		System.out.println("After Click");
		
		return new BookingSearchPage();
	}
	
	
	public String verifyDashboardPageTitle() {
		
		return driver.getTitle();
		
	}
	

}
