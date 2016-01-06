package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class GameTrailersAndClipsPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/a")
	public WebElement trailerAndClipsSubmenuTab;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/div/a[4]")
	public WebElement comicTrailersAndClipsSubmenuTab;
	
	public GameTrailersAndClipsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public ComicTrailersAndClipsPage clickComicTrailersAndClipsMouseOverMenuTab()
	{
		shared.mouseOver(trailerAndClipsSubmenuTab);
		shared.click(comicTrailersAndClipsSubmenuTab);
		
		return new ComicTrailersAndClipsPage(driver);
	}
	
}
