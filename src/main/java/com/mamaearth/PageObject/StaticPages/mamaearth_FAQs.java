package com.mamaearth.PageObject.StaticPages;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_FAQs extends mamaearth_utils_CategoriesFunctions{
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
	
	public mamaearth_FAQs() {
		PageFactory.initElements(driver, this);
	}
	
	/*** This function will verify FAQs page under Static category page is loaded properly? Content are coming correctly? 
	 * All links on a page are working? Banners are loaded properly? etc..
	 * 
	 * 
	 * ***/
	public boolean verfiy_FAQs_StaticCategory_page() {
			
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
		if(mamaearthLogo && GILogo) return true;
		else return false;
	}
	
	public boolean verify_AllQuestionsAnswer() {
		ArrayList<WebElement> array = (ArrayList<WebElement>) driver.findElements(By.xpath("//ol[contains(@class, 'AccordionItem__Wrapper-sc-ilgiiy-1 eLDVvL')]/div[@class='title']"));
		Iterator<WebElement> itr = array.iterator();
		boolean flag = true;
		while(itr.hasNext()) {
			if(!itr.next().isEnabled()) {
				flag = false;
				break;
			}
		}
		
		if(flag) return true;
		else return false;
	}
	
}
