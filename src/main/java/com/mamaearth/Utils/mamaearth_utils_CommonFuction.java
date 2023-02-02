package com.mamaearth.Utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mamaearth.Base.mamaearth_Base;

public class mamaearth_utils_CommonFuction extends mamaearth_Base{
	
	
	
	/*** This function will verify the visibility of the product display images
	 * @throws IOException 
	 * 
	 * 
	 * 
	 ***/
	public static boolean verfiy_Images_ofProducts() throws IOException {
		boolean defaultFlag = true;
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		for(int i = 0; i<imagesList.size(); i++) {
			URL url = new URL(imagesList.get(i).getAttribute("src"));
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			int response = connection.getResponseCode();
			if(response >= 400) defaultFlag = false;
			connection.disconnect();
		}
		if(defaultFlag) return true;
		else return false;
	}
	
	
	
	/*** This function will return the count of broken links present on the page
	 * @throws IOException 
	 * 
	 * 
	 * 
	 * ***/
	public static int get_count_of_brokenLinks() throws IOException {
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
		
		int brokCount = 0;
		
		for(int i=0; i<urlLinks.size(); i++) {
			if(urlLinks.get(i).contains("http")) {
				URL url = new URL(urlLinks.get(i));
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.connect();
				
				int response = connection.getResponseCode();
				
				connection.disconnect();
				
				if(response >= 400) {
					brokCount++;
				}
			}
		}
		return brokCount;
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
		
		System.out.println("Total urls present on a page are : "+urlLinks.size());
		
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
