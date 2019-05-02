package com.quadlabs.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;

public class FlightBookPageTriprequest extends Baselibrary{

	
	public static void flightBookpagetriprequest (String Category) throws Exception
	{
		
		
		WebDriverWait wait =new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='progress-bar progress-bar-striped active']")));
		
		Thread.sleep(1000);
		List<WebElement> farecategorytype= driver.findElements(By.xpath("(//div[contains(@id,'tdContainerTblAirlines')]/ul)[1]/li"));
		for(WebElement Categorytype:farecategorytype)
		{
			System.out.println(Categorytype.getText());
		if(Categorytype.getText().equalsIgnoreCase(Category))
		{
			Categorytype.click();
			
			Thread.sleep(2000);
			JavascriptExecutor Booknow= (JavascriptExecutor) driver;
			WebElement 	Booknowonsearch=driver.findElement(By.xpath("(//input[@value='Book Now'])[1]"));
			Booknow.executeScript("arguments[0].click();", Booknowonsearch);
			
			WebDriverWait wait1 =new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='result_count']")));
			getWebElement("flightbookpagetriprequest").click();
			getWebElement("Textdataintriprequest").sendKeys("Anurag Test");
			getWebElement("SendData").click();
			driver.findElement(By.xpath("//a[@title='Close']")).click();
			}
		}
		
	
		
		
	
	    

//getWebElement("CheckTermAndCondition").click();
		    
		
	
}}
