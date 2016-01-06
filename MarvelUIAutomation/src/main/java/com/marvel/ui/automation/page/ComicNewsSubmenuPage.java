package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class ComicNewsSubmenuPage 

{
	
WebDriver driver;

	Shared shared = new Shared(driver);

	
	
	
	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/a")
	public WebElement mainRotatorImage;
	
	@FindBy(xpath=".//*[@id='news-list']/div[1]/div[2]/h2")
	public WebElement moduleHeader;
	
	@FindBy(xpath=".//*[@id='news-list']/div[1]/div[2]/div/div[1]/div/div[1]/div/a/div")
	public WebElement firstNewsArticle;
	
	
	public ComicNewsSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//loop through browse menu
	
	
	public void verifyMainRotatorImageIsDisplayed()
	{
		shared.isDisplayed(mainRotatorImage);
	}
	
	public void verifyModuleHeaderPresent()
	{
		shared.isDisplayed(moduleHeader);
	}
	
	
	
	public NewsArticlePage clickNewsArticle()
	{
		shared.click(firstNewsArticle);
	
		return new NewsArticlePage(driver);
		
	}
	
	

}
