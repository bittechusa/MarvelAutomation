package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class GamesPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);



	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/a")
	public WebElement mainGamesRotator;
	
	
	@FindBy(xpath=".//*[@id='games-index']/header/div[1]")
	public WebElement topBannerAd;
	
	@FindBy(xpath=".//*[@id='featuredgames']/div/div[1]")
	public WebElement squareBannerAd;
	

	@FindBy(xpath=".//*[@id='featuredgames']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstGame;
	
	@FindBy(xpath=".//*[@id='fyre-editor-15']/p")
	public WebElement commentingModuleTextbox;
	
	@FindBy(xpath=".//*[@id=':c4']/div/div")
	public WebElement shareButtonOnCommentingModule;
	
	@FindBy(xpath=".//*[@id=':c6']/div/div")
	public WebElement postCommentButton;
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/span")
	public WebElement facebookLikeWidget;
	
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	

	public GamesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMainGamesRotator()
	{
		log.info("Verified main Games page rotator.");
	}
	//Verify main videos page rotator
	
	public void verifyAdUnits()
	{
		log.info("Verified top ad banner.");
		
		log.info("Verifed square ad banner.");
	}
	
	
	public void clickFirstGame1()
	{
		log.info("Navigated to Game detail page.");
	}
	//click on first game to go to game detail page
	
	
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
	
	
	
	
	public GameDetailPage clickFirstGame()
	{
		shared.click(firstGame);
		
		return new GameDetailPage(driver);
	}
	
	
}
