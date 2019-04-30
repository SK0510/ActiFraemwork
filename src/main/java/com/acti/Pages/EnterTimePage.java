package com.acti.Pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.Base.Driverscript;
import com.acti.helper.Utils;

public class EnterTimePage extends Driverscript{
	/*
	Tester:Sirisha
	Date created:4/22/2019
	Date modified: 
	Modified by:
	Code reviewed :Ritu
	*/
//***********************page elements*******************//
	@FindBy(id="logoutLink") WebElement logoutLink;
	@FindBy(xpath="//a[@class='userProfileLink username']") WebElement userProfileText;
	@FindBy(id="container_users") WebElement usersMenu;
	WebDriverWait wait;
	
	
	///*************************page Initialization****************//
	public EnterTimePage()
	{
		PageFactory.initElements(driver,this);
		
	}
//****************************page actions******************************//	
	public void clickLogout()
	{
		Utils.highLightElement(logoutLink);
		logoutLink.click();
	}
	public void clickUsersMenu() throws Exception
	{
		Utils.highLightElement(usersMenu);
		Thread.sleep(3000);
		// wait = new WebDriverWait(driver,3);
		//usersMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("container_users")));
		usersMenu.click();
		
	}
	
}
