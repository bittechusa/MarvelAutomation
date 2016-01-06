package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class BookInfoPage 
{
	
WebDriver driver;
	
	Shared shared;
	
	
	
	
	@FindBy(xpath=".//*[@id='comics-issuedetail']/section[1]/div[4]/div/div/div[1]/div[1]/a/div")
	public WebElement bookCover;
	
	@FindBy(xpath=".//*[@id='comics-issuedetail']/section[1]/div[4]/div/div/div[2]/h1")
	public WebElement bookTitle;
	
	@FindBy(xpath="//*[@id='comics-issuedetail']/section[1]/div[5]/div/div[1]/div/div/div/div/div[1]/a/span")
	public WebElement readSampleButton;
	//click this button to open the reader from the comic details page
	
	@FindBy(xpath=".//*[@id='comics-issuedetail']/section[1]/div[1]/div/div/a/span")
	public WebElement backToSeriesPageLink;
	
	@FindBy(xpath=".//*[@id='comics-issuedetail']/section[1]/div[4]/div/div/div[1]/div[2]/a")
	public WebElement readNowLink;
	
	@FindBy(xpath=".//*[@id='fyre-editor-6']/p")
	public WebElement commentingModuleTextBox;
	//Live Fyre commenting widget text box
	
	@FindBy(xpath=".//*[@id=':73']/div/div")
	public WebElement shareButtonOnCommentingModule;
	//"Share" button on the LiveFyre commenting widget
	
	@FindBy(xpath=".//*[@id=':75']/div/div")
	public WebElement postCommentAsButton;
	//red "Post Comment As" button on the LiveFyre commenting widget
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/span")
	public WebElement facebookLikeButton;
	//icon for Facebook 'like' button
	
	@FindBy(xpath=".//*[@id='comics-issuedetail']/section[1]/div[1]/div/div/div[1]/div[1]")
	public WebElement shareButton;
	
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/a")
	public WebElement discoverSubmenuTab;
	
	
	
	public BookInfoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void verifyBookCoverExists()
	{
		shared = new Shared(driver);
		shared.waitUntilElementDisplayed(bookCover);
	}
	
	public void verifyBookTitleExists()
	{
		shared = new Shared(driver);
		shared.waitUntilElementDisplayed(bookTitle);
	}
	
	public void isReadNowButtonPresent()
	{
		shared = new Shared(driver);
		//return shared.isDisplayed(readNowButton);
	}
	
	

	
	
	
	public DiscoverSubmenuPage clickDiscoverSubmenu(FirefoxDriver x)
	{
		shared = new Shared(driver);
		shared.click(discoverSubmenuTab);
		return new DiscoverSubmenuPage(driver);
		
	}
	
	

}
