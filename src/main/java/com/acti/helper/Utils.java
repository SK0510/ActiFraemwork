package com.acti.helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.acti.Base.Driverscript;

public class Utils extends Driverscript {
	public static void highLightElement(WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;broder:2px solid red;')",ele);
	}
}
