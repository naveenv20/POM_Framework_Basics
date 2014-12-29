package com.qtpselenium.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;

public class mysampletest extends TestBase{

	@Test
	public void sayhello() throws IOException{
		Xls_Reader xls= new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\Test Cases.xlsx");
		if(!TestUtil.isexecutable("LoginTest", xls))
			throw new SkipException("Test case is configured as NO");
			System.out.println("inside the LoginTest");
		System.out.println("hello");
		
		initconfigurations();
		initdriver();
		d1.get("http://google.com");
		
		
		
	}
	
}
