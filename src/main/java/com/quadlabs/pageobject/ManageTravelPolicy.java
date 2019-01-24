package com.quadlabs.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.HandlingStaleElement;

public class ManageTravelPolicy extends Baselibrary {

	
	public static void policy(String Travelpurpose,String PolicyTitle,String prod,
			                  String Ruleapply,String category,String Policycriteria,String Airline ,String origin,String destination,
			                  String PriceFrom, String PriceTo) 
			                		  throws Exception
	{
		
	getWebElement("Corporate").click();
	getWebElement("approverpolicyworkflow").click();
	getWebElement("Managetravelpolicy").click();
	getWebElement("Addtravel").click();
	getWebElement("PolicyNAme").sendKeys(PolicyTitle);
	
	
	if(Travelpurpose.equalsIgnoreCase("Businesstrip"))
	{
		getWebElement("TravelPurposeBusinesstrip").click();
	}
	
	else if(Travelpurpose.equalsIgnoreCase("Personaltrip"))
	{
	getWebElement("TravelPurposePersonaltrip").click();	
	}
	
	else if(Travelpurpose.equalsIgnoreCase("GuestUser"))
	{
	getWebElement("TravelPurposeGuesttrip").click();	
	}
	else if(Travelpurpose.equalsIgnoreCase("MultiPassenger"))
	{
	getWebElement("TravelPurposeMultiPAssengertrip").click();	
	}
	
	
	WebElement Travelcategory=getWebElement("TravelCategory");
	Select seltra= new Select(Travelcategory);
	seltra.selectByVisibleText(category);
	
	WebElement product=getWebElement("Product");
	Select selcat= new Select(product);
	selcat.selectByVisibleText(prod);
	
	WebElement RuleApplied = getWebElement("RuleApplied");
	Select RuleApply =new Select(RuleApplied);
	RuleApply.selectByVisibleText(Ruleapply);
	
	if(prod.equalsIgnoreCase("Flight"))
	{
		WebElement flightsearchciteria=getWebElement("Flightsearcri");
		Select Selsearchcriteria= new Select(flightsearchciteria);
		Selsearchcriteria.selectByVisibleText(Policycriteria);
		
		if (Policycriteria.equalsIgnoreCase("Airline Criteria"))
		       {
			   getWebElement("AirlineCRitflight").sendKeys(Airline);
			   
			   List<WebElement> ele = driver.findElements(By.xpath("//select[@id='ListBoxAirlineFiller']/option"));
				
				for(WebElement element : ele)
				{
				System.out.println(element.getText());
				
				if(element.getText().equalsIgnoreCase(Airline))
				   {
					
					element.click();
					
					getWebElement("Addselect").click();
					
					break;
					
					}	
				}
	//	       HandlingStaleElement.handlingStaleElement1(Airline ,"//select[@id='ListBoxAirlineFiller']/option");
		       getWebElement("SelectAndClose").click();
		       }
		else if (Policycriteria.equalsIgnoreCase("Origin"))
		{
			  List<WebElement> ele = driver.findElements(By.xpath("//select[@id='ListBoxOriginZone']/option"));
				
				for(WebElement element : ele)
				{
				System.out.println(element.getText());
				
				if(element.getText().equalsIgnoreCase(origin))
				   {
					
					element.click();
					
					getWebElement("Addselect").click();
					
					break;
					
					}	
				}
	//	      HandlingStaleElement.handlingStaleElement1(origin ,"//select[@id='ListBoxOriginZone']/option");
		       getWebElement("SelectAndClose").click();
			
		}
		else if (Policycriteria.equalsIgnoreCase("Destination"))
		{
			  List<WebElement> ele = driver.findElements(By.xpath("//select[@id='ListBoxDestinationZone']/option"));
				
				for(WebElement element : ele)
				{
				System.out.println(element.getText());
				
				if(element.getText().equalsIgnoreCase(destination))
				   {
					
					element.click();
					
					getWebElement("Addselect").click();
					
					break;
					
					}	
				}	
		   //    HandlingStaleElement.handlingStaleElement1(destination,"//select[@id='ListBoxDestinationZone']/option");
		       getWebElement("SelectAndClose").click();
			
		}
		else if (Policycriteria.equalsIgnoreCase("Customer Cost"))
		{
			
		      getWebElement("pricefrom").sendKeys(PriceFrom);
		      
		      getWebElement("priceto").sendKeys(PriceTo);
		      
		       getWebElement("SelectAndClose").click();
			
		}
	}
	else if(prod.equalsIgnoreCase("Hotel"))
	{
		WebElement Hotelsearchciteria=getWebElement("Hoteltsearcri");
		Select Selsearchcriteria= new Select(Hotelsearchciteria);
		Selsearchcriteria.selectByVisibleText(Policycriteria);
		
	}
	
	}
	public static void policyappliedon(String Traveller) throws Exception{
	
	List<WebElement> ele = driver.findElements(By.xpath(".//*[@id='listUser']/option"));
	
	for(WebElement element : ele)
	{
	System.out.println(element.getText());
	
	if(element.getText().equalsIgnoreCase(Traveller))
	   {
		
		element.click();
		
		getWebElement("Addselect").click();
		
		break;
		
		}	
	}
	Thread.sleep(3000);
	getWebElement("Savepolicy").click();}
	
}
