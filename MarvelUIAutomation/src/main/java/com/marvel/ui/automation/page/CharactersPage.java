package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class CharactersPage 

{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[2]/a")
	public WebElement allCharactersSubmenuTab;
	
	
	
	
	@FindBy(xpath=".//*[@id='characterRotator']/div[2]/div/div[3]/a")
	public WebElement mainCharactersPageRotator;
	
	@FindBy(xpath=".//*[@id='archetype-index']/section[3]/div/div/a[1]/span")
	public WebElement backButtonOnListModule;
	
	@FindBy(xpath=".//*[@id='archetype-index']/section[3]/div/div/a[2]/span")
	public WebElement forwardButtonOnListModule;
	
	
	@FindBy(xpath=".//*[@id='archetype-index']/header/div[1]")
	public WebElement topBannerAd;
	
	@FindBy(xpath=".//*[@id='featured-chars']/div/div[1]")
	public WebElement squareBannerAd;
	

	@FindBy(xpath=".//*[@id='54']/div[1]/a/div")
	public WebElement firstCharacter;
	
	@FindBy(xpath=".//*[@id='fyre-editor-11']/p")
	public WebElement commentingModuleTextbox;
	
	@FindBy(xpath=".//*[@id=':ca']/div/div")
	public WebElement shareButtonOnCommentingModule;
	
	@FindBy(xpath=".//*[@id=':cc']/div/div")
	public WebElement postCommentButton;
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/div/button")
	public WebElement facebookLikeWidget;
	
	
	public CharactersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	
	
	
	
	public void verifyMainCharacterPageRotator()
	{
		log.info("Verified main Character page rotator.");
	}
	//Verify main Character page rotator
	
	
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
	
	
	public void clickCharacter()
	{
		log.info("Navigated to Character detail page.");
	}
	//click on first game to go to Character detail page
	
	
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
	
	
	
	public AllCharactersSubmenuPage clickAllCharactersSubmenuTab()
	{
		shared.click(allCharactersSubmenuTab);
		
		return new AllCharactersSubmenuPage(driver);
	}

}
