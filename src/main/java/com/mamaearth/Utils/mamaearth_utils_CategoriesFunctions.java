package com.mamaearth.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_Category_Beauty;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_FacialKits;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_Fragrance;
import com.mamaearth.PageObject.mamaearth_Category_Body;
import com.mamaearth.PageObject.mamaearth_Category_Face;
import com.mamaearth.PageObject.mamaearth_Category_Hair;
import com.mamaearth.PageObject.mamaearth_Category_Hair_Shampoo;
import com.mamaearth.PageObject.mamaearth_Category_Makeup;

public class mamaearth_utils_CategoriesFunctions extends mamaearth_Base{
	

	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Beauty')]")
	WebElement beauty_category_button;
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Hair')]")
	WebElement hair_category_button;
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Face')]")
	WebElement face_category_button;
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Body')]")
	WebElement Body_category_button;

	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Makeup')]")
	WebElement Makeup_category_button;
	
	@FindBy(xpath = "//a[contains(text(),'Fragrance')]")
	WebElement Beauty_Fragrance_category_button;
	
	@FindBy(xpath = "//a[contains(text(),'Facial Kits')]")
	WebElement Beauty_FacialKits_category_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Shampoo')]//parent::div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair')]//following-sibling::a[contains(text(), 'Shampoo')]")
	WebElement Hair_Shampoo_category_button;
	
	
	public mamaearth_utils_CategoriesFunctions() {
		PageFactory.initElements(driver, this);
	}
	
	/*** This function will return the new reference of a Beauty Category page
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Beauty click_on_Beauty_cateogry() {
		beauty_category_button.click();
		return new mamaearth_Category_Beauty();
	}
	

	/*** This function will return the new reference of a Hair Category page
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair click_on_Hair_cateogry() {
		hair_category_button.click();
		return new mamaearth_Category_Hair();
	}
	
	
	/*** This function will return the reference of the face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face click_on_Face_cateogry() {
		face_category_button.click();
		return new mamaearth_Category_Face();
	}
	
	
	/*** This function will return the reference of the Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body click_on_Body_cateogry() {
		Body_category_button.click();
		return new mamaearth_Category_Body();
	}
	

	/*** This function will return the reference of the Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup click_on_Makeup_cateogry() {
		Makeup_category_button.click();
		return new mamaearth_Category_Makeup();
	}

	
	/*** This function will return the reference of the Fragrance category of Beauty category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Beauty_Fragrance click_on_Beauty_Fragrance_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(beauty_category_button);
		Beauty_Fragrance_category_button.click();
		return new mamaearth_Category_Beauty_Fragrance();
	}
	
	
	/*** This function will return the reference of the Facial Kits category of Beauty category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Beauty_FacialKits click_on_Beauty_FacialKits_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(beauty_category_button);
		Beauty_FacialKits_category_button.click();
		return new mamaearth_Category_Beauty_FacialKits();
	}
	
	/*** This function will return the reference of the Shampoo category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_Shampoo click_on_Hair_Shampoo_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_Shampoo_category_button.click();
		return new mamaearth_Category_Hair_Shampoo();
	}

}
