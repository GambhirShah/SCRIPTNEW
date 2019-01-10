package com.quadlabs.pageobject;

import org.testng.Assert;
import org.testng.Reporter;


import com.quadlabs.generic.Baselibrary;


public class CorporateManagement extends Baselibrary {

	
	public static void corporate() throws Exception 
	{
		    getWebElement("Corporate").click();
			getWebElement("Corporatemanagement").click();
			String expectedurl="https://corporatetravel.dnataindia.com/Corporate/Asp/SubMenu.aspx?menu=company";
			String actualurl=driver.getCurrentUrl();
			Assert.assertEquals(actualurl,expectedurl," Url is not Verified");
			Reporter.log("Homepage Url Is Verified", true);	
	//	    getWebElement("managedivision").click();
	}
		
		
		
	/**	public static void managedivision(String division) throws Exception 
		{
			
			getWebElement("divisionadd").click();
			getWebElement("enterdivision").sendKeys(division);
			getWebElement("status").click();
			getWebElement("Save").click();
			
			
		}
		public static void managebranch(String Telephone,
				String Mobile,String Fax,String Contactname,String ContactEmailAdresss,
				String ContactMobile,String country,String Postcode,String State,
				String City,
				String Address,String Branchemail,String branchname,String division) throws Exception
		{
			
			getWebElement("branch").click();
			getWebElement("branchadd").click();
			WebElement seldivision = getWebElement("Division");
			Select sel = new Select(seldivision);
			sel.selectByVisibleText(division);
			getWebElement("corporateBranchname").sendKeys(branchname);
			getWebElement("BranchEmail").sendKeys(Branchemail);
			getWebElement("txtaddress").sendKeys(Address);
			getWebElement("City").sendKeys(City);
			getWebElement("State").sendKeys(State);
			getWebElement("PostCode").sendKeys(Postcode);
			WebElement selcountry = getWebElement("country");
			Select sel1 = new Select(selcountry);
			sel1.selectByVisibleText(country);
			getWebElement("Telephone").sendKeys(Telephone);
			getWebElement("Mobile").sendKeys(Mobile);
			getWebElement("Fax").sendKeys(Fax);
			getWebElement("Contactname").sendKeys(Contactname);
			getWebElement("ContactEmailadrress").sendKeys(ContactEmailAdresss);
			getWebElement("ContactMobile").sendKeys(ContactMobile);
			getWebElement("Save").click();
			driver.switchTo().alert().accept();
	
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
			
		}
		
		public static void managedesignation(String Designation) throws Exception
		{
			getWebElement("Managedesignation").click();
			getWebElement("addbutton").click();
			getWebElement("Designation").sendKeys(Designation);
			getWebElement("Save").click();
			
		}
		
		public static void manageEmployeegrade(String Categorycode,String Categoryname) throws Exception
		{  
			getWebElement("ManageEmployeeGradeCategory").click();
		    getWebElement("Addnew1").click();
			getWebElement("Categorycode").sendKeys(Categorycode);
			getWebElement("Categoryname").sendKeys(Categoryname);
			getWebElement("ChkBookForfamily").click();
			getWebElement("ChkBookForPersonal").click();
			
	
			getWebElement("AddButton1").click();
			driver.switchTo().alert().accept();
		}
		
		public static void managepassportvisaalert(String VisaExpirationmonth,String PassportExpirationmonth) throws Exception
		
		{
		getWebElement("passportalert").click();
	    getWebElement("VisaExpirationmonth").sendKeys(VisaExpirationmonth);
		getWebElement("PassportExpirationmonth").sendKeys(PassportExpirationmonth);
		getWebElement("Savebuttonexpiration").click();
		getWebElement("BtnClose").click();
		}
		**/
		public static void managetravelcategory()
		{}
}