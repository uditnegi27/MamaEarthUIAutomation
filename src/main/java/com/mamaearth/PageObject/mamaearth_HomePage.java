package com.mamaearth.PageObject;

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
	
	@FindBy(xpath = "//div[@class='CartTrigger__Trigger-sc-1dc6mjo-1 jQZcXv cart-trigger']")
	WebElement cart_icon;
	
	@FindBy(xpath = "//input[@class='StyledInput-sc-1m95fu4-0 dQlmoN search-input']")
	WebElement searchBar;
	
	@FindBy(xpath = "//div[@class='price' or @class='price special']")
	WebElement product_price;
	
	@FindBy(xpath = "wzrk-confirm-id")
	WebElement Alerts_popUp;
	
	public void clearAllAlerts() {
		Alerts_popUp.click();
	}

	public boolean verify_presence_of_logo() {
		return mamaearth_logo.isEnabled();
	}
	
	public mamaearth_CartPage click_on_cart_icon() {
		cart_icon.click();
		return new mamaearth_CartPage();
	}
	
	public mamaearth_hair_categoryPage search_category(String cat) {
		searchBar.clear();
		searchBar.sendKeys(cat);
		searchBar.sendKeys(Keys.ENTER);
		return new mamaearth_hair_categoryPage();
	}
	
	public mamaearth_PdpPage open_pdpPage() {
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='slick-slide slick-active']"));
		productList.get(0).click();
		return new mamaearth_PdpPage();
	}
	
	public int maximum_product_price() {
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='price' or @class='price special']"));
		
		int min = 0;
		for(int i=0; i<list.size(); i++) {
			WebElement element = list.get(i);
			String cost = element.getText();
		}
		
		return 0;
	}
	
}
