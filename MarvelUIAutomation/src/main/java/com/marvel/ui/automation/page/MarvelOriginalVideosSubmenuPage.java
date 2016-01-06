package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class MarvelOriginalVideosSubmenuPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	
	@FindBy(xpath=".//*[@id='mostWatched']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstVideo;
	
	public MarvelOriginalVideosSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public VideoDetailPage clickFirstVideo()
	{
		shared.click(firstVideo);
		
		return new VideoDetailPage(driver);
	}
	//click first video to go to video detail page -- opens up VideoDetailPage
	
	
	
	
	
	
	
	
	

}
