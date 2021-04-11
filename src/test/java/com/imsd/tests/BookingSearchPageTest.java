package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.imsd.pages.BookingSearchPage;
import com.imsd.pages.GroupedBookingsPage;

public class BookingSearchPageTest {
	
	BookingSearchPage bookingSearhPage;
	GroupedBookingsPage groupedBookingsPage;
	
	
	public BookingSearchPageTest(){
		
		super();
	}
	
	
	@Test ()
	public void verifyBookingSearchPageTitleTest() {
		
		bookingSearhPage = new BookingSearchPage();
		
		String bookingSearchPageTile = bookingSearhPage.verifyBookingSearchPageTitle();
		
		Assert.assertEquals(bookingSearchPageTile, "Bookings - thebigword gms", "BookingSearchPageTitle did not match");
	}
	
	
	@Test(dependsOnMethods= {"verifyBookingSearchPageTitleTest"})
	public void clickGroupedBookingslinkTest() {
		
	
		
		groupedBookingsPage = bookingSearhPage.clickGroupedBookingslink();
	}
	
	
	
	
	
	

}
