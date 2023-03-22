package com.mamaearth.PageObject.StaticPages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_Returns extends mamaearth_utils_CategoriesFunctions{
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	@FindBy(xpath = "//h1[contains(text(), 'Mamaearth – Return Policy')]")
	WebElement Return_page_Banner;
	
	
	
	public mamaearth_Returns() {
		PageFactory.initElements(driver, this);
	}
	
	/*** This function will verify Return page under Static category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_Return_StaticCategory_page() {
			
		mamaearth_utils.implicit_wait(Duration.ofSeconds(10));
		
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		mamaearth_utils.waitToElementPresence(Return_page_Banner, Duration.ofSeconds(5));
		boolean pageBanner = Return_page_Banner.isDisplayed();
		
		if(mamaearthLogo && GILogo && pageBanner) return true;
		else return false;
	}
}