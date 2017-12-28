package com.crm.qa.util;

import java.io.IOException;


import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public TestUtil() throws IOException {
		super();
	}
	public static long PAGE_LOAD_TIMEOUT = 10;
	public static long IMPLICIT_WAIT = 20;
	

	 public void switchToIframe(String nameOrID) {

	        //make sure you get the id or name of the iframe and pass it as element
	        //so create a variable and store the webelement object and pass it to the method parameter
	        driver.switchTo().frame(nameOrID);

	    }
}
