package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_Category_StoreLocator extends mamaearth_Base{
	

	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	@FindBy(xpath = "//button[@title='Show street map']")
	WebElement Map_button;
	
	
	public mamaearth_Category_StoreLocator() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify StoreLocator category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * 
	 * 
	 * ***/
	public boolean verfiy_StoreLocator_category_page() throws IOException {
			
			boolean mamaearthLogo = mamaearth_logo.isDisplayed();
			boolean GILogo = GI_button.isDisplayed();
			
			boolean map = Map_button.isDisplayed();
			
	//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//		boolean brokenCountFlag = true;
	//		if(brokenLinkCount > 50) {
	//			brokenCountFlag = false;
	//		}
			
			if(mamaearthLogo && GILogo && map) return true;
			else return false;
		}
	
	
	
	/*** This function will return the reference of the GoodnessInsider page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_GoodnessInsider click_on_GoodnessInsider_cateogry() {
		GI_button.click();
		return new mamaearth_Category_GoodnessInsider();
	}
	
	


}
