package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class NewsArticlePage 
{

	WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	@FindBy(xpath=".//*[@id='gallery_25392_single']/div[1]/div/div[2]/div/div/ul/li/img")
	public WebElement mainBannerImage;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[3]/a")
	public WebElement moviesTopNavTab;
	
	public NewsArticlePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void verifyMainBannerImagePresent()
	{
		shared.isDisplayed(mainBannerImage);
	}
	
	
	public void verifyCommentsSection()
	{
		shared.getText(null);
	}
	
	
	public MoviesPage clickOnMoviesPageMenuTab()
	{
		shared.click(moviesTopNavTab);
		
		return new MoviesPage(driver);
	}

}
