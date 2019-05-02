package com.quadlabs.pagescript.hotel;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.pageobject.hotel.DashBoard;

public class DashboardTest extends Baselibrary {
	
	
	  @DataProvider
	   	public Object[][] getData() throws Exception{
	   		
		  ExcelUtilities.excelCorporateReader("exceldata2");
	   		
		  int row = ExcelUtilities.RowNum("exceldata2","SearchData");
	   		
	   	  System.out.println(row);
	   		
	   	  int col = ExcelUtilities.ColNum("exceldata2","SearchData"); 
	   		
	   	  System.out.println(col);
	   		
	   	  Object[][] data= new Object[row][col];
	   		
	   	  	for(int i = 0; i < row; i++){
	   			
	   	  		for(int j = 0; j < col; j++){
	   			
	   	  			data[i][j] = ExcelUtilities.readXLSFile("exceldata2","SearchData", i+1, j);
	   			}
	   		}
	   		return data;
		}
	@Test(dataProvider="getData")

	public static void Dashboarddata (String Travellertype,String User_FirstName,String email,
			String cityname,String destcity,String tripdate,String returndate,
			String NOofroom ,String Adultsinroom1,String Adultsinroom2,
			String Adultsinroom3,String Adultsinroom4,String Adultsinroom5,String i) throws Exception
	
	{
		LoginHotelTest.validlogintest();
	DashBoard.search(Travellertype,User_FirstName,email,
			cityname,destcity,tripdate, returndate,
		 NOofroom , Adultsinroom1, Adultsinroom2,
			Adultsinroom3, Adultsinroom4, Adultsinroom5);
	
	

	
	}
	
}
