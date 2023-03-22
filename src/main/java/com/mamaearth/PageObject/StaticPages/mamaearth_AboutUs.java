package com.mamaearth.PageObject.StaticPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_AboutUs extends mamaearth_utils_CategoriesFunctions {
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	@FindBy(xpath = "//h1[contains(text(), 'Our Story')]")
	WebElement AboutUS_page_header;
	
	@FindBy(xpath = "//h2[contains(text(), 'What We Want To Achieve?')]")
	WebElement page_header_1;
	
	@FindBy(xpath = "//h2[contains(text(), 'What Are We Doing Every Day To Achieve It?')]")
	WebElement page_header_2;
	
	
	public mamaearth_AboutUs() {
		PageFactory.initElements(driver, this);
	}
	
	/*** This function will verify About Us category under Static category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_AboutUs_StaticCategory_page() {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		boolean titleFlag_1 = true;
		boolean titleFlag_2 = true;
		boolean titleFlag_3 = true;
		
		String title_1 = AboutUS_page_header.getText();
		String title_2 = page_header_1.getText();
		String title_3 = page_header_2.getText();
		
		if(!title_1.equals("Our Story")) titleFlag_1 = false;
		if(!title_2.equals("What We Want To Achieve?")) titleFlag_2 = false;
		if(!title_3.equals("What Are We Doing Every Day To Achieve It?")) titleFlag_3 = false;
		
		if(mamaearthLogo && GILogo && titleFlag_1 && titleFlag_2 && titleFlag_3) return true;
		else return false;
	}
}
