package com.mamaearth.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_Beauty_FacialKits extends mamaearth_utils_CategoriesFunctions{

	@FindBy(xpath = "//div[@class='ProductList__Div-sc-1co8frz-3 cIAELX']//child::h1[contains(text(),'Facial Kits')]")
	WebElement FragranceKits_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	

	public mamaearth_Category_Beauty_FacialKits() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify Fragrance category under Beauty category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Beauty_FacialKits_category_page() {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = FragranceKits_page_header.getText();
		if(!title.equals("Facial Kits")) titleFlag = false;
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}
	
	/*** This will return the reference of the categories utils class ***/
	public mamaearth_utils_CategoriesFunctions categoriesRefrence() {
		return new mamaearth_utils_CategoriesFunctions();
	}
	
}
