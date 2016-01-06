package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class TVTrailersAndClipsPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	





	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/a")
	public WebElement trailersAndClipsSubmenuTab;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/div/a[3]")
	public WebElement gameTrailersAndClips;
	
	public TVTrailersAndClipsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public GameTrailersAndClipsPage clickGameTrailersAndClipsTab(FirefoxDriver x)
	{
		shared.mouseOver(trailersAndClipsSubmenuTab);
		shared.click(gameTrailersAndClips);
		driver=x;
		return new GameTrailersAndClipsPage(driver);
	}
	
	
	
	
	
	

}	