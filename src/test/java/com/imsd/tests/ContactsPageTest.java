package com.imsd.tests;

import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.ContactsPage;

public class ContactsPageTest extends TestBase {
	
	ContactsPage contactsPage;
	
	public ContactsPageTest() {
		
		super();
	}
	
	
	@Test
	public void clickAssignBookingsLinkTest() throws InterruptedException {
		
		contactsPage = new ContactsPage();
		
		contactsPage.clickAssignBookingsLink();
		
	}
	
	
	
	
	
	
	

}
