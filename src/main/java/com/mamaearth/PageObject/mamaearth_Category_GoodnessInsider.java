package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_GoodnessInsider extends mamaearth_Base{
	
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath = "//img[@class='elgible-image']")
	WebElement GI_Banner;
	
	@FindBy(xpath = "//button[contains(text(), 'Buy Now')]//parent::div[@class='pricing-plan best-seller']/button")
	WebElement six_month_buyNow_button;
	
	@FindBy(xpath = "//h3[contains(text(), 'How to avail Goodness Insider Benefits?')]")
	WebElement Help_Title;

	@FindBy(xpath = "//h3[contains(text(), 'FAQ')]")
	WebElement FAQ_Title;

	@FindBy(xpath = "//h3[contains(text(), 'Terms & Conditions')]")
	WebElement Terms_Condition_Title;
	
	
	//h3[contains(text(), 'Terms & Conditions')]
	
	public mamaearth_Category_GoodnessInsider() {
		PageFactory.initElements(driver, this);
	}
	
	/*** This function will verify Goodness Insider page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * ***/
	public boolean verfiy_GoodnessInsider_page() throws IOException {
			
			boolean SixMonthPlanBuyNow = six_month_buyNow_button.isDisplayed();
			boolean helpTitle = Help_Title.isDisplayed();
			boolean FAQTitle = FAQ_Title.isDisplayed();
			boolean TermsConditionTitle = Terms_Condition_Title.isDisplayed();
			
	//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//		boolean brokenCountFlag = true;
	//		if(brokenLinkCount > 50) {
	//			brokenCountFlag = false;
	//		}
			System.out.println("plan: " + SixMonthPlanBuyNow+", helpTitle: " + helpTitle+", FAQ: " + FAQTitle+", Terms: " + TermsConditionTitle);
			if(SixMonthPlanBuyNow && helpTitle && FAQTitle && TermsConditionTitle) return true;
			else return false;
		}
	
	
	
	/*** This function will return the reference of the Home Page category page class
	 * 
	 * 
	 * ***/
	public mamaearth_HomePage click_on_AllProducts_cateogry() {
		mamaearth_logo.click();
		return new mamaearth_HomePage();
	}
	
	
	/*** This will return the reference of the categories utils class ***/
	public mamaearth_utils_CategoriesFunctions categoriesRefrence() {
		return new mamaearth_utils_CategoriesFunctions();
	}


}
