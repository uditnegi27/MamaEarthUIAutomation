package com.mamaearth.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.PageObject.StaticPages.mamaearth_AboutUs;
import com.mamaearth.PageObject.StaticPages.mamaearth_FAQs;
import com.mamaearth.PageObject.StaticPages.mamaearth_PrivacyPolicy;
import com.mamaearth.PageObject.StaticPages.mamaearth_Returns;
import com.mamaearth.PageObject.StaticPages.mamaearth_TermsAndConditions;
import com.mamaearth.PageObject.StaticPages.mamaearth_TermsAndConditions_Cashback;
import com.mamaearth.PageObject.StaticPages.mamaearth_WeAreSafe;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class TC_StaticPagesVerification extends mamaearth_Base {
	
	mamaearth_HomePage home;
	mamaearth_PrivacyPolicy privacyPolicy;
	mamaearth_AboutUs aboutUs;
	mamaearth_Returns returns;
	mamaearth_TermsAndConditions termsAndCondition;
	mamaearth_TermsAndConditions_Cashback termsAndConditionAndCashback;
	mamaearth_FAQs FAQs;
	mamaearth_WeAreSafe weAreSafe;
	
	
	mamaearth_utils_CategoriesFunctions cf;

	
	@BeforeMethod
	public void setup() {
		initialization();
		home = new mamaearth_HomePage();
	}
	
	@Test(priority = 1)
	public void Test_mamaearth_PrivacyPolicy_Page() {
		privacyPolicy = home.open_StaticPage_PrivacyPolicy_cateogry();
		privacyPolicy.verfiy_PrivacyPolicy_StaticCategory_page();
	}
	
	@Test(priority = 2)
	public void Test_mamaearth_Returns_Page() {
		returns = home.open_StaticPage_Returns_cateogry();
		returns.verfiy_Return_StaticCategory_page();
	}
	
	@Test(priority = 3)
	public void Test_mamaearth_TermsAndConditions_Page() {
		termsAndCondition = home.open_StaticPage_TermsAndConditions_cateogry();
		termsAndCondition.verfiy_TermsAndConditions_StaticCategory_page();
	}
	
	@Test(priority = 4)
	public void Test_mamaearth_TermsAndConditionsAndCashback_Page() {
		termsAndConditionAndCashback = home.open_StaticPage_TermsAndConditionsAndCashback_cateogry();
		termsAndConditionAndCashback.verfiy_TermsAndConditionsAndCashback_StaticCategory_page();
	}
	
	@Test(priority = 5)
	public void Test_mamaearth_FAQs_Page() {
		FAQs = home.open_StaticPage_FAQs_cateogry();
		FAQs.verfiy_FAQs_StaticCategory_page();
		FAQs.verify_AllQuestionsAnswer();
	}
	
	@Test(priority = 6)
	public void Test_mamaearth_WeAreSafe_Page() {
		weAreSafe = home.open_StaticPage_WeAreSafe_cateogry();
		weAreSafe.verfiy_WeAreSafe_StaticCategory_page();
	}
	
//	@Test
//	public void Test_mamaearth_TrackOrder_Page() {
//	}
//	
//	@Test
//	public void Test_mamaearth_ContactUs_Page() {
//	}
//	
//	@Test
//	public void Test_mamaearth_Sitemap_Page() {
//	}
	
	@Test(priority = 7)
	public void Test_mamaearth_AboutUS_Page() throws InterruptedException{
		aboutUs = home.open_StaticPage_AboutUs_cateogry();
		boolean response = aboutUs.verfiy_AboutUs_StaticCategory_page();
		Assert.assertTrue(response);
	}
	
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		driver.quit();
	}

}
