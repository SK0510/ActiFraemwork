package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import com.acti.Helper.Utils;
import com.acti.Base.Driverscript;
import com.acti.helper.Utils;

/*
Tester:Sirisha
Date created:4/19/2019
Date modified: 
Modified by:
Code reviewed :Ritu
*/

public class LoginPage extends Driverscript {
	
	//****************************page elements******************************//
	
	@FindBy(id="logoContainer") WebElement actiTimeLogo;
	@FindBy(name="username") WebElement usernameTB;
	@FindBy(name= "pwd") WebElement passwordTB;
	@FindBy(id="loginButton") WebElement loginBtn;
	//****************************page Initialization******************************//
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	//****************************page actions******************************//
	public String verifyLPtitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyActilogo()
	{
		return actiTimeLogo.isDisplayed();
	}
	public void validateLogin(String username , String password)
	{
		Utils.highLightElement(usernameTB);
		usernameTB.sendKeys(username);
		Utils.highLightElement(passwordTB);
		passwordTB.sendKeys(password);
		loginBtn.click();
		
	}
	
}
