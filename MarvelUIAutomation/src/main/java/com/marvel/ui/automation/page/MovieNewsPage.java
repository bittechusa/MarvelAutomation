package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class MovieNewsPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	


	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[4]/a")
	public WebElement videosTopNavTab;
	
	public MovieNewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	



	public VideosPage clickOnVideosTopNavTab()
	{
		shared.click(videosTopNavTab);
		
		return new VideosPage(driver);
	}




}
