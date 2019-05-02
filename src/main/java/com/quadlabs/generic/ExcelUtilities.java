package com.quadlabs.generic;



import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelUtilities extends GetPropertyValue {
public static String src;
public static DataFormatter formatter;
	
public static void excelCorporateReader(String Excelkey) throws Exception{
	
	try{
		String exceldata = GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", Excelkey);
	
	FileInputStream ExcelFileToRead = new FileInputStream(exceldata);
	XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
	}catch(Exception e){
	e.getMessage();
	}
}
		public static int RowNum(String Excelkey, String SheetName) throws Exception{
			
			
			String exceldata = GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", Excelkey);
			
			FileInputStream ExcelFileToRead = new FileInputStream(exceldata);
			
			XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
			
			int row = wb.getSheet(SheetName).getLastRowNum();
			
			return row;
		}
		
		
		public static int ColNum(String Excelkey, String SheetName) throws Exception{
			
			
			String exceldata = GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", Excelkey);
			
			FileInputStream ExcelFileToRead = new FileInputStream(exceldata);
			
			XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
			
			int col= wb.getSheet(SheetName).getRow(0).getLastCellNum();
			
			return col;
		}
		

		public static String readXLSFile(String Excelkey,String sheetname, int rownum,int cellnum) {
			
		String value = "";
		{
				 
		try {
					
	String exceldata = GetPropertyValue.getpropertyvalue(System.getProperty("user.dir")+"\\testdata\\config.properties", Excelkey);
		
	FileInputStream ExcelFileToRead = new FileInputStream(exceldata);

	XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		
	DataFormatter formatter = new DataFormatter();
		
	value = formatter.formatCellValue(wb.getSheet(sheetname).getRow(rownum).getCell(cellnum));
		
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