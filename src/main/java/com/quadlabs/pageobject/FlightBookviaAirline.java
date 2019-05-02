package com.quadlabs.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.quadlabs.generic.Baselibrary;

public class FlightBookviaAirline  extends Baselibrary {

	public static void airlinebooking(String Airline,String PolicyType) throws Exception
	{
		
		WebDriverWait wait =new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='progress-bar progress-bar-striped active']")));
		
		Thread.sleep(1000);
		List<WebElement> farecategorytype= driver.findElements(By.xpath("(//div[contains(@id,'tdContainerTblAirlines')]/ul)[2]/li"));
		for(WebElement Categorytype:farecategorytype)
		{
			System.out.println(Categorytype.getText());
		if(Categorytype.getText().equalsIgnoreCase(Airline))
		{
			Categorytype.click();
			}
		}
		
		
		List<WebElement> Policy = driver.findElements(By.xpath("//ul[@class='timelape stop-list pticon']/li"));
		for(WebElement policy:Policy)
		{
			if(policy.getText().equalsIgnoreCase(PolicyType))
			{
				policy.click();
			}
		}
		
		getWebElement("FareBreakup").click();
		
		WebElement wb=getWebElement("Fare");
		String farebreakupprice =wb.getText();
		WebElement Wb1=getWebElement("FareBreakup");
		String searchFare=Wb1.getText();
		SoftAssert Sa=new SoftAssert();
		Sa.assertEquals(searchFare, farebreakupprice,"Fare Breakup not Matched");
		Reporter.log("Fare Breakup Matched", true);
		
		
		
		
		JavascriptExecutor flightitenerary= (JavascriptExecutor) driver;
		WebElement 	flitit=driver.findElement(By.xpath("(//a[@class='flght-itnry ng-binding'])[2]"));
		flightitenerary.executeScript("arguments[0].click();", flitit);
	//	driver.findElement(By.xpath("(//a[@class='flght-itnry ng-binding'])[2]")).click();
	//	getWebElement("FlightItinerary").click();
		
		
		
		JavascriptExecutor flightmail= (JavascriptExecutor) driver;
		WebElement 	flitmail=driver.findElement(By.xpath("(//span[@class='ng-binding' and text()='Send Email'])[2]"));
		flightmail.executeScript("arguments[0].click();", flitmail);
	//	driver.findElement(By.xpath("(//span[@class='ng-binding' and text()='Send Email'])[2]")).click();
	//	getWebElement("SendEmail").click();
		getWebElement("EnterEmail").sendKeys("Anurag.upadhyay@quadlabs.com");
		
		
		Thread.sleep(3000);
		JavascriptExecutor sendemail= (JavascriptExecutor) driver;
		WebElement 	submit=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		sendemail.executeScript("arguments[0].click();", submit);
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.switchTo().alert().accept();
		getWebElement("Close").click();
	//	getWebElement("Print").click();
	//	getWebElement("PrintClick").click();
		JavascriptExecutor Booknow= (JavascriptExecutor) driver;
		WebElement 	Booknowonsearch=driver.findElement(By.xpath("(//input[@value='Book Now'])[1]"));
		Booknow.executeScript("arguments[0].click();", Booknowonsearch);
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='result_count']")));
		getWebElement("CheckTermAndCondition").click();
	//	getWebElement("InstantTicket").click();
	}
	
}
