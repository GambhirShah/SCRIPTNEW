package com.quadlabs.generic;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities extends GetPropertyValue {
public static String src;
public static DataFormatter formatter;
	
	
		public static String readXLSFile(String sheetname, int rownum,int cellnum) {
			String value="";
		{
				 
	try {
					
		String exceldata = GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", "exceldata1");
		FileInputStream ExcelFileToRead = new FileInputStream(exceldata);

		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		value = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		} 
		catch (IOException e )
		{
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
		}
		return value;
		}
	}
	
