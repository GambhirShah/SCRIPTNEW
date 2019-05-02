package com.quadlabs.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.GetPropertyValue;
import com.quadlabs.generic.HandlingStaleElement;
import com.quadlabs.generic.WaitStatement;

public class Managetraveller extends Baselibrary {

	
	public static void corporatemanagement(String Empcode ,String Title,String EmpFirstName,String  EmpLastName,
			String Username,String Emailid,String branchname,String Language,String Address,
			String City,String State,String Postcode,String phoneCountrycode,String Phone,String MobCountrycode,String Mobileno,String Remark,
			String departme,String designe,String emplgradecategory,String cocenter,String Proj ) throws Exception
	{  
		
		getWebElement("Corporate").click();
	
		getWebElement("ManageTraveller").click();
		
//String expectedurl="https://corporatetravel.dnataindia.com/CAM/Admin/asp/SA_UserSearch.aspx?Client_ID=24307";
//String actualurl=driver.getCurrentUrl();
	//	Assert.assertEquals(actualurl,expectedurl," Url is not Verified");
		//Reporter.log("Homepage Url Is Verified", true);	
		
	getWebElement("CreateEmployee").click();
		
		
//String expectedurl1="https://corporatetravel.dnataindia.com/CAM/Admin/asp/"
	//	+ "CA_userexecutive.aspx?MAX=MAX&Pos=1&SubAgentID=kMmXZj1dXNcpTcKX2VwTlQ%3d%3d";
//String actualurl1=driver.getCurrentUrl();
//Assert.assertEquals(actualurl1,expectedurl1," Url is not Verified");
//Reporter.log("Homepage Url Is Verified", true);	


    /**     getWebElement("Empcode").sendKeys(Empcode);
       
WebElement title=getWebElement("Title");
         
         Select Sel1= new Select(title);
         
         Sel1.selectByVisibleText(Title);
        
         getWebElement("EmpFirstName").sendKeys(EmpFirstName); 
         
         getWebElement("EmpLastName").sendKeys(EmpLastName); 
         
      
         getWebElement("Username").sendKeys(Username);
       
         
         getWebElement("Emailid").sendKeys(Emailid);
         
 //  WebElement branch=      getWebElement("Branch");
    //        Select Br= new Select(branch);
      //             Br.selectByVisibleText(branchname);
     
     
WebElement lang=getWebElement("Language");
         
         Select Sel2= new Select(lang);
         
         Sel2.selectByVisibleText(Language);
         getWebElement("Address").sendKeys(Address);
         getWebElement("City").sendKeys(City);
         getWebElement("State").sendKeys(State);
         getWebElement("Postcode").sendKeys(Postcode);
         
         
         
         
         
List<WebElement> dropdowncountrycode=  driver.findElements(By.xpath("//select[@id='ddlPhoneCountryCode']"));  
    	for(WebElement webelement : dropdowncountrycode)
    	{
    		if(webelement.getText().contains(phoneCountrycode))
    		{
    			
    			webelement.click();
    			
    		}
        }  
         getWebElement("Phoneno.").sendKeys(Phone);       
List<WebElement> dropdownmobilecountrycode=driver.findElements(By.xpath("//select[@id='ddlPhoneCountryCode']"));  
     	for(WebElement webelement : dropdownmobilecountrycode)
     	{
     		if(webelement.getText().contains(MobCountrycode))
     		{
     			
     			webelement.click();
     			
     		}
         }
       
         getWebElement("Phoneno.").sendKeys(Mobileno);
         
         getWebElement("Remarks").sendKeys(Remark);
         
         
 // WebElement department = getWebElement("Department");
         
   //      Select Sele= new Select(department);
         
     //    Sele.selectByVisibleText(departme);
    
         WebElement designation = getWebElement("Designation");
         
         Select Sel6= new Select(designation);
         
         Sel6.selectByVisibleText(designe);
         
WebElement employeegradecategory=getWebElement("Employeegradecategory");
         
       Select Sel7= new Select(employeegradecategory);
         
       Sel7.selectByVisibleText(emplgradecategory);
         
         getWebElement("BookforFamily").click();
         getWebElement("Personal").click();   
         
         
WebElement costcenter=getWebElement("Costcenter");
         
         Select Sel8= new Select(costcenter);
         
         Sel8.selectByVisibleText(cocenter);
         
WebElement project=getWebElement("Project");
         
         Select Sel9= new Select(project);
         
         Sel9.selectByVisibleText(Proj);
         
         getWebElement("Administrator").click();
         getWebElement("Travellertype").click();
         getWebElement("TravellerTypeCIP").click();**/
	
	
        
     WebElement digsign=getWebElement("uploaddigsign");
     Actions Act =new Actions(driver);
 	Act.moveToElement(digsign).perform();
     digsign.sendKeys("E:\\Self Booking Tools\\extradata\\bmw.jpg");
        
      WebElement pp=getWebElement("Profilepic");	
      
      Actions Act1 =new Actions(driver);
   	Act.moveToElement(pp).perform();
     pp.sendKeys("E:\\Self Booking Tools\\extradata\\bmw.jpg");
        
        getWebElement("Saveprofile").click(); 
 /**      driver.findElement(By.xpath("//a[contains(.,'"+EmpFirstName+" "+EmpLastName+"')]")).click();
      getWebElement("Passport").click();
		
	}
	
	public static void Passport(String Passport,String day,String Month,
			String Date, String Year ,String Nation,String expday,String expMonth, String expDate, 
			String expYear,String IssuingCountry) throws Exception
	{
		 getWebElement("PassportAdd").click();
		getWebElement("PassportNo").sendKeys(Passport);
		getWebElement("Dateofbirth").click();
		
		List<WebElement> dobyear =  driver.findElements(By.xpath("//div[@class='datepick-popup']//select[@class='datepick-month-year'and @title='Change the year']/option"));  
    	for(WebElement webelement : dobyear)
    	{
    		if(webelement.getText().contains(Year))
    		{
    			
    			webelement.click();
    			break;
           	}
         }
    	
    	List<WebElement> month =  driver.findElements(By.xpath("//*[@title='Change the month']/option"));  
    	
    	for(WebElement webelement : month){
    		
    		System.out.println(webelement.getText());
    	
    		if(webelement.getText().contains(Month))
    		{
    			
    			webelement.click();
    			break;
           	}
         }
    	
	
    	

	   
	   
	
		driver.findElement(By.xpath("//a[contains(.,'"+Date+"')]")).click();
		
	WebElement nationality=getWebElement("Nationality");
		Select sel= new Select(nationality);
		sel.selectByVisibleText(Nation);
		
    WebElement passportissuecountry= getWebElement("Passportissuecountry");
		Select sel1= new Select (passportissuecountry);
		sel1.selectByVisibleText(IssuingCountry);
		
		getWebElement("passportexpdate").click();
		
		List<WebElement> expyear =  driver.findElements(By.xpath("//div[@class='datepick-popup']//select[@class='datepick-month-year'and @title='Change the year']/option"));  
    	for(WebElement webelement : expyear)
    	{ System.out.println(webelement.getText());
		  System.out.println(expYear);
    		if(webelement.getText().contains(expYear))
    		{
    			
    			webelement.click();
    			break;
           	}
         }
    	//*[@title='Change the month']
    	List<WebElement> expmonth =  driver.findElements(By.xpath("//*[@title='Change the month']/option"));  
    	
    	for(WebElement webelement : expmonth)
    	{
    		
    		System.out.println(webelement.getText());
    	
    		if(webelement.getText().contains(expMonth))
    		{
    			
    			webelement.click();
    			break;
           	}
         }
    	driver.findElement(By.xpath("//a[contains(.,'"+expDate+"')]")).click();

	
	getWebElement("AddPassport1").click();
	}
	
	
 
	public static void Visadetail(String visa, String country,String VisaType,String issueYear,String issueMonth,String issueDate,String VisaexpYear,String expMonth, String expDate) throws Exception
	
	{
		
	getWebElement("visadetail").click();
		
	getWebElement("Addvisa").click();
	
	
	getWebElement("Visano").sendKeys(visa);
	
	WebElement countcode=getWebElement("VisaCountrycode");
	
	Select sel6= new Select(countcode);
	
	sel6.selectByVisibleText(country);
	
	getWebElement("VIsatype").sendKeys(VisaType);
	getWebElement("IssueDate").click();
	
	List<WebElement> issueyear =  driver.findElements(By.xpath("//div[@class='datepick-popup']//select[@class='datepick-month-year'and @title='Change the year']/option"));  
	for(WebElement webelement : issueyear)
	{ System.out.println(webelement.getText());
	  System.out.println(issueYear);
		if(webelement.getText().contains(issueYear))
		{
			
			webelement.click();
			break;
       	}
     }
	//*[@title='Change the month']
	List<WebElement> issuemonth =  driver.findElements(By.xpath("//*[@title='Change the month']/option"));  
	
	for(WebElement webelement : issuemonth)
	{
		
		System.out.println(webelement.getText());
	
		if(webelement.getText().contains(issueMonth))
		{
			
			webelement.click();
			break;
       	}
     }
	
	driver.findElement(By.xpath("//a[contains(.,'"+issueDate+"')]")).click();
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//HandlingStaleElement.retryingFindClick("//span[contains(@class,'glyphicon glyphicon-calendar')]");
	
	Thread.sleep(2000);
	WebElement exp= getWebElement("DATEOFEXPIRY");

	getWebElement("DATEOFEXPIRY").click();
//	driver.findElement(By.xpath("//*[@id='f1']/div[8]/div/div/div[3]/div[1]/div[2]/div/div[5]/div/div/div[1]/div/span/span")).click();
	
	List<WebElement> visaexpyear =  driver.findElements(By.xpath("//div[@class='datepick-popup']//select[@class='datepick-month-year'and @title='Change the year']/option"));  
	for(WebElement webelement : visaexpyear)
	{ 
		System.out.println(webelement.getText());
	  System.out.println(VisaexpYear);
		if(webelement.getText().contains(VisaexpYear))
		{
			
			webelement.click();
			break;
       	}
     }
	
	List<WebElement> visaexpmonth =  driver.findElements(By.xpath("//*[@title='Change the month']/option"));  
	
	for(WebElement webelement : visaexpmonth)
	{
		
		System.out.println(webelement.getText());
	
		if(webelement.getText().contains(expMonth))
		{
			
			webelement.click();
			break;
       	}
     }
	driver.findElement(By.xpath("//a[contains(.,'"+expDate+"')]")).click();
	
getWebElement("Addvisdetail").click();


	}
	
	public static void dependentdetail(String Dependentname,String Middlename,String Lastname,String DOBYear,String DOBMonth,String DobDate) throws Exception
	{
		getWebElement("DependentDetail").click();
		getWebElement("Dependentname").sendKeys(Dependentname);
		getWebElement("Middlename").sendKeys(Middlename);
		getWebElement("LastName").sendKeys(Lastname);
		List<WebElement> Dobyear =  driver.findElements(By.xpath("//div[@class='datepick-popup']//select[@class='datepick-month-year'and @title='Change the year']/option"));  
		for(WebElement webelement : Dobyear)
		{ System.out.println(webelement.getText());
		  System.out.println(DOBYear);
			if(webelement.getText().contains(DOBYear))
			{
				
				webelement.click();
				break;
	       	}
	     }
		List<WebElement> Dobmonth =  driver.findElements(By.xpath("//*[@title='Change the month']/option"));  
		
		for(WebElement webelement : Dobmonth)
		{
			
			System.out.println(webelement.getText());
		
			if(webelement.getText().contains(DOBMonth))
			{
				
				webelement.click();
				break;
	       	}
	     }
		driver.findElement(By.xpath("//a[contains(.,'"+DobDate+"')]")).click();
		
		getWebElement("Relation").click();**/
	}
	}
	
