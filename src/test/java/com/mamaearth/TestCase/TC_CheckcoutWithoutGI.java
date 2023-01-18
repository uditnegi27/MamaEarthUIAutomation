package com.mamaearth.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_CartPage;
import com.mamaearth.PageObject.mamaearth_CheckoutPage;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.PageObject.mamaearth_PdpPage;
import com.mamaearth.PageObject.mamaearth_ThankyouPage;
import com.mamaearth.Utils.mamaearth_utils;


public class TC_CheckcoutWithoutGI extends mamaearth_Base{
	
	mamaearth_HomePage home;
	mamaearth_PdpPage pdp;
	mamaearth_CartPage cart;
	mamaearth_CheckoutPage checkout;
	mamaearth_ThankyouPage thankyou;

	TC_CheckcoutWithoutGI() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		home = new mamaearth_HomePage();
		pdp = home.open_pdpPage();
		pdp.add_product_to_cart();
		cart = pdp.click_on_cart();
		checkout = cart.continue_to_checkout();
	}
	
	@Test(dataProvider = "fill_address_details")
	public void TC_001(String fName, String lName, String email, String number, String postalCode, String address) throws InterruptedException, IOException {
		
		checkout.fill_address_details(fName, lName, email, number, postalCode, address);
		checkout.select_COD();
		thankyou = checkout.payWithCOD();
		mamaearth_utils.take_screenShot(lName);
//		mamaearth_utils.print_all_broken_links();
		
	}
	
	@DataProvider
	public Object[][] fill_address_details() throws IOException {
		Object[][] data = mamaearth_utils.address_details("details");
		return data;
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
