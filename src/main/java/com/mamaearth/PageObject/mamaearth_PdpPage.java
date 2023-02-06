package com.mamaearth.PageObject;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils;

public class mamaearth_PdpPage extends mamaearth_Base{
	
	public mamaearth_PdpPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[@class='addTocart_pdp']")
	WebElement addToCart_button;
	
	@FindBy(xpath = "//div[contains(text(), 'Cart')]//preceding-sibling::div[@class='CartTrigger__IconContainer-sc-1dc6mjo-0 ccyIBC cart-icon-container']")
	WebElement cart_icon;
	
	public void add_product_to_cart() {
		mamaearth_utils.waitToElementClickable(addToCart_button, Duration.ofSeconds(5));
		addToCart_button.click();
	}
	
	public mamaearth_CartPage click_on_cart() {
		cart_icon.click();
		return new mamaearth_CartPage();
	}

}
