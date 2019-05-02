package com.quadlabs.pageobject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.quadlabs.generic.Baselibrary;

public class CorpPolicyApprover extends Baselibrary {	
		public static void approverworkflow(String  NoofApprover,String Approver1, String Approver2, String Approver3) throws Exception
	
	{
			getWebElement("Corporate").click();
			getWebElement("approverpolicyworkflow").click();
			getWebElement("managecorporateapprover").click();
			getWebElement("Addnew").click();
			
			
			WebElement Product = getWebElement("Productapp");
			
			Select Sel= new Select(Product);
			
			Sel.selectByValue("ALL");

			for(int i=0; i<=2;i++)
			{
		  
				try{
					
					WebElement Addcategory=	getWebElement("TravelCategoryapp");
					
					Select Sel1= new Select(Addcategory);
					
					Sel1.selectByVisibleText("Business Travel");
			  		
					break; 
				  }
		  
				    catch(Exception e)
				    {
					
				    System.out.println(e.getMessage());
				    
				    }
			}

			WebElement Workflow =getWebElement("workflowaplliedon");
	
			Select Sel2= new Select(Workflow);
	 
			Sel2.selectByValue("6");
	 
			Integer text = (int)Double.parseDouble(NoofApprover);
	
			WebElement Approverlevel = getWebElement("Approverlevel");
	
			Select Sel3= new Select(Approverlevel);
	
			Sel3.selectByValue(text.toString());
			 
			String noOfApovers = text.toString();	
			
			Thread.sleep(4000);
			
			
			if (noOfApovers.equals("1"))
			{
				 
				getWebElement("Approver1").sendKeys(Approver1);
				
				Thread.sleep(2000);
				
				List<WebElement> approvers = driver.findElements(By.name("divInPolicyApprover1"));
				
				for(WebElement approver: approvers)
				{
					
					System.out.println(approver.getText());
					
					if(approver.getText().contains(Approver1))
					{
						
						approver.click();
						break;
					}
					
				}
				
			}
			else if (noOfApovers.equals("2"))
				
			{
				
			getWebElement("Approver1").sendKeys(Approver1);
			Thread.sleep(2000);
	List<WebElement> approvers = driver.findElements(By.name("divInPolicyApprover1"));
			
			for(WebElement approver: approvers)
			    {
				
				System.out.println(approver.getText());
				
				if(approver.getText().contains(Approver1))
				{
					
					approver.click();
					break;
				}
				
			    }
			getWebElement("Approver2").sendKeys(Approver2);
			Thread.sleep(2000);
			List<WebElement> approvera = driver.findElements(By.name("divInPolicyApprover2"));
			
			for(WebElement approver: approvera)
			{
				
				System.out.println(approver.getText());
				
				if(approver.getText().contains(Approver1))
				{
					
					approver.click();
					break;
				}
				
			}
			}
			
			else if(noOfApovers.equals("3"))
			{
		//		listofautosuggestion(By.xpath("//div[contains(@id,'divInPolicyApprover1')]"),Approver1, Approver1,By.id("txtInPolicyApprover1"));	
		getWebElement("Approver1").sendKeys(Approver1);
				Thread.sleep(3000);
				List<WebElement> approvers = driver.findElements(By.id("divInPolicyApprover1"));
				
				for(WebElement approver: approvers)
				{
					
					System.out.println(approver.getText());
					
				
					
					if(approver.getText().contains(Approver1))
					{
						
						approver.click();
						break;
					}
					
				}
				
				getWebElement("Approver2").sendKeys(Approver2);
				Thread.sleep(3000);
				List<WebElement> approveres = driver.findElements(By.id("divInPolicyApprover2"));
				
				for(WebElement approver: approveres){
				
					System.out.println(approver.getText());
					
					if(approver.getText().contains(Approver2)){
						
						approver.click();
						break;
					}
					
				}
				
				getWebElement("Approver3").sendKeys(Approver3);
				Thread.sleep(3000);
				List<WebElement> approverf = driver.findElements(By.id("divInPolicyApprover3"));
				
				for(WebElement approver: approverf){
					
					System.out.println(approver.getText());
					
					if(approver.getText().contains(Approver3)){
						
						
						
						approver.click();
						break;
					}
				}   
				}

			if (noOfApovers.equals("1"))
			{
			listofautosuggestion(By.xpath("//div[contains(@id,'divOutPolicyApprover1')]"),Approver1, Approver1,By.id("txtOutPolicyApprover1"));
	/**		getWebElement("outPolicyApprover1").sendKeys(Approver1);
				
				Thread.sleep(3000);
				
				
				
				List<WebElement> dapprovers = driver.findElements(By.name("divOutPolicyApprover1"));
				
				for(WebElement approver: dapprovers)
				{
					
					System.out.println(approver.getText());
					
					if(approver.getText().contains(Approver1))
					{
						
						approver.click();
						break;
					}
					
				}**/
				
			}
			else if (noOfApovers.equals("2"))
				
			{
				
			getWebElement("outPolicyApprover1").sendKeys(Approver1);
			Thread.sleep(3000);
	List<WebElement> dapprovers = driver.findElements(By.name("divOutPolicyApprover1"));
			
			for(WebElement approver: dapprovers){
				
				System.out.println(approver.getText());
				
				if(approver.getText().contains(Approver1)){
					
					approver.click();
					break;
				}
				
			}
			getWebElement("outPolicyApprover2").sendKeys(Approver2);
			Thread.sleep(3000);
			List<WebElement> dapprovera = driver.findElements(By.name("divOutPolicyApprover2"));
			
			for(WebElement approver: dapprovera){
				
				System.out.println(approver.getText());
				
				if(approver.getText().contains(Approver1)){
					
					approver.click();
					break;
				}
				
			}
		}
			
			else if(noOfApovers.equals("3"))
			{
				
				getWebElement("outPolicyApprover1").sendKeys(Approver1);
				Thread.sleep(3000);
				List<WebElement> dapprovers = driver.findElements(By.id("divOutPolicyApprover1"));
				
				for(WebElement approver: dapprovers){
					
					System.out.println(approver.getText());
					
				
					
					if(approver.getText().contains(Approver1)){
						
						approver.click();
						break;
					}
					
				}
				
				getWebElement("outPolicyApprover2").sendKeys(Approver2);
				Thread.sleep(3000);
				List<WebElement> dapproveres = driver.findElements(By.id("divOutPolicyApprover2"));
				
				for(WebElement approver: dapproveres){
				
					System.out.println(approver.getText());
					
					if(approver.getText().contains(Approver2)){
						
						approver.click();
						break;
					}
					
				}
				
				getWebElement("outPolicyApprover3").sendKeys(Approver3);
				Thread.sleep(3000);
				List<WebElement> dapproverf = driver.findElements(By.id("divOutPolicyApprover3"));
				
				for(WebElement approver: dapproverf){
					
					System.out.println(approver.getText());
					
					if(approver.getText().contains(Approver3)){
						
						
						
						approver.click();
						break;
					}
				}   
				}
			}
		public static boolean handlingStaleElement (String user) throws Exception
		{
			
		    boolean result = false;
		    int attempts = 0;
		    while(attempts < 2) 
		    {
		        try {
		        	
		        	List<WebElement> users =  driver.findElements(By.xpath("//select[@id='listUser']/option"));  
		        	for(WebElement webelement : users)
		        	{
		        		if(webelement.getText().contains(user))
		        		{
		        			
		        			webelement.click();
		        			getWebElement("Addselect").click();
		        			
		        			
		        		
		        			result = true;
		        			
		        			Thread.sleep(1000);
		    			    break;
		    			    
		        		}
		        	}
		        	} catch(StaleElementReferenceException e) 
		                {}attempts++;
		      }
		    return result;
		    
		    
		    
		        }
		
		
		
		}
	