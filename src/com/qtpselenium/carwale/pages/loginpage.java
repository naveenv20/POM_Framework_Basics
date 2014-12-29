package com.qtpselenium.carwale.pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qtpselenium.util.ErrorUtil;
import com.qtpselenium.util.TestUtil;
import com.qtpselenium.util.constants;

public class loginpage {

	//Xpaths we are reading from the constant file available in the util package
	@FindBy(xpath=constants.loginemail)
	public WebElement loginemail;
	
	@FindBy(xpath=constants.loginpassword)
	public WebElement loginpassword;
	
	@FindBy(xpath=constants.loginlink)
	public WebElement loginlink;

	@FindBy(xpath=constants.loginbutton)
	public WebElement loginbutton;
	
	@FindBy(xpath=constants.loggednuser)
	public WebElement loggeduser;
	
	
	
	public WebDriver driver;
	public loginpage(WebDriver d1){
		driver=d1;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	//after logging in we will be in the landing page ...so we are returing the landing page object
	public landingpage dologin(String username,String password){
		driver.get("http://www.carwale.com/");
		loginlink.click();
		loginemail.sendKeys(username);
		loginpassword.sendKeys(password);
		loginbutton.click();
		try{
		Assert.assertEquals(driver.getTitle(), constants.homepagetitle);
		}catch (Throwable e)
		{
			System.out.println("Error");
			//errorutil add verrific is like a bascket which keeps the errors coming
			ErrorUtil.addVerificationFailure(e);
			//when ever error occurs take screen shot
			String scrsht_filename="loginpage";
			TestUtil.takescreenshot(scrsht_filename, driver);
			
		}
		//validate login ..if successful the return landing page object 
		 String  LoggedUser=loggeduser.getText();
		if(!LoggedUser.contains("Naveen"))
		return null;
		else{
		landingpage lanpage=PageFactory.initElements(driver, landingpage.class);
		return lanpage;
	}
	}
	
}
