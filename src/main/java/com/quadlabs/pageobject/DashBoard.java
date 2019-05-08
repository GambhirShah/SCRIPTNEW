package com.quadlabs.pageobject;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;

import com.quadlabs.generic.HandlingStaleElement;
import com.quadlabs.generic.WaitStatement;


public class DashBoard extends Baselibrary


{
	
	public static void search  (String	Travellertype,String User_FirstName,String triptype,String depcity, 
			String Descity,String depcityairport, String Descityairport,String tripdate,String returndate,String email) throws Exception
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
		
		
		
	//	wait.until(ExpectedConditions.elementToBeClickable(element))
		
		Thread.sleep(2000);
		
	WebElement	searchclick=getWebElement("Clicking_value");
	WaitStatement.explicitWaitForClickable(driver, 50, searchclick);
	
	WebElement Email= driver.findElement(By.xpath("//span[contains(.,'"+email+"')]"));
	
	WaitStatement.explicitWaitForVisibility(driver, 20, Email);
	
		searchclick.click();
		
		
	
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
		
		/////////////////////////////////////////////one way///////////////////////////////////////////////
		if (triptype.equalsIgnoreCase("oneway"))
		{
			
			Thread.sleep(2000);
			getWebElement("oneway").click();
			

	listofautosuggestion(By.xpath("//*[@id='divDepartureCity']/p"),depcity, depcityairport,By.xpath("//*[@id='txtDepartureCity']"));
listofautosuggestion(By.xpath("//*[@id='divDestinationCity']/p"),Descity, Descityairport,By.xpath("//*[@id='txtDestinationCity']"));
				

		
		 
		getWebElement("calndElemnt").click();
//			String tripdate="26-7-2019";

		System.out.println("Trip date"+tripdate);

		String[] tripDateA = tripdate.split("-");

		int tripDay=Integer.parseInt(tripDateA[0]);
		System.out.println("tripDateA[0]"+tripDateA[0]);

		int tripMon=Integer.parseInt(tripDateA[1]);
		System.out.println("tripDateA[1]"+tripDateA[1]);

		int tripYear=Integer.parseInt(tripDateA[2]); 
		System.out.println("tripDateA[2]"+tripDateA[2]);
		WebElement currentmonth= getWebElement("firstmonth");
		
          String value= currentmonth.getText();
          
          System.out.println(value);
          
          String[] CalMonYear = value.split(" ");
          
          String currentMon = CalMonYear[0];
          System.out.println(currentMon);
          
          int currentMonNum=1;
          
          if(currentMon.equalsIgnoreCase("Jan")){
        	  currentMonNum=1;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Feb")){
        	  currentMonNum=2;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Mar")){
        	  currentMonNum=3;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Apr")){
        	  currentMonNum=4;

        	  }
        	  else if(currentMon.equalsIgnoreCase("May")){
        	  currentMonNum=5;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Jun")){
        	  currentMonNum=6;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Jul")){
        	  currentMonNum=7;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Aug")){
        	  currentMonNum=8;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Sep")){
        	  currentMonNum=9;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Oct")){
        	  currentMonNum=10;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Nov")){
        	  currentMonNum=11;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Dec")){
        	  currentMonNum=12;

        	  }
          for (int i = 1; i < tripMon - currentMonNum; i++) {
        	  
        	  Thread.sleep(1000);
        	  getWebElement("nextmonth").click();
        	  }
          
          Thread.sleep(2000);
          driver.findElement(By.xpath("(//a[contains(.,'"+tripDay+"')])[1]")).click();
		 }
		
		
		
		////////////////////////////////round trip ///////////////////////////////////////////////////////////
		
		else if (triptype.equalsIgnoreCase("Roundtrip"))
		     {
			getWebElement("roundtrip").click();

		    
			listofautosuggestion(By.xpath("//*[@id='divDepartureCity']/p"),depcity, depcityairport,By.xpath("//*[@id='txtDepartureCity']"));
			listofautosuggestion(By.xpath("//*[@id='divDestinationCity']/p"),Descity, Descityairport,By.xpath("//*[@id='txtDestinationCity']"));

					 
		
	
		 
		getWebElement("calndElemnt").click();
		
		calender(tripdate);
		
        Thread.sleep(2000);
  
        driver.findElement(By.xpath("(//span[contains(@class,'pikcalndr datepick-trigger')])[2]")).click();
        
        calender(returndate);
        }

		else if (triptype.equalsIgnoreCase("Multicity"))
		{
		 getWebElement("multicity").click();
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
		 
        JavascriptExecutor SearchClick = (JavascriptExecutor) driver;
        
        WebElement serchclick = driver.findElement(By.xpath("//input[contains(@id,'btnSearchFlight')]"));
        
        SearchClick.executeScript("arguments[0].click();", serchclick);
		
        }     

	
}
	

