package com.qtpselenium.carwale.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class personalprofile {

	@FindBy(xpath="//*[@id='uiTabs']/ul/li[3]/a/span")
	public WebElement updatecommunityprofile;
	@FindBy(xpath="//*[@id='txtAboutMe']")
	public WebElement aboutyoudescp;
	@FindBy(xpath="	//*[@id='btnSave']")
	public WebElement updateprofilebutton;
	

	
	public void updateprofile(){
		
	updatecommunityprofile.click();
	aboutyoudescp.sendKeys("Abcd");
	updateprofilebutton.click();
}
}
