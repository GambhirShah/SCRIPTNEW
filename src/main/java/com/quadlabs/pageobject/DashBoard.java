package com.quadlabs.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;


public class DashBoard extends Baselibrary
{

	
	
	public static void search  (String	Travellertype,String User_FirstName,String triptype,String depcity, String Descity) throws Exception
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
		
		else if (Travellertype.equalsIgnoreCase("Guest User"))
		{
			WebElement Guest_radio_button = getWebElement("GuestUserclick");
			
			Guest_radio_button.click();
			
			 WebElement PolicyDropdown =  getWebElement("PolicyDropdown");
			    
			    Select Sel = new Select(PolicyDropdown);
			    Sel.selectByVisibleText("123");
		}
		if (triptype.equalsIgnoreCase("oneway"))
		{
			
			getWebElement("oneway").click();
		 
			getWebElement("Departurecity").sendKeys(depcity);
		 
			Thread.sleep(2000);
		 
			List<WebElement> cities= driver.findElements(By.id("divDepartureCity"));
		 
			for(WebElement depelement : cities)
			{
			
				if (depelement.getText().equals(depcity))
				{
				 
					depelement.click();
				
				}
			 
				else
			 
				{
				
					System.out.println("No departure city found");}
			}
			
		 getWebElement("Destinationcity").sendKeys(Descity); 
		 Thread.sleep(4000);
		 List<WebElement> descities= driver.findElements(By.id("txtDestinationCity"));
		 for(WebElement deselement : descities)
		 {
			 if (deselement.getText().contains(Descity))
			 {
				 deselement.click();
			 }
			 else
			 {System.out.println("No destinations city found");}
			  }}
		
		else if (triptype.equalsIgnoreCase("Roundtrip"))
		     {
			getWebElement("roundtrip").click();
		    getWebElement("Departurecity").sendKeys(depcity);
		    List<WebElement> cities= driver.findElements(By.id("divDepartureCity"));
		    for(WebElement depelement : cities)
		     {
			 if (depelement.getText().contains(depcity))
			 {
				 depelement.click();
			 }
			 else
			  {
				 System.out.println("No departure city found");}
			  }
		 getWebElement("Destinationcity").sendKeys(Descity); 
		 List<WebElement> descities= driver.findElements(By.id("txtDestinationCity"));
		 for(WebElement deselement : descities)
		 {
			 if (deselement.getText().contains(Descity))
			 {
				 deselement.click();
			 }
			 else
			 {
				 System.out.println("No destinations city found");}
			 }
		 }
		
		else if (triptype.equalsIgnoreCase("Multicity"))
		{getWebElement("multicity").click();
		 getWebElement("Departurecity").sendKeys(depcity);
		 List<WebElement> cities= driver.findElements(By.id("divDepartureCity"));
		 for(WebElement depelement : cities)
		 {
			 if (depelement.getText().contains(depcity))
			 {
				 depelement.click();
			 }
			 else
			 {System.out.println("No departure city found");}
			  }
		 getWebElement("Destinationcity").sendKeys(Descity); 
		 List<WebElement> descities= driver.findElements(By.id("txtDestinationCity"));
		 for(WebElement deselement : descities)
		 {
			 if (deselement.getText().contains(Descity))
			 {
				 deselement.click();
			 }
			 else
			 {System.out.println("No destinations city found");}
			  }}
}      
	
}
