package com.mamaearth.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_Category_Beauty;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_FacialKits;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_Fragrance;
import com.mamaearth.PageObject.mamaearth_Category_Body;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodyLotion;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodyScrub;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodySoap;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodyWash;
import com.mamaearth.PageObject.mamaearth_Category_Body_HandCream;
import com.mamaearth.PageObject.mamaearth_Category_Body_UnderarmCream;
import com.mamaearth.PageObject.mamaearth_Category_Face;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceCream;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceGel;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceMask;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceMoisturizer;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceScrub;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceSerum;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceSheetMask;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceToner;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceWash;
import com.mamaearth.PageObject.mamaearth_Category_Hair;
import com.mamaearth.PageObject.mamaearth_Category_Hair_Conditioner;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairMask;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairOil;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairOilBooster;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairSerum;
import com.mamaearth.PageObject.mamaearth_Category_Hair_Shampoo;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_AppleCiderVinegar;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Aqua;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Argan;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Bhringmla;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Charcoal;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Coco;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_GreenTea;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Henna;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_HoneyMalai;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Onion;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Retinol;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Rice;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_TeaTree;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Ubtan;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_VitaminC;
import com.mamaearth.PageObject.mamaearth_Category_Makeup;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Compact;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Concealer;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Foundation;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Kajal;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_LipBalm;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Lipsticks;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyBath;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyBodyLotion;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyOil;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyOralcare;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyShampoo;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabySkin;
import com.mamaearth.PageObject.StaticPages.mamaearth_AboutUs;
import com.mamaearth.PageObject.StaticPages.mamaearth_ContactUs;
import com.mamaearth.PageObject.StaticPages.mamaearth_PrivacyPolicy;
import com.mamaearth.PageObject.StaticPages.mamaearth_Returns;
import com.mamaearth.PageObject.StaticPages.mamaearth_Sitemap;
import com.mamaearth.PageObject.StaticPages.mamaearth_TermsAndConditions;
import com.mamaearth.PageObject.StaticPages.mamaearth_TermsAndConditions_Cashback;
import com.mamaearth.PageObject.StaticPages.mamaearth_TrackOrder;
import com.mamaearth.PageObject.StaticPages.mamaearth_WeAreSafe;

