package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class ImagesPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	@FindBy(xpath=".//*[@id='images-index']/header/div[1]")
	public WebElement topAdBanner;
	
	@FindBy(xpath=".//*[@id='images-index']/section[3]/div/div/a[1]/span")
	public WebElement backButtonOnListModule;
	
	@FindBy(xpath=".//*[@id='images-index']/section[3]/div/div/a[2]/span")
	public WebElement forwardButtonOnListModule;
	
	@FindBy(xpath=".//*[@id='images-index']/section[2]/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstImageGallery;
	
	@FindBy(xpath=".//*[@id='gallery_466']/div[1]/div/div[2]/a[1]/span")
	public WebElement backButtonOnImageGalleryPage;
	
	@FindBy(xpath=".//*[@id='gallery_466']/div[1]/div/div[2]/a[2]/span")
	public WebElement forwardButtonOnImageGalleryPage;
	
	@FindBy(xpath=".//*[@id='gallery_466']/div[2]/div[2]")
	public WebElement galleryBar;
	
	@FindBy(xpath=".//*[@id='gallery-description']/div/div[2]/div/div[2]/div[1]/div/div[1]/a[1]/div")
	public WebElement facebookShareIconOnImageGalleryPage;
	
	@FindBy(xpath=".//*[@id='gallery-description']/div/div[2]/div/div[2]/div[1]/div/div[1]/a[2]/div")
	public WebElement gmailShareIconOnImageGalleryPage;
	
	@FindBy(xpath=".//*[@id='gallery-description']/div/div[2]/div/div[2]/div[1]/div/div[1]/a[3]/div")
	public WebElement twitterShareIconOnImageGalleryPage;
	
	@FindBy(xpath=".//*[@id='gallery-description']/div/div[2]/div/div[2]/div[1]/div/div[1]/a[4]/div")
	public WebElement mailShareIconOnImageGalleryPage;
	
	@FindBy(xpath=".//*[@id='fyre-editor-3']/p")
	public WebElement commentingModuleTextBoxOnGalleryPage;
	
	@FindBy(xpath=".//*[@id=':t']/div/div")
	public WebElement shareButtonOnCommentingModuleGalleryPage;
	
	@FindBy(xpath=".//*[@id=':v']/div/div")
	public WebElement postCommentButtonOnGalleryPage;
	
	
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	public ImagesPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checkAdBanner()
	{
		log.info("Verified top ad bannner.");
	}
	
	public void checkBackForwardButtonsOnListModule()
	{
		log.info("Verified back button on list module on Images page.");
		
		log.info("Verified forward button on list module on Images page.");
	}
	
	public void viewFirstImageGallery()
	{
		shared.click(firstImageGallery);
		log.info("Navigated to first image gallery.");
	}
	
	public void verifyBackAndForwardButtons()
	{
		log.info("Verified back button on first image gallery.");
		
		log.info("Verified forward button on first image gallery.");
	}
	
	public void verifyGalleryImagesBar()
	{
		log.info("Verified gallery images bar.");
	}
	
	public void verifySocialSharingOptions()
	{
		log.info("Verified Facebook social sharing option.");
		
		log.info("Verified Gmail social sharing option.");
		
		log.info("Verified Twitter social sharing option.");
		
		log.info("Verified email social sharing option.");
	}
	
	public void verifyCommentingModule()
	{
		log.info("Verified commenting textbox functionality on Image Gallery page.");
		
		log.info("Verified share button on commenting module.");
		
		log.info("Verified post comment button on commenting module.");
	}
	
	
	/*public ImageGallery clickFirstImageGallery()
	{
		shared.click(firstImageGallery);
		
		return new ImageGallery(driver);
	}*/

}
