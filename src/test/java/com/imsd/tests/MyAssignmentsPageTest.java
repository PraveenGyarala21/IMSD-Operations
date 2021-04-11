package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imsd.pages.MyAssignmentsPage;

public class MyAssignmentsPageTest {
	
	MyAssignmentsPage myAssignmentsPage;
	
	
	
	public MyAssignmentsPageTest() {
		super();
	}
	
	
	
	@Test void verifyMyAssignmentsPageTitleTest() {
		
		myAssignmentsPage = new MyAssignmentsPage();
		
		String myAssignmentsPageTitle = myAssignmentsPage.verifyMyAssignmentsPageTitle();
		
		
		Assert.assertEquals(myAssignmentsPageTitle, "My Assignments - thebigword gms", "MyAssignmentsPage title did not match");
		
	}
	
	
	@Test(dependsOnMethods= {"verifyMyAssignmentsPageTitleTest"})
	public void clickMyAssignmentsLinkTest() {
		
		
	myAssignmentsPage.clickManageAssignmentsLink();
		
	}
	
	
	

}
