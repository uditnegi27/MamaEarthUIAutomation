package com.mamaearth.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mamaearth.Utils.mamaearth_utils;
import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

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
	public static synchronized void initialization() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver_mac64/chromeDriver");
		driver = new ChromeDriver();
		
		driver.navigate().to(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		mamaearth_utils.waitToElementPresence(driver.findElement(By.id("wzrk-confirm-id")), Duration.ofSeconds(10));
		
		driver.findElement(By.id("wzrk-cancel-id")).click();
	}
	

	/*** This will return the reference of the categories utils class ***/
	public mamaearth_utils_CategoriesFunctions categoriesRefrence() {
		return new mamaearth_utils_CategoriesFunctions();
	}


}
