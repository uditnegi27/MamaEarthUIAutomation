package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_Hair_Shampoo extends mamaearth_Base{

	@FindBy(xpath = "//h1[contains(text(), 'Best Shampoo for Hair Fall')]")
	WebElement shampoo_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	public mamaearth_Category_Hair_Shampoo() {
		PageFactory.initElements(driver, this);
	}
	
	
	/*** This function will verify Fragrance category under Beauty category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Hair_Shampoo_category_page() throws IOException {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = shampoo_page_header.getText();
		if(!title.equals("Best Shampoo for Hair Fall")) titleFlag = false;
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}
	
	/*** This will return the reference of the categories utils class ***/
	public mamaearth_utils_CategoriesFunctions categoriesRefrence() {
		return new mamaearth_utils_CategoriesFunctions();
	}
}
