package com.quadlabs.pagescript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.pageobject.ManageTravelPolicy;


public class Mangaetravelpolicytest extends Baselibrary
{

	  @DataProvider
	   	public Object[][] getData() throws Exception
	  {
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Policydata");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Policydata"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Policydata", i+1, j);
	   			}
	   		}
	   		return data;
	}
	
	@Test(dataProvider="getData",priority=1)
	public static  void policy(String Travelpurpose,String PolicyTitle,String prod,
            String Ruleapply,String category,String Policycriteria,
            String Airline ,String origin,String destination,
            String PriceFrom, String PriceTo) throws Exception
	
	{
		LoginTest.validlogintest();
		
		
		ManageTravelPolicy.policy(Travelpurpose, PolicyTitle, prod, 
				Ruleapply, category, Policycriteria, Airline, 
				origin, destination, PriceFrom, PriceTo);
	}
	
	  @DataProvider
	   	public Object[][] getData1() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Policyon");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Policyon"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Policyon", i+1, j);
	   			}
	   		}
	   		return data;
		}

		@Test(dataProvider="getData1",priority=2)
		
		public static  void policy(String Traveller) throws Exception
		
		{
			test = report.createTest("Manage traveller policy test");
			ManageTravelPolicy.policyappliedon(Traveller);
		}
}