public class mamaearth_utils_CategoriesFunctions extends mamaearth_Base{
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Beauty')]")
	WebElement beauty_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Fragrance')]")
	WebElement Beauty_Fragrance_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Facial Kits')]")
	WebElement Beauty_FacialKits_category_button;
	
	
	
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Hair')]")
	WebElement hair_category_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Shampoo')]//parent::div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair')]//following-sibling::a[contains(text(), 'Shampoo')]")
	WebElement Hair_Shampoo_category_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Shampoo')]//parent::div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair')]//following-sibling::a[contains(text(), 'Conditioner')]")
	WebElement Hair_Conditioner_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair Mask')]//preceding-sibling::a[contains(text(), 'Hair Oil')]")
	WebElement Hair_HairOil_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair Mask')]")
	WebElement Hair_HairMask_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair Serum')]")
	WebElement Hair_HairSerum_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//child::a[contains(text(), 'Hair Mask')]//following-sibling::a[contains(text(), 'Hair Oil')]")
	WebElement Hair_HairOilBooster_category_button;
	
	
	
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Face')]")
	WebElement face_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Wash')]")
	WebElement Face_FaceWash_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Mask')]")
	WebElement Face_FaceMask_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Cream')]")
	WebElement Face_FaceCream_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Serum')]")
	WebElement Face_FaceSerum_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Scrub')]")
	WebElement Face_FaceScrub_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Toner')]")
	WebElement Face_FaceToner_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Gel')]")
	WebElement Face_FaceGel_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Sheet Mask')]")
	WebElement Face_FaceSheetMask_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown__StyledCategory-sc-iwzze0-0 dZoFQj']//following-sibling::a[contains(text(),'Face Moisturizer')]")
	WebElement Face_FaceMoisturizer_category_button;
	
	
	
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Body')]")
	WebElement Body_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Underarm Cream')]//preceding-sibling::a[contains(text(),'Body Lotion')]")
	WebElement Body_BodyLotion_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Underarm Cream')]")
	WebElement Body_UnderarmCream_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Body Scrub')]")
	WebElement Body_BodyScrub_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Hand Cream')]")
	WebElement Body_HandCream_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Body Wash')]")
	WebElement Body_BodyWash_category_button;

	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Body Soap')]")
	WebElement Body_BodySoap_category_button;

	
	
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Makeup')]")
	WebElement Makeup_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Lipsticks')]")
	WebElement Makeup_Lipsticks_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Lip Balm')]")
	WebElement Makeup_LipBalm_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Foundation')]")
	WebElement Makeup_Foundation_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Kajal')]")
	WebElement Makeup_Kajal_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Compact')]")
	WebElement Makeup_Compact_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Concealer')]")
	WebElement Makeup_Concealer_category_button;
	
	
	
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Ingredient')]")
	WebElement Ingredient_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Onion')]")
	WebElement Ingredient_Onion_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Henna')]")
	WebElement Ingredient_Henna_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Rice')]")
	WebElement Ingredient_Rice_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Ubtan')]")
	WebElement Ingredient_Ubtan_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Vitamin C')]")
	WebElement Ingredient_VitaminC_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Green Tea')]")
	WebElement Ingredient_GreenTea_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Tea Tree')]")
	WebElement Ingredient_TeaTree_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Aqua')]")
	WebElement Ingredient_Aqua_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Bhringmla')]")
	WebElement Ingredient_Bhringmla_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Charcoal')]")
	WebElement Ingredient_Charcoal_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Coco')]")
	WebElement Ingredient_Coco_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Argan')]")
	WebElement Ingredient_Argan_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Apple cider Vinegar')]")
	WebElement Ingredient_AppleCiderVinegar_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Retinol')]")
	WebElement Ingredient_Retinol_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Honey Malai')]")
	WebElement Ingredient_HoneyMalai_category_button;
	
	
	
	
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Baby')]")
	WebElement Baby_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(),'Baby Shampoo')]")
	WebElement Baby_BabyShampoo_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Baby Oralcare')]")
	WebElement Baby_BabyOralcare_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Baby Oil')]")
	WebElement Baby_BabyOil_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Baby Skin')]")
	WebElement Baby_BabySkin_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Baby Bath')]")
	WebElement Baby_BabyBath_category_button;
	
	@FindBy(xpath = "//div[@class='MegaDropdown-sc-iwzze0-1 dloynJ mega-dropdown']//child::a[contains(text(), 'Baby Body Lotion')]")
	WebElement Baby_BabyBodyLotion_category_button;
	
	
	
	
	
	@FindBy(xpath = "//a[contains(text(), 'Privacy Policy')]")
	WebElement PrivacyPolicy_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Returns')]")
	WebElement Returns_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Privacy Policy')]//following::a[contains(text(), 'Terms & Conditions')][1]")
	WebElement TermsAndConditions_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Terms & Conditions- Cashback')]")
	WebElement TermsAndConditionsCashback_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'FAQs')]")
	WebElement FAQs_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'We’re Safe')]")
	WebElement WeAreSafe_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Track Order')]")
	WebElement TrackOrder_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'We’re Safe')]/following::a[contains(text(), 'Contact Us')]")
	WebElement ContactUS_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Sitemap')]")
	WebElement Sitemap_StaticPage_button;
	
	@FindBy(xpath = "//a[contains(text(), 'About Us')]")
	WebElement aboutUS_StaticPage_button;
	
	
	
	
	
	
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
	
	/*** This function will return the Body Lotion category of Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body_BodyLotion click_on_Body_BodyLotion_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Body_category_button);
		Body_BodyLotion_category_button.click();
		return new mamaearth_Category_Body_BodyLotion();
	}
	
	/*** This function will return the Body underarm cream category of Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body_UnderarmCream click_on_Body_UnderarmCream_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Body_category_button);
		Body_UnderarmCream_category_button.click();
		return new mamaearth_Category_Body_UnderarmCream();
	}
	
	/*** This function will return the Body Scrub category of Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body_BodyScrub click_on_Body_BodyScrub_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Body_category_button);
		Body_BodyScrub_category_button.click();
		return new mamaearth_Category_Body_BodyScrub();
	}
	
	/*** This function will return the Body Hand Cream category of Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body_HandCream click_on_Body_HandCream_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Body_category_button);
		Body_HandCream_category_button.click();
		return new mamaearth_Category_Body_HandCream();
	}
	
	/*** This function will return the Body Wash category of Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body_BodyWash click_on_Body_BodyWash_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Body_category_button);
		Body_BodyWash_category_button.click();
		return new mamaearth_Category_Body_BodyWash();
	}
	
	/*** This function will return the Body Soap category of Body category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Body_BodySoap click_on_Body_BodySoap_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Body_category_button);
		Body_BodySoap_category_button.click();
		return new mamaearth_Category_Body_BodySoap();
	}
	
	
	
	
	
	
	
	
	

	/*** This function will return the reference of the Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup click_on_Makeup_cateogry() {
		Makeup_category_button.click();
		return new mamaearth_Category_Makeup();
	}

	/*** This function will return the Makeup Lipsticks category of Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup_Lipsticks click_on_Makeup_Lipsticks_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Makeup_category_button);
		Makeup_Lipsticks_category_button.click();
		return new mamaearth_Category_Makeup_Lipsticks();
	}
	
	/*** This function will return the Makeup Lip Balm category of Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup_LipBalm click_on_Makeup_LipBalm_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Makeup_category_button);
		Makeup_LipBalm_category_button.click();
		return new mamaearth_Category_Makeup_LipBalm();
	}
	
	/*** This function will return the Makeup Foundation category of Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup_Foundation click_on_Makeup_Foundation_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Makeup_category_button);
		Makeup_Foundation_category_button.click();
		return new mamaearth_Category_Makeup_Foundation();
	}
	
	/*** This function will return the Makeup Kajal category of Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup_Kajal click_on_Makeup_Kajal_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Makeup_category_button);
		Makeup_Kajal_category_button.click();
		return new mamaearth_Category_Makeup_Kajal();
	}
	
	/*** This function will return the Makeup Compact category of Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup_Compact click_on_Makeup_Compact_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Makeup_category_button);
		Makeup_Compact_category_button.click();
		return new mamaearth_Category_Makeup_Compact();
	}
	
	/*** This function will return the Makeup Concealer category of Makeup category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Makeup_Concealer click_on_Makeup_Concealer_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Makeup_category_button);
		Makeup_Concealer_category_button.click();
		return new mamaearth_Category_Makeup_Concealer();
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
	
	/*** This function will return the reference of the HairShampoo category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_Shampoo click_on_Hair_Shampoo_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_Shampoo_category_button.click();
		return new mamaearth_Category_Hair_Shampoo();
	}
	
	/*** This function will return the reference of the Hair Conditioner category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_Conditioner click_on_Hair_Conditioner_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_Conditioner_category_button.click();
		return new mamaearth_Category_Hair_Conditioner();
	}
	
	/*** This function will return the reference of the Hair Oil category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_HairOil click_on_Hair_HairOil_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_HairOil_category_button.click();
		return new mamaearth_Category_Hair_HairOil();
	}
	
	/*** This function will return the reference of the Hair Mask category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_HairMask click_on_Hair_HairMask_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_HairMask_category_button.click();
		return new mamaearth_Category_Hair_HairMask();
	}
	
	/*** This function will return the reference of the Hair Serum category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_HairSerum click_on_Hair_HairSerum_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_HairSerum_category_button.click();
		return new mamaearth_Category_Hair_HairSerum();
	}
	
	/*** This function will return the reference of the Hair Oil Booster category of Hair category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair_HairOilBooster click_on_Hair_HairOilBooster_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(hair_category_button);
		Hair_HairOilBooster_category_button.click();
		return new mamaearth_Category_Hair_HairOilBooster();
	}
	
	/*** This function will return the reference of the Face Wash category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceWash click_on_Face_FaceWash_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceWash_category_button.click();
		return new mamaearth_Category_Face_FaceWash();
	}
	
	/*** This function will return the reference of the Face Mask category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceMask click_on_Face_FaceMask_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceMask_category_button.click();
		return new mamaearth_Category_Face_FaceMask();
	}
	
	/*** This function will return the reference of the Face Cream category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceCream click_on_Face_FaceCream_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceCream_category_button.click();
		return new mamaearth_Category_Face_FaceCream();
	}
	
	/*** This function will return the reference of the Face Cream category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceSerum click_on_Face_FaceSerum_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceSerum_category_button.click();
		return new mamaearth_Category_Face_FaceSerum();
	}
	
	/*** This function will return the reference of the Face Scrub category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceScrub click_on_Face_FaceScrub_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceScrub_category_button.click();
		return new mamaearth_Category_Face_FaceScrub();
	}
	
	/*** This function will return the reference of the Face Toner category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceToner click_on_Face_FaceToner_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceToner_category_button.click();
		return new mamaearth_Category_Face_FaceToner();
	}
	
	/*** This function will return the reference of the Face Gel category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceGel click_on_Face_FaceGel_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceGel_category_button.click();
		return new mamaearth_Category_Face_FaceGel();
	}
	
	/*** This function will return the reference of the Face Sheet Mask category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceSheetMask click_on_Face_FaceSheetMask_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceSheetMask_category_button.click();
		return new mamaearth_Category_Face_FaceSheetMask();
	}
	
	/*** This function will return the reference of the Face Moisturizer category of Face category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Face_FaceMoisturizer click_on_Face_FaceMoisturizer_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(face_category_button);
		Face_FaceMoisturizer_category_button.click();
		return new mamaearth_Category_Face_FaceMoisturizer();
	}
	
	
	
	
	
	
	
	
	
	/*** This function will return the reference of the Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient click_on_Ingredient_cateogry() {
		Ingredient_category_button.click();
		return new mamaearth_Category_Ingredient();
	}
	
	/*** This function will return the Ingredient Onion category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Onion click_on_Ingredient_Onion_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Onion_category_button.click();
		return new mamaearth_Category_Ingredient_Onion();
	}
	
	/*** This function will return the Ingredient Henna category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Henna click_on_Ingredient_Henna_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Henna_category_button.click();
		return new mamaearth_Category_Ingredient_Henna();
	}
	
	/*** This function will return the Ingredient Rice category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Rice click_on_Ingredient_Rice_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Rice_category_button.click();
		return new mamaearth_Category_Ingredient_Rice();
	}
	
	/*** This function will return the Ingredient Ubtan category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Ubtan click_on_Ingredient_Ubtan_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Ubtan_category_button.click();
		return new mamaearth_Category_Ingredient_Ubtan();
	}
	
	/*** This function will return the Ingredient Vitamin C category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_VitaminC click_on_Ingredient_VitaminC_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_VitaminC_category_button.click();
		return new mamaearth_Category_Ingredient_VitaminC();
	}
	
	/*** This function will return the Ingredient GreenTea category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_GreenTea click_on_Ingredient_GreenTea_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_GreenTea_category_button.click();
		return new mamaearth_Category_Ingredient_GreenTea();
	}
	
	/*** This function will return the Ingredient TeaTree category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_TeaTree click_on_Ingredient_TeaTree_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_TeaTree_category_button.click();
		return new mamaearth_Category_Ingredient_TeaTree();
	}
	
	/*** This function will return the Ingredient Aqua category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Aqua click_on_Ingredient_Aqau_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Aqua_category_button.click();
		return new mamaearth_Category_Ingredient_Aqua();
	}
	
	/*** This function will return the Ingredient Bhringmla category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Bhringmla click_on_Ingredient_Bhringmla_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Bhringmla_category_button.click();
		return new mamaearth_Category_Ingredient_Bhringmla();
	}
	
	/*** This function will return the Ingredient Charcoal category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Charcoal click_on_Ingredient_Charcoal_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Charcoal_category_button.click();
		return new mamaearth_Category_Ingredient_Charcoal();
	}
	
	/*** This function will return the Ingredient Coco category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Coco click_on_Ingredient_Coco_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Coco_category_button.click();
		return new mamaearth_Category_Ingredient_Coco();
	}

	/*** This function will return the Ingredient Argan category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Argan click_on_Ingredient_Argan_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Argan_category_button.click();
		return new mamaearth_Category_Ingredient_Argan();
	}

	/*** This function will return the Ingredient Apple cider Vinegar category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_AppleCiderVinegar click_on_Ingredient_AppleCiderVinegar_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_AppleCiderVinegar_category_button.click();
		return new mamaearth_Category_Ingredient_AppleCiderVinegar();
	}
	
	/*** This function will return the Ingredient Retinol category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_Retinol click_on_Ingredient_Retinol_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_Retinol_category_button.click();
		return new mamaearth_Category_Ingredient_Retinol();
	}
	
	/*** This function will return the Ingredient HoneyMalai category of Ingredient category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Ingredient_HoneyMalai click_on_Ingredient_HoneyMalai_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Ingredient_category_button);
		Ingredient_HoneyMalai_category_button.click();
		return new mamaearth_Category_Ingredient_HoneyMalai();
	}
	
	
	
	
	
	
	
	
	/*** This function will return the reference of the Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby click_on_Baby_cateogry() {
		Baby_category_button.click();
		return new mamaearth_Category_Baby();
	}
	
	/*** This function will return the Baby Shampoo category of Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby_BabyShampoo click_on_Baby_BabyShampoo_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Baby_category_button);
		Baby_BabyShampoo_category_button.click();
		return new mamaearth_Category_Baby_BabyShampoo();
	}
	
	/*** This function will return the Baby Oralcare category of Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby_BabyOralcare click_on_Baby_BabyOralcare_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Baby_category_button);
		Baby_BabyOralcare_category_button.click();
		return new mamaearth_Category_Baby_BabyOralcare();
	}
	
	/*** This function will return the Baby Oil category of Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby_BabyOil click_on_Baby_BabyOil_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Baby_category_button);
		Baby_BabyOil_category_button.click();
		return new mamaearth_Category_Baby_BabyOil();
	}
	
	/*** This function will return the Baby Skin category of Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby_BabySkin click_on_Baby_BabySkin_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Baby_category_button);
		Baby_BabySkin_category_button.click();
		return new mamaearth_Category_Baby_BabySkin();
	}
	
	/*** This function will return the Baby Bath category of Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby_BabyBath click_on_Baby_BabyBath_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Baby_category_button);
		Baby_BabyBath_category_button.click();
		return new mamaearth_Category_Baby_BabyBath();
	}
	
	/*** This function will return the Baby Body Lotion category of Baby category page class
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Baby_BabyBodyLotion click_on_Baby_BabyBodyLotion_cateogry() {
		mamaearth_utils_ActionFunction.move_cursor_to_element(Baby_category_button);
		Baby_BabyBodyLotion_category_button.click();
		return new mamaearth_Category_Baby_BabyBodyLotion();
	}
	
	
	
	
	
	
	
	
	
	
	/*** This function will return the Privacy Policy Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_PrivacyPolicy click_on_StaticPage_PrivacyPolicy_cateogry() {
		PrivacyPolicy_StaticPage_button.click();
		return new mamaearth_PrivacyPolicy();
	}
	
	/*** This function will return the Returns Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_Returns click_on_StaticPage_Returns_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_Returns();
	}
	
	/*** This function will return the Terms & Conditions Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_AboutUs click_on_StaticPage_TermsAndConditions_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_AboutUs();
	}
	
	/*** This function will return the Terms & Conditions- Cashback Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_TermsAndConditions click_on_StaticPage_TermsAndConditionsAndCashback_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_TermsAndConditions();
	}
	
	/*** This function will return the FAQs Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_TermsAndConditions_Cashback click_on_StaticPage_FAQs_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_TermsAndConditions_Cashback();
	}
	
	/*** This function will return the We’re Safe Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_WeAreSafe click_on_StaticPage_WeAreSafe_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_WeAreSafe();
	}
	
	/*** This function will return the Track Order Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_TrackOrder click_on_StaticPage_TrackOrder_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_TrackOrder();
	}
	
	/*** This function will return the Contact Us Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_ContactUs click_on_StaticPage_ContactUs_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_ContactUs();
	}
	
	/*** This function will return the Sitemap Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_Sitemap click_on_StaticPage_Sitemap_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_Sitemap();
	}
	
	/*** This function will return the About Us Static page 
	 * 
	 * 
	 * ***/
	public mamaearth_AboutUs click_on_StaticPage_AboutUs_cateogry() {
		aboutUS_StaticPage_button.click();
		return new mamaearth_AboutUs();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
