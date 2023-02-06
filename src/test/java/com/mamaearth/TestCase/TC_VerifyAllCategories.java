package com.mamaearth.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_Category_AllProducts;
import com.mamaearth.PageObject.mamaearth_Category_Baby;
import com.mamaearth.PageObject.mamaearth_Category_Beauty;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_FacialKits;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_Fragrance;
import com.mamaearth.PageObject.mamaearth_Category_Blog;
import com.mamaearth.PageObject.mamaearth_Category_Body;
import com.mamaearth.PageObject.mamaearth_Category_Face;
import com.mamaearth.PageObject.mamaearth_Category_GiftPacks;
import com.mamaearth.PageObject.mamaearth_Category_GoodnessInsider;
import com.mamaearth.PageObject.mamaearth_Category_Hair;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient;
import com.mamaearth.PageObject.mamaearth_Category_Makeup;
import com.mamaearth.PageObject.mamaearth_Category_PlantGoodness;
import com.mamaearth.PageObject.mamaearth_Category_StoreLocator;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class TC_VerifyAllCategories extends mamaearth_Base{
	
	mamaearth_HomePage home;
	mamaearth_Category_Hair hair;
	mamaearth_Category_Beauty beauty;
	mamaearth_Category_Face face;
	mamaearth_Category_Body body;
	mamaearth_Category_Makeup makeup;
	mamaearth_Category_Ingredient ingredient;
	mamaearth_Category_Baby baby;
	mamaearth_Category_GiftPacks giftPacks;
	mamaearth_Category_AllProducts allProducts;
	mamaearth_Category_Blog blog;
	mamaearth_Category_PlantGoodness plantGoodness;
	mamaearth_Category_StoreLocator storeLocator;
	mamaearth_Category_GoodnessInsider goodnessInsider;
	mamaearth_utils_CategoriesFunctions cf;
	mamaearth_Category_Beauty_Fragrance fragrance;
	mamaearth_Category_Beauty_FacialKits facialKits;
	
	
	@BeforeClass
	public void setup() throws InterruptedException {
		initialization();
		home = new mamaearth_HomePage();
	}
	
	@Test(priority = -1)
	public void Test_mamaearth_launching() throws IOException {
		boolean response = home.verfiy_homePageContent();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 0)
	public void Test_mamaearth_category_Beauty_launching() throws IOException {
		cf = home.categoriesRefrence();
		beauty = cf.click_on_Beauty_cateogry();
		boolean response = beauty.verfiy_Beauty_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 1)
	public void Test_mamaearth_category_Fragrance_launching() throws IOException, InterruptedException {
		cf = beauty.categoriesRefrence();
		fragrance = cf.click_on_Beauty_Fragrance_cateogry();
		Assert.assertTrue(fragrance.verfiy_Beauty_Fragrance_category_page());
	}
	
	@Test(priority = 2)
	public void Test_mamaearth_category_FacialKits_launching() throws IOException, InterruptedException {
		cf = beauty.categoriesRefrence();
		facialKits = cf.click_on_Beauty_FacialKits_cateogry();
		Thread.sleep(3000);
		Assert.assertTrue(facialKits.verfiy_Beauty_FacialKits_category_page());
	}
	
	
	@Test(priority = 3)
	public void Test_mamaearth_category_Hair_launching() throws IOException {
		cf = facialKits.categoriesRefrence();
		hair = cf.click_on_Hair_cateogry();
		boolean response = hair.verfiy_Hair_category_page();
		cf = hair.categoriesRefrence();
		Assert.assertTrue(response);
	}
	
	
	@Test(priority = 4)
	public void Test_mamaearth_category_Face_launching() throws IOException {
		cf = beauty.categoriesRefrence();
		face = cf.click_on_Face_cateogry();
		boolean response = face.verfiy_Face_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 5)
	public void Test_mamaearth_category_Body_launching() throws IOException {
		cf = face.categoriesRefrence();
		body = cf.click_on_Body_cateogry();
		boolean response = body.verfiy_Body_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 6)
	public void Test_mamaearth_category_Makeup_launching() throws IOException {
		cf = body.categoriesRefrence();
		makeup = cf.click_on_Makeup_cateogry();
		boolean response = makeup.verfiy_Makeup_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 7)
	public void Test_mamaearth_category_Ingredient_launching() throws IOException {
		ingredient = makeup.click_on_Ingredient_cateogry();
		boolean response = ingredient.verfiy_Ingredient_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 8)
	public void Test_mamaearth_category_Baby_launching() throws IOException {
		baby = ingredient.click_on_Baby_cateogry();
		boolean response = baby.verfiy_Baby_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 9)
	public void Test_mamaearth_category_GiftPacks_launching() throws IOException {
		giftPacks = baby.click_on_GiftPacks_cateogry();
		boolean response = giftPacks.verfiy_GiftPacks_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 10)
	public void Test_mamaearth_category_AllProducts_launching() throws IOException {
		allProducts = giftPacks.click_on_AllProducts_cateogry();
		boolean response = allProducts.verfiy_AllProducts_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 11)
	public void Test_mamaearth_category_Blog_launching() throws IOException, InterruptedException {
		blog = allProducts.click_on_Blog_cateogry();
		Thread.sleep(3000);
		boolean response = blog.verfiy_Blog_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 12)
	public void Test_mamaearth_category_PlantGoodness_launching() throws IOException, InterruptedException {
		allProducts = blog.back_to_AllProducts_cateogry();
		plantGoodness = allProducts.click_on_PlantGoodness_cateogry();
		boolean response = plantGoodness.verfiy_PlantGoodness_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 13)
	public void Test_mamaearth_category_StoreLocator_launching() throws IOException, InterruptedException {
		storeLocator = plantGoodness.click_on_StoreLocator_cateogry();
		boolean response = storeLocator.verfiy_StoreLocator_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 14)
	public void Test_mamaearth_GoodnessInsider_launching() throws IOException, InterruptedException {
		goodnessInsider = storeLocator.click_on_GoodnessInsider_cateogry();
		boolean response = goodnessInsider.verfiy_GoodnessInsider_page();
		Assert.assertTrue(response);
	}
	
//	@Test(priority = 14)
//	public void Test_mamaearth_category_Makeup_launching() throws IOException, InterruptedException {
//		cf = goodnessInsider.categoriesRefrence();
//		
//		boolean response = goodnessInsider.verfiy_GoodnessInsider_page();
//		Assert.assertTrue(response);
//	}
//	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
