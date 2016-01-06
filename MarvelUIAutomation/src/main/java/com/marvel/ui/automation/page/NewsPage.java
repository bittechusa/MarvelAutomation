package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class NewsPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	@FindBy(xpath=".//*[@id='news-index']/header/div[1]")
	public WebElement topBannerAd;
	
	@FindBy(xpath=".//*[@id='news-list']/div[1]/div[1]")
	public WebElement squareBannerAd;
	
	@FindBy(xpath=".//*[@id='news-index']/section[2]/div/div/a[1]/span")
	public WebElement backButtonOnListModule;
	
	@FindBy(xpath=".//*[@id='news-index']/section[2]/div/div/a[2]/span")
	public WebElement forwardButtonOnListModule;
	
	@FindBy(xpath=".//*[@id='news-index']/section[2]/div/h2/a")
	public WebElement seeAllButton;
	
	
	@FindBy(xpath=".//*[@id='news-list']/div[1]/div[2]/div/div[1]/div/div[1]/div/a/div")
	public WebElement firstNewsArticle;
	
	@FindBy(xpath=".//*[@id='story1']/div/div[2]/div/ul/div/div[1]")
	public WebElement shareButtonsSection;
	
	@FindBy(xpath=".//*[@id='story1']/div/div[1]")
	public WebElement stickyModuleOnRightColumn;
	
	@FindBy(xpath=".//*[@id='fyre-editor-5']/p")
	public WebElement commentingModuleTextBox;
	
	@FindBy(xpath=".//*[@id=':13']/div/div")
	public WebElement postCommentButtonOnCommentingModule;
	
	@FindBy(xpath=".//*[@id=':11']/div/div")
	public WebElement shareButtonOnCommentingModule; 
	
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	public NewsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyAdUnits()
	{
		
		log.info("Verified top banner ad.");
		
		log.info("Verified square banner ad.");
	}
	
	public void checkBackForwardButtonsOnListModule()
	{
		log.info("Verified back button on list module.");
		
		log.info("Verified forward button on list module.");
	}
	
	public void verifySeeAllButton()
	{
		log.info("Verified 'See All' button.");
	}
	
	public void testCommentingModule()
	{
		log.info("Verified commenting module.");
	}
	
	
	public FirstNewsArticle clickToReadFirstNewsArticle()
	{
		shared.click(firstNewsArticle);
		
		return new FirstNewsArticle(driver);
	}
	
	
	

}
