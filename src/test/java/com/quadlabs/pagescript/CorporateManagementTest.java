package com.quadlabs.pagescript;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.pageobject.CorporateManagement;



public class CorporateManagementTest extends Baselibrary {

	@BeforeClass
	public static void corp() throws Exception {
	LoginTest.validlogintest();
	
    CorporateManagement.corporate();
	
    }
	
	
  @DataProvider
	   	public Object[][] getData() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Division");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Division"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Division", i+1, j);
	   			}
	   		}
	   		return data;
		}
	  
	  
	@Test(dataProvider="getData",priority=1)
	
	public void managedivision(String division) throws Exception
	{
	
    CorporateManagement.managedivision(division);
    CorporateManagement.verifymanagedivision(driver);
   
	
	}
	 @Test(priority=2)

		public void closeDivision() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 
	
	
	
	  @DataProvider
	   	public Object[][] getData1() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Branch");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Branch"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Branch", i+1, j);
	   			}
	   		}
	   		return data;
		}
	  @Test(dataProvider="getData1",priority=3)
	  
	  public void managebranch(String Telephone,
				String Mobile,String Fax,String Contactname,String ContactEmailAdresss,
				String ContactMobile,String country,String Postcode,String State,
				String City,
				String Address,String Branchemail,String branchname,String division) throws Exception
	  
	  { 
		  	  CorporateManagement.managebranch(Telephone,Mobile,Fax,Contactname,
			  ContactEmailAdresss,ContactMobile,country,Postcode,
			  State,City,Address,Branchemail,branchname,division);
		  
	  }
	  @Test(priority=4)

		public void closeBranch() throws Exception
	{  
		 getWebElement("BranchClose").click();	

	}
	 
	
	  
	  
	  @DataProvider
	   	public Object[][] getData2() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Department");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Department"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Department", i+1, j);
	   			}
	   		}
	   		return data;
		}
	  
	  @Test(dataProvider="getData2",priority=5)
	  public void department(String Branch,String Departmentname,String DepartmentEmail,String DepartmentPhone,
				String DepartmentFax ,  String TravelBudget  ,String Noofstaff ,String Nooftraveller) throws Exception
	  {
		  CorporateManagement.managedepartment(Branch,Departmentname,DepartmentEmail,DepartmentPhone,DepartmentFax,TravelBudget,Noofstaff,Nooftraveller);
	  }
	  @Test(priority=6)

		public void closeDepartment() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 
	  
	  
	  @DataProvider
	   	public Object[][] getDatadesignation() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Designation");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Designation"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Designation", i+1, j);
	   			}
	   		}
	   		return data;
		}
	  @Test(dataProvider="getDatadesignation",priority=7)
	  public void Designation (String designation) throws Exception
	  
	  {
		  CorporateManagement.managedesignation(designation);
		  
	  }
	  @Test(priority=8)

		public void closeDesignation() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 
	 
	
	  
	  @DataProvider
	   	public Object[][] getDataEmployeegrade() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","EmployeeGrade");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","EmployeeGrade"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","EmployeeGrade", i+1, j);
	   			}
	   		}
	   		return data;
		}
	 @Test(dataProvider="getDataEmployeegrade",priority=9)
	  public void EmployeeGrade (String Categorycode,String Categoryname) throws Exception
	  
	  {
		  CorporateManagement.manageEmployeegrade(Categorycode,Categoryname);
		  
	  }
	 
	 	@Test(priority=10)

		public void closegrade() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 	
	 	 
	 	 @DataProvider
		   	public Object[][] getpassportalertmonth() throws Exception{
		   		
			  ExcelUtilities.excelCorporateReader("exceldata1");
		   		
			  int row = ExcelUtilities.RowNum("exceldata1","Passportvisaalert");
		   		
		   	  System.out.println(row);
		   		
		   	  int col = ExcelUtilities.ColNum("exceldata1","Passportvisaalert"); 
		   		
		   	  System.out.println(col);
		   		
		   	  Object[][] data= new Object[row][col];
		   		
		   	  	for(int i = 0; i < row; i++){
		   			
		   	  		for(int j = 0; j <col; j++){
		   			
		   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Passportvisaalert", i+1, j);
		   			}
		   		}
		   		return data;
			}
	 	 @Test(dataProvider="getpassportalertmonth",priority=11)
	 	 public void expirtationalert(String VisaExpirationmonth,String PassportExpirationmonth) throws Exception
	 	 
	 	 { CorporateManagement.managepassportvisaalert(VisaExpirationmonth, PassportExpirationmonth);}
	 	 
		 
	 	@Test(priority=12)

		public void closeAlert() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	
	 @DataProvider
	   	public Object[][] getTravelCategory() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","TravelCategory");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","TravelCategory"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","TravelCategory", i+1, j);
	   			}
	   		}
	   		return data;
		}
	 @Test(dataProvider="getTravelCategory",priority=13)
	 public void TravelCategory(String TravelCategoryName)throws Exception
	 
	 
	 {
		 CorporateManagement.managetravelcategory(TravelCategoryName);
	 }
	 @Test(priority=14)

		public void travelcategory() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 
	 
	 @DataProvider
	   	public Object[][] getcostcenter() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Costcenter");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Costcenter"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Costcenter", i+1, j);
	   			}
	   		}
	   		return data;
		}
	 @Test(dataProvider="getcostcenter",priority=15)
	 public void costCenter(String CostCentercode,String CostCenterName)throws Exception
	 
	 {
		 CorporateManagement.managecostcentre(CostCentercode,CostCenterName);
	 }
		@Test(priority=16)

		public void closecostcenter () throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 
	 @DataProvider
	   	public Object[][] getoutpolicy() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","outpolicyreason");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","outpolicyreason"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","outpolicyreason", i+1, j);
	   			}
	   		}
	   		return data;
		}
	 @Test(dataProvider="getoutpolicy",priority=17)
	 public void pdreasonoutpolicy(String Reasoncode,String Reasonname)throws Exception
	 
	 {
		 CorporateManagement.predefinedreasonforoutpolicy(Reasoncode,Reasonname);
	 }
		@Test(priority=18)

		public void closepolicy() throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 @DataProvider
	   	public Object[][] getProject() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Project");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Project"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Project", i+1, j);
	   			}
	   		}
	   		return data;
		}
	 @Test(dataProvider="getProject",priority=19)
	 public void project(String Projectcode,String ProjectName)throws Exception
	 
	 {
		 CorporateManagement.AddProject(Projectcode,ProjectName);
	 }
		@Test(priority=20)

		public void closeproject () throws Exception
	{  
		 getWebElement("Close").click();	

	}
	 @DataProvider
	   	public Object[][] getcorporatecard() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","corporatecard");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","corporatecard"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j <col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","corporatecard", i+1, j);
	   			}
	   		}
	   		return data;
		}
	@Test(dataProvider="getcorporatecard",priority=21)
	 public void corporatecard(String Billaddress,String CardName,String Nameoncard,
			 String CardNumber,String expMonth,String expyear,String cardlimit,String Currency,
			 String Bankcharge,String Paymentperiod,String Corporate)throws Exception
	 
	 {
	CorporateManagement.corporatecards(Billaddress, CardName, Nameoncard, CardNumber, expMonth, expyear,
				 cardlimit, Currency, Bankcharge, Paymentperiod,Corporate);
	 }
	@Test(priority=22)

	public void closebranch () throws Exception
{  
	 getWebElement("Close").click();	

}
}