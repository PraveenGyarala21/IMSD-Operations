package com.imsd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.imsd.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory
	
	@FindBy(id="Username")
	WebElement Username;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//span[text()=\"Login\"]")
	WebElement LoginButton;
	
	
	
	//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		
	//Actions
		
	public DashboardPage login(String un, String pwd) throws InterruptedException {
		
		Username.sendKeys(un);
		Password.sendKeys(pwd);
		LoginButton.click();
		
		Thread.sleep(5000);
		
		
		return new DashboardPage();
	}
	
	
	
	
		
	
	

}
