package com.qtpselenium.testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.qtpselenium.carwale.pages.landingpage;
import com.qtpselenium.carwale.pages.loginpage;
import com.qtpselenium.carwale.pages.personalprofile;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.Xls_Reader;



public class LoginTest extends TestBase {

	
	
	
	@Test
	public void loginTest() throws IOException{
		
		//checking the run mode
		Xls_Reader xls= new Xls_Reader(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\data\\Test Cases.xlsx");
		if(!TestUtil.isexecutable("LoginTest", xls))
			throw new SkipException("Test case is configured as NO");
			System.out.println("inside the LoginTest");
			
			//********
			//calling init functions of test base
			initconfigurations();
			initdriver();
			
			
			
			
			//intital logs and properties fiels here
			//Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
			//these log function now in TestBase
			APPLICATION_LOGS.debug("Starting test");
			//these properties function now in TestBase
			//Properties prop= new Properties();
			//FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\qtpselenium\\config\\Config.properties");
			//prop.load(fs);
			
			//intial browser
			/*WebDriver d1=null;
			if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
			d1= new FirefoxDriver();
			}*/
			
			//page factory style begins here
			//original test
			
	
			
			
			d1.get("http://www.carwale.com/");
			d1.findElement(By.xpath("//div[@class='city-content-close']")).click();
			d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			loginpage lp=PageFactory.initElements(d1, loginpage.class);
			landingpage Lanpage=lp.dologin("naveen_v201985@rediffmail.com", "greffendor1");
			Assert.assertTrue(Lanpage!=null, "could not login");
			personalprofile perprofi=Lanpage.gotoprofile();
			perprofi.updateprofile();
			
	}
	
}
