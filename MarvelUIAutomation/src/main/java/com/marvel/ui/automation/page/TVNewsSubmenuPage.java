package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class TVNewsSubmenuPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[7]/a")
	public WebElement charactersTopNavTab;
	
	

	public TVNewsSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public CharactersPage clickAllCharactersTopNavTab()
	{
		shared.click(charactersTopNavTab);
		
		return new CharactersPage(driver);
	}
	
	

}
