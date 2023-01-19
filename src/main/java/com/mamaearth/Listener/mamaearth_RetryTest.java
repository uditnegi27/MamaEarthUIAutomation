package com.mamaearth.Listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class mamaearth_RetryTest implements IRetryAnalyzer{

	public int currentCount = 0;
	public final int retryCount = 3;
	
	
	/***  This function execute the failed test cases to fixed retryCount 
	 * 
	 * 
	 * ***/
	public boolean retry(ITestResult result) {
		if(currentCount < retryCount) {
			currentCount++;
			return true;
		}
		return false;
	}
	
}
