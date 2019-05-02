package com.quadlabs.pageobject.hotel;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.WaitStatement;

public class DashBoard extends Baselibrary 
{

	public static void search(String Travellertype,String User_FirstName,String email,
			String cityname,String destcity,String tripdate,String returndate,
			String NOofroom ,String Adultsinroom1,String Adultsinroom2,
			String Adultsinroom3,String Adultsinroom4,String Adultsinroom5) throws Exception{
		
	or = new Properties();
		
		File	file = new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
		 
		FileInputStream fis = new FileInputStream(file);
			
		or.load(fis);
	
	getWebElement("Hotel").click();
	
	if (Travellertype.equalsIgnoreCase("Employee"))
	{
	WebElement emp_radio_button = getWebElement("empradiobutton");
		
		emp_radio_button.click();
		
		WebElement name = getWebElement("Name");
		
		name.sendKeys(User_FirstName);
		
		getWebElement("button_click").click();
		
		Thread.sleep(2000);
		
		WebElement	searchclick=getWebElement("Clicking_value");
		WaitStatement.explicitWaitForClickable(driver, 50, searchclick);
		
		WebElement Email= driver.findElement(By.xpath("//span[contains(.,'"+email+"')]"));
		
		WaitStatement.explicitWaitForVisibility(driver, 20, Email);
		
			searchclick.click();
			
			
		
		    getWebElement("RadionBusinesstrip").click();
		    
		    WebElement PolicyDropdown =  getWebElement("PolicyDropdown");
		    
		 //   Select Sel = new Select(PolicyDropdown);
		   // Sel.selectByVisibleText("Anurag Hotel POlicy");
	}
	
	else if (Travellertype.equalsIgnoreCase("Guest User"))
	{
		WebElement Guest_radio_button = getWebElement("GuestUserclick");
		
		Guest_radio_button.click();
		
		 WebElement PolicyDropdown =  getWebElement("PolicyDropdown");
		    
		    Select Sel = new Select(PolicyDropdown);
		    Sel.selectByVisibleText("123");
	}
	
	listofautosuggestion(By.xpath("//div[@id='divHotelName']/p"),cityname, destcity,By.xpath("//div[contains(@class,'search_row cities sr_hotelcity')]//input[@placeholder='Enter Destination City']"));

	
	driver.findElement(By.xpath("(//span[@class='pikcalndr_inside'])[9]//span[@class='pikcalndr datepick-trigger']/img")).click();
	calender(tripdate);
	
	
	JavascriptExecutor currmon= (JavascriptExecutor) driver;
	WebElement 	monclick=driver.findElement(By.xpath("//div[@class='datepick-month first']/div[@class='datepick-month-header']"));
	currmon.executeScript("arguments[0].click();", monclick);
	

	//(//span[@class='pikcalndr datepick-trigger'])[10]
	
	
	calender(returndate);
	
WebElement room =	getWebElement("Rooms");
	Select sel3 = new Select(room);
	sel3.selectByVisibleText(NOofroom);
	
	if(NOofroom=="1")
	{
		WebElement Adultcount=getWebElement("Room1");
		Select sel = new Select(Adultcount);
		sel.selectByVisibleText(Adultsinroom1);
	}else if(NOofroom=="2")
	{
		WebElement Adultcount=getWebElement("Room2");
		Select sel = new Select(Adultcount);
		sel.selectByVisibleText(Adultsinroom2);
	}else if(NOofroom=="3")
	{
		WebElement Adultcount=getWebElement("Room3");
		Select sel = new Select(Adultcount);
		sel.selectByVisibleText(Adultsinroom3);
	}else if(NOofroom=="4")
	{
		WebElement Adultcount=getWebElement("Room4");
		Select sel = new Select(Adultcount);
		sel.selectByVisibleText(Adultsinroom4);
	}else if(NOofroom=="5")
	{
		WebElement Adultcount=getWebElement("Room4");
		Select sel = new Select(Adultcount);
		sel.selectByVisibleText(Adultsinroom5);
	}
	getWebElement("Searchbut").click();
}
}