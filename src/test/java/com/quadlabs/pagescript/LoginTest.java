package com.quadlabs.pagescript;

import org.testng.annotations.Test;
import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.ExcelUtilities;
import com.quadlabs.generic.WaitStatement;
import com.quadlabs.pageobject.DashBoard;
import com.quadlabs.pageobject.EnterDashboard;
import com.quadlabs.pageobject.LoginPage;


public class LoginTest extends Baselibrary{

	@Test
	public void validlogintest() throws Exception {
		
		LoginPage lp=new LoginPage();
		
		{
			 

		WaitStatement.implicitWaitForSeconds(driver, 20);

		String username =ExcelUtilities.readXLSFile("Sheet1", 1, 0);

		String password =ExcelUtilities.readXLSFile("Sheet1", 1, 1);
		
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
		ed.verifylogintest(driver);
		ed.verifytitle(driver);
		
		DashBoard.search();
	
	}
}


