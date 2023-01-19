package com.mamaearth.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_Category_Beauty;
import com.mamaearth.PageObject.mamaearth_Category_Body;
import com.mamaearth.PageObject.mamaearth_Category_Face;
import com.mamaearth.PageObject.mamaearth_Category_Hair;
import com.mamaearth.PageObject.mamaearth_HomePage;

public class TC_VerifyAllCategories extends mamaearth_Base{
	
	mamaearth_HomePage home;
	mamaearth_Category_Hair hair;
	mamaearth_Category_Beauty beauty;
	mamaearth_Category_Face face;
	mamaearth_Category_Body body;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		home = new mamaearth_HomePage();
	}
	
	
	@Test(priority = 1)
	public void Test_mamaearth_launching() throws IOException {
		boolean response = home.verfiy_homePageContent();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 2)
	public void Test_mamaearth__category_Hair_launching() throws IOException {
		hair = home.click_on_Hair_cateogry();
		boolean response = hair.verfiy_Hair_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 3)
	public void Test_mamaearth__category_Beauty_launching() throws IOException {
		beauty = hair.click_on_Beauty_cateogry();
		boolean response = beauty.verfiy_Beauty_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 4)
	public void Test_mamaearth__category_Face_launching() throws IOException {
		face = beauty.click_on_Face_cateogry();
		boolean response = face.verfiy_Face_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 5)
	public void Test_mamaearth__category_Body_launching() throws IOException {
		body = face.click_on_Body_cateogry();
		boolean response = body.verfiy_Body_category_page();
		Assert.assertTrue(response);
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
