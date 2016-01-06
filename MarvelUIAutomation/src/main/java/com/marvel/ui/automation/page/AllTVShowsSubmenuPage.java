package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class AllTVShowsSubmenuPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	
	
	
	@FindBy(xpath=".//*[@id='curated_with_ad']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement tvShowsDetailPage;
	
	
	
	public AllTVShowsSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public TVShowsDetailPage clickTVShowsDetailPage()
	{
		shared.click(tvShowsDetailPage);
	
		return new TVShowsDetailPage(driver);
	}

}
