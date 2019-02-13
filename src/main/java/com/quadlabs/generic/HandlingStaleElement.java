package com.quadlabs.generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandlingStaleElement extends Baselibrary {
   
	
	static WebDriver driver;
	
	public static boolean handlingStaleElement1 (String comparabledata) throws Exception
	{
		
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) 
	    {
	        try {
	        	
	        	
	        	
	        	List<WebElement> users =  driver.findElements(By.id("divDestinationCity"));
	        	
	        	for(WebElement webelement : users)
	        	{
	        		if(webelement.getText().contains(comparabledata))
	        		{
	        			System.out.println(webelement.getText());
	        			
	        			webelement.click();
	        			
	        			getWebElement("Addselect").click();
	    
	        			result = true;
	        			
	        			Thread.sleep(1000);
	    			    break;
	    			    
	        		}
	        	}
	        	} catch(StaleElementReferenceException e) 
	                {}attempts++;
	      }
	    return result;
	    
	    
	    
	 }
	public static  boolean retryingFindClick(String xpathExpression) {
	    boolean result = false;
	    int attempts = 0;
	    while(attempts < 2) {
	        try {
	            driver.findElement(By.xpath(xpathExpression)).click();
	            result = true;
	            break;
	        } catch(StaleElementReferenceException e) {
	        }
	        attempts++;
	    }
	    return result;
	}
}
