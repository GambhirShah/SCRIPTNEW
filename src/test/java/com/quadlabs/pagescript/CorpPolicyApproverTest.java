package com.quadlabs.pagescript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.pageobject.CorpPolicyApprover;


public class CorpPolicyApproverTest extends Baselibrary {
	 
		@DataProvider
	   	public Object[][] getData1() throws Exception
	  {
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","Sheet3");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","Sheet3"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","Sheet3", i+1, j);
	   			}
	   		}
	   		return data;
		}
	  
	@Test(priority= 1)
	public static void policyapprover() throws Exception
	
	{
		LoginTest.validlogintest();
		 
	}

	  @DataProvider
	   	public Object[][] getData() throws Exception
	  {
	   		
		  ExcelUtilities.excelCorporateReader("exceldata1");
	   		
		  int row = ExcelUtilities.RowNum("exceldata1","username");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata1","username"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata1","username", i, j);
	   			}
	   		}
	   		return data;
		}
	
	
	@Test(dataProvider="getData1", priority=2)
	
	public void approverData(String noOfApprovers,String Approver1, String Approver2, String Approver3) throws Exception{
		
		CorpPolicyApprover.approverworkflow(noOfApprovers,Approver1,Approver2, Approver3);
		
	}
	
	@Test(dataProvider= "getData", priority=3)
	public static void selectuser(String user) throws Exception

	{
		
		CorpPolicyApprover.handlingStaleElement(user);	
		getWebElement("Submit").click();
		
		
		
	
	}
		//Thirunavukarasu  Sethuraman(Thirunavukarasu.Sethuraman@bmw.in
		//*[text()="Thirunavukarasu  Sethuraman(Thirunavukarasu.Sethuraman@bmw.in)"]
		
		
	}
