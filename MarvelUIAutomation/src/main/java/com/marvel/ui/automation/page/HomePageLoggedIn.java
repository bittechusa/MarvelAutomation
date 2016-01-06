package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import com.marvel.ui.automation.shared.Shared;

import junit.framework.Assert;

public class HomePageLoggedIn extends LoadableComponent<HomePageLoggedIn>
{
	WebDriver driver;

    Logger log=Logger.getLogger(HomePage.class.getName());
    
	Shared shared;


	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_user_button']/a/span")
	public WebElement topNavUserButton;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_user_button']/div/div/div/ul/li[3]/a")
	public WebElement accountSettingsButton;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul_wrapper']")
	public WebElement topNavBar;
	
	@FindBy(xpath=".//*[@id='txtSearch']")
	public WebElement searchBox;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_search']/form/div[2]/button")
	public WebElement redSearchButton;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_search_button']/a/span")
	public WebElement searchIcon;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_search']/form/div[2]/button")
	public WebElement searchButton;
	
	@FindBy(xpath=".//*[@id='marvel_topnav']/h1/a")
	public WebElement marvelLogoToGoBackToHomePageLoggedIn;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[2]/a")
	public WebElement comicsButtonOnTopNav;
	
	@FindBy(xpath="html/body/div[6]/div[1]")
	public WebElement footerAdBanner;
	
	@FindBy(xpath="html/body/header/div[1]")
	public WebElement headerAdBanner;
	
	
	
	
	
	
	
	
	public HomePageLoggedIn(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		log.info("footer initialized");
	}
	
	
	
	
	
	public void goToMyAccount()
	{
		shared=new Shared(driver);
		shared.mouseOver(topNavUserButton);
		
	}
	
	public void clickAccountSettings()
	{
		shared=new Shared(driver);
		shared.click(accountSettingsButton);
	}
	
	
	public void verifyTopNavBarPresent()
	{
		shared=new Shared(driver);
		//return shared.isDisplayed(topNavBar);
	}
	
	
	public void searchThroughSearchBox()
	{
		shared= new Shared(driver);
		shared.mouseOver(searchIcon);
		shared.click(searchIcon);
		log.info("Clicked on Search Icon.");
		shared.clearAndFillText(searchBox, "spiderman");
		log.info("Entered search term 'Spiderman.'");
		shared.click(searchButton);
		log.info("Clicked search button.");
		shared.click(marvelLogoToGoBackToHomePageLoggedIn);
		
	}
	//click into search icon and search for the specified text then navigate back to homepage
	
	public void verifyAdBanners()
	{
		shared= new Shared(driver);
		shared.isDisplayed(headerAdBanner);
		shared.isDisplayed(footerAdBanner);
	}
	
	
	public void verifyGeneralFooterArea()
	{
		
	}
	
	
	public ComicsPage clickComicsOnTopNav()
	{
		shared.click(comicsButtonOnTopNav);
		
		return new ComicsPage(driver);
		
	}

	@Override
	protected void load() {
		
		driver.get("http://marvel.com/");
		Footer f=new Footer(driver);
		log.info("load executed");
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void isLoaded() throws Error {
		Assert.assertTrue(driver.getCurrentUrl().equals("http://marvel.com/"));
		Assert.assertTrue(topNavUserButton.isDisplayed());
		Footer f=new Footer(driver);
		log.info("isloaded method executed");
		
		
	}
	
	
	
	
	
		
}
