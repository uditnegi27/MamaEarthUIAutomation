package com.mamaearth.PageObject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://mamaearth.in/");
		
		driver.findElement(By.xpath("//input[@class='StyledInput-sc-1m95fu4-0 dQlmoN search-input']")).sendKeys("hair");
		driver.findElement(By.xpath("//button[@class='search-button']")).click();
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='price' or @class='price special']"));
		
		WebElement ee = list.get(4);
		System.out.println(ee.getText());
		
		for(int i=0; i<list.size(); i++) {
		
			WebElement element = list.get(i);
			String cost = element.getText();
			System.out.println(i + " --> "+cost);
		}
		
		System.out.println("done");
		driver.quit();

	}

}
