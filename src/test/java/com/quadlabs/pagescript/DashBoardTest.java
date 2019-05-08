package com.quadlabs.pagescript;

import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.pageobject.DashBoard;

import org.testng.annotations.DataProvider;


public class DashBoardTest extends Baselibrary {
	  @DataProvider
	   	public Object[][] getData() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","SearchData");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","SearchData"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","SearchData", i+1, j);
	   			}
	   		}
	   		return data;
		}
	@Test(dataProvider="getData")
	
	public void searchEmployee(String Travellertype,String User_FirstName,String triptype,String depcity, 
			String Descity,String depcityairport,
			String Descityairport,String tripdate,String returndate,String email) throws Exception
	{
	LoginTest.validlogintest();
	test = report.createTest("open dashboard");
	DashBoard.search(Travellertype,User_FirstName,
			         triptype, depcity,  Descity
			          ,depcityairport,Descityairport,
			            tripdate,returndate,email);
	 
	
	}	
	
	
}
