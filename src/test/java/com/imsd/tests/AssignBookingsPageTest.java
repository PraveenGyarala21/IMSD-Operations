package com.imsd.tests;

import org.testng.annotations.Test;

import com.imsd.pages.AssignBookingsPage;
import com.imsd.pages.MyAssignmentsPage;

public class AssignBookingsPageTest {
	
	AssignBookingsPage assignBookingsPage;
	
	
	
	public AssignBookingsPageTest() {
		
		super();
	}
	
	
	@Test
	public void clickMyAssignmentsLinkTest() {
		
		assignBookingsPage = new AssignBookingsPage();
		
		assignBookingsPage.clickMyAssignmentsLink();
		
	}
	
	
	

}
