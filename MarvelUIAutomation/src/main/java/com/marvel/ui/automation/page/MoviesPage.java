package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class MoviesPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);

	
	@FindBy(xpath=".//*[@id='marvel_cinematic_universe']/a")
	public WebElement marvelCinematicUniverseHover;
	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/a")
	public WebElement mainMoviesRotator;
	
	@FindBy(xpath=".//*[@id='movies-index']/header/div[1]")
	public WebElement topBannerAdMoviesPage;
	
	@FindBy(xpath=".//*[@id='featuredMovies']/div/div[1]")
	public WebElement squareAdMoviesPage;
	
	@FindBy(xpath=".//*[@id='movies-index']/section[2]/div/div/a[1]/span")
	public WebElement backNavigationButton;
	
	@FindBy(xpath=".//*[@id='movies-index']/section[2]/div/div/a[2]/span")
	public WebElement forwardNavigationButton;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/a")
	public WebElement allMoviesSubmenuTab;
	
	@FindBy(xpath=".//*[@id='cinematicMovies']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstMovie;
	
	
	
	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/div[2]/div[2]/div[2]/div/a/span")
	public WebElement learnMoreButtonOnRotator;
	
	@FindBy(xpath=".//*[@id='featuredMovies']/div/div[2]/div[1]/div[1]/a/div")
	public WebElement firstMovieImage;
	

	public MoviesPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	
	
	public void hoverOverMarvelCinematicUniverse()
	{
		log.info("Hovered over Marvel Cinematic Universe.");
		
	}
	
	public void mainMoviesRotator()
	{
		log.info("Verified main movies page rotator.");
	}
	
	public void verifyAdUnits()
	{
		log.info("Verified top banner ad.");
		
		log.info("Verified square ad.");
	}
	
	public void spotCheckNavigationArrowsOnListModules()
	{
		log.info("Verified back arrow on list module.");
		
		log.info("Verified forward arrow on list module.");
	}
	
	public void navigateToAllMoviesPage()
	{
		log.info("Navigated to all movies page. ");
	}
	
	
	public MovieInfoPage navigateToMovieDetailPage()
	{
		log.info("Navigate to movie detail page.");
		shared.click(firstMovieImage);
		
		return new MovieInfoPage(driver);
	}
	

	//hover over marvel cinematic universe


	
	
	
	
	


}
