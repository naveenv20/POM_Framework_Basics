package com.qtpselenium.carwale.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qtpselenium.util.constants;

public class landingpage {

	
	@FindBy(xpath=constants.mycontactdetlink)
	public WebElement mycontactdetlink;	

	public WebDriver driver;
	
	public landingpage(WebDriver d1){
		driver=d1;
	}
	
	public personalprofile gotoprofile(){
		
		mycontactdetlink.click();	
		
		personalprofile perprofile=PageFactory.initElements(driver, personalprofile.class);
		return perprofile;
	}
	
	
}
