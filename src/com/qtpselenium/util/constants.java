package com.qtpselenium.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class constants {

	//xpaths from login page
	public static final String  loginemail="//*[@id='ctlLogin_txtLoginid']";
	public static final String loginpassword="//*[@id='ctlLogin_txtPasswd']";		
	public static final String loginlink="//*[@id='login_ul']/li[1]/a";		
	public static final String loginbutton="//*[@id='ctlLogin_butLogin']";	
	public static final String loggednuser="//*[@id='login1_lblUser']";	

			
	//xpaths from landing page
	public static final String mycontactdetlink="//*[@id='sub-navbar']/ul/li[1]/a";
	
	
			 
// xpaths for top menu page
	
	public static final String usedcarslink="//*[@id='primary-navbar']/ul/li[8]/a";
	public static final String logout="//*[@id='login1_hrefLogin']";

		
//page titles
	public static final String homepagetitle="My CarWale Home - CarWale";
		

			
			
			
			
			
}
