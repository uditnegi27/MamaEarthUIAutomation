package com.mamaearth.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_Ingredient_Bhringmla extends mamaearth_utils_CategoriesFunctions {
	
	@FindBy(xpath = "//h1[contains(text(), 'Amla Products for Hair')]")
	WebElement IngredientBhringmla_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	public mamaearth_Category_Ingredient_Bhringmla() {
		PageFactory.initElements(driver, this);
	}
	
	
	/*** This function will verify Ingredient Bhringmla category under Ingredient category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Ingredient_Bhringmla_category_page() {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = IngredientBhringmla_page_header.getText();
		if(!title.equals("Amla Products for Hair")) titleFlag = false;
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}

}
