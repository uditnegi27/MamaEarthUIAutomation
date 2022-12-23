package com.mamaearth.TestCase;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_CartPage;
import com.mamaearth.PageObject.mamaearth_HomePage;

public class TC_LaunchingTest_0001 extends mamaearth_Base{
	
	mamaearth_HomePage home;
	mamaearth_CartPage cart;
	
	TC_LaunchingTest_0001(){
		super();
	}
	
	Logger log = Logger.getLogger(TC_LaunchingTest_0001.class);
	
	@BeforeClass
	public void setup() {
		log.info("launching");
		initialization();
		home = new mamaearth_HomePage();
	}
	
//	@Test
//	public void TC_0001() {
//		home.verify_presence_of_logo();
//	}
	
	@Test
	public void TC_0002() {
		log.info("validation");
		cart = home.click_on_cart_icon();
	}
	
	@Test
	public void TC_0003() {
		home = cart.click_on_mamaearth_logo();
	}
	
	@Test
	public void TC_0004() {
		home.verify_presence_of_logo();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
