package com.quadlabs.pageobject.hotel;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;

public class BookingHotelTripRequest extends Baselibrary{

		
		public static void Bookonstar(String i) throws Exception{
		//getWebElement("deselectAll").click();
//		List<WebElement> Star=driver.findElements(By.xpath("//div[@id='trHotelStarList']//ul/li/label/input[@type='checkbox']"));
		//for()
			
			
			
			WebDriverWait wait =new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='hotel-result-loader']/i")));
			
			
			Thread.sleep(2000);
			
		driver.findElement(By.xpath("(//a[@id='htlrm01'])["+i+"]")).click();
		driver.findElement(By.xpath("(//div[@class='nrm-content nrm-open-content']/label/div[@class='otrm_bknow']/p)[1]")).click();
		
		WebElement costcenter=getWebElement("costcenter");
		Select sel= new Select(costcenter);
		sel.selectByVisibleText("Test cost center");
		
		
		driver.findElement(By.xpath("//input[@class='term_radio']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_contentMain_TripRequest']")).click();
		driver.findElement(By.xpath("//textarea[@id='txtremarks']")).sendKeys("TEST TEST");
		driver.findElement(By.xpath("//a[@id='lnksendHHLEnqFromCorp']")).click();
		driver.findElement(By.xpath("//a[@title='Close']")).click();
	}}
