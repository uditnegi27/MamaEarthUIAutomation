package com.mamaearth.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.PageObject.mamaearth_LogInPopUpSreen;

public class TC_VerifyLoginFlow extends mamaearth_Base {
	
	mamaearth_HomePage home;
	mamaearth_LogInPopUpSreen loginScreen;
	
	@BeforeMethod
	public void setup() {
		open_Mamaearth_As_Guest();
		home = new mamaearth_HomePage();
	}
	
	
	@Test
	public void Test_login_with_EmptyNumber() {
		loginScreen = home.click_Login_Page();
		loginScreen.click_loginButton_with_empty_number();
	}
	
	@Test
	public void Test_login_with_InvalidNumber() {
		loginScreen = home.click_Login_Page();
		loginScreen.click_loginButton_with_invalid_number();
	}
	
	@Test
	public void Test_login_with_lessThanTenDigitNumber() {
		loginScreen = home.click_Login_Page();
		loginScreen.click_loginButton_with_lessThanFixedDigit_number();
	}
	
	@Test
	public void Test_login_with_moreThanTenDigitNumber() {
		loginScreen = home.click_Login_Page();
		loginScreen.click_loginButton_with_moreThanFixedDigit_number();
	}
	
	@Test
	public void Test_login_with_ValidNumber() {
		loginScreen = home.click_Login_Page();
		loginScreen.click_loginButton_with_moreThanFixedDigit_number();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
