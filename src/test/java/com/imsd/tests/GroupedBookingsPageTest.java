package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.GroupedBookingsPage;

public class GroupedBookingsPageTest extends TestBase{
	
	
	GroupedBookingsPage groupedBookingsPage;
	
	
	public GroupedBookingsPageTest() {
		super();
		
	}
	
	
	@Test
	public void verifyGroupedBookingsPageTitleTest() {
		
		groupedBookingsPage = new GroupedBookingsPage();
		
		String groupedBookingsTile = groupedBookingsPage.verifyGourpedBookingsPageTile();
		
		Assert.assertEquals(groupedBookingsTile, "Grouped Bookings - thebigword gms", "GroupedBookingsPage Title did not match");
	}
	
	
	
	
	@Test(dependsOnMethods= {"verifyGroupedBookingsPageTitleTest"})
	public void clickAddBookingLinkTest() throws InterruptedException {
		
		groupedBookingsPage.clickAddBookingsLink();
		
		
	}
	
	
	
	
	
	
	

}
