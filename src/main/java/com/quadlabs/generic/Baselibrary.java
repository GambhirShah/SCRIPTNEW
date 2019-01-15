package com.quadlabs.generic;



//Anurag

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baselibrary {
	
	public  static WebDriver driver;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static Properties or;
	
	
	@Parameters("browser")
	@BeforeClass	
	public void precondition(String Browsername)
	  {
		
		 if(Browsername.equalsIgnoreCase("chrome"))
				
		 {  
			 
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\exefiles\\chromedriver.exe");
	         driver = new ChromeDriver();
		     Reporter.log("chrome launched",true);
		     }
	
		     else  if(Browsername.equalsIgnoreCase("firefox"))
		 
		 {
		
		    		System.out.println("Firefox browser");
					System.setProperty("webdriver.firefox.marionette",  System.getProperty("user.dir")+"\\exefiles\\geckodriver.exe");
					DesiredCapabilities dc = DesiredCapabilities.firefox();
					dc.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
		
		 }
	  
		 else if(Browsername.equalsIgnoreCase("IE"))
		 
		 { 
			 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\exefiles\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 Reporter.log("IE  launched",true);
		 } 
	  
		 	e_driver = new EventFiringWebDriver(driver);
		 	
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			
		 	eventListener = new WebEventListener();
			
		 	e_driver.register(eventListener);
			
		 	driver = e_driver;
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
		
		 	driver.get(GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", "testUrl")); 	
		 	
      }


	
	 @AfterClass
	 public void postcondition(ITestResult result)
	 {
		 if(result.isSuccess())
		 
		 {Reporter.log("Test script passed ", true );}
		 
		 else
			  {
			 
			 Reporter.log("Test script failed ", true );
			 String filename= result.getMethod().getMethodName();
		 ScreenShot snap = new  ScreenShot();
		 try {
			ScreenShot.getSnapShot(driver,filename);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		          }
	 
    //  driver.close();
     // Reporter.log("browser closed", true);
	 }
	 
	
		
		public static WebElement getLocator(String key) throws Exception
		{
			
			
		
			String locatorType=key.split(":")[0];
			String value=key.split(":")[1];
			
			if(locatorType.toLowerCase().equals("xpath"))
				return driver.findElement(By.xpath(value));
			else if(locatorType.toLowerCase().equals("id"))
				return driver.findElement(By.id(value));
			else if(locatorType.toLowerCase().equals("class"))
				return driver.findElement(By.className(value));
			else if(locatorType.toLowerCase().equals("tag"))
				return driver.findElement(By.tagName(value));
			else if(locatorType.toLowerCase().equals("link"))
				return driver.findElement(By.linkText(value));
			else if(locatorType.toLowerCase().equals("css"))
				return driver.findElement(By.cssSelector(value));
			else if(locatorType.toLowerCase().equals("name"))
				return driver.findElement(By.name(value));
			else
				throw new Exception("Unknown Locator Type"+locatorType);
			
		}
		
		// ***  This Function returns the locators from the Web Application  *****
		public static WebElement getWebElement(String key) throws Exception
		{
			return getLocator(or.getProperty(key));
		}
	

		
		
		
			
		
	
}




