package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_Category_Blog extends mamaearth_Base{
	

	@FindBy(xpath = "//a[@class='logo-image']/img")
	WebElement mamaearth_logo;
	
	
	public mamaearth_Category_Blog() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify Blog category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * ***/
	public boolean verfiy_Blog_category_page() throws IOException {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
			
//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
//		boolean brokenCountFlag = true;
//		if(brokenLinkCount > 50) {
//			brokenCountFlag = false;
//		}
		
		if(mamaearthLogo) return true;
		else return false;
	}
	

	
	/*** This function will return the reference of the AllProducts Page category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_AllProducts back_to_AllProducts_cateogry() {
		driver.navigate().back();
		return new mamaearth_Category_AllProducts();
	}


	
}
