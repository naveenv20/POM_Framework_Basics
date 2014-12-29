package com.qtpselenium.carwale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qtpselenium.util.constants;



public class topmenu {

	@FindBy(xpath=constants.usedcarslink)
	public WebElement usedcarslink;
	@FindBy(xpath=constants.logout)
	public WebElement logoutlink;
	
	WebDriver driver;
	
	public topmenu(WebDriver d1){
		driver=d1;
	}
	
	public void gotousedcars(){
		usedcarslink.click();	
	}
	
	public void logout(){
		logoutlink.click();
	}
	
	
}
