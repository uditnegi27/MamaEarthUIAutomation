package com.mamaearth.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.Utils.mamaearth_utils_Algolia;

public class TC_SearchingAndAlgolia extends mamaearth_Base{
	
	mamaearth_HomePage home;
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		home = new mamaearth_HomePage();
	}
	
	@Test
	public void TC1() throws IOException, InterruptedException {
		mamaearth_utils_Algolia.search_product_category(prop.getProperty("search_categoryName"));
		Assert.assertTrue(mamaearth_utils_Algolia.verify_searched_product_category(prop.getProperty("search_categoryName")), "Products are not matcing with the searched cateogry:  -->  ");
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
