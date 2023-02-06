package com.mamaearth.Utils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_utils_Algolia extends mamaearth_Base{
	
	
	public mamaearth_utils_Algolia() {
		PageFactory.initElements(driver, this);
	}

	
	/*** This function will search the product category
	 * @throws IOException 
	 * 
	 * 
	 * 
	 ***/
	public static void search_product_category(String category_name) throws IOException {
		driver.findElement(By.xpath("//div[@class='MainMenu__InputPlaceHolder-sc-3fgvo-2 hjBSMZ']//parent::div[@class='ShortSearchBar']//p")).click();
		WebElement search_box = driver.findElement(By.xpath("//input[@class='StyledInput-sc-1m95fu4-0 dQlmoN search-input']"));
		mamaearth_utils_ActionFunction.double_click(search_box);
		search_box.clear();
		search_box.sendKeys(category_name);
		search_box.sendKeys(Keys.ENTER);
	}
	
	/*** This function will verify the products coming for searched categories are matching or not
	 * @throws IOException 
	 * @throws InterruptedException 
	 * 
	 * 
	 * 
	 ***/
	public static boolean verify_searched_product_category(String category_name) throws IOException, InterruptedException {
		Thread.sleep(5000);
		List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='title']//parent::a//child::div[@class='title']"));
		boolean titleflag = true;
		for(int i=0; i<5; i++) {
			String productName = elementList.get(i).getText();
			if(!productName.contains(category_name)){
				titleflag = false;
				break;
			}
		}
		if(titleflag) return true;
		else return false;
		
	}
	
}
