package com.mamaearth.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_CheckoutPage extends mamaearth_Base{
	
	public mamaearth_CheckoutPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstname")
	WebElement first_name_input;
	
	@FindBy(name = "lastname")
	WebElement last_name_input;
	
	@FindBy(name = "email")
	WebElement email_input;
	
	@FindBy(name = "telephone")
	WebElement phoneNumber_input;
	
	@FindBy(name = "postcode")
	WebElement postalCode_input;
	
	@FindBy(name = "street")
	WebElement address_input;
	
	@FindBy(name = "payOnDelivery")
	WebElement cod_payment;
	
	@FindBy(xpath = "//button[contains(@class, 'tablinks')]")
	WebElement sdsds;
	
	public void fill_address_details(String fName, String lName, String email, String number, String postalCode, String address) {
		first_name_input.sendKeys(fName);
		last_name_input.sendKeys(lName);
		email_input.sendKeys(email);
		phoneNumber_input.sendKeys(number);
		postalCode_input.sendKeys(postalCode);
		address_input.sendKeys(address);
		
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void select_COD() {
		List<WebElement> PaymentOptionsList = driver.findElements(By.xpath("//button[contains(@class, 'tablinks')]"));
		PaymentOptionsList.get(4).click();
		try {
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public mamaearth_ThankyouPage payWithCOD() {
		cod_payment.click();
		
		try {
			Thread.sleep(8000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		return new mamaearth_ThankyouPage();
	}
}
