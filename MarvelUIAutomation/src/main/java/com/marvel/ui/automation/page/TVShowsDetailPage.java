package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class TVShowsDetailPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	


	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[7]/a")
	public WebElement tvNewsSubmenuTab;
	
	
	public TVShowsDetailPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public TVNewsSubmenuPage clickTVNewsSubmenuPage()
	{
		shared.click(tvNewsSubmenuTab);
		
		return new TVNewsSubmenuPage(driver);
	}
	
}
