package com.mamaearth.PageObject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_Category_Face extends mamaearth_Base{
	
	public Logger log = Logger.getLogger(mamaearth_Category_Face.class);

	@FindBy(xpath = "//h1[contains(text(),'Best Skin Care Products')]")
	WebElement Face_page_header;
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;

	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Body')]")
	WebElement Body_category_button;
	
	
	public mamaearth_Category_Face() {
		PageFactory.initElements(driver, this);
	}
	

	/*** This function will verify Face category page is loaded properly? Content are coming correctly. 
	 * All links on a page are working. Banners are loaded properly
	 * 
	 * ***/
	public boolean verfiy_Face_category_page() throws IOException {
		
		log.info("***************    Verifying the presence of a mamaearth logo    *****************");
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		log.info("Presence of a mamaearth logo is verified");
		
		log.info("***************    Verifying the presence of a GI logo    *****************");
		boolean GILogo = GI_button.isDisplayed();
		log.info("Presence of a GI logo is verified");
		
		log.info("***************    Verifying the title of a page    *****************");
		boolean titleFlag = true;
		String title = Face_page_header.getText();
		if(!title.equals("Best Skin Care Products")) titleFlag = false;
		
//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
//		boolean brokenCountFlag = true;
//		if(brokenLinkCount > 50) {
//			brokenCountFlag = false;
//		}

		if(mamaearthLogo && GILogo && titleFlag) return true;
		else return false;
	}

	
	
	/*** This function will return the reference of the Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body click_on_Body_cateogry() {
		log.info("***************    Opening Body cateogry page    *****************");
		Body_category_button.click();
		return new mamaearth_Category_Body();
	}


}
