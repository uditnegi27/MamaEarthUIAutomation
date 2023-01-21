package com.mamaearth.PageObject;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils;

public class mamaearth_Category_AllProducts  extends mamaearth_Base{


	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Blog')]")
	WebElement Blog_category_button;
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Plant Goodness')]")
	WebElement PlantGoodness_category_button;
	
	@FindBy(xpath = "//button[contains(text(),'Load More')]")
	WebElement loadMore_button;
	
	
	public mamaearth_Category_AllProducts() {
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
			
			mamaearth_utils.waitToElementPresence(loadMore_button, Duration.ofSeconds(5));
			boolean loadmore = loadMore_button.isDisplayed();
			
	//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//		boolean brokenCountFlag = true;
	//		if(brokenLinkCount > 50) {
	//			brokenCountFlag = false;
	//		}
			
			if(mamaearthLogo && GILogo && loadmore) return true;
			else return false;
		}
	
	
	
	/*** This function will return the reference of the Blog category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Blog click_on_Blog_cateogry() {
		Blog_category_button.click();
		return new mamaearth_Category_Blog();
	}
	

	
	/*** This function will return the reference of the PlantGoodness category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_PlantGoodness click_on_PlantGoodness_cateogry() {
		PlantGoodness_category_button.click();
		return new mamaearth_Category_PlantGoodness();
	}



}
