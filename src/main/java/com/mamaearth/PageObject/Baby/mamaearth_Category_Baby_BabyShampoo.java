package com.mamaearth.PageObject.Baby;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_Category_Baby_BabyShampoo extends mamaearth_Base {
	
	@FindBy(xpath = "//h1[contains(text(), 'Best Baby Shampoo In India')]")
	WebElement BabyShampoo_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	public mamaearth_Category_Baby_BabyShampoo() {
		PageFactory.initElements(driver, this);
	}
	
	
	/*** This function will verify Baby Shampoo category under Baby category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Baby_BabyShampoo_category_page() throws IOException {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		boolean titleFlag = true;
		String title = BabyShampoo_page_header.getText();
		if(!title.equals("Best Baby Shampoo In India")) titleFlag = false;
		
		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}
}