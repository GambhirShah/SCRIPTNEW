package com.quadlabs.pageobject.hotel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.quadlabs.generic.Baselibrary;

public class BookingHotelTripRequestViasearch extends Baselibrary {

	
	
	
	public static void bookinghoteltriprequestsearch (String i) throws Exception{
		
		
		WebDriverWait wait =new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='progress-bar progress-bar-striped active']")));
		
	driver.findElement(By.xpath("(//a[@id='htlrm01'])["+i+"]")).click();
	driver.findElement(By.xpath("(//div[@class='nrm-content nrm-open-content']/label/div[@class='otrm_bknow']/p)[2]")).click();
	driver.findElement(By.xpath("//label[contains(text(),'Send For Preapproval')]")).click();
	driver.findElement(By.xpath("//div[@class='s_e_n_q_r_ibox s_e_n_q_r_ibox_textarea col-sm-12']/textarea[@id='txtremarks']")).sendKeys("Test Data");
	driver.findElement(By.xpath("//div[@class='s_e_n_q_r_ibox s_e_n_q_r_ibox_textarea col-sm-12']/a")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	
	
	//WebElement costcenter=getWebElement("costcenter");
	//Select sel= new Select(costcenter);
//	sel.selectByVisibleText("Test cost center");
	
//	getWebElement("CheckTermAndCondition").click();
//	getWebElement("BookingHotel").click();
}
}