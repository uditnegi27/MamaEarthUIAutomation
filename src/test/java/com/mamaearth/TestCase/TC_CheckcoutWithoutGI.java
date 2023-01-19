package com.mamaearth.TestCase;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_CartPage;
import com.mamaearth.PageObject.mamaearth_CheckoutPage;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.PageObject.mamaearth_PdpPage;
import com.mamaearth.PageObject.mamaearth_ThankyouPage;
import com.mamaearth.Utils.mamaearth_utils;
import com.mamaearth.Utils.mamaearth_utils_DataGenerator;


public class TC_CheckcoutWithoutGI extends mamaearth_Base{
	
	mamaearth_HomePage home;
	mamaearth_PdpPage pdp;
	mamaearth_CartPage cart;
	mamaearth_CheckoutPage checkout;
	mamaearth_ThankyouPage thankyou;
	
	
	public Logger log = Logger.getLogger(TC_CheckcoutWithoutGI.class);
	

	TC_CheckcoutWithoutGI() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		log.info("Page initialized");
		home = new mamaearth_HomePage();
		log.info("Home page is opened");
		pdp = home.open_pdpPage();
		log.info("Page is opened");
		pdp.add_product_to_cart();
		log.info("Product added to a cart");
		cart = pdp.click_on_cart();
		log.info("Cart page is opened");
		checkout = cart.continue_to_checkout();
		log.info("Checkout page is opened");
	}
	
	@Test(dataProvider = "fill_address_details")
	public void TC_001(String fName, String lName, String email, String number, String postalCode, String address) throws InterruptedException, IOException {
		
		checkout.fill_address_details(fName, lName, email, number, postalCode, address);
		log.info("Details are filled");
		checkout.select_COD();
		log.info("Payment COD is selected");
		thankyou = checkout.payWithCOD();
		log.info("Payment successful and thankyou page is appeared");
		mamaearth_utils.take_screenShot(lName);
		log.info("Screenshot taken");
		
	}
	
	
	@DataProvider
	public Object[][] fill_address_details() throws IOException {
		Object[][] data = mamaearth_utils_DataGenerator.address_details("details");
		return data;
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
