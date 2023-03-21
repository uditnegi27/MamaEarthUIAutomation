package com.mamaearth.PageObject.Baby;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_Baby_BabyOil extends mamaearth_utils_CategoriesFunctions {
	
	@FindBy(xpath = "//h1[contains(text(), 'Baby Oil For Skin')]")
	WebElement BabyOil_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	public mamaearth_Category_Baby_BabyOil() {
		PageFactory.initElements(driver, this);
	}
	
	
	/*** This function will verify Baby Oil category under Baby category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Baby_BabyOil_category_page() {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = BabyOil_page_header.getText();
		if(!title.equals("Baby Oil For Skin")) titleFlag = false;
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}

}
