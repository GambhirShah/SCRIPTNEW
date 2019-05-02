package com.quadlabs.generic;



import java.util.List;

//Anurag

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.HTMLReporter;

public class Baselibrary {
	
	public  static WebDriver driver;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static Properties or;
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setextent()
	{
		htmlreporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		htmlreporter.config().setDocumentTitle("AutomationReport");
		
		htmlreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("HostName","LocalHost");
		extent.setSystemInfo("OS", "Windows10");
		
		
		
	}
	
	@AfterTest
	public void endReport(){
		
		extent.flush();
	}
	
	
	@Parameters("browser")
	@BeforeClass
	
	
	
	public void precondition(String Browsername)
	  {
		
		 if(Browsername.equalsIgnoreCase("chrome"))
				
		 {  
			 
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\exefiles\\chrome\\chromedriver.exe");
	         driver = new ChromeDriver();
		     Reporter.log("chrome launched",true);
		     }
	
		     else  if(Browsername.equalsIgnoreCase("firefox"))
		 
		 {
		
		    		System.out.println("Firefox browser");
		    		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\exefiles\\geckodriver.exe");
			//		DesiredCapabilities dc = DesiredCapabilities.firefox();
			//		dc.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
		
		 }
		 else if(Browsername.equalsIgnoreCase("IE"))
		 { 
			 System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\exefiles\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			 Reporter.log("IE  launched",true);
		 } 
		 else if(Browsername.equalsIgnoreCase("incognitochrome"))
	     { 
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\exefiles\\chrome\\chromedriver.exe");
			 ChromeOptions option= new ChromeOptions();
			 option.addArguments("-incognito");
			 driver= new ChromeDriver(option);
			 Reporter.log("incognitochrome launched",true);
		 } 
	  
		 	e_driver = new EventFiringWebDriver(driver);
		 	
		//	Now create object of EventListerHandler to register it with EventFiringWebDriver
			
		 eventListener = new WebEventListener();
			
		 	e_driver.register(eventListener);
			
		 	driver = e_driver;
			
			driver.manage().window().maximize();
			
			driver.manage().deleteAllCookies();
		
		 		
		 	
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
	

		
		public  static List<WebElement> listofautosuggestion(By suggestiontxt, String txt,String city_name, By d) throws InterruptedException {
			
			driver.findElement(d).sendKeys(txt);
		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			List<WebElement> autosuggestions = driver.findElements(suggestiontxt);
			
			for (WebElement autosuggestion : autosuggestions) {
				System.out.println(autosuggestion.getText());
				Thread.sleep(3000);
				
				System.out.println("Excel Text"  + " " +city_name);
				if (autosuggestion.getText().equalsIgnoreCase(city_name)) {
					System.out.println("equal");
					autosuggestion.click();
					break;
				} else {
					System.out.println("not equal");
				}
			}

			return autosuggestions;
		}
		
		public static  void calender(String date) throws Exception{
			
		System.out.println("Trip date"+date);

		String[] tripDateA = date.split("-");

		int tripDay=Integer.parseInt(tripDateA[0]);
		
		System.out.println("tripDateA[0]"+tripDateA[0]);

		int tripMon=Integer.parseInt(tripDateA[1]);
		
		System.out.println("tripDateA[1]"+tripDateA[1]);

		int tripYear=Integer.parseInt(tripDateA[2]); 
		
		System.out.println("tripDateA[2]"+tripDateA[2]);
		
		
	//	WebElement currentmonth= getWebElement("firstmonth");
		JavascriptExecutor currmon= (JavascriptExecutor) driver;
	WebElement 	currentmonth=driver.findElement(By.xpath("//div[@class='datepick-month first']/div[@class='datepick-month-header']"));
	currmon.executeScript("arguments[0].click();", currentmonth);
          String value= currentmonth.getText();
          
          System.out.println(currentmonth.getText());
          
          String[] CalMonYear = value.split(" ");
          
          String currentMon = CalMonYear[0];
          
          System.out.println(currentMon);
          int currentMonNum=1;
         
          if(currentMon.equalsIgnoreCase("Jan")){
        	  currentMonNum=1;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Feb")){
        	  currentMonNum=2;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Mar")){
        	  currentMonNum=3;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Apr")){
        	  currentMonNum=4;

        	  }
        	  else if(currentMon.equalsIgnoreCase("May")){
        	  currentMonNum=5;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Jun")){
        	  currentMonNum=6;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Jul")){
        	  currentMonNum=7;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Aug")){
        	  currentMonNum=8;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Sep")){
        	  currentMonNum=9;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Oct")){
        	  currentMonNum=10;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Nov")){
        	  currentMonNum=11;

        	  }
        	  else if(currentMon.equalsIgnoreCase("Dec")){
        	  currentMonNum=12;

        	  }
          
         
          for (int i = 1; i <= tripMon - currentMonNum; i++) 
          {
        	
        	System.out.println(tripMon-currentMonNum);
        	
        	System.out.println(i);
        	  
        	WebElement nextmonths = getWebElement("nextmonth");
        	
        	JavascriptExecutor js = (JavascriptExecutor) driver;
        	
        	js.executeScript("arguments[0].click();",nextmonths);
        
        	
          }
          
          Thread.sleep(2000);
          
          JavascriptExecutor tripDays = (JavascriptExecutor) driver;
          
          WebElement tripdayclick = driver.findElement(By.xpath("(//a[contains(.,'"+tripDay+"')])[1]"));
          
          tripDays.executeScript("arguments[0].click();", tripdayclick);
	}
	
}




