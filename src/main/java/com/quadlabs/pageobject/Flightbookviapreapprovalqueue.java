package com.quadlabs.pageobject;

import com.quadlabs.generic.Baselibrary;

public class Flightbookviapreapprovalqueue extends Baselibrary {
	
	public static void flightbookviapreapprovalqueue() throws Exception
	{
		getWebElement("BookingQueue").click();
		getWebElement("preappqueue").click();
	}

}
