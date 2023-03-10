package com.mamaearth.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_Category_AllProducts;
import com.mamaearth.PageObject.mamaearth_Category_Baby;
import com.mamaearth.PageObject.mamaearth_Category_Beauty;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_FacialKits;
import com.mamaearth.PageObject.mamaearth_Category_Beauty_Fragrance;
import com.mamaearth.PageObject.mamaearth_Category_Blog;
import com.mamaearth.PageObject.mamaearth_Category_Body;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodyLotion;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodyScrub;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodySoap;
import com.mamaearth.PageObject.mamaearth_Category_Body_BodyWash;
import com.mamaearth.PageObject.mamaearth_Category_Body_HandCream;
import com.mamaearth.PageObject.mamaearth_Category_Body_UnderarmCream;
import com.mamaearth.PageObject.mamaearth_Category_Face;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceCream;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceGel;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceMask;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceMoisturizer;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceScrub;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceSerum;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceSheetMask;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceToner;
import com.mamaearth.PageObject.mamaearth_Category_Face_FaceWash;
import com.mamaearth.PageObject.mamaearth_Category_GiftPacks;
import com.mamaearth.PageObject.mamaearth_Category_GoodnessInsider;
import com.mamaearth.PageObject.mamaearth_Category_Hair;
import com.mamaearth.PageObject.mamaearth_Category_Hair_Conditioner;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairMask;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairOil;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairOilBooster;
import com.mamaearth.PageObject.mamaearth_Category_Hair_HairSerum;
import com.mamaearth.PageObject.mamaearth_Category_Hair_Shampoo;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient;
import com.mamaearth.PageObject.mamaearth_Category_Makeup;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Compact;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Concealer;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Foundation;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Kajal;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_LipBalm;
import com.mamaearth.PageObject.mamaearth_Category_Makeup_Lipsticks;
import com.mamaearth.PageObject.mamaearth_Category_PlantGoodness;
import com.mamaearth.PageObject.mamaearth_Category_StoreLocator;
import com.mamaearth.PageObject.mamaearth_HomePage;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class TC_VerifyAllCategories extends mamaearth_Base{
	
	mamaearth_HomePage home;
	
	
	mamaearth_Category_Beauty beauty;
	mamaearth_Category_Beauty_Fragrance fragrance;
	mamaearth_Category_Beauty_FacialKits facialKits;
	
	
	mamaearth_Category_Hair hair;
	mamaearth_Category_Hair_Shampoo hairShampoo;
	mamaearth_Category_Hair_Conditioner hairConditioner;
	mamaearth_Category_Hair_HairOil hairOil;
	mamaearth_Category_Hair_HairMask hairMask;
	mamaearth_Category_Hair_HairSerum hairSerum;
	mamaearth_Category_Hair_HairOilBooster hairOilBooster;
	
	
	mamaearth_Category_Face face;
	mamaearth_Category_Face_FaceWash faceWash;
	mamaearth_Category_Face_FaceMask faceMask;
	mamaearth_Category_Face_FaceCream faceCream;
	mamaearth_Category_Face_FaceSerum faceSerum;
	mamaearth_Category_Face_FaceScrub faceScrub;
	mamaearth_Category_Face_FaceToner faceToner;
	mamaearth_Category_Face_FaceGel faceGel;
	mamaearth_Category_Face_FaceSheetMask faceSheetMask;
	mamaearth_Category_Face_FaceMoisturizer faceMoisturizer;
	
	
	mamaearth_Category_Body body;
	mamaearth_Category_Body_BodyLotion bodyLotion;
	mamaearth_Category_Body_UnderarmCream underarmCream;
	mamaearth_Category_Body_BodyScrub bodyScrub;
	mamaearth_Category_Body_HandCream handCream;
	mamaearth_Category_Body_BodyWash bodyWash;
	mamaearth_Category_Body_BodySoap bodySoap;
	
	
	mamaearth_Category_Makeup makeup;
	mamaearth_Category_Makeup_Lipsticks lipsticks;
	mamaearth_Category_Makeup_LipBalm lipBalm;
	mamaearth_Category_Makeup_Foundation foundation;
	mamaearth_Category_Makeup_Kajal kajal;
	mamaearth_Category_Makeup_Compact compact;
	mamaearth_Category_Makeup_Concealer concealer;
	
	
	mamaearth_Category_Ingredient ingredient;
	mamaearth_Category_Baby baby;
	mamaearth_Category_GiftPacks giftPacks;
	mamaearth_Category_AllProducts allProducts;
	mamaearth_Category_Blog blog;
	mamaearth_Category_PlantGoodness plantGoodness;
	mamaearth_Category_StoreLocator storeLocator;
	mamaearth_Category_GoodnessInsider goodnessInsider;
	mamaearth_utils_CategoriesFunctions cf;
	
	
	
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
	public void Test_mamaearth_category_Beauty_launching() throws IOException {
		cf = home.categoriesRefrence();
		beauty = cf.click_on_Beauty_cateogry();
		boolean response = beauty.verfiy_Beauty_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 3)
	public void Test_mamaearth_category_Beauty_Fragrance_launching() throws IOException, InterruptedException {
		cf = beauty.categoriesRefrence();
		fragrance = cf.click_on_Beauty_Fragrance_cateogry();
		Assert.assertTrue(fragrance.verfiy_Beauty_Fragrance_category_page());
	}

	@Test(priority = 4)
	public void Test_mamaearth_category_Beauty_FacialKits_launching() throws IOException, InterruptedException {
		cf = beauty.categoriesRefrence();
		facialKits = cf.click_on_Beauty_FacialKits_cateogry();
		Thread.sleep(3000);
		Assert.assertTrue(facialKits.verfiy_Beauty_FacialKits_category_page());
	}
	
	
	@Test(priority = 5)
	public void Test_mamaearth_category_Hair_launching() throws IOException {
		cf = facialKits.categoriesRefrence();
		hair = cf.click_on_Hair_cateogry();
		boolean response = hair.verfiy_Hair_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 6)
	public void Test_mamaearth_category_Hair_Shampoo_launching() throws IOException {
		cf = hair.categoriesRefrence();
		hairShampoo = cf.click_on_Hair_Shampoo_cateogry();
		boolean response = hairShampoo.verfiy_Hair_Shampoo_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 7)
	public void Test_mamaearth_category_Hair_Conditioner_launching() throws IOException {
		cf = hairShampoo.categoriesRefrence();
		hairConditioner = cf.click_on_Hair_Conditioner_cateogry();
		boolean response = hairConditioner.verfiy_Hair_Conditioner_category_page();
		Assert.assertTrue(response);
	}

	@Test(priority = 8)
	public void Test_mamaearth_category_Hair_HairOil_launching() throws IOException {
		cf = hairConditioner.categoriesRefrence();
		hairOil = cf.click_on_Hair_HairOil_cateogry();
		boolean response = hairOil.verfiy_Hair_Oil_category_page();
		Assert.assertTrue(response);
	}
	
	
	@Test(priority = 9)
	public void Test_mamaearth_category_Hair_HairMask_launching() throws IOException {
		cf = hairOil.categoriesRefrence();
		hairMask = cf.click_on_Hair_HairMask_cateogry();
		boolean response = hairMask.verfiy_Hair_Mask_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 10)
	public void Test_mamaearth_category_Hair_HairSerum_launching() throws IOException {
		cf = hairMask.categoriesRefrence();
		hairSerum = cf.click_on_Hair_HairSerum_cateogry();
		boolean response = hairSerum.verfiy_Hair_Serum_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 11)
	public void Test_mamaearth_category_Hair_HairOilBooster_launching() throws IOException {
		cf = hairSerum.categoriesRefrence();
		hairOilBooster = cf.click_on_Hair_HairOilBooster_cateogry();
		boolean response = hairOilBooster.verfiy_Hair_OilBooster_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 12)
	public void Test_mamaearth_category_Face_launching() throws IOException {
		cf = hairOilBooster.categoriesRefrence();
		face = cf.click_on_Face_cateogry();
		boolean response = face.verfiy_Face_category_page();
		Assert.assertTrue(response);
	}

	@Test(priority = 13)
	public void Test_mamaearth_category_Face_FaceWash_launching() throws IOException {
		cf = face.categoriesRefrence();
		faceWash = cf.click_on_Face_FaceWash_cateogry();
		boolean response = faceWash.verfiy_Face_FaceWash_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 14)
	public void Test_mamaearth_category_Face_FaceMask_launching() throws IOException {
		cf = faceWash.categoriesRefrence();
		faceMask = cf.click_on_Face_FaceMask_cateogry();
		boolean response = faceMask.verfiy_Face_FaceMask_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 15)
	public void Test_mamaearth_category_Face_FaceCream_launching() throws IOException {
		cf = faceMask.categoriesRefrence();
		faceCream = cf.click_on_Face_FaceCream_cateogry();
		boolean response = faceCream.verfiy_Face_FaceCream_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 16)
	public void Test_mamaearth_category_Face_FaceSerum_launching() throws IOException {
		cf = faceCream.categoriesRefrence();
		faceSerum = cf.click_on_Face_FaceSerum_cateogry();
		boolean response = faceSerum.verfiy_Face_FaceSerum_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 17)
	public void Test_mamaearth_category_Face_FaceScrub_launching() throws IOException {
		cf = faceSerum.categoriesRefrence();
		faceScrub = cf.click_on_Face_FaceScrub_cateogry();
		boolean response = faceScrub.verfiy_Face_FaceScrub_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 18)
	public void Test_mamaearth_category_Face_FaceToner_launching() throws IOException {
		cf = faceScrub.categoriesRefrence();
		faceToner = cf.click_on_Face_FaceToner_cateogry();
		boolean response = faceToner.verfiy_Face_FaceToner_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 19)
	public void Test_mamaearth_category_Face_FaceGel_launching() throws IOException {
		cf = faceToner.categoriesRefrence();
		faceGel = cf.click_on_Face_FaceGel_cateogry();
		boolean response = faceGel.verfiy_Face_FaceGel_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 20)
	public void Test_mamaearth_category_Face_FaceSheetMask_launching() throws IOException {
		cf = faceGel.categoriesRefrence();
		faceSheetMask = cf.click_on_Face_FaceSheetMask_cateogry();
		boolean response = faceSheetMask.verfiy_Face_FaceSheetMask_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 21)
	public void Test_mamaearth_category_Face_FaceMoisturizer_launching() throws IOException {
		cf = faceSheetMask.categoriesRefrence();
		faceMoisturizer = cf.click_on_Face_FaceMoisturizer_cateogry();
		boolean response = faceMoisturizer.verfiy_Face_FaceMoisturizer_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 22)
	public void Test_mamaearth_category_Body_launching() throws IOException {
		cf = faceMoisturizer.categoriesRefrence();
		body = cf.click_on_Body_cateogry();
		boolean response = body.verfiy_Body_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 23)
	public void Test_mamaearth_category_Body_BodyLotion_launching() throws IOException {
		cf = body.categoriesRefrence();
		bodyLotion = cf.click_on_Body_BodyLotion_cateogry();
		boolean response = bodyLotion.verfiy_Body_BodyLotion_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 24)
	public void Test_mamaearth_category_Body_UnderarmCream_launching() throws IOException {
		cf = bodyLotion.categoriesRefrence();
		underarmCream = cf.click_on_Body_UnderarmCream_cateogry();
		boolean response = underarmCream.verfiy_Body_UnderarmCream_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 25)
	public void Test_mamaearth_category_Body_BodyScrub_launching() throws IOException {
		cf = underarmCream.categoriesRefrence();
		bodyScrub = cf.click_on_Body_BodyScrub_cateogry();
		boolean response = bodyScrub.verfiy_Body_BodyScrub_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 26)
	public void Test_mamaearth_category_Body_HandCream_launching() throws IOException {
		cf = bodyScrub.categoriesRefrence();
		handCream = cf.click_on_Body_HandCream_cateogry();
		boolean response = handCream.verfiy_Body_HandCream_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 27)
	public void Test_mamaearth_category_Body_BodyWash_launching() throws IOException {
		cf = handCream.categoriesRefrence();
		bodyWash = cf.click_on_Body_BodyWash_cateogry();
		boolean response = bodyWash.verfiy_Body_BodyWash_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 28)
	public void Test_mamaearth_category_Body_BodySoap_launching() throws IOException {
		cf = bodyWash.categoriesRefrence();
		bodySoap = cf.click_on_Body_BodySoap_cateogry();
		boolean response = bodySoap.verfiy_Body_BodySoap_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 29)
	public void Test_mamaearth_category_Makeup_launching() throws IOException {
		cf = bodyLotion.categoriesRefrence();
		makeup = cf.click_on_Makeup_cateogry();
		boolean response = makeup.verfiy_Makeup_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 30)
	public void Test_mamaearth_category_Makeup_Lipsticks_launching() throws IOException {
		cf = makeup.categoriesRefrence();
		lipsticks = cf.click_on_Makeup_Lipsticks_cateogry();
		boolean response = lipsticks.verfiy_Makeup_Lipsticks_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 31)
	public void Test_mamaearth_category_Makeup_LipBalm_launching() throws IOException {
		cf = lipsticks.categoriesRefrence();
		lipBalm = cf.click_on_Makeup_LipBalm_cateogry();
		boolean response = lipBalm.verfiy_Makeup_LipBalm_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 32)
	public void Test_mamaearth_category_Makeup_Foundation_launching() throws IOException {
		cf = lipBalm.categoriesRefrence();
		foundation = cf.click_on_Makeup_Foundation_cateogry();
		boolean response = foundation.verfiy_Makeup_Foundations_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 33)
	public void Test_mamaearth_category_Makeup_Kajal_launching() throws IOException {
		cf = foundation.categoriesRefrence();
		kajal = cf.click_on_Makeup_Kajal_cateogry();
		boolean response = kajal.verfiy_Makeup_Kajal_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 34)
	public void Test_mamaearth_category_Makeup_Compact_launching() throws IOException {
		cf = kajal.categoriesRefrence();
		compact = cf.click_on_Makeup_Compact_cateogry();
		boolean response = compact.verfiy_Makeup_CompactPowder_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 35)
	public void Test_mamaearth_category_Makeup_Concealer_launching() throws IOException {
		cf = compact.categoriesRefrence();
		concealer = cf.click_on_Makeup_Concealer_cateogry();
		boolean response = concealer.verfiy_Makeup_Concealer_category_page();
		Assert.assertTrue(response);
	}
	
	
//	@Test(priority = 25)
//	public void Test_mamaearth_category_Ingredient_launching() throws IOException {
//		ingredient = makeup.click_on_Ingredient_cateogry();
//		boolean response = ingredient.verfiy_Ingredient_category_page();
//		Assert.assertTrue(response);
//	}
//	
//	@Test(priority = 26)
//	public void Test_mamaearth_category_Baby_launching() throws IOException {
//		baby = ingredient.click_on_Baby_cateogry();
//		boolean response = baby.verfiy_Baby_category_page();
//		Assert.assertTrue(response);
//	}
//	
//	@Test(priority = 27)
//	public void Test_mamaearth_category_GiftPacks_launching() throws IOException {
//		giftPacks = baby.click_on_GiftPacks_cateogry();
//		boolean response = giftPacks.verfiy_GiftPacks_category_page();
//		Assert.assertTrue(response);
//	}
//	
//	@Test(priority = 28)
//	public void Test_mamaearth_category_AllProducts_launching() throws IOException, InterruptedException {
//		allProducts = giftPacks.click_on_AllProducts_cateogry();
//		Thread.sleep(3000);
//		boolean response = allProducts.verfiy_AllProducts_category_page();
//		Assert.assertTrue(response);
//	}
//	
////	@Test(priority = 11)
////	public void Test_mamaearth_category_Blog_launching() throws IOException, InterruptedException {
////		blog = allProducts.click_on_Blog_cateogry();
////		Thread.sleep(3000);
////		boolean response = blog.verfiy_Blog_category_page();
////		Assert.assertTrue(response);
////	}
////	
//	@Test(priority = 29)
//	public void Test_mamaearth_category_PlantGoodness_launching() throws IOException, InterruptedException {
////		allProducts = blog.back_to_AllProducts_cateogry();
//		plantGoodness = allProducts.click_on_PlantGoodness_cateogry();
//		Thread.sleep(3000);
//		boolean response = plantGoodness.verfiy_PlantGoodness_category_page();
//		Assert.assertTrue(response);
//	}
//	
//	@Test(priority = 30)
//	public void Test_mamaearth_category_StoreLocator_launching() throws IOException, InterruptedException {
//		storeLocator = plantGoodness.click_on_StoreLocator_cateogry();
//		Thread.sleep(3000);
//		boolean response = storeLocator.verfiy_StoreLocator_category_page();
//		Assert.assertTrue(response);
//	}
//	
	
//	@Test(priority = 14)
//	public void Test_mamaearth_GoodnessInsider_launching() throws IOException, InterruptedException {
//		goodnessInsider = storeLocator.click_on_GoodnessInsider_cateogry();
//		boolean response = goodnessInsider.verfiy_GoodnessInsider_page();
//		Assert.assertTrue(response);
//	}
	
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
