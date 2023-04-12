package com.mamaearth.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.mamaearth.Utils.mamaearth_utils_CategoriesFunctions;

public class mamaearth_GoodnessInsider extends mamaearth_utils_CategoriesFunctions{
	
	@FindBy(xpath = "//img[@class='elgible-image']")
	WebElement GI_Banner;
	
	
}
