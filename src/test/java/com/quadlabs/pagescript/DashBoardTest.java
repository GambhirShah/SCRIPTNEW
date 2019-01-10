package com.quadlabs.pagescript;

import org.testng.annotations.Test;

import com.quadlabs.generic.Baselibrary;


import com.quadlabs.pageobject.DashBoard;


public class DashBoardTest extends Baselibrary {
	
	@Test
	
	public void searchEmployee() throws Exception
	{
	LoginTest.validlogintest();
	
	DashBoard.search("Guest User","Guest");
	
	}
}
