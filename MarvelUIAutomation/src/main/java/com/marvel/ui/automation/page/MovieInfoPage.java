package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class MovieInfoPage 
{
	
	WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	
	@FindBy(xpath=".//*[@id='movies-detail']/section[1]/div[2]/div/div/div[1]/div[1]/div")
	public WebElement movieImage;
	
	@FindBy(xpath=".//*[@id='marvel_topnav']/h1/a")
	public WebElement marvelLogo;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[3]/a")
	public WebElement moviesTopNavTab;
	
	public MovieInfoPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickMovieImage()
	{
		movieImage.click();
	}
	
	public void verifyMovieImageIsDisplayed()
	{
		shared.isDisplayed(movieImage);
	}
	
	public void verifyMarvelLogoIsDisplayed()
	{
		shared.isDisplayed(marvelLogo);
	}
	
	
	
	//navigate back to movies 
	
	
	public AllMoviesSubmenuPage clickAllMoviesSubmenuTab()
	{
		shared.click(moviesTopNavTab);
	
		return new AllMoviesSubmenuPage(driver);
		
	}
	

}
