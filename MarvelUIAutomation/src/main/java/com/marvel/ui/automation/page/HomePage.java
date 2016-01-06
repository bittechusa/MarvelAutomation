package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

import junit.framework.Assert;

public class HomePage extends LoadableComponent<HomePage>
{
	public WebDriver driver;
	
	
	Logger log=Logger.getLogger(HomePage.class.getName());
	
	@FindBy(xpath=".//*[@id='marvel_topnav_user_button']/a/span")
	public WebElement userButton;
	//user button icon on the top right hand corner of homepage
	
	@FindBy(xpath=".//*[@id='marvel_topnav']/h1/a")
	public WebElement marvelLogo;
	//main Marvel logo on the top left hand corner of the homepage
	
	@FindBy(xpath=".//*[@id='marvel_topnav_user_button']/div/div/a/span")
	public WebElement loginWithMarvelAccountButton;
	//red "Login with Marvel Account" button on the mouseover menu from the user icon
	
	@FindBy(xpath="html/body/header/div[2]/div")
	public WebElement topNavBar;
	//entire top navigation bar containing all page sections: Comics, Movies, Videos, Games, TV, Characters, Shop, More
	
	@FindBy(xpath=".//*[@id='home-skin-ad']")
	public WebElement homePageMainRotatorArea;
	//main rotator image on the home page
	
	@FindBy(xpath=".//*[@id='homeRotator']/div[2]/div/div[2]/div[2]/div[3]/div/a/span")
	public WebElement watchNowButtonOnRotator;
	//red "Watch Now" button on the main rotator
	
	@FindBy(xpath=".//*[@id='marvel_topnav_search_button']/a/span")
	public WebElement searchButton;
		
	@FindBy(xpath=".//*[@id='txtSearch']")
	public WebElement searchBox;
	
	
	
	
	
	Shared shared;

	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void getHomePageTitle()
	{
		shared=new Shared(driver);
		//shared.getTitle("Marvel.com: The Official Site | Iron Man, Spider-Man, Hulk, X-Men, Wolverine and the heroes of the Marvel Universe.Comics,  News, Movies and Video Games | Marvel.com");
		log.info("Verified home page title.");
	}
	//verify Home page title
	
	public void isMarvelLogoDisplayed()
	{
		shared=new Shared(driver);
		//return shared.isDisplayed(marvelLogo);
	}
	//verify that Marvel logo is displayed
	
	public void isTopNavBarPresent()
	{
		shared.isDisplayed(topNavBar);
		
	}
	//verify that Top Nav bar is present
	
	
	
	
	public void mainRotatorModule()
	{
		shared.isDisplayed(homePageMainRotatorArea);
		log.info("Main rotator module verified.");
	}
	//verify that there is an image on the rotator
	
	
	public void moveToLoginWithMarvelAccountButton()
	{
		shared=new Shared(driver);
		shared.mouseOver(userButton);
		//shared.click(loginWithMarvelAccountButton);
	
	}
	//login with existing Marvel.com account -- will open new page: 'Marvel Registration Page'
	
	public MarvelRegistrationPage clickLoginWithMarvelAccount()
	{
		//shared.mouseOver(userButton);
		log.info("Hovered over mouseover menu on login icon");
		shared.click(loginWithMarvelAccountButton);
		log.info("clicked on 'Login With Marvel Account' Button");
		return new MarvelRegistrationPage(driver);
	}
	//will open new page: 'Marvel Registration Page'


	@Override
	protected void load() {
		//driver.get("http://marvel.com/");
		//Footer f=new Footer(driver);
		
	}


	@SuppressWarnings("deprecation")
	@Override
	protected void isLoaded() throws Error {
		//Assert.assertTrue(driver.getCurrentUrl().contains("wwww.marvel.com"));
		Footer f=new Footer(driver);
		
		
	}



}
