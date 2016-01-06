package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class TVPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/a")
	public WebElement mainTVRotator;
	
	@FindBy(xpath=".//*[@id='tv-index']/section[2]/div/div/a[1]/span")
	public WebElement backButtonOnListModule;
	
	@FindBy(xpath=".//*[@id='tv-index']/section[2]/div/div/a[2]/span")
	public WebElement forwardButtonOnListModule;
	
	
	@FindBy(xpath=".//*[@id='tv-index']/header/div[1]")
	public WebElement topBannerAd;
	
	@FindBy(xpath=".//*[@id='featuredShows']/div/div[1]/div")
	public WebElement squareBannerAd;
	

	@FindBy(xpath=".//*[@id='featuredShows']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstTVShow;
	
	@FindBy(xpath=".//*[@id='fyre-editor-10']/p")
	public WebElement commentingModuleTextbox;
	
	@FindBy(xpath=".//*[@id=':cd']/div/div")
	public WebElement shareButtonOnCommentingModule;
	
	@FindBy(xpath=".//*[@id=':cf']/div/div")
	public WebElement postCommentButton;
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/span")
	public WebElement facebookLikeWidget;
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[6]/a")
	public WebElement allTVShowsSubmenuTab;

	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	public TVPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyMainTVPageRotator()
	{
		log.info("Verified main TV page rotator.");
	}
	//Verify main TV page rotator
	
	
	public void checkNavigationArrowsOnListModules()
	{
		log.info("Verified back navigation arrow on list module.");
		
		log.info("Verified forward navigation arrow on list module.");
	}
	
	public void verifyAdUnits()
	{
		log.info("Verified top ad banner.");
		
		log.info("Verifed square ad banner.");
	}
	
	
	public void clickFirstTVShow()
	{
		log.info("Navigated to TV show detail page.");
	}
	//click on first game to go to TV show detail page
	
	
	public void testCommentingModule()
	{
		log.info("Verified commenting module textbox functionality.");
	}
	
	public void testShareModule()
	{
		log.info("Verified Share module functionality.");
	}
	
	public void testFacebookLikeWidget()
	{
		log.info("Verified Facebook Like widget.");
	}
	
	
	
	
	
	
	
	public AllTVShowsSubmenuPage clickAllTVShowsSubmenuTab()
	{
		shared.click(allTVShowsSubmenuTab);
		
		return new AllTVShowsSubmenuPage(driver);
	}

}
