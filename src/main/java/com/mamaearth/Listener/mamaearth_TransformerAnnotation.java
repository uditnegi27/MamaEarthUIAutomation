package com.mamaearth.Listener;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class mamaearth_TransformerAnnotation implements IAnnotationTransformer{
	
	
	/*** This function will run the failed test cases after the execution from taking a count using the retry method from retryTest class
	 * 
	 * 
	 * 
	 ***/
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	   annotation.setRetryAnalyzer(mamaearth_RetryTest.class);
	  }

	
}
