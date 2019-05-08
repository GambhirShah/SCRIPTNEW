package com.quadlabs.pagescript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.generic.WaitStatement;

import com.quadlabs.pageobject.EnterDashboard;
import com.quadlabs.pageobject.LoginPage;


public class LoginTest extends Baselibrary{
	
	@BeforeMethod
	public static void LoginStart()
	{System.out.println("RunLogin");}

	@Test
	public static void validlogintest() throws Exception {
		
		
		test = report.createTest("Login data");
		LoginPage lp = new LoginPage();
		
		{
			 
		WaitStatement.implicitWaitForSeconds(driver, 20);
	//	String companycode=ExcelUtilities.readXLSFile("exceldata1","Sheet1", 1, 0);
		
		String username = ExcelUtilities.readXLSFile("exceldata1","Sheet1", 1, 0);

		String password = ExcelUtilities.readXLSFile("exceldata1","Sheet1", 1, 1);
		
		lp.login(username, password);
		
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
	
	@AfterMethod
	public static void afterMetod() {
		test.getExtent().flush();
	}
	
}



