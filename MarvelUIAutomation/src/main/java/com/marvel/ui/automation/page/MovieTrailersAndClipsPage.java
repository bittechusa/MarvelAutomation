package com.marvel.ui.automation.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class MovieTrailersAndClipsPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);


	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/a")
	public WebElement trailersAndClipsSubmenuTab;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/div/a[2]")
	public WebElement tvTrailersAndClipsPage;
	
	public MovieTrailersAndClipsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	public TVTrailersAndClipsPage clickTVTrailersAndClipsMouseOverMenuTab()
	{
		shared.mouseOver(trailersAndClipsSubmenuTab);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		shared.click(tvTrailersAndClipsPage);
		
		return new TVTrailersAndClipsPage(driver);
	}
	
	
	
	
	
}
