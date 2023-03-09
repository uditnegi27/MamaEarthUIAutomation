package com.mamaearth.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.Utils.mamaearth_utils_Algolia;

public class TC_SearchingAndAlgolia extends mamaearth_Base{
	
	mamaearth_HomePage home;
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();
		
	}
	
	@Test
	public void TC1() throws  InterruptedException, IOException {
		mamaearth_utils_Algolia.search_product_category(prop.getProperty("search_categoryName"));
		Assert.assertTrue(mamaearth_utils_Algolia.verify_searched_product_category(prop.getProperty("search_categoryName")), "Products are not matching with the searched cateogry:  -->  ");
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
