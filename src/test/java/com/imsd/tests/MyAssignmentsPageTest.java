package com.imsd.tests;

import org.testng.annotations.Test;

import com.imsd.pages.MyAssignmentsPage;

public class MyAssignmentsPageTest {
	
	MyAssignmentsPage myAssignmentsPage;
	
	
	
	public MyAssignmentsPageTest() {
		super();
	}
	
	
	@Test
	public void clickMyAssignmentsLinkTest() {
		
		myAssignmentsPage = new MyAssignmentsPage();
		
		myAssignmentsPage.clickManageAssignmentsLink();
		
	}
	
	
	

}
