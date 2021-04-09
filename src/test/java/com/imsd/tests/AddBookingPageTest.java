package com.imsd.tests;

import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.AddBookingPage;

public class AddBookingPageTest extends TestBase{
	
	AddBookingPage addBookingPage;
	
	public AddBookingPageTest() {
		super();
	}
	
	
	@Test
	public void clickContactsLinkTest() throws InterruptedException {
		
		addBookingPage = new AddBookingPage();
		
		addBookingPage.clickContactsLink();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
	}
	
	

}
