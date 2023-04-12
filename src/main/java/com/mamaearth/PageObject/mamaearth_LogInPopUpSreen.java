package com.mamaearth.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_LogInPopUpSreen extends mamaearth_utils_CategoriesFunctions {
	
	@FindBy(xpath = "//div[contains(text(), 'Log in to get started')]")
	WebElement loginPopUpHeader;
	
	@FindBy(name = "contact")
	WebElement numberInputBox;
	
	@FindBy(xpath = "//div[contains(text(), 'Required')]")
	WebElement requiredNumberErrorMessage;
	
	@FindBy(xpath = "//div[contains(text(), 'Add a 10 digit mobile number')]")
	WebElement lessNumberDigitErrorMessage;
	
	@FindBy(xpath = "//div[contains(text(), 'Phone number is not valid')]")
	WebElement invalidNumberErrorMessage;
	
	@FindBy(xpath = "//a[contains(text(), 'Terms and Conditions')]")
	WebElement termsAndConditionLink;
	
	@FindBy(id = "login_otp")
	WebElement loginWithOtpButton;
	
	@FindBy(id = "continue_guest")
	WebElement continueAsGuestButton;
	
	@FindBy(xpath = "//img[contains(@class, 'close-icon')]")
	WebElement loginPopupCrossIcon;
	
	
	public mamaearth_LogInPopUpSreen() {
		PageFactory.initElements(driver, this);
	}
	

	
	public void click_loginButton_with_empty_number() {
		
		loginWithOtpButton.click();
		String errorMessage = requiredNumberErrorMessage.getText();
		Assert.assertEquals(errorMessage, "Required");
		
	}
	
	
	public void click_loginButton_with_lessThanFixedDigit_number() {
		
		numberInputBox.sendKeys("23456789");
		loginWithOtpButton.click();
		String errorMessage = lessNumberDigitErrorMessage.getText();
		Assert.assertEquals(errorMessage, "Add a 10 digit mobile number");
		
	}
	
	
	public void click_loginButton_with_moreThanFixedDigit_number() {
		
		numberInputBox.sendKeys("985496748576849576");
		loginWithOtpButton.click();
		String errorMessage = lessNumberDigitErrorMessage.getText();
		Assert.assertEquals(errorMessage, "Add a 10 digit mobile number");
		
	}
	
	
	public void click_loginButton_with_invalid_number() {
		
		numberInputBox.sendKeys("2345678909");
		loginWithOtpButton.click();
		String errorMessage = invalidNumberErrorMessage.getText();
		Assert.assertEquals(errorMessage, "Phone number is not valid");
		
	}
	
	
	public void click_loginButton_with_valid_number() {
		
		numberInputBox.sendKeys("9773953566");
		loginWithOtpButton.click();
		
		
	}
}
