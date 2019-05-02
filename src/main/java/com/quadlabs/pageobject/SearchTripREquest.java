package com.quadlabs.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;

public class SearchTripREquest extends Baselibrary{

	
	
	public static void triprequestviasearch() throws Exception
	{
		
		//WebElement strip=driver.findElement(By.xpath("//div[@class='progress-bar progress-bar-striped active']"));
		
		
		WebDriverWait wait =new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='progress-bar progress-bar-striped active']")));
		//div[@class='progress-bar progress-bar-striped active']
		getWebElement("TripRequestviasearch").click();
		getWebElement("sendforpreapproval").click();
		getWebElement("Sendtext").sendKeys("Anurag Test");
		getWebElement("SendButton").click();
		getWebElement("closebuttontripreq").click();
	}
}
