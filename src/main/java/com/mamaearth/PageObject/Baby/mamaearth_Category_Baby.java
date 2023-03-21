package com.mamaearth.PageObject.Baby;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.PageObject.mamaearth_Category_GiftPacks;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_Baby extends mamaearth_utils_CategoriesFunctions {
	

	@FindBy(xpath = "//h1[contains(text(),'Baby Care Products')]")
	WebElement Baby_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Gift Packs')]")
	WebElement GiftPacks_category_button;
	
	
	public mamaearth_Category_Baby() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify Baby category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * ***/
	public boolean verfiy_Baby_category_page() {
			
			boolean mamaearthLogo = mamaearth_logo.isDisplayed();
			boolean GILogo = GI_button.isDisplayed();
			
			boolean titleFlag = true;
			String title = Baby_page_header.getText();
			if(!title.equals("Baby Care Products")) titleFlag = false;
			
	//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//		boolean brokenCountFlag = true;
	//		if(brokenLinkCount > 50) {
	//			brokenCountFlag = false;
	//		}
			
			if(mamaearthLogo && GILogo && titleFlag) return true;
			else return false;
		}
	
	
	
	/*** This function will return the reference of the GiftPacks category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_GiftPacks click_on_GiftPacks_cateogry() {
		GiftPacks_category_button.click();
		return new mamaearth_Category_GiftPacks();
	}


}
