package com.mamaearth.TestCase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import com.mamaearth.Base.mamaearth_Base;
import com.mamaearth.PageObject.mamaearth_Category_AllProducts;
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
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_AppleCiderVinegar;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Aqua;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Argan;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Bhringmla;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Charcoal;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Coco;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_GreenTea;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Henna;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_HoneyMalai;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Onion;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Retinol;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Rice;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_TeaTree;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_Ubtan;
import com.mamaearth.PageObject.mamaearth_Category_Ingredient_VitaminC;
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
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyBath;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyBodyLotion;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyOil;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyOralcare;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabyShampoo;
import com.mamaearth.PageObject.Baby.mamaearth_Category_Baby_BabySkin;

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
	mamaearth_Category_Ingredient_Onion onion;
	mamaearth_Category_Ingredient_Henna henna;
	mamaearth_Category_Ingredient_Rice rice;
	mamaearth_Category_Ingredient_Ubtan ubtan;
	mamaearth_Category_Ingredient_VitaminC vitaminC;
	mamaearth_Category_Ingredient_GreenTea greenTea;
	mamaearth_Category_Ingredient_TeaTree teaTree;
	mamaearth_Category_Ingredient_Aqua aqua;
	mamaearth_Category_Ingredient_Bhringmla bhringmla;
	mamaearth_Category_Ingredient_Charcoal charcoal;
	mamaearth_Category_Ingredient_Coco coco;
	mamaearth_Category_Ingredient_Argan argan;
	mamaearth_Category_Ingredient_AppleCiderVinegar appleCiderVinegar;
	mamaearth_Category_Ingredient_Retinol retinol;
	mamaearth_Category_Ingredient_HoneyMalai honeyMalai;
	
	
	mamaearth_Category_Baby baby;
	mamaearth_Category_Baby_BabyShampoo babyShampoo;
	mamaearth_Category_Baby_BabyOralcare babyOralcare;
	mamaearth_Category_Baby_BabyOil babyOil;
	mamaearth_Category_Baby_BabySkin babySkin;
	mamaearth_Category_Baby_BabyBath babyBath;
	mamaearth_Category_Baby_BabyBodyLotion babyBodyLotion;
	
	
	mamaearth_Category_GiftPacks giftPacks;
	mamaearth_Category_AllProducts allProducts;
	mamaearth_Category_Blog blog;
	mamaearth_Category_PlantGoodness plantGoodness;
	mamaearth_Category_StoreLocator storeLocator;
	mamaearth_Category_GoodnessInsider goodnessInsider;
	
	
	
	
	@BeforeClass
	public void setup() {
		open_Mamaearth_As_Guest();
		home = new mamaearth_HomePage();
	}
	
	@Test(priority = 1)
	public void Test_mamaearth_launching() {
		boolean response = home.verfiy_homePageContent();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 2)
	public void Test_mamaearth_category_Beauty_launching() {
		beauty = home.click_on_Beauty_cateogry();
		boolean response = beauty.verfiy_Beauty_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 3)
	public void Test_mamaearth_category_Beauty_Fragrance_launching() {
		fragrance = beauty.click_on_Beauty_Fragrance_cateogry();
		Assert.assertTrue(fragrance.verfiy_Beauty_Fragrance_category_page());
	}

	@Test(priority = 4)
	public void Test_mamaearth_category_Beauty_FacialKits_launching() {
		facialKits = beauty.click_on_Beauty_FacialKits_cateogry();
		Assert.assertTrue(facialKits.verfiy_Beauty_FacialKits_category_page());
	}
	
	@Test(priority = 5)
	public void Test_mamaearth_category_Hair_launching() {
		hair = facialKits.click_on_Hair_cateogry();
		boolean response = hair.verfiy_Hair_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 6)
	public void Test_mamaearth_category_Hair_Shampoo_launching() {
		hairShampoo = hair.click_on_Hair_Shampoo_cateogry();
		boolean response = hairShampoo.verfiy_Hair_Shampoo_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 7)
	public void Test_mamaearth_category_Hair_Conditioner_launching() {
		hairConditioner = hairShampoo.click_on_Hair_Conditioner_cateogry();
		boolean response = hairConditioner.verfiy_Hair_Conditioner_category_page();
		Assert.assertTrue(response);
	}

	@Test(priority = 8)
	public void Test_mamaearth_category_Hair_HairOil_launching() {
		hairOil = hairConditioner.click_on_Hair_HairOil_cateogry();
		boolean response = hairOil.verfiy_Hair_Oil_category_page();
		Assert.assertTrue(response);
	}
		
	@Test(priority = 9)
	public void Test_mamaearth_category_Hair_HairMask_launching() {
		hairMask = hairOil.click_on_Hair_HairMask_cateogry();
		boolean response = hairMask.verfiy_Hair_Mask_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 10)
	public void Test_mamaearth_category_Hair_HairSerum_launching() {
		hairSerum = hairMask.click_on_Hair_HairSerum_cateogry();
		boolean response = hairSerum.verfiy_Hair_Serum_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 11)
	public void Test_mamaearth_category_Hair_HairOilBooster_launching() {
		hairOilBooster = hairSerum.click_on_Hair_HairOilBooster_cateogry();
		boolean response = hairOilBooster.verfiy_Hair_OilBooster_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 12)
	public void Test_mamaearth_category_Face_launching() {
		face = hairOilBooster.click_on_Face_cateogry();
		boolean response = face.verfiy_Face_category_page();
		Assert.assertTrue(response);
	}

	@Test(priority = 13)
	public void Test_mamaearth_category_Face_FaceWash_launching() {
		faceWash = face.click_on_Face_FaceWash_cateogry();
		boolean response = faceWash.verfiy_Face_FaceWash_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 14)
	public void Test_mamaearth_category_Face_FaceMask_launching() {
	
		faceMask = faceWash.click_on_Face_FaceMask_cateogry();
		boolean response = faceMask.verfiy_Face_FaceMask_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 15)
	public void Test_mamaearth_category_Face_FaceCream_launching() {
		faceCream = faceMask.click_on_Face_FaceCream_cateogry();
		boolean response = faceCream.verfiy_Face_FaceCream_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 16)
	public void Test_mamaearth_category_Face_FaceSerum_launching() {
		faceSerum = faceCream.click_on_Face_FaceSerum_cateogry();
		boolean response = faceSerum.verfiy_Face_FaceSerum_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 17)
	public void Test_mamaearth_category_Face_FaceScrub_launching() {
		faceScrub = faceSerum.click_on_Face_FaceScrub_cateogry();
		boolean response = faceScrub.verfiy_Face_FaceScrub_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 18)
	public void Test_mamaearth_category_Face_FaceToner_launching() {
		faceToner = faceScrub.click_on_Face_FaceToner_cateogry();
		boolean response = faceToner.verfiy_Face_FaceToner_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 19)
	public void Test_mamaearth_category_Face_FaceGel_launching() {
		faceGel = faceToner.click_on_Face_FaceGel_cateogry();
		boolean response = faceGel.verfiy_Face_FaceGel_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 20)
	public void Test_mamaearth_category_Face_FaceSheetMask_launching() {
		faceSheetMask = faceGel.click_on_Face_FaceSheetMask_cateogry();
		boolean response = faceSheetMask.verfiy_Face_FaceSheetMask_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 21)
	public void Test_mamaearth_category_Face_FaceMoisturizer_launching() {
		faceMoisturizer = faceSheetMask.click_on_Face_FaceMoisturizer_cateogry();
		boolean response = faceMoisturizer.verfiy_Face_FaceMoisturizer_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 22)
	public void Test_mamaearth_category_Body_launching() {
		body = faceMoisturizer.click_on_Body_cateogry();
		boolean response = body.verfiy_Body_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 23)
	public void Test_mamaearth_category_Body_BodyLotion_launching() {
		bodyLotion = body.click_on_Body_BodyLotion_cateogry();
		boolean response = bodyLotion.verfiy_Body_BodyLotion_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 24)
	public void Test_mamaearth_category_Body_UnderarmCream_launching() {
		underarmCream = bodyLotion.click_on_Body_UnderarmCream_cateogry();
		boolean response = underarmCream.verfiy_Body_UnderarmCream_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 25)
	public void Test_mamaearth_category_Body_BodyScrub_launching() {
		bodyScrub = underarmCream.click_on_Body_BodyScrub_cateogry();
		boolean response = bodyScrub.verfiy_Body_BodyScrub_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 26)
	public void Test_mamaearth_category_Body_HandCream_launching() {
		handCream = bodyScrub.click_on_Body_HandCream_cateogry();
		boolean response = handCream.verfiy_Body_HandCream_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 27)
	public void Test_mamaearth_category_Body_BodyWash_launching() {
		bodyWash = handCream.click_on_Body_BodyWash_cateogry();
		boolean response = bodyWash.verfiy_Body_BodyWash_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 28)
	public void Test_mamaearth_category_Body_BodySoap_launching() {
		bodySoap = bodyWash.click_on_Body_BodySoap_cateogry();
		boolean response = bodySoap.verfiy_Body_BodySoap_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 29)
	public void Test_mamaearth_category_Makeup_launching() {
		makeup = bodyLotion.click_on_Makeup_cateogry();
		boolean response = makeup.verfiy_Makeup_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 30)
	public void Test_mamaearth_category_Makeup_Lipsticks_launching() {
		lipsticks = makeup.click_on_Makeup_Lipsticks_cateogry();
		boolean response = lipsticks.verfiy_Makeup_Lipsticks_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 31)
	public void Test_mamaearth_category_Makeup_LipBalm_launching() {
		lipBalm = lipsticks.click_on_Makeup_LipBalm_cateogry();
		boolean response = lipBalm.verfiy_Makeup_LipBalm_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 32)
	public void Test_mamaearth_category_Makeup_Foundation_launching() {
		foundation = lipBalm.click_on_Makeup_Foundation_cateogry();
		boolean response = foundation.verfiy_Makeup_Foundations_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 33)
	public void Test_mamaearth_category_Makeup_Kajal_launching() {
		kajal = foundation.click_on_Makeup_Kajal_cateogry();
		boolean response = kajal.verfiy_Makeup_Kajal_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 34)
	public void Test_mamaearth_category_Makeup_Compact_launching() {
		compact = kajal.click_on_Makeup_Compact_cateogry();
		boolean response = compact.verfiy_Makeup_CompactPowder_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 35)
	public void Test_mamaearth_category_Makeup_Concealer_launching() {
		concealer = compact.click_on_Makeup_Concealer_cateogry();
		boolean response = concealer.verfiy_Makeup_Concealer_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 36)
	public void Test_mamaearth_category_Ingredient_launching() {
		ingredient = concealer.click_on_Ingredient_cateogry();
		boolean response = ingredient.verfiy_Ingredient_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 37)
	public void Test_mamaearth_category_Ingredient_Onion_launching() {
		onion = ingredient.click_on_Ingredient_Onion_cateogry();
		boolean response = onion.verfiy_Ingredient_Onion_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 38)
	public void Test_mamaearth_category_Ingredient_Henna_launching() {
		henna = onion.click_on_Ingredient_Henna_cateogry();
		boolean response = henna.verfiy_Ingredient_Henna_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 39)
	public void Test_mamaearth_category_Ingredient_Rice_launching() {
		rice = henna.click_on_Ingredient_Rice_cateogry();
		boolean response = rice.verfiy_Ingredient_Rice_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 40)
	public void Test_mamaearth_category_Ingredient_Ubtan_launching() {
		ubtan = rice.click_on_Ingredient_Ubtan_cateogry();
		boolean response = ubtan.verfiy_Ingredient_Ubtan_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 41)
	public void Test_mamaearth_category_Ingredient_VitaminC_launching() {
		vitaminC = ubtan.click_on_Ingredient_VitaminC_cateogry();
		boolean response = vitaminC.verfiy_Ingredient_VitaminC_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 42)
	public void Test_mamaearth_category_Ingredient_GreenTea_launching() {
		greenTea = vitaminC.click_on_Ingredient_GreenTea_cateogry();
		boolean response = greenTea.verfiy_Ingredient_GreenTea_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 43)
	public void Test_mamaearth_category_Ingredient_TeaTree_launching() {
		teaTree = greenTea.click_on_Ingredient_TeaTree_cateogry();
		boolean response = teaTree.verfiy_Ingredient_TeaTree_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 44)
	public void Test_mamaearth_category_Ingredient_Aqua_launching() {
		aqua = teaTree.click_on_Ingredient_Aqau_cateogry();
		boolean response = aqua.verfiy_Ingredient_Aqua_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 45)
	public void Test_mamaearth_category_Ingredient_Bhringmla_launching() {
		bhringmla = greenTea.click_on_Ingredient_Bhringmla_cateogry();
		boolean response = bhringmla.verfiy_Ingredient_Bhringmla_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 46)
	public void Test_mamaearth_category_Ingredient_Charcoal_launching() {
		charcoal = bhringmla.click_on_Ingredient_Charcoal_cateogry();
		boolean response = charcoal.verfiy_Ingredient_Charcoal_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 47)
	public void Test_mamaearth_category_Ingredient_Coco_launching() {
		coco = charcoal.click_on_Ingredient_Coco_cateogry();
		boolean response = coco.verfiy_Ingredient_Coco_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 48)
	public void Test_mamaearth_category_Ingredient_Argan_launching() {
		argan = coco.click_on_Ingredient_Argan_cateogry();
		boolean response = argan.verfiy_Ingredient_Argan_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 49)
	public void Test_mamaearth_category_Ingredient_AppleCiderVinegar_launching() {
		appleCiderVinegar = argan.click_on_Ingredient_AppleCiderVinegar_cateogry();
		boolean response = appleCiderVinegar.verfiy_Ingredient_AppleCiderVinegar_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 50)
	public void Test_mamaearth_category_Ingredient_Retinol_launching() {
		retinol = appleCiderVinegar.click_on_Ingredient_Retinol_cateogry();
		boolean response = retinol.verfiy_Ingredient_Retinol_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 51)
	public void Test_mamaearth_category_Ingredient_HoneyMalai_launching() {
		honeyMalai = retinol.click_on_Ingredient_HoneyMalai_cateogry();
		boolean response = honeyMalai.verfiy_Ingredient_HoneyMalai_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 52)
	public void Test_mamaearth_category_Baby_launching() {
		baby = honeyMalai.click_on_Baby_cateogry();
		boolean response = baby.verfiy_Baby_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 53)
	public void Test_mamaearth_category_Baby__BabyShampoo_launching() {
		babyShampoo = baby.click_on_Baby_BabyShampoo_cateogry();
		boolean response = babyShampoo.verfiy_Baby_BabyShampoo_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 54)
	public void Test_mamaearth_category_Baby__BabyOralcare_launching() {
		babyOralcare = babyShampoo.click_on_Baby_BabyOralcare_cateogry();
		boolean response = babyOralcare.verfiy_Baby_BabyOralcare_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 55)
	public void Test_mamaearth_category_Baby__BabyOil_launching() {
		babyOil = babyOralcare.click_on_Baby_BabyOil_cateogry();
		boolean response = babyOil.verfiy_Baby_BabyOil_category_page();
		Assert.assertTrue(response);
	}
	 
	@Test(priority = 56)
	public void Test_mamaearth_category_Baby__BabySkin_launching() {
		babySkin = babyOil.click_on_Baby_BabySkin_cateogry();
		boolean response = babySkin.verfiy_Baby_BabySkin_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 57)
	public void Test_mamaearth_category_Baby__BabyBath_launching() {
		babyBath = babySkin.click_on_Baby_BabyBath_cateogry();
		boolean response = babyBath.verfiy_Baby_BabyBath_category_page();
		Assert.assertTrue(response);
	}
	
	@Test(priority = 58)
	public void Test_mamaearth_category_Baby__BabyBodyLotion_launching() {
		babyBodyLotion = babyBath.click_on_Baby_BabyBodyLotion_cateogry();
		boolean response = babyBodyLotion.verfiy_Baby_BabyBodyLotion_category_page();
		Assert.assertTrue(response);
	}
	

//	@Test(priority = 27)
//	public void Test_mamaearth_category_GiftPacks_launching() throws IOException {
//		giftPacks = baby.click_on_GiftPacks_cateogry();
//		boolean response = giftPacks.verfiy_GiftPacks_category_page();
//		Assert.assertTrue(response);
//	}
	
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
