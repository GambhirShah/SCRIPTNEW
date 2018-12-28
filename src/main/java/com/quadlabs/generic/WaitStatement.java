package com.quadlabs.generic;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class WaitStatement
	{
		
		public static void implicitWaitForSeconds(WebDriver driver,int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		
		public static void implicitWaitForMinutes(WebDriver driver,int time)
		{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		}
		
		public static void explicitWaitForVisibility(WebDriver driver,int time,WebElement ele)
		{
			WebDriverWait wait =new WebDriverWait(driver,time);
		
			
		}
		
		public static void explicitWaitForClickable(WebDriver driver,int time,WebElement ele)
		{
			
			WebDriverWait waits =new WebDriverWait(driver,time);
			
		}
	}

