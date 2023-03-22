package com.mamaearth.PageObject.StaticPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_WeAreSafe extends mamaearth_utils_CategoriesFunctions{
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	@FindBy(xpath = "//div[contains(text(), 'PRODUCT NEED')]")
	WebElement productNeedSection_page_header;
	
	@FindBy(xpath = "//div[contains(text(), 'TESTING')]")
	WebElement testingSection_page_header;
	
	@FindBy(xpath = "//div[contains(text(), 'REFINEMENT')]")
	WebElement refinementSection_page_header;
	
	@FindBy(xpath = "//div[contains(text(), 'MADE SAFE CERTIFIED')]")
	WebElement madeSafeCertifiedSection_page_header;
	
	@FindBy(xpath = "//div[contains(text(), 'QACS LAB TEST')]")
	WebElement QACSLabTestSection_page_header;
	
	@FindBy(xpath = "//div[contains(text(), 'FDA APPROVED')]")
	WebElement FDAApprovedSection_page_header;
	
	public mamaearth_WeAreSafe() {
		PageFactory.initElements(driver, this);
	}
	
	/*** This function will verify We are Safe page under Static pages is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_WeAreSafe_StaticCategory_page() {
		
		mamaearth_utils.implicit_wait(Duration.ofSeconds(10));
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		
		if(mamaearthLogo && GILogo && verify_allSectionOnWeAreSafe_page()) return true;
		else return false;
	}
	
	public boolean verify_allSectionOnWeAreSafe_page() {
		if(productNeedSection_page_header.isEnabled() && testingSection_page_header.isEnabled() && refinementSection_page_header.isEnabled() && 
		madeSafeCertifiedSection_page_header.isEnabled() && QACSLabTestSection_page_header.isEnabled() && FDAApprovedSection_page_header.isEnabled()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
