package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class ComicTrailersAndClipsPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	



	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[4]/a")
	public WebElement fullEpisodesSubmenuTab;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[4]/div/a")
	public WebElement ultimateSpidermanMouseOverMenuTab;
	
	public ComicTrailersAndClipsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public UltimateSpidermanPage clickUltimateSpidermanMouseOverMenuTab()
	{
		shared.mouseOver(fullEpisodesSubmenuTab);
		shared.click(ultimateSpidermanMouseOverMenuTab);
	
		return new UltimateSpidermanPage(driver);
	}
	








}
