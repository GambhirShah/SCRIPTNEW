package com.quadlabs.pageobject;


import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;


import org.openqa.selenium.WebElement;

import com.quadlabs.generic.Baselibrary;
import com.quadlabs.generic.GetPropertyValue;



public class LoginPage extends Baselibrary {

		
	/**	
	 @FindBy(name="txtEmail")
		private WebElement Untxtbox;
		
		@FindBy(id="txtPassword")
		private WebElement pwdtxtbox;
		
		@FindBy (id="btnLogin")
		private WebElement Login;
		
		
		public LoginPage(WebDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		
		}
		
	public WebElement getUntxtbox()
		{return Untxtbox;}
		
		public WebElement getpwdtxtbox()
		{return pwdtxtbox;}
		
		public WebElement getLogin()
		{return Login;}
		
		public void login (String username, String password){
			Untxtbox.sendKeys(username);
			pwdtxtbox.sendKeys(password);
			Login.click();
		}
	**/
	
	public void login(String username, String password ) throws Exception
	{
		
		driver.get(GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", "testUrl")); 
		or = new Properties();
		
	
	
		File file = new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
	 
		FileInputStream fis = new FileInputStream(file);
		
		or.load(fis);
	//	getWebElement("companycode").sendKeys(companycode);
		
		WebElement Untxtbox = getWebElement("loginusername");
	
		Untxtbox.sendKeys(username);
	
		WebElement pwdtxtbox = getWebElement("loginpassword");
		
		pwdtxtbox.sendKeys(password);
	
		WebElement login=getWebElement("loginsubmit");
		
		login.click();
	
	
		}
		
	}
	


