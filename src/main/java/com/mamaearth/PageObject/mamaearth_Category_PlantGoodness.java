package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_Category_PlantGoodness extends mamaearth_Base{
	

	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	@FindBy(xpath = "//div[contains(text(), 'Login')]//parent::div[@class='style__ButtonLayout-sc-1ww9rhd-0 cLyWOa']/div")
	WebElement Login_button;
	
	@FindBy(xpath = "//div[contains(text(), 'Hi Guest')]")
	WebElement Header_Text;
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Store Locator')]")
	WebElement StoreLocator_category_button;
	
	@FindBy(xpath = "//img[@class='goodnessInsider__Img2-sc-o395w4-2 gabzHP']")
	WebElement Banner_Image;
	
	public mamaearth_Category_PlantGoodness() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify PlantGoodness category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * 
	 * 
	 * ***/
	public boolean verfiy_PlantGoodness_category_page() throws IOException {
			
			boolean mamaearthLogo = mamaearth_logo.isDisplayed();
			boolean GILogo = GI_button.isDisplayed();
			
			boolean banner = Banner_Image.isDisplayed();
	//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//		boolean brokenCountFlag = true;;
	//		if(brokenLinkCount > 50) {
	//			brokenCountFlag = false;
	//		}
			
			if(mamaearthLogo && GILogo && banner) return true;
			else return false;
		}
	
	
	
	/*** This function will return the reference of the StoreLocator category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_StoreLocator click_on_StoreLocator_cateogry() {
		StoreLocator_category_button.click();
		return new mamaearth_Category_StoreLocator();
	}
	
	

}
