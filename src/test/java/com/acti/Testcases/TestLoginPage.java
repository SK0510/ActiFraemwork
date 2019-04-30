package com.acti.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPage extends BaseTest{
	
	public TestLoginPage()
	{
		super();//super keyword is used to call the parent class constructor
	}
	
	@Test(priority=1)
	public void testVerifyTitle()
	{
		lanchApplication();
		String expected="actiTIME - Login";
		String actual = loginPage.verifyLPtitle();
		Assert.assertEquals(expected , actual);
		//System.out.println(actual);
	}
	@Test(priority=2)
	public void testVerifyLogo()
	{
		lanchApplication();
		boolean flag = loginPage.verifyActilogo();
		Assert.assertTrue(flag);
		//System.out.println(flag);
		
	}
	@Test(priority=3)
	public void testValidateLogin()
	{
		lanchApplication();
		//loginPage.validateLogin("admin", "manager");
		loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
