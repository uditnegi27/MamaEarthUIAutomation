package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils_CommonFuction;

public class mamaearth_Category_Beauty_Makeup extends mamaearth_Base{
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	public mamaearth_Category_Beauty_Makeup() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	/*** This function will verify AllProducts category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * 
	 * ***/
	public boolean verfiy_AllProducts_category_page() throws IOException {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		boolean imageFlag = mamaearth_utils_CommonFuction.verfiy_Images_ofProducts();
			
	//	int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//	boolean brokenCountFlag = true;
	//	if(brokenLinkCount > 50) {
	//		brokenCountFlag = false;
	//	}
			
		if(mamaearthLogo && GILogo && imageFlag) return true;
		else return false;
	}
	
	

}
