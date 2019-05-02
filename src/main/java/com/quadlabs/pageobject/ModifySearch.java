package com.quadlabs.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.quadlabs.generic.Baselibrary;

public class ModifySearch extends Baselibrary
{
	
	
	public static void flightmodify(String depcity,String depcityairport,String Descity,String Descityairport,String
			Triptype,String tripdate,String Airline,String PolicyType) throws Exception
	
	
	{
	getWebElement("Modifysearch").click();
	
	if(Triptype.equalsIgnoreCase("One-Way"))
	
	{
		
	getWebElement("Oneway").click();
	listofautosuggestion(By.xpath("//div[@id='divDepartureCity0']/p"),depcity, depcityairport,By.xpath("//input[@id='MtxtDepartureCity0']"));
	listofautosuggestion(By.xpath("//div[@id='divDestinationCity']/p"),Descity, Descityairport,By.xpath("//input[@id='MtxtDestinationCity0']"));
		
	
	getWebElement("Tripdate").click();
	
	calender(tripdate);
	
	getWebElement("PreferredAirline").click();
	
	getWebElement("SearchButton").click();
	getWebElement("SearchPreferredAirline").sendKeys(Airline);
	driver.findElement(By.xpath("//label[contains(text(),'"+Airline+"')]")).click();
	
	List<WebElement> Airlines= driver.findElements(By.xpath("((//div[@id='tdContainerTblAirlines'])[2]//li"));
	for(WebElement Categorytype:Airlines)
	{
		System.out.println(Categorytype.getText());
	if(Categorytype.getText().equalsIgnoreCase(Airline))
	{
		Reporter.log("Airline Matched ");
	}
	else
	{
		Reporter.log("Airline not matched ");
	}
	
	}
	WebElement Airlinematcher= driver.findElement(By.xpath("//div[@class='filter_box']//div[@id='tdContainerTblAirlines']//li[@class='ng-scope']"));
	
/**	List<WebElement> farecategorytype= driver.findElements(By.xpath("(//div[contains(@id,'tdContainerTblAirlines')]/ul)[2]/li"));
	for(WebElement Categorytype:farecategorytype)
	{
		System.out.println(Categorytype.getText());
	if(Categorytype.getText().equalsIgnoreCase(Airline))
	{
		Categorytype.click();
		}
	}
**/	
	
	List<WebElement> Policy = driver.findElements(By.xpath("//ul[@class='timelape stop-list pticon']/li"));
	for(WebElement policy:Policy)
	{
		if(policy.getText().equalsIgnoreCase(PolicyType))
		{
			policy.click();
		}
	}
	
//	getWebElement("FareBreakup").click();
	
//	WebElement wb=getWebElement("Fare");
//	String farebreakupprice =wb.getText();
//	WebElement Wb1=getWebElement("FareBreakup");
//	String searchFare=Wb1.getText();
//	SoftAssert Sa=new SoftAssert();
//	Sa.assertEquals(searchFare, farebreakupprice,"Fare Breakup not Matched");
//	Reporter.log("Fare Breakup Matched", true);
	
	
	
//	getWebElement("FlightItinerary").click();
//	getWebElement("SendEmail").click();
//	getWebElement("EnterEmail").sendKeys("Anurag.upadhyay@quadlabs.com");
//	driver.switchTo().alert().accept();
//	getWebElement("Close").click();
//	getWebElement("Print").click();
//	getWebElement("PrintClick").click();
	getWebElement("BookNow").click();
	getWebElement("CheckTermAndCondition").click();
	getWebElement("InstantTicket").click();
	}
    }

}
