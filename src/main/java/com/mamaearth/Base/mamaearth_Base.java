package com.mamaearth.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.json.simple.JSONObject;
//import org.json.simple.JSONValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.html5.LocalStorage;
//import org.openqa.selenium.html5.WebStorage;
//import org.openqa.selenium.remote.Augmenter;

import com.mamaearth.Utils.mamaearth_utils;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;




public class mamaearth_Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public mamaearth_Base() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream("/Users/honasa/Desktop/SeleniumSeesion/mamaEarth_UI_Automation/src/main/java/com/mamaearth/config/config.properties");
			prop.load(file);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public static synchronized void initialization() {
				
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		options.setHeadless(true);
		
		driver = WebDriverManager.chromedriver().capabilities(options).create();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mamaearth_utils.waitToElementPresence(driver.findElement(By.id("wzrk-confirm-id")), Duration.ofSeconds(10));
		
		driver.findElement(By.id("wzrk-cancel-id")).click();
		
//		WebStorage webStorage = (WebStorage) new Augmenter().augment(driver);	
//		
//		LocalStorage localStorage = webStorage.getLocalStorage();
//		
//		String str = "{\"account\":{\"data\":{\"userInfo\":{\"id\":4699745,\"group_id\":5,\"default_billing\":\"6521643\",\"default_shipping\":\"6521643\",\"created_at\":\"2022-02-04 05:55:22\",\"updated_at\":\"2023-03-14 12:31:42\",\"created_in\":\"MamaEarth\",\"dob\":\"1997-12-22\",\"email\":\"uditnegi27@gmail.com\",\"firstname\":\"Udit\",\"lastname\":\"Negi\",\"gender\":1,\"store_id\":1,\"website_id\":1,\"addresses\":[{\"id\":6521643,\"customer_id\":4699745,\"region\":\"DELHI\",\"region_id\":0,\"country_id\":\"IN\",\"street\":[\"A-213/A, Street No 9, 4 5 Pusta, New Usmanpur\"],\"telephone\":\"9773953566\",\"postcode\":\"110053\",\"city\":\"delhi\",\"firstname\":\"udit\",\"lastname\":\"negi\",\"default_shipping\":true,\"default_billing\":true,\"custom_attributes\":[{\"attribute_code\":\"address_category\",\"value\":\"HOME\"},{\"attribute_code\":\"shipping_email\",\"value\":\"uditnegi27@gmail.com\"}]},{\"id\":7013360,\"customer_id\":4699745,\"region\":\"HARYANA\",\"region_id\":0,\"country_id\":\"IN\",\"street\":[\"rgferge\"],\"telephone\":\"9773953566\",\"postcode\":\"122003\",\"city\":\"gurgaon\",\"firstname\":\"HKUH\",\"lastname\":\"tyfuf\",\"custom_attributes\":[{\"attribute_code\":\"address_category\",\"value\":\"HOME\"},{\"attribute_code\":\"shipping_email\",\"value\":\"uytgu@gnail.com\"}]},{\"id\":7125711,\"customer_id\":4699745,\"region\":\"DELHI\",\"region_id\":0,\"country_id\":\"IN\",\"street\":[\"A-213/A, Street No 9, 4 5 Pusta, New Usmanpur\"],\"telephone\":\"9773953566\",\"postcode\":\"110053\",\"city\":\"delhi\",\"firstname\":\"udit negi\",\"lastname\":\"negi\",\"custom_attributes\":[{\"attribute_code\":\"address_category\",\"value\":\"HOME\"},{\"attribute_code\":\"shipping_email\",\"value\":\"uditnegi27@gmail.com\"}]},{\"id\":7363480,\"customer_id\":4699745,\"region\":\"DELHI\",\"region_id\":0,\"country_id\":\"IN\",\"street\":[\"A-213/A, Street No 9, 4 5 Pusta, New Usmanpur\"],\"telephone\":\"9773953566\",\"postcode\":\"110053\",\"city\":\"delhi\",\"firstname\":\"udit negi\",\"lastname\":\"negi\",\"custom_attributes\":[{\"attribute_code\":\"address_category\",\"value\":\"HOME\"},{\"attribute_code\":\"shipping_email\",\"value\":\"sai.r@mamaearth.in\"}]},{\"id\":7494853,\"customer_id\":4699745,\"region\":\"DELHI\",\"region_id\":0,\"country_id\":\"IN\",\"street\":[\"A-213/A, Street No 9, 4 5 Pusta, New Usmanpur\"],\"telephone\":\"9773953566\",\"postcode\":\"110053\",\"city\":\"delhi\",\"firstname\":\"udit negi\",\"lastname\":\"negi\",\"custom_attributes\":[{\"attribute_code\":\"address_category\",\"value\":\"HOME\"},{\"attribute_code\":\"shipping_email\",\"value\":\"hdfjdk@gmail.com\"}]},{\"id\":7636093,\"customer_id\":4699745,\"region\":\"DELHI\",\"country_id\":\"IN\",\"street\":[\"A-213\"],\"telephone\":\"9773953566\",\"postcode\":\"110053\",\"city\":\"delhi\",\"firstname\":\"Udit\",\"lastname\":\"Negi\",\"custom_attributes\":[{\"attribute_code\":\"address_category\",\"value\":\"HOME\"},{\"attribute_code\":\"shipping_email\",\"value\":\"uditnegi27@gmail.com\"}]}],\"disable_auto_group_change\":0,\"extension_attributes\":{\"is_subscribed\":false},\"custom_attributes\":[{\"attribute_code\":\"mobile_number\",\"value\":\"9773953566\"}]}}},\"auth\":{\"loading\":false,\"error\":false,\"loginPopUp\":false,\"signUp\":false,\"newUser\":false,\"redirectUrl\":false,\"mappedContact\":\"\",\"otpLocked\":false,\"data\":{\"user\":{\"id\":\"61fcbfcaccf6262809027d72\",\"email\":\"uditnegi27@gmail.com\",\"role\":\"user\",\"firstName\":\"Udit\",\"lastName\":\"Negi\",\"phone\":\"9773953566\",\"addresses\":[],\"gender\":\"MALE\",\"dob\":\"1997-12-22T00:00:00.000Z\",\"customerGroupId\":5,\"customerGroupCode\":\"VIP Customer\"},\"token\":{\"tokenType\":\"Bearer\",\"accessToken\":\"9fa2fc0db4413bd1001416886a10d76b\",\"refreshToken\":\"7083449cc5862e0c384e061f0309b337\",\"expiresIn\":\"604800\"},\"otp\":{\"contact\":false,\"email\":false,\"sessionId\":false}},\"meta\":{\"isTokenRefreshing\":false},\"popUpData\":false,\"invalidReferral\":false},\"cart\":{\"loading\":false,\"quantityLoading\":false,\"error\":false,\"gIaddToCart\":false,\"data\":{\"cartId\":196287559,\"ids\":[],\"cartMap\":{},\"recentRemovals\":[],\"appliedRules\":[{\"rule_name\":\"Coupon for Payment Testing\",\"rule_description\":\"Coupon for Payment Testing\",\"action_amount\":20,\"rule_type\":\"Reward\",\"amount\":0.714,\"action_key\":\"percentage\",\"max_reward_points\":0}],\"wishlist\":[],\"inertProducts\":[],\"applied\":false,\"code\":null,\"message\":null,\"couponError\":null},\"open\":false},\"checkout\":{\"walletChecked\":false,\"otpLoading\":false,\"loading\":false,\"thankyouPageLoading\":false,\"placeOrderLoading\":false,\"paymentFailed\":false,\"paymentError\":\"\",\"error\":false,\"jusPayLoad\":false,\"initiatePayload\":false,\"addressError\":false,\"localStorageAddressData\":{\"region\":\"DELHI\",\"country_id\":\"IN\",\"street\":\"A-213/A, Street No 9, 4 5 Pusta, New Usmanpur\",\"postcode\":\"110053\",\"city\":\"delhi\",\"firstname\":\"udit\",\"lastname\":\"negi\",\"email\":\"uditnegi27@gmail.com\",\"telephone\":\"9773953566\",\"save_in_address_book\":1,\"addressType\":\"HOME\"},\"jusPayRequestId\":false,\"isJuspay\":false,\"showPaymentOptions\":false,\"fraudOrderError\":false,\"benefitsData\":false,\"data\":{\"isCODAvailable\":true,\"shipping\":false,\"totals\":{\"grand_total\":3.75,\"base_grand_total\":3.75,\"subtotal\":375,\"base_subtotal\":375,\"discount_amount\":-371.25,\"base_discount_amount\":-371.25,\"subtotal_with_discount\":3.75,\"base_subtotal_with_discount\":3.75,\"shipping_amount\":0,\"base_shipping_amount\":0,\"shipping_discount_amount\":0,\"base_shipping_discount_amount\":0,\"tax_amount\":0,\"base_tax_amount\":0,\"weee_tax_applied_amount\":null,\"shipping_tax_amount\":0,\"base_shipping_tax_amount\":0,\"subtotal_incl_tax\":375,\"shipping_incl_tax\":0,\"base_shipping_incl_tax\":0,\"base_currency_code\":\"INR\",\"quote_currency_code\":\"INR\",\"coupon_code\":\"99OFFTEST2023\",\"items_qty\":3,\"items\":[{\"item_id\":196969546,\"price\":375,\"base_price\":375,\"qty\":1,\"row_total\":375,\"base_row_total\":375,\"row_total_with_discount\":0,\"tax_amount\":0,\"base_tax_amount\":0,\"tax_percent\":0,\"discount_amount\":371.25,\"base_discount_amount\":371.25,\"discount_percent\":99,\"price_incl_tax\":375,\"base_price_incl_tax\":375,\"row_total_incl_tax\":375,\"base_row_total_incl_tax\":375,\"options\":\"[]\",\"weee_tax_applied_amount\":null,\"weee_tax_applied\":null,\"name\":\"Ubtan Face Wash with Turmeric & Saffron for Tan Removal – 150 ml\",\"categories\":[\"2\",\"18\",\"21\",\"51\",\"217\",\"128\",\"129\",\"130\",\"131\",\"132\",\"133\",\"134\",\"135\",\"260\",\"102\",\"52\"],\"product_id\":571,\"sku\":\"8904417300512\"},{\"item_id\":196969547,\"price\":0,\"base_price\":0,\"qty\":1,\"row_total\":0,\"base_row_total\":0,\"row_total_with_discount\":0,\"tax_amount\":0,\"base_tax_amount\":0,\"tax_percent\":0,\"discount_amount\":0,\"base_discount_amount\":0,\"discount_percent\":0,\"price_incl_tax\":0,\"base_price_incl_tax\":0,\"row_total_incl_tax\":0,\"base_row_total_incl_tax\":0,\"options\":\"[]\",\"weee_tax_applied_amount\":null,\"weee_tax_applied\":null,\"extension_attributes\":{\"amasty_promo\":{\"image_src\":\"https://mmrth-mg-cs.honasa-production.net/pub/media/catalog/product/cache/4bbd5a5ec693b62559096d78be10d8b5/a/l/aloevera-gel-moisturizer-1_1_1.jpg\",\"image_alt\":\"Aloe Vera Gel Face Moisturizer with Aloe Vera & Ashwagandha for a Youthful Glow - 15g\",\"image_width\":\"150\",\"image_height\":\"150\"}},\"name\":\"FREE -  Aloe Vera Gel Face Moisturizer with Aloe Vera & Ashwagandha for a Youthful Glow - 15g\",\"categories\":[\"2\",\"251\",\"18\",\"126\"],\"product_id\":562,\"sku\":\"8906087779155\"},{\"item_id\":196969548,\"price\":0,\"base_price\":0,\"qty\":1,\"row_total\":0,\"base_row_total\":0,\"row_total_with_discount\":0,\"tax_amount\":0,\"base_tax_amount\":0,\"tax_percent\":0,\"discount_amount\":0,\"base_discount_amount\":0,\"discount_percent\":0,\"price_incl_tax\":0,\"base_price_incl_tax\":0,\"row_total_incl_tax\":0,\"base_row_total_incl_tax\":0,\"options\":\"[]\",\"weee_tax_applied_amount\":null,\"weee_tax_applied\":null,\"extension_attributes\":{\"amasty_promo\":{\"image_src\":\"https://mmrth-mg-cs.honasa-production.net/pub/media/catalog/product/cache/4bbd5a5ec693b62559096d78be10d8b5/a/l/aloevera-fw-1_1_1.jpg\",\"image_alt\":\"Aloe Vera Face Wash with Aloe Vera & Ashwagandha for a Youthful Glow - 20ml\",\"image_width\":\"150\",\"image_height\":\"150\"}},\"name\":\"FREE -  Aloe Vera Face Wash with Aloe Vera & Ashwagandha for a Youthful Glow - 20ml\",\"categories\":[\"2\",\"251\",\"18\",\"126\"],\"product_id\":561,\"sku\":\"8906087779100\"}],\"total_segments\":[{\"code\":\"subtotal\",\"title\":\"Subtotal\",\"value\":375,\"index\":3},{\"code\":\"discount\",\"title\":\"Discount (VIP default free sku Coupon used in the post purchase journey, Coupon for Payment Testing)\",\"value\":-371.25,\"index\":4},{\"code\":\"shipping\",\"title\":\"Shipping & Handling\",\"value\":0,\"index\":5},{\"code\":\"tax\",\"title\":\"Tax\",\"value\":0,\"area\":\"taxes\",\"extension_attributes\":{\"tax_grandtotal_details\":[]}},{\"code\":\"testdiscount\",\"title\":\"Discount (VIP default free sku Coupon used in the post purchase journey, Coupon for Payment Testing)\",\"value\":-371.25},{\"code\":\"grand_total\",\"title\":\"Grand Total\",\"value\":3.75,\"area\":\"footer\"},{\"code\":\"reward\",\"title\":\"0 Reward points\",\"value\":0},{\"code\":\"custom_payment_mutation\",\"title\":\"5% online payment discount\",\"percentValue\":5,\"calculatedInNode\":true,\"value\":-0.18,\"index\":100},{\"code\":\"grand_total_adjusted\",\"title\":\"Grand Total\",\"value\":3.57,\"calculatedInNode\":true,\"index\":100},{\"code\":\"orderTotal\",\"title\":\"Order Total\",\"value\":573,\"index\":1,\"calculatedInNode\":true},{\"code\":\"itemsDiscount\",\"title\":\"Items Discount\",\"value\":198,\"index\":2,\"calculatedInNode\":true},{\"code\":\"goodnessInsider\",\"title\":\"Goodness Insider\",\"value\":0,\"index\":10,\"calculatedInNode\":true}],\"extension_attributes\":{\"reward_points_balance\":0,\"reward_currency_amount\":0,\"base_reward_currency_amount\":0},\"vipCoupon\":\"vipfreeskuadd22\",\"isVipPurchase\":false,\"onlinePayment\":{\"status\":1,\"value\":5},\"totalSaving\":609.43,\"isVipApplied\":false,\"message\":\"You save 371.25 amount on this order.\"},\"order\":false,\"confirmedOrder\":false,\"customerDetail\":false,\"paymentEntity\":false,\"paymentMethods\":false,\"old_productId\":[],\"couponError\":false,\"otp\":{\"contact\":false,\"sessionId\":false}},\"meta\":{\"trackingData\":false,\"order\":{\"comment\":\"\",\"payMethod\":\"\",\"methodFields\":{},\"billingAddress\":false,\"shippingAddress\":false,\"selectedPaymentMethod\":\"razorpay\",\"availablePaymentMethods\":[\"razorpay\",\"paypal\",\"cod\"]}},\"gokwikScore\":false,\"couponType\":\"\",\"deliveryDetails\":false,\"giGuestStatusSuccess\":false,\"giGuestTelephone\":false,\"repeatUser\":0,\"payment_initiate\":false,\"couponWithTimer\":false,\"couponWithTimerApplied\":false,\"couponStatus\":false,\"giftCardApplied\":false,\"isUPIIntent\":false}}";
//		Object obj = JSONValue.parse(str);  
//	    JSONObject jsonObject = (JSONObject) obj;  
//	    
//		localStorage.setItem("pwaState", jsonObject.toJSONString());
		
//		driver.navigate().refresh();
		
	}
	

	/*** This will return the reference of the categories utils class ***/
	public mamaearth_utils_CategoriesFunctions categoriesRefrence() {
		return new mamaearth_utils_CategoriesFunctions();
	}


}
