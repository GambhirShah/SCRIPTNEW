package com.quadlabs.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;


import com.quadlabs.generic.Baselibrary;


public class CorporateManagement extends Baselibrary {

	
	public static void corporate() throws Exception 
	{
		
		
		    getWebElement("Corporate").click();
			getWebElement("Corporatemanagement").click();
			
			
	//		String expectedurl="https://corporatetravel.dnataindia.com/Corporate/Asp/SubMenu.aspx?menu=company";
		//	String actualurl=driver.getCurrentUrl();
	//		Assert.assertEquals(actualurl,expectedurl," Url is not Verified");
		//	Reporter.log("Homepage Url Is Verified", true);	
		getWebElement("managedivision").click();
	}
		
//	public static void verifymanagedivision(WebDriver driver)
//	{String expectedurl="https://corporatetravel.dnataindia.com/CAM/Admin/asp/ViewBusinessType.aspx";
//	String actualurl=driver.getCurrentUrl();
//	Assert.assertEquals(actualurl,expectedurl,"Home Page Url is not Verified");
//	Reporter.log("Homepage Url Is Verified", true);
//	}
	
    public static void managedivision(String division) throws Exception 
		{
			
			getWebElement("divisionadd").click();
			getWebElement("enterdivision").sendKeys(division);
			getWebElement("status").click();
			getWebElement("Save").click();	
		}
    
	public static void closeDivision() throws Exception
	{  
		 getWebElement("divClose").click();	

	}
	 
		
		public static void managebranch(String Telephone,
				String Mobile,String Fax,String Contactname,String ContactEmailAdresss,
				String ContactMobile,String country,String Postcode,String State,
				String City,
				String Address,String Branchemail,String branchname,String division) throws Exception
		{
			
			getWebElement("branch").click();
	//		String expectedurl="https://corporatetravel.dnataindia.com/CAM/Admin/asp/CA_branch.aspx";
	//		String actualurl=driver.getCurrentUrl();
	//		Assert.assertEquals(actualurl,expectedurl,"Home Page Url is not Verified");
	//		Reporter.log("Homepage Url Is Verified", true);
			getWebElement("branchadd").click();
			WebElement seldivision = getWebElement("Division");
			Select sel = new Select(seldivision);
			sel.selectByVisibleText(division);
			getWebElement("corporateBranchname").sendKeys(branchname);
			getWebElement("BranchEmail").sendKeys(Branchemail);
			getWebElement("txtaddress").sendKeys(Address);
			getWebElement("BranchCity").sendKeys(City);
			getWebElement("BranchState").sendKeys(State);
			getWebElement("BranchPostCode").sendKeys(Postcode);
			WebElement selcountry = getWebElement("country");
			Select sel1 = new Select(selcountry);
			sel1.selectByVisibleText(country);
			getWebElement("BranchTelephone").sendKeys(Telephone);
			getWebElement("BranchMobile").sendKeys(Mobile);
			getWebElement("BranchFax").sendKeys(Fax);
			getWebElement("BranchContactname").sendKeys(Contactname);
			getWebElement("BranchContactEmailadrress").sendKeys(ContactEmailAdresss);
			getWebElement("BranchContactMobile").sendKeys(ContactMobile);
			getWebElement("Save").click();
			driver.switchTo().alert().accept();
	
		}
		

		public static void closeBranch() throws Exception
	{  
		 getWebElement("BranchClose").click();	

	}
	 
		public static void managedepartment(String Branch,String Departmentname,String DepartmentEmail,String DepartmentPhone,
				String DepartmentFax ,  String TravelBudget  ,String Noofstaff ,String Nooftraveller) throws Exception
		{
			getWebElement("managedepartment").click();
			getWebElement("addbutton").click();
			WebElement branch=getWebElement("SelectBranch");
			Select sel = new Select(branch);
			sel.selectByVisibleText(Branch);
			getWebElement("Departmentname").sendKeys(Departmentname);
			getWebElement("DepartmentEmail").sendKeys(DepartmentEmail);
			getWebElement("DepartmentPhone").sendKeys(DepartmentPhone);
			getWebElement("DepartmentFax").sendKeys(DepartmentFax);
			getWebElement("TravelBudget").sendKeys(TravelBudget);
			getWebElement("Noofstaff").sendKeys(Noofstaff);
			getWebElement("Nooftraveller").sendKeys(Nooftraveller);
			getWebElement("Savebutton").click();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
		}
		public static void closeDepartment() throws Exception
		{  
			
			 getWebElement("departmentClose").click();	

		}
		
		
		public static void managedesignation(String Designation) throws Exception
		{
			getWebElement("Managedesignation").click();
			getWebElement("addbutton").click();
			
			Thread.sleep(2000);
			getWebElement("Designationtext").sendKeys(Designation);
			
			getWebElement("Save").click();
			driver.switchTo().alert().accept();
			
			
			
		}
		public static void closeDesignation() throws Exception
		{  
			 getWebElement("designationClose").click();	 
		}
		

			public static void manageEmployeegrade(String Categorycode,String Categoryname) throws Exception
		{  
			getWebElement("ManageEmployeeGradeCategory").click();
		    getWebElement("Addnew1").click();
			getWebElement("Categorycode").sendKeys(Categorycode);
			getWebElement("Categoryname").sendKeys(Categoryname);
			getWebElement("ChkBookForfamily").click();
			getWebElement("ChkBookForPersonal").click();
			Thread.sleep(2000);
	
			getWebElement("AddButton1").click();
			driver.switchTo().alert().accept();
		}
		
