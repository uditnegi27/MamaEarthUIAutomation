package com.mamaearth.PageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_HomePage extends mamaearth_Base{
	
	public mamaearth_HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath = "//li[@class='category']/child::a[contains(text(),'Hair')]")
	WebElement hair_category_button;
	
	@FindBy(xpath = "//div[@class='CartTrigger__Trigger-sc-1dc6mjo-1 jQZcXv cart-trigger']")
	WebElement cart_icon;
	
	@FindBy(xpath = "//input[@class='StyledInput-sc-1m95fu4-0 dQlmoN search-input']")
	WebElement searchBar;
	
	@FindBy(xpath = "//div[@class='price' or @class='price special']")
	WebElement product_price;
	
	@FindBy(xpath = "wzrk-confirm-id")
	WebElement Alerts_popUp;
	
	@FindBy(xpath="//div[@class='ShortSearchBar']//following-sibling::img")
	WebElement GI_button;
	
		
	public void clearAllAlerts() {
		Alerts_popUp.click();
	}

	public boolean verify_presence_of_logo() {
		return mamaearth_logo.isDisplayed();
	}
	
	
	public boolean verfiy_homePageContent() throws IOException {
		
		boolean mamaearthLogo = mamaearth_logo.isDisplayed();
		boolean GILogo = GI_button.isDisplayed();
		
//		int brokenLinkCount = mamaearth_utils_BrokenLinksFinder.get_count_of_brokenLinks();
//		boolean brokenCountFlag = true;
//		if(brokenLinkCount > 50) {
//			brokenCountFlag = false;
//		}
		
		if(mamaearthLogo && GILogo) return true;
		else return false;
	}
	
	public mamaearth_CartPage click_on_cart_icon() {
		cart_icon.click();
		return new mamaearth_CartPage();
	}
	
	
	/*** This function will return the new reference of a Hair Category page
	 * 
	 * 
	 * ***/
	public mamaearth_Category_Hair click_on_Hair_cateogry() {
		hair_category_button.click();
		return new mamaearth_Category_Hair();
	}
	
	
	public mamaearth_Category_Hair search_category(String cat) {
		searchBar.clear();
		searchBar.sendKeys(cat);
		searchBar.sendKeys(Keys.ENTER);
		return new mamaearth_Category_Hair();
	}
	
	public mamaearth_PdpPage open_pdpPage() throws InterruptedException {
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='slick-slide slick-active']"));
		productList.get(0).click();
		Thread.sleep(3000);
		return new mamaearth_PdpPage();
	}
	
//	public int maximum_product_price() {
//		List<WebElement> list = driver.findElements(By.xpath("//div[@class='price' or @class='price special']"));
//		
//		int min = 0;
//		for(int i=0; i<list.size(); i++) {
//			WebElement element = list.get(i);
//			String cost = element.getText();
//		}
//		
//		return 0;
//	}
//	
}
