package com.quadlabs.pagescript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.pageobject.Managetraveller;

public class ManageTravellertest extends Baselibrary {
	  @DataProvider
	   	public Object[][] getData() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","userdetail");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","userdetail"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","userdetail", i+1, j);
	   			}
	   		}
	   		return data;
		}
	
@Test(dataProvider="getData")
public static void managetraveller(String Empcode ,String Title,String EmpFirstName,String  EmpLastName,
		String Username,String Emailid, String branchname,String Language,String Address,
		String City,String State,String Postcode,String phoneCountrycode,String Phone,String MobCountrycode,String Mobileno,String Remark,
		String departme,String designe,String emplgradecategory,String cocenter,String Proj) throws Exception
{
	LoginTest.validlogintest();
	Managetraveller.corporatemanagement(Empcode ,Title, EmpFirstName, EmpLastName,
			 Username,Emailid, branchname,Language,Address,
			City, State,Postcode,phoneCountrycode, Phone,MobCountrycode, Mobileno, Remark,
			departme,designe,emplgradecategory,cocenter,Proj);
}
	
/** @DataProvider
	   	public Object[][] getData1() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Passport");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Passport"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Passport", i+1, j);
	   			}
	   		}
	   		return data;
		}
	
	
	@Test(dataProvider="getData1")
	public static void passportdata(String Passport,String day,String Month, String Date,
			String Year ,String Nation,String expday,
			String expMonth, String expDate, String expYear,String IssuingCountry) throws Exception
	{
		Managetraveller.Passport(Passport, day, Month, Date, Year, Nation, expday,
				expMonth, expDate, expYear,IssuingCountry);
		
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	 @DataProvider
	   	public Object[][] getData2() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Visadetail");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Visadetail"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Visadetail", i+1, j);
	   			}
	   		}
	   		return data;
	 }
	@Test(dataProvider="getData2")
	public static void visadetail(String visa,String country,String VisaType,String issueYear,
			String issueMonth,String issueDate,String VisaexpYear,String expMonth,String expDate) throws Exception
	{
		Managetraveller.Visadetail(visa, country, VisaType, issueYear, issueMonth, issueDate, VisaexpYear, expMonth,expDate);
		
	}
	
	**/

}