		public static void closegrade() throws Exception
		{  
			 getWebElement("grade1close").click();	

		} 
		
		public static void managepassportvisaalert(String VisaExpirationmonth,String PassportExpirationmonth) throws Exception
		
		{
		getWebElement("passportalert").click();
	    getWebElement("VisaExpirationmonth").sendKeys(VisaExpirationmonth);
		getWebElement("PassportExpirationmonth").sendKeys(PassportExpirationmonth);
		getWebElement("Savebuttonexpiration").click();
		getWebElement("BtnClose").click();
		}
		public static void closeAlert() throws Exception
		{  
			 getWebElement("Close").click();	

		}
		
			public static void managetravelcategory(String TravelCategoryName) throws Exception
		{
			getWebElement("ManageTravelCategory").click();
			getWebElement("Addtravelcategory").click();
				getWebElement("travelcategoryname").sendKeys(TravelCategoryName);
				getWebElement("Businesstrip").click();
				getWebElement("ApplyTravelpolicy").click();
				getWebElement("Status").click();
				getWebElement("AddCategory").click();
				Thread.sleep(1000);
				driver.switchTo().alert().accept();
		}
		
		public static void travelcategory() throws Exception
		{  
			driver.findElement(By.xpath("//div[@class='col-md-12 common_box']/div/input[@class='btn btn-gray btn-lg']")).click();

		}
		 
		
	public static void managecostcentre(String CostCentercode,String CostCenterName) throws Exception
	{
		getWebElement("costcenter").click();
		getWebElement("Addcostcenter").click();
		getWebElement("CostCenterCode").sendKeys(CostCentercode);
		getWebElement("CostCenterName").sendKeys(CostCenterName);
		getWebElement("Status").click();
	    getWebElement("Addnewcostcenter").click();
	    } 
	
	public static  void closecostcenter () throws Exception
	{  
		 getWebElement("costcenterClose").click();	

	}
	 
		public static void predefinedreasonforoutpolicy(String Reasoncode,String Reasonname) throws Exception
	{
		getWebElement("outpolicyreason").click();
		getWebElement("AddNewPolicyreason").click();
		WebElement Lang=getWebElement("Languagepolicy");
		Select SelLang= new Select(Lang);
		SelLang.selectByVisibleText("English");
		getWebElement("Reasoncode").sendKeys(Reasoncode);
		getWebElement("Reasonname").sendKeys(Reasonname);
		getWebElement("Statuscheck").click();
		getWebElement("Addoutpolicy").click();
	driver.switchTo().alert().accept();	
	}
	

	public static void closepolicy() throws Exception
{  
	 getWebElement("predefineClose").click();	

}
	 
		public static void AddProject(String Projectcode,String ProjectName) throws Exception
	{
		getWebElement("manageproject").click();
		getWebElement("AddProject").click();				
		getWebElement("Projectcode").sendKeys(Projectcode);
		getWebElement("ProjectName").sendKeys(ProjectName);
		getWebElement("Projectstatus").click();
		getWebElement("AddProject").click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
   }
	public static void closeproject () throws Exception
	{  
		 getWebElement("projectclose").click();	

	}
	
	public static void corporatecards(String Billaddress,
			String Cardname,String Nameoncard,
			String CardNumber ,String expMonth,String expyear,
			String cardlimit,String Currency, String Bankcharge,String Paymentperiod,String Corporate) throws Exception
	{
		getWebElement("CreditCArd").click();
		getWebElement("AddCArd").click();
		getWebElement("CardName").sendKeys(Cardname);
WebElement cardoption=getWebElement("CArdOption");
Select Selcard=new Select(cardoption);
Selcard.selectByVisibleText("Debit Card");

WebElement cardtype =getWebElement("CardType");
Select Selcardtype =new Select(cardtype);
Selcardtype.selectByVisibleText("VISA");

getWebElement("NameonCArd").sendKeys(Nameoncard);
getWebElement("CardNumber").sendKeys(CardNumber);
		
WebElement cardexpmonth=getWebElement("Expirymonth");
Select expmonth=new Select(cardexpmonth);
expmonth.selectByVisibleText(expMonth);
		
WebElement cardexpYear=getWebElement("ExpiryYear");
Select expYear=new Select(cardexpYear);
expYear.selectByVisibleText(expyear);
		
getWebElement("BillingAddress").sendKeys(Billaddress);
getWebElement("CardLimit").sendKeys(cardlimit);
		WebElement Country=getWebElement("country");
		Select country= new Select(Country);
		country.selectByVisibleText("India");
		getWebElement("currency").sendKeys(Currency);
		getWebElement("BankCharges").sendKeys(Bankcharge);
		getWebElement("PaymentPeriod").sendKeys(Paymentperiod);
		WebElement userrule=getWebElement("RuleAppliedon");
		Select userrulE= new Select(userrule);
		userrulE.selectByVisibleText("Corporate");
		
		List<WebElement> Corporates =  driver.findElements(By.xpath("//select[@id='listUser']/option"));  
    	for(WebElement webelement : Corporates)
    	{
    		if(webelement.getText().contains(Corporate))
    		{
    			
    			webelement.click();
    			getWebElement("Addselect").click();
    		}
        }
    	
    	Thread.sleep(4000);
    	getWebElement("SaveCard1").click();
    	}
	public static void closecorporatecard () throws Exception
	{  
		 getWebElement("Cardclose").click();	

	}
}