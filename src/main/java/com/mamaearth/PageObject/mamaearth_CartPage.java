package com.mamaearth.PageObject;

import org.openqa.selenium.WebDriver;
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
	
	public mamaearth_HomePage click_on_mamaearth_logo() {
		mamaearth_logo.click();
		return new mamaearth_HomePage();
	}
	
	public mamaearth_CheckoutPage continue_to_checkout() {
		continue_button.click();
		return new mamaearth_CheckoutPage();
	}
	
}
