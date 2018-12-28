package com.quadlabs.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import com.quadlabs.generic.Baselibrary;

public class DashBoard extends Baselibrary
{

	
	
	public static void search  () throws Exception
	{
		
		or = new Properties();
		
		File	file = new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
		 
		FileInputStream fis = new FileInputStream(file);
			
		or.load(fis);
	
		String	Travellertype = "Employee";
			
		if (Travellertype.equalsIgnoreCase("Employee"))
		{
		
		WebElement emp_radio_button = getWebElement("empradiobutton");
		
		emp_radio_button.click();
		
		WebElement name = getWebElement("Name");
		
		name.sendKeys("Kanchan");
		
		getWebElement("button_click").click();

		getWebElement("Clicking_value").click();
		
		}
		
		
		
	
	}
}
