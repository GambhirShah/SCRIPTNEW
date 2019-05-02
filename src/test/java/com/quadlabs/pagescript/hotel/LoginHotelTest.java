package com.quadlabs.pagescript.hotel;

import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.generic.WaitStatement;
import com.quadlabs.pageobject.EnterDashboard;

import com.quadlabs.pageobject.hotel.Loginhotel;

public class LoginHotelTest extends Baselibrary {

	@Test
	public static void validlogintest() throws Exception {
		
		Loginhotel lp = new Loginhotel();
		
		{
			 
		WaitStatement.implicitWaitForSeconds(driver, 20);
		String companycode=ExcelUtilities.readXLSFile("exceldata2","Sheet1", 1, 0);
		
		String username = ExcelUtilities.readXLSFile("exceldata2","Sheet1", 1, 1);

		String password = ExcelUtilities.readXLSFile("exceldata2","Sheet1", 1, 2);
		
		lp.login(companycode,username, password);
		
		}		
	
		try{
		
		Thread.sleep(3000);
	
		}
	
		catch (InterruptedException e)
		{
			
		e.printStackTrace();
		
		}
		
		EnterDashboard ed = new EnterDashboard();
		
//		ed.verifylogintest(driver);
		
//		ed.verifytitle(driver);
		
	}
	
}
