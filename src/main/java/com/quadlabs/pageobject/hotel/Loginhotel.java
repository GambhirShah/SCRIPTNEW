package com.quadlabs.pageobject.hotel;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.GetPropertyValue;

public class Loginhotel extends Baselibrary {

	
	
	public void login(String companycode,String username, String password ) throws Exception
	{
		
		
		driver.get(GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", "testUrl1")); 
		or = new Properties();
	
		File file = new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
	 
		FileInputStream fis = new FileInputStream(file);
		
		or.load(fis);
		getWebElement("companycode").sendKeys(companycode);
		
		WebElement Untxtbox = getWebElement("loginusername");
	
		Untxtbox.sendKeys(username);
	
		WebElement pwdtxtbox = getWebElement("loginpassword");
		
		pwdtxtbox.sendKeys(password);
	
		WebElement login=getWebElement("loginsubmit");
		
		login.click();
	
	
		}
		
}
