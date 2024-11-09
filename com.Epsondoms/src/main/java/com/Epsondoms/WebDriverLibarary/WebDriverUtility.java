package com.Epsondoms.WebDriverLibarary;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class Provides the Reusable Method To Perform All Browser Related Actions
 * @author*/


public  class WebDriverUtility {

	
	
	public static WebDriver driver;
	public static Select selectobj;
	public static Actions actionobj;
	public static Robot rbobj;
	public WebDriverWait wait;
	
	/**
	 * This Method Used To Launch The Specific Browser
	 * @param String BrowserName
	 * @returnvoid*/

	
	public static void launchBrowser(String browser) {
		//String browser = bname;
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid input");
			break;
		}

	}
	/**
	 * This Method Used To Navigate The Specific Browser
	 * 
	 * @param String URL
	 * @return void*/
	
	
	
		public static void navigateToApplication(String url) {
			driver.get(url);
		}
		/**
		 * This Method Used To MaximizeTheBrowser
		 * 
		 * @return void*/
	
	public static void maximizeTheBrowser() {
		driver.manage().window().maximize();
	}
	/**
	 * This Method Used To Close the Browser
	 * 
	 *@return void */
	
	public static void closeTheBrowser() {
		driver.close();
	}
	/**
	 * This Method Used To Close All The Browser
	 * 
	 * @return void*/
	
	
	public static void closeAllTheBrowser() {
		driver.quit();
	}
	
	/**
	 * This Method Used To Wait Implicitly
	 * 
	 * @return void*/
	
	public static void Waitimplicitly(Long duration)
	{
		driver.manage().timeouts().implicitlyWait(duration,TimeUnit.SECONDS);
	}
	
	/**
	 * This Method used To Wait Wait Explicitly
	 * 
	 * @return void*/
	
	
	
	public static void waitexplicitly(long duration,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,duration);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	/**
	 * This Method Used To Select OPtion In DropDown
	 * 
	 * @return void*/
	
	
	public void selectOptionInDropDown(WebElement element,int index) {
		
	}
	
	/**
	 * This Method Used To Select Options Dropdown
	 * 
	 *@return void */
	
	
	
	public void selectOptionsDropdown(WebElement element,String visibletext) {
		
	}
	/**
	 * This Method used To Select option In DropDown
	 * 
	 *@return void */
	

	public void selectOptionInDropDown(WebElement element) {
		selectobj.selectByValue("300,200");
		
	}
	/**
	 * This Method Used To Select MouseHovering
	 * 
	 * @return void*/
	public void mouseHovering(WebElement element)
	{
	  actionobj.moveToElement(element).perform();
	}
	
	/**
	 * This Method USed To Press The Key
	 * @return void*/
	
	
	public void pressThekey_pageDown()
	{
		rbobj.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
		
	/**
	 * This Method used To Release The key PageDown
	 * 
	 * @return void*/
	
	
	public void ReleaseTheKey_pageDown()
	{
		rbobj.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
	
	/**
	 * This Method used To Alert Popupdismiss
	 * 
	 * @return void*/
	

	public void alertPopupdismiss() {
		driver.switchTo().alert().dismiss();
		
	}
	/**
	 * This Method used To switchControlToFrame
	 * 
	 * @return void*/
	
	public void switchControlToFrame(int index)
	{
		driver.switchTo().frame(index);
		
	}
	/**
	 * This Method used To SwitchcontrolToFrame
	 * 
	 * @return void*/
	public void switchControlToFrame(WebElement element)
	{
		driver.switchTo().frame(element);
		
	}
	/**
	 * This Method used To SwitchBackControlToMain
	 * 
	 * @return void*/
	
	public void switchBackControlToMain()
	{
		driver.switchTo().defaultContent();
	}
	/**
	 * This Method used To switch control To Window
	 * 
	 * @return void*/
	
	public void switchControlToWindow(String windowaddress)
	{
	
		driver.switchTo().window(windowaddress);
	}
	
}
