package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imsd.pages.AssignBookingsPage;
import com.imsd.pages.MyAssignmentsPage;

public class AssignBookingsPageTest {
	
	AssignBookingsPage assignBookingsPage;
	
	
	
	public AssignBookingsPageTest() {
		
		super();
	}
	
	
	@Test
	public void verifyAssignBookingsPageTitleTest() {
		
		assignBookingsPage = new AssignBookingsPage();
		
		String assignBookingsPageTitle = assignBookingsPage.verifyAssignBookingsPageTitle();
		
		Assert.assertEquals(assignBookingsPageTitle, "Bookings - thebigword gms", "AssignBookingsPage title did not match");
	}
	
	
	@Test(dependsOnMethods= {"verifyAssignBookingsPageTitleTest"})
	public void clickMyAssignmentsLinkTest() {
		
		
	assignBookingsPage.clickMyAssignmentsLink();
		
	}
	
	
	

}
