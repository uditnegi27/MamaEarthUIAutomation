package com.mamaearth.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Category_Hair extends mamaearth_Base{
	
	@FindBy(xpath = "//h1[contains(text(),'Best Hair Care Products')]")
	WebElement page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	
	public mamaearth_Category_Hair() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verfiy_Hair_category_page() throws IOException {
		
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = page_header.getText();
		if(!title.equals("Best Hair Care Products")) titleFlag = false;
		
//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
//		boolean brokenCountFlag = true;
//		if(brokenLinkCount > 50) {
//			brokenCountFlag = false;
//		}
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}
	
	

	/*** This will return the reference of the categories utils class ***/
	public mamaearth_utils_CategoriesFunctions categoriesRefrence() {
		return new mamaearth_utils_CategoriesFunctions();
	}
}
