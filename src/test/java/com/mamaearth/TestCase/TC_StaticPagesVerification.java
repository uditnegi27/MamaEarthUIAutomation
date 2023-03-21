package com.mamaearth.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.PageObject.StaticPages.mamaearth_AboutUs;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class TC_StaticPagesVerification extends mamaearth_Base {
	
	mamaearth_HomePage home;
	mamaearth_AboutUs aboutUs;
	
	
	mamaearth_utils_CategoriesFunctions cf;

	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		home = new mamaearth_HomePage();
	}
	
	@Test
	public void Test_mamaearth_PrivacyPolicy_Page() {
		aboutUs = home.click_on_StaticPage_AboutUs_cateogry();
		aboutUs.verfiy_AboutUs_StaticCategory_page();
		
	}
	
	@Test
	public void Test_mamaearth_Returns_Page() {
	}
	
	@Test
	public void Test_mamaearth_TermsAndConditions_Page() {
	}
	
	@Test
	public void Test_mamaearth_TermsAndConditionsAndCashback_Page() {
	}
	
	@Test
	public void Test_mamaearth_FAQs_Page() {
	}
	
	@Test
	public void Test_mamaearth_WeAreSafe_Page() {
	}
	
	@Test
	public void Test_mamaearth_TrackOrder_Page() {
	}
	
	@Test
	public void Test_mamaearth_ContactUs_Page() {
	}
	
	@Test
	public void Test_mamaearth_Sitemap_Page() {
	}
	
	@Test
	public void Test_mamaearth_AboutUS_Page() {
		aboutUs = home.click_on_StaticPage_AboutUs_cateogry();
		aboutUs.verfiy_AboutUs_StaticCategory_page();
		
	}
	
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		driver.quit();
	}

}
