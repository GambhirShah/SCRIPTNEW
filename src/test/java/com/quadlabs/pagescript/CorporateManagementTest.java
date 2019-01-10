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
	
	
 /** @DataProvider
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
   
	
	}
	@Test(priority=2)
	
	public void closediv () throws Exception{
	
	 getWebElement("Close").click();	}
	
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
		
		public void closebranch () throws Exception{
		
		 getWebElement("Close").click();	}
		 
	  
	  
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
	  
	  @Test(dataProvider="getData2")
	  public void department(String Branch,String Departmentname,String DepartmentEmail,String DepartmentPhone,
				String DepartmentFax ,  String TravelBudget  ,String Noofstaff ,String Nooftraveller) throws Exception
	  {
		  CorporateManagement.managedepartment(Branch,Departmentname,DepartmentEmail,DepartmentPhone,DepartmentFax,TravelBudget,Noofstaff,Nooftraveller);
	  }
	  
	  @Test
		
			public void closebranch () throws Exception
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
	  @Test(dataProvider="getDatadesignation")
	  public void Designation (String designation) throws Exception
	  
	  {
		  CorporateManagement.managedesignation(designation);
		  
	  }
	  @Test
		
		public void closebranch () throws Exception
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
	 @Test(dataProvider="getDataEmployeegrade")
	  public void EmployeeGrade (String Categorycode,String Categoryname) throws Exception
	  
	  {
		  CorporateManagement.manageEmployeegrade(Categorycode,Categoryname);
		  
	  }
	 	 @Test
		
		public void closebranch () throws Exception
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
	 	 @Test(dataProvider="getpassportalertmonth")
	 	 public void expirtationalert(String VisaExpirationmonth,String PassportExpirationmonth) throws Exception
	 	 
	 	 { CorporateManagement.managepassportvisaalert(VisaExpirationmonth, PassportExpirationmonth);}
	 	 
		 @Test
			public void closebranch () throws Exception
	    {  
			 getWebElement("Close").click();	
		
	   }
		**/
}