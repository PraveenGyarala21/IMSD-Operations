package com.imsd.tests;

import org.testng.annotations.Test;

import com.imsd.pages.BookingSearchPage;
import com.imsd.pages.GroupedBookingsPage;

public class BookingSearchPageTest {
	
	BookingSearchPage bookingSearhPage;
	GroupedBookingsPage groupedBookingsPage;
	
	
	public BookingSearchPageTest(){
		
		super();
	}
	
	
	
	@Test
	public void clickGroupedBookingslinkTest() {
		
		bookingSearhPage = new BookingSearchPage();
		
		groupedBookingsPage = bookingSearhPage.clickGroupedBookingslink();
	}
	
	

}
