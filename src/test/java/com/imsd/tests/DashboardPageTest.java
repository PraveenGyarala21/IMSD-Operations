package com.imsd.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.BookingSearchPage;
import com.imsd.pages.DashboardPage;




public class DashboardPageTest extends TestBase {
	

	DashboardPage dashboardPage;
	BookingSearchPage bookingsearchPage;
	
	
	
	public DashboardPageTest() {
	 
		super();
	}
	
	
	@Test()
	public void verifyDashboardPageTileTest() {
		
		dashboardPage = new DashboardPage();
		
		String dashboardPageTile = dashboardPage.verifyDashboardPageTitle();
		
		Assert.assertEquals(dashboardPageTile, "Apps - thebigword gms", "Dashboardpage Tile not matched");
	}
	
	
	@Test(dependsOnMethods= {"verifyDashboardPageTileTest"})
	public void clickOperationsTileTest() throws InterruptedException {
		
	 bookingsearchPage	= dashboardPage.clickOperationTile();
		
	}
	
	
	
	
	
	

}
