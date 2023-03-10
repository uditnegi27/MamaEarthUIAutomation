package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby;

public class mamaearth_Category_Ingredient extends mamaearth_Base{


	@FindBy(xpath = "//h1[contains(text(),'Ingredient')]")
	WebElement Ingredient_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Baby')]")
	WebElement Baby_category_button;
	
	
	
	public mamaearth_Category_Ingredient() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify Ingredient category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * ***/
	public boolean verfiy_Ingredient_category_page() throws IOException {
			
			boolean mamaearthLogo = mamaearth_logo.isDisplayed();
			boolean GILogo = GI_button.isDisplayed();
			
			boolean titleFlag = true;
			String title = Ingredient_page_header.getText();
			if(!title.equals("Ingredient")) titleFlag = false;
			
	//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
	//		boolean brokenCountFlag = true;
	//		if(brokenLinkCount > 50) {
	//			brokenCountFlag = false;
	//		}
			
			if(mamaearthLogo && GILogo && titleFlag) return true;
			else return false;
		}
	
	
	
	/*** This function will return the reference of the Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby click_on_Baby_cateogry() {
		Baby_category_button.click();
		return new mamaearth_Category_Baby();
	}


}
