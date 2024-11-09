package com.Epsondoms.JavaScriptLibrary;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;

import com.Epsondoms.WebDriverLibarary.WebDriver_Utility;

public class JavaScriptUtility {
	
	
	public static JavascriptExecutor javascriptobj;
	
	
	public static void enterData_DisabledElement(WebElement element,String data)
	{
		javascriptobj = (JavascriptExecutor)WebDriver_Utility.driver;
		javascriptobj.executeScript("arguments[0].vaue="+data+"",element);

	}

	public static void click_DisabledElement(WebElement element)
	{
		javascriptobj = (JavascriptExecutor)WebDriver_Utility.driver;
		javascriptobj.executeScript("arguments[0]/click()",element);

		
	}
	public static void defaultverticalscrollBy()
	{
		javascriptobj = (JavascriptExecutor)WebDriver_Utility.driver;
		javascriptobj.executeScript("window.scrollBy(1000,1000)");

}
	public static void defaultverticalscrollTo()
	{
		javascriptobj = (JavascriptExecutor)WebDriver_Utility.driver;
		javascriptobj.executeScript("window.scrollTo(1000,1000)");

	}
	
	public static void scrollUsingView(WebElement element,boolean value)
	{
		javascriptobj=(JavascriptExecutor)WebDriver_Utility.driver;
		
		javascriptobj.executeScript("arguments[0].scrollIntoview("+value+");",element);
	}
	
	
	
}
