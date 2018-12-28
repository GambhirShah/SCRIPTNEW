
package com.quadlabs.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetPropertyValue {
	static String key;
	static String value="";
	static WebDriver driver;
	
	

	
	public static String getpropertyvalue(String filepath,String key){
		
		
		Properties prop = new Properties();
		
		
		try {
			prop.load(new FileInputStream(new File(filepath)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			String value =	prop.getProperty(key);
			return value;}
			
	

			
		}
		
	

