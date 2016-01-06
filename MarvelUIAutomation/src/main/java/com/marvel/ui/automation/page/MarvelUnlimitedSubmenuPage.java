package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class MarvelUnlimitedSubmenuPage 
{

WebDriver driver;

	Shared shared = new Shared(driver);
	
	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[8]/a")
	public WebElement comicNewsSubmenuTab;
	

	public MarvelUnlimitedSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//loop through covers
	
	
	public ComicNewsSubmenuPage clickOnComicNewsSubmenuTab()
	{
		shared.click(comicNewsSubmenuTab);
		
		return new ComicNewsSubmenuPage(driver);
	}
	

}
