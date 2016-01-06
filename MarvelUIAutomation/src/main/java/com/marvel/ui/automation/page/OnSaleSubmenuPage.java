package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class OnSaleSubmenuPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[5]/a")
	public WebElement marvelUnlimitedSubmenuTab;
	
	public OnSaleSubmenuPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//loop through elements/books on page 

	public MarvelUnlimitedSubmenuPage clickOnMarvelUnlimitedSubmenuTab()
	{
		shared.click(marvelUnlimitedSubmenuTab);
		
		return new MarvelUnlimitedSubmenuPage(driver);
	}
	
}
