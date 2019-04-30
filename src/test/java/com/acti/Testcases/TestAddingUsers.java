package com.acti.Testcases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestAddingUsers extends BaseTest{
	
	public TestAddingUsers()
	{
		super();
	}
	
	
	@Test
	public void validateAddUserFunctionality() throws Exception
	{
		logger=extent.createTest("Validating New User Fucntionality");
		lanchApplication();
		logger.log(Status.PASS, "Launched the Application");
		loginPage.validateLogin("admin", "manager");
		logger.log(Status.PASS, "logged into application");
		enterTimePage.clickUsersMenu();
		logger.log(Status.PASS, "clicked on user menu");
		usersPage.clickNewUserButton();
		logger.log(Status.PASS, "clicked on new user button");
    	//usersPage.clickNewUserButton();
		//usersPage.enterFirstName("Shantosh");
	 //logger.log(Status.PASS, "entered firstname");
	  //usersPage.enterLastName("Kumar");
	 //logger.log(Status.PASS, "entered lastname");
	}

}
