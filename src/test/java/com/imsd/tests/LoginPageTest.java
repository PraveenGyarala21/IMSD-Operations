package com.imsd.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.imsd.base.TestBase;
import com.imsd.pages.DashboardPage;
import com.imsd.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	DashboardPage dashboardPage;

	
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeSuite
	public void setup() {
		initialization();
		loginPage = new LoginPage();
	}
	
	
	@Test
	public void loginTest() throws InterruptedException {
		dashboardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		Assert.assertEquals("", "");
	}
	
	
	
	@AfterSuite()
	public void tearDown() {
     driver.quit();	
     
	}
	
	
	
	
	
	

}
