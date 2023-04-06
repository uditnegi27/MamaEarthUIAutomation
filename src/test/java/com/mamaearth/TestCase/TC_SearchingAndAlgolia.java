package com.mamaearth.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.Utils.mamaearth_utils;
import com.mamaearth.Utils.mamaearth_utils_Algolia;

public class TC_SearchingAndAlgolia extends mamaearth_Base{
	

	@BeforeMethod
	public void setup() {
		initialization();
	}
	
	@Test
	public void Test_mamaearth_Search_ProductSearch() {
		mamaearth_utils_Algolia.search_product_category(prop.getProperty("search_categoryName"));
		mamaearth_utils.take_screenShot("test");
		Assert.assertTrue(mamaearth_utils_Algolia.verify_searched_product_category(prop.getProperty("search_categoryName")), "Products are not matching with the searched cateogry:  -->  ");
		
	}
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
