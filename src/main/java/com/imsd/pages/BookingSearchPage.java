package com.imsd.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class BookingSearchPage extends TestBase {
	
	// Page Factory 
	 
	   @FindBy(xpath="//ul[@class=\"sidebarMenu\"]/li[3]")
	   public WebElement groupedBookingslink;
	
	//Initializing the Page Objects:
		public BookingSearchPage(){
			PageFactory.initElements(driver, this);
		}
		
		
	//Actions
		
		public GroupedBookingsPage clickGroupedBookingslink() {
			
			groupedBookingslink.click();
			
			return new GroupedBookingsPage();
			
		}
		
		
		
		public String verifyBookingSearchPageTitle() {
			
			return driver.getTitle();
			
		}
			
	
		
	
	
	
	

}
