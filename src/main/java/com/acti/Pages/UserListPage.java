package com.acti.Pages;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.acti.Base.Driverscript;
import com.acti.helper.Utils;

public class UserListPage extends Driverscript {
	
	@FindBy(xpath="//div[contains(@class,'withPlusIcon')]") WebElement newUserButton;
	@FindBy(xpath="//input[@id='createUserPanel_firstNameField']") WebElement firstNameTB;
//	@FindBy(className="firstNameField inputFieldWithPlaceholder") WebElement firstNameTB;
	@FindBy(id="createUserPanel_lastNameField") WebElement lastNameTB;
	@FindBy(xpath="//div[@class='components_button submitBtn']") WebElement createUserBtn;
	
	public UserListPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void clickNewUserButton() throws Exception
	{
		Utils.highLightElement(newUserButton);
		Thread.sleep(3000);
		newUserButton.click();
	}
	public void enterFirstName(String firstName) throws Exception
	{
		Utils.highLightElement(firstNameTB);
		Thread.sleep(3000);
		firstNameTB.sendKeys(firstName);
	}
	public void enterLastName(String lastName) throws Exception
	{
		Utils.highLightElement(lastNameTB);
		Thread.sleep(3000);
		lastNameTB.sendKeys(lastName);
	}
}
