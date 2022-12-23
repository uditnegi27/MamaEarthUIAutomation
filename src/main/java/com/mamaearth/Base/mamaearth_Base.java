package com.mamaearth.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
