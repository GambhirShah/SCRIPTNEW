package com.quadlabs.pageobject;


import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

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
		
		or = new Properties();
	
		File	file = new File(System.getProperty("user.dir")+"\\testdata\\config.properties");
	 
		FileInputStream fis = new FileInputStream(file);
		
		or.load(fis);
		
		WebElement Untxtbox = getWebElement("loginusername");
	
		Untxtbox.sendKeys(username);
	
		WebElement pwdtxtbox = getWebElement("loginpassword");
		
		pwdtxtbox.sendKeys(password);
	
		WebElement login=getWebElement("loginsubmit");
		
		login.click();
	
		/*
		getWebElement("empradiobutton").click();
		
		for(int i=2;i<=2000;i++){
				
		String s = "//*[@id='gridCorporateTravel']/tbody/tr["+i+"]"+"/td[1]";
		
		Thread.sleep(1000);
		
		WebElement myElements = driver.findElement(By.xpath(s));
		
		System.out.println(myElements.getText());
		
		*/	
		}
		
	}
	


