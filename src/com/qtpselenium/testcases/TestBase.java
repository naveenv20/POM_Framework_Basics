package com.qtpselenium.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static Logger APPLICATION_LOGS;
	public static Properties prop=null;
	public static WebDriver d1=null;
	
	public void initconfigurations() throws IOException{
		//logging
		if(prop==null){
		APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
		//Properties intialising
		prop= new Properties();
		FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\Config.properties");
		prop.load(fs);
		}
	}
	
	
	public void initdriver(){
	if(d1==null)
	{
		if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
		d1= new FirefoxDriver();
	}
	}
	
}
	
	
	public void quitdriver(){
		d1.quit();
	}
}

