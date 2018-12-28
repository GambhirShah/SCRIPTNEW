package com.quadlabs.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterDashboard  {
		public void verifytitle(WebDriver driver){
			String expTitle="Corporate Dashboard";
			String actTitle=driver.getTitle();
			Assert.assertEquals(actTitle,expTitle,"Home Page Title is not Verified");
			Reporter.log("Homepage Title Is Verified", true);
		}
		public void verifylogintest(WebDriver driver)
		{String expectedurl="https://corporatetravel.dnataindia.com/Corporate/call_center/asp/DashBoard.aspx?alert=1";
		String actualurl=driver.getCurrentUrl();
		Assert.assertEquals(actualurl,expectedurl,"Home Page Url is not Verified");
		Reporter.log("Homepage Url Is Verified", true);

	}
	
	
}
