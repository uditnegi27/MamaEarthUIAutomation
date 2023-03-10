package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_Category_Ingredient_AppleCiderVinegar  extends mamaearth_Base {
	
	@FindBy(xpath = "//h1[contains(text(), 'Apple Cider Vinegar for Hair and Skin')]")
	WebElement IngredientAppleCiderVinegar_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	public mamaearth_Category_Ingredient_AppleCiderVinegar() {
		PageFactory.initElements(driver, this);
	}
	
	
	/*** This function will verify Ingredient AppleCiderVinegar category under Ingredient category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Ingredient_AppleCiderVinegar_category_page() throws IOException {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = IngredientAppleCiderVinegar_page_header.getText();
		if(!title.equals("Apple Cider Vinegar for Hair and Skin")) titleFlag = false;
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}
}
