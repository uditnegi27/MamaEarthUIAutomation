package com.mamaearth.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_utils extends mamaearth_Base{
	
	
	
	/*** This function will take the screen short of the page and store on the folder which path user will give in the argument
	 * @throws IOException 
	 * 
	 * 
	 * 
	 * 
	 * ***/
	public static void take_screenShot(String screenShortName) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File capturedScreenShot = screenShot.getScreenshotAs(OutputType.FILE);
		File sourceFile = new File("/Users/honasa/Desktop/image/"+screenShortName+".png");
		FileUtils.copyFile(capturedScreenShot, sourceFile);
	}
	
	
	
	
	
	/*** This functions will return the object[][]
	 * @throws IOException 
	 * 
	 * 
	 * ***/
	public static Object[][] address_details(String sheetName) throws IOException{
		
		FileInputStream file = null;
		
		try {
			file = new FileInputStream(prop.getProperty("sheetPath"));
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		@SuppressWarnings("resource")
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(1).getLastCellNum();
		
		Object[][] data = new Object[rowCount][colCount];
		
		for(int i=0; i<rowCount; i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<colCount; j++) {
				XSSFCell cell = row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j] = cell.getStringCellValue();
			}
		}
		
		return data;
	}
	
	
	
	
	/*** This function will scroll the page using the pixel of the page 
	 * 
	 * 
	 * 
	 * ***/
	public void scollByPixel(int startPixel, int lastIndex) {
		JavascriptExecutor javaExe = (JavascriptExecutor) driver;
		javaExe.executeScript("window.scrollBy("+startPixel+", "+lastIndex+")", "");
	}
	
	
	
	/*** This function will scroll the browser page till the end of the page 
	 * 
	 * 
	 * 
	 * ***/
	public void scrollToEnd() {
		JavascriptExecutor javaExe = (JavascriptExecutor) driver;
		javaExe.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	}
	
	
	
	/*** This function will find an element and scroll till that element 
	 * 
	 * 
	 * ***/
	public void scrollToElement(WebElement element) {
		JavascriptExecutor javaExe = (JavascriptExecutor) driver;
		javaExe.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	
	/*** This function will print all the broken links present on the opened browser page  
	 * 
	 * 
	 * 
	 * ****/
	public static void print_all_broken_links() throws IOException {
		
		List<WebElement> allurlLinks = driver.findElements(By.tagName("a"));
		List<String> urlLinks= new ArrayList<>();
		
		for(int i=0; i<allurlLinks.size(); i++) {
			
			WebElement webelement = allurlLinks.get(i);
			String url = webelement.getAttribute("href");
			
			try {
				if(!url.equals("null")) {
					urlLinks.add(url);
				}
			}
			catch(NullPointerException e) {
			}
		}
		
		System.out.println("Total urls count is: "+urlLinks.size());
		
		int brokCount = 0;
		int count = 0;
		
		for(int i=0; i<urlLinks.size(); i++) {
			if(urlLinks.get(i).contains("http")) {
				URL url = new URL(urlLinks.get(i));
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.connect();
				
				int response = connection.getResponseCode();
				
				connection.disconnect();
				
				if(response >= 400) {
					brokCount++;
					System.out.println(i+"  --->>   "+"not working: "+ urlLinks.get(i));
					}
			}
			else {
				System.out.println(urlLinks.get(i)+ "-> Does not have http in URL");
				count++;
			}
			
		}
		
		System.out.println("Total URLs are: "+ urlLinks.size());
		System.out.println("Broken URLs are: "+ brokCount);
		System.out.println("URL which does not have http are: "+ count);
	}

}
