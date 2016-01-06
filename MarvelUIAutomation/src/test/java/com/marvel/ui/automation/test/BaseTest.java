package com.marvel.ui.automation.test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public WebDriver driver;
	
	@Before
	public void startBrowser()
	{
		Logger log=Logger.getLogger(SmokeTest.class.getName());
		DOMConfigurator.configure("log4j.xml");
		driver = new FirefoxDriver();
		
		driver.get("http://www.marvel.com");
		log.info("BROWSER SUCCESSFULLY INITIALIZED AND NAVIGATED TO MARVEL.COM");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	@After
	public void closeBrowser()
	{
		Logger log=Logger.getLogger(SmokeTest.class.getName());
		log.info("TEST COMPLETED");
		driver.quit();
		
	}
	

}
