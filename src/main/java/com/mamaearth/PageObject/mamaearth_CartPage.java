package com.mamaearth.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_CartPage extends mamaearth_Base{
	
	public mamaearth_CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='mamaearth-logo-wrapper']")
	WebElement mamaearth_logo;
	
	@FindBy(xpath = "//button[contains(text(), 'Continue')]")
	WebElement continue_button;
	
	@FindBy(xpath = "//div[contains(@class, 'OrderSummary__CouponTrayStrip-sc-b29dda-0 edRxHm')]")
	WebElement applyCoupon_button;
	
	@FindBy(xpath = "//input[contains(@class, 'CouponTrayVariant__StyledInput-sc-1hws438-0 jfrbVq')]")
	WebElement coupon_button;
	
	@FindBy(xpath = "//input[contains(@class, 'CouponTrayVariant__StyledInput-sc-1hws438-0 jfrbVq')]//following-sibling::div")
	WebElement apply_button;
	
	public mamaearth_HomePage click_on_mamaearth_logo() {
		mamaearth_logo.click();
		return new mamaearth_HomePage();
	}
	
	public void click_on_applyCoupon() {
		applyCoupon_button.click();
	}
	
	public void apply_coupon() {
		coupon_button.click();
		coupon_button.sendKeys("REDEEM15");
		apply_button.click();
	}
	
	public mamaearth_CheckoutPage continue_to_checkout() {
		continue_button.click();
		return new mamaearth_CheckoutPage();
	}
	
}
