package com.acti.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.Base.Driverscript;
import com.acti.Pages.EnterTimePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.UserListPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest extends Driverscript
{
	ExtentHtmlReporter htmlReport;
	ExtentReports extent;
	ExtentTest logger;
	LoginPage loginPage;
	 EnterTimePage enterTimePage;
	 UserListPage usersPage;
	@BeforeMethod
	public void setUp()
	{
	     htmlReport = new ExtentHtmlReporter("./acti-Reports/AutomationReport.html");
	     extent = new ExtentReports();
		extent.attachReporter(htmlReport);
		initBrowser();
	    loginPage = new LoginPage();
	    enterTimePage = new EnterTimePage();
	    usersPage = new UserListPage();
		
	}
	@AfterMethod
		public void tearDown()
		{
			driver.quit();
			extent.flush();
		}
}
