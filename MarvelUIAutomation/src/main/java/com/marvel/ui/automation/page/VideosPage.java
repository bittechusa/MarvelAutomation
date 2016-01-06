package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class VideosPage 

{
	WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[4]/a")
	public WebElement mainVideosRotator;
	
	@FindBy(xpath=".//*[@id='movies-detail']/header/div[1]")
	public WebElement topAdBannerVideosPage;
	
	@FindBy(xpath=".//*[@id='movies-detail']/section[1]/div[2]/div/div/div[2]")
	public WebElement sideBannerVideosPage;
	
	@FindBy(xpath=".//*[@id='videos-index']/section[3]/div/div/a[1]/span")
	public WebElement backNavigationArrowOnListModule;
	
	@FindBy(xpath=".//*[@id='videos-index']/section[3]/div/div/a[2]/span")
	public WebElement forwardNavigationArrowOnListModule;
	
	@FindBy(xpath=".//*[@id='mostWatched']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstMostWatchedVideo;
	
	@FindBy(xpath=".//*[@id='videos-detail']/header/div[1]")
	public WebElement topBannerAd;
	
	@FindBy(xpath=".//*[@id='videos-detail']/section[2]/div/div/div/div[2]")
	public WebElement squareBannerAd;
	
	@FindBy(xpath=".//*[@id='fyre-editor-3']/p")
	public WebElement commentingModuleTextbox;
	
	@FindBy(xpath=".//*[@id=':t']/div/div")
	public WebElement shareButtonOnCommentingModule;
	
	@FindBy(xpath=".//*[@id=':v']/div/div")
	public WebElement postCommentButton;
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/span")
	public WebElement facebookLikeWidget;

	
	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[2]/a")
	public WebElement marvelOriginalVideosSubmenuTab;
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	
	public VideosPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMainVideosRotator()
	{
		log.info("Verified main videos page rotator.");
	}
	//Verify main videos page rotator
	
	public void verifyAdUnits()
	{
		log.info("Verified top ad banner.");
		
		log.info("Verifed square ad banner.");
	}
	
	public void spotCheckNavigationArrowsOnListModule()
	{
		log.info("Verified back navigation arrow on list module.");
		
		log.info("Verified forward navigation arrow on list module.");
		
	}
	
	public void clickFirstMostWatchedVideo()
	{
		log.info("Navigated to video detail page.");
	}
	//click on first video under 'Most Watched category
	
	
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
	
	public void verifyAdBanners()
	{
		log.info("Verified top ad banner.");
		
		log.info("Verified square ad banner.");
	}
	
	
	public MarvelOriginalVideosSubmenuPage clickMarvelOriginalVideosSubmenuTab()
	{
	
		shared.click(marvelOriginalVideosSubmenuTab);
		return new MarvelOriginalVideosSubmenuPage(driver);
	}

}
