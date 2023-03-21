package com.mamaearth.Utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_utils extends mamaearth_Base{
	
	
	/*** This function will give explicit wait to an element click able
	 * 
	 * 
	 * ***/
	public static void waitToElementClickable(WebElement element, Duration stayTime) {
		new WebDriverWait(driver, stayTime).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	/*** This function will give explicit wait to an element presence
	 * 
	 * 
	 * ***/
	public static void waitToElementPresence(WebElement element, Duration stayTime) {
		new WebDriverWait(driver, stayTime).until(ExpectedConditions.visibilityOf(element));
	}
	
	
	
	/*** This function will give implicit wait to an element
	 * 
	 * 
	 * ***/
	public static void implicit_wait(Duration stayTime) {
		driver.manage().timeouts().implicitlyWait(stayTime);
	}
	
	
	
	/*** This function will take the screenshot of the page and store on the folder which path user will give in the argument
	 * @throws IOException 
	 * 
	 * 
	 * 
	 * ***/
	public static void take_screenShot(String screenShotName) {
		
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File capturedScreenShot = screenShot.getScreenshotAs(OutputType.FILE);
		File sourceFile = new File("/Users/honasa/Desktop/image/"+screenShotName+".png");
		
		try {
			FileUtils.copyFile(capturedScreenShot, sourceFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	/*** This function will take the screenshot of the Specific section
	 * 
	 * 
	 * ***/
	public static void take_screenShotOfElement(String screenShotName, WebElement element) throws IOException{
		File capturedScreenShot = element.getScreenshotAs(OutputType.FILE);
		File sourceFile = new File("/Users/honasa/Desktop/image/"+screenShotName+".png");
		
		try {
			FileUtils.copyFile(capturedScreenShot, sourceFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	/*** This function will scroll the page using the pixel of the page 
	 * 
	 * 
	 * 
	 * ***/
	public static void scollByPixel(int startPixel, int lastIndex) {
		JavascriptExecutor javaExe = (JavascriptExecutor) driver;
		javaExe.executeScript("window.scrollBy("+startPixel+", "+lastIndex+")", "");
	}
	
	
	
	/*** This function will scroll the browser page till the end of the page 
	 * 
	 * 
	 * 
	 * ***/
	public static void scrollToEnd() {
		JavascriptExecutor javaExe = (JavascriptExecutor) driver;
		javaExe.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	}
	
	
	
	/*** This function will find an element and scroll till that element 
	 * 
	 * 
	 * ***/
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor javaExe = (JavascriptExecutor) driver;
		javaExe.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
}
