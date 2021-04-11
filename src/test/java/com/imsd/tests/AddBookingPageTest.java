package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.AddBookingPage;

public class AddBookingPageTest extends TestBase{
	
	AddBookingPage addBookingPage;
	
	public AddBookingPageTest() {
		super();
	}
	 
	
	
	@Test
	public void verifyAddBookingPageTitleTest() {
		
		addBookingPage = new AddBookingPage();
		
		String addBookingPageTitle = addBookingPage.verifyAddBookingPageTile();
		
		Assert.assertEquals(addBookingPageTitle, "Contacts - thebigword gms", "AddBookingPage title did not match");
		
		
	}
	
	
	
	
	
	@Test(dependsOnMethods= {"verifyAddBookingPageTitleTest"})
	public void clickContactsLinkTest() throws InterruptedException {
		
		addBookingPage.navigateBack();
			
		addBookingPage.clickContactsLink();
		
		
	}
	
	
	
	
	

}
