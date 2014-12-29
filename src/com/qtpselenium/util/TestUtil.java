package com.qtpselenium.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {

	
	public static boolean isexecutable(String Testcasename,Xls_Reader xls){
		
		for(int rnum=2;rnum<=xls.getRowCount("Test Cases");rnum++){
			if(xls.getCellData("Test Cases", "TCID", rnum).equalsIgnoreCase(Testcasename)){
				if(xls.getCellData("Test Cases", "Runmode", rnum).equalsIgnoreCase("Y"))
					return true;
				else 
					return false;
			}
		}
		return false;		
	
		
	}
	
	
	public static void takescreenshot(String filename,WebDriver d1) {
		File scrFile = ((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"//screenshots//"+filename+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
