package com.mamaearth.Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_utils_ActionFunction extends mamaearth_Base{
	
	static Actions action = new Actions(driver);
	
	
	/*** This function will move cursor from one element to given element
	 * 
	 * 
	 * ***/
	public static void move_cursor_to_element(WebElement element) {
		action.moveToElement(element).build().perform();
	}
	
	
	
	/*** This function will move cursor from one element to given element
	 * 
	 * 
	 * ***/
	public static void move_cursor_to_element_and_click(WebElement element) {
		action.moveToElement(element).click().perform();;
	}
	
	
	
	/*** This function will perform double click on an element 
	 * 
	 * 
	 * ***/
	public static void double_click(WebElement element) {
		action.doubleClick(element).perform();
	}
}
