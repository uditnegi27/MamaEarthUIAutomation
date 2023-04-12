package com.mamaearth.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_HomePage;

public class TC_StandaloneGiPurchase extends mamaearth_Base {
	
	mamaearth_HomePage home;
	
	@BeforeMethod
	public void setup() {
		open_Mamaearth_As_Guest();
	}
	
	@Test
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
