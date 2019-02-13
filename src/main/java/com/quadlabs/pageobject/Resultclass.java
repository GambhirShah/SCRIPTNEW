package com.quadlabs.pageobject;

import com.quadlabs.generic.Baselibrary;

public class Resultclass extends Baselibrary {

	
	public  static void book () throws Exception
	{
		getWebElement("BookNow").click();
	}
}
