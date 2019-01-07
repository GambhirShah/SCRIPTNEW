package com.quadlabs.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;


public class DashBoard extends Baselibrary
{

	
	
	public static void search  (String	Travellertype,String User_FirstName ) throws Exception
	{
		
		or = new Properties();
		
		File	file = new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
		 
		FileInputStream fis = new FileInputStream(file);
			
		or.load(fis);
	
		 
			
		if (Travellertype.equalsIgnoreCase("Employee"))
		{
			
		
		
		WebElement emp_radio_button = getWebElement("empradiobutton");
		
		emp_radio_button.click();
		
	
		
		WebElement name = getWebElement("Name");
		
		name.sendKeys(User_FirstName);
		
		getWebElement("button_click").click();
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		
	//	wait.until(ExpectedConditions.elementToBeClickable(element))
		
		Thread.sleep(2000);
		
		getWebElement("Clicking_value").click();
	
	    getWebElement("RadionBusinesstrip").click();
	    
	    WebElement PolicyDropdown =  getWebElement("PolicyDropdown");
	    
	    Select Sel = new Select(PolicyDropdown);
	    Sel.selectByVisibleText("user policy");
	    }
		
		if (Travellertype.equalsIgnoreCase("Guest User"))
		{
			WebElement Guest_radio_button = getWebElement("GuestUserclick");
			
			Guest_radio_button.click();
			
			 WebElement PolicyDropdown =  getWebElement("PolicyDropdown");
			    
			    Select Sel = new Select(PolicyDropdown);
			    Sel.selectByVisibleText("123");
		}
		
		
	
	}
}
