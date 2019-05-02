package com.quadlabs.generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;





public class ScreenShot 
{
WebDriver driver;
public static String imgname = null;


public static void getSnapShot(WebDriver wb, String testcaseName) throws Exception 
{
  try 
  {
  String imgpath=System.getProperty("user.dir").concat("\\Screenshot\\"+testcaseName);
  File f=new File(imgpath);
  if(!f.exists())   
    {
      f.mkdir();
    }   
    Date d=new Date();
    SimpleDateFormat sd=new SimpleDateFormat("dd_MM_yy_HH_mm_ss_a");
    String timestamp=sd.format(d);
    imgname=imgpath+"\\"+timestamp+".png";

    
    TakesScreenshot snpobj=((TakesScreenshot)wb);
    File srcfile=snpobj.getScreenshotAs(OutputType.FILE);
    File destFile=new File(imgname);
    FileUtils.copyFile(srcfile, destFile);

    }
  catch(Exception e)
  {
      e.getMessage();
  }
}
}

