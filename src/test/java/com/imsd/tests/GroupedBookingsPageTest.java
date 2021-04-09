package com.imsd.tests;

import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.GroupedBookingsPage;

public class GroupedBookingsPageTest extends TestBase{
	
	
	GroupedBookingsPage groupedBookingsPage;
	
	
	public GroupedBookingsPageTest() {
		super();
		
	}
	
	
	@Test
	public void clickGroupedBookingsLinkTest() throws InterruptedException {
		
		groupedBookingsPage = new GroupedBookingsPage();
		
		groupedBookingsPage.clickAddBookingsLink();
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
	}
	
	

}
