package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.AddBookingPage;
import com.imsd.pages.ContactsPage;

public class ContactsPageTest extends TestBase {
	
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		
		super();
	}
	
	
	@Test
	public void verifyContactsPageTitleTest() {
		
		contactsPage = new ContactsPage();
		
		String contactsPageTitle = contactsPage.verifyContactsPageTile();
		
		Assert.assertEquals(contactsPageTitle, "Contacts - thebigword gms", "AddBookingPage title did not match");
	}
	
	@Test(dependsOnMethods= {"verifyContactsPageTitleTest"})
	public void clickAssignBookingsLinkTest() throws InterruptedException {
		
	contactsPage.navigateBack();	
		
	contactsPage.clickAssignBookingsLink();
		
	}
	
	
	
	
	
	
	

}
