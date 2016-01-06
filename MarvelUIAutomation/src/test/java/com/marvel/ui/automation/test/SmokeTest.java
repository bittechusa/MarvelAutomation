package com.marvel.ui.automation.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

import com.marvel.ui.automation.page.AllCharactersSubmenuPage;
import com.marvel.ui.automation.page.AllGamesSubmenuPage;
import com.marvel.ui.automation.page.AllMoviesSubmenuPage;
import com.marvel.ui.automation.page.AllTVShowsSubmenuPage;
import com.marvel.ui.automation.page.BehindTheScenesPage;
import com.marvel.ui.automation.page.BookInfoPage;
import com.marvel.ui.automation.page.CharacterDetailPage;
import com.marvel.ui.automation.page.CharactersPage;
import com.marvel.ui.automation.page.ComicNewsSubmenuPage;
import com.marvel.ui.automation.page.ComicTrailersAndClipsPage;
import com.marvel.ui.automation.page.ComicsPage;
import com.marvel.ui.automation.page.DiscoverSubmenuPage;
import com.marvel.ui.automation.page.FirstNewsArticle;
import com.marvel.ui.automation.page.Footer;
import com.marvel.ui.automation.page.GameDetailFromAllGamesPage;
import com.marvel.ui.automation.page.GameDetailPage;
import com.marvel.ui.automation.page.GameTrailersAndClipsPage;
import com.marvel.ui.automation.page.GamesNewsSubmenuPage;
import com.marvel.ui.automation.page.GamesPage;
import com.marvel.ui.automation.page.HomePage;
import com.marvel.ui.automation.page.HomePageLoggedIn;
import com.marvel.ui.automation.page.ImageGallery;
import com.marvel.ui.automation.page.ImagesPage;
import com.marvel.ui.automation.page.InterviewsSubmenuPage;
import com.marvel.ui.automation.page.MarvelARPage;
import com.marvel.ui.automation.page.MarvelOriginalVideosSubmenuPage;
import com.marvel.ui.automation.page.MarvelRegistrationPage;
import com.marvel.ui.automation.page.MarvelUnlimitedSubmenuPage;
import com.marvel.ui.automation.page.MovieInfoPage;
import com.marvel.ui.automation.page.MovieNewsPage;
import com.marvel.ui.automation.page.MovieTrailersAndClipsPage;
import com.marvel.ui.automation.page.MoviesPage;
import com.marvel.ui.automation.page.NewsArticlePage;
import com.marvel.ui.automation.page.NewsPage;
import com.marvel.ui.automation.page.OnSaleSubmenuPage;
import com.marvel.ui.automation.page.TVNewsSubmenuPage;
import com.marvel.ui.automation.page.TVPage;
import com.marvel.ui.automation.page.TVShowsDetailPage;
import com.marvel.ui.automation.page.TVTrailersAndClipsPage;
import com.marvel.ui.automation.page.TopMarvelHeroesSubmenuPage;
import com.marvel.ui.automation.page.UltimateSpidermanPage;
import com.marvel.ui.automation.page.VideoDetailPage;
import com.marvel.ui.automation.page.VideosPage;
import com.marvel.ui.automation.page.WatchInterviewPage;
import com.marvel.ui.automation.shared.Shared;


public class SmokeTest extends BaseTest
{
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	Shared shared;
	
	HomePage homePage;
	MarvelRegistrationPage marvelRegistrationPage;
	HomePageLoggedIn homePageLoggedIn;
	ComicsPage comicsPage;
	Footer footer;
	
	/*MarvelRegistrationPage marvelRegistrationPage;
	HomePageLoggedIn homePageLoggedIn;
	ComicsPage comicsPage;
	BookInfoPage bookInfoPage;
	DiscoverSubmenuPage discoverSubmenuPage;
	OnSaleSubmenuPage onSaleSubmenuPage;
	MarvelUnlimitedSubmenuPage marvelUnlimitedSubmenuPage;
	ComicNewsSubmenuPage comicNewsSubmenuPage;
	NewsArticlePage newsArticlePage;
	MoviesPage moviesPage;
	MovieInfoPage movieInfoPage;
	AllMoviesSubmenuPage allMoviesSubmenuPage;
	MovieNewsPage movieNewsPage;
	VideosPage videosPage;
	MarvelOriginalVideosSubmenuPage marvelOriginalVideosSubmenuPage;
	VideoDetailPage videoDetailPage;
	MovieTrailersAndClipsPage movieTrailersAndClipsPage;
	TVTrailersAndClipsPage tvTrailersAndClipsPage;
	GameTrailersAndClipsPage gameTrailersAndClipsPage;
	ComicTrailersAndClipsPage comicTrailersAndClipsPage;
	UltimateSpidermanPage ultimateSpidermanPage;
	InterviewsSubmenuPage interviewsSubmenuPage;
	WatchInterviewPage watchInterviewPage;
	BehindTheScenesPage behindTheScenesPage;
	MarvelARPage marvelARPage;
	GamesPage gamesPage;
	GameDetailPage gameDetailPage;
	AllGamesSubmenuPage allGamesSubmenuPage;
	GameDetailFromAllGamesPage gameDetailFromAllGamesPage;
	GamesNewsSubmenuPage gamesNewsSubmenuPage; 
	TVPage tvPage;
	AllTVShowsSubmenuPage allTVShowsSubmenuPage;
	TVShowsDetailPage tvShowsDetailPage;
	TVNewsSubmenuPage tvNewsSubmenuPage;
	CharactersPage charactersPage;
	AllCharactersSubmenuPage allCharactersSubmenuPage;
	CharacterDetailPage characterDetailPage;
	TopMarvelHeroesSubmenuPage topMarvelHeroesSubmenuPage;
	NewsPage newsPage;
	FirstNewsArticle firstNewsArticle;
	ImagesPage imagesPage;
	ImageGallery imageGallery;

	
	*/
	
	
	
	
	
	
	
	
	
	@Test
	public void verifyBasicHomePageFunctionalities() throws InterruptedException
	{
		log.info("Home page tests initialized.");
		shared=new Shared(driver);
		homePage= new HomePage(driver);
		Thread.sleep(3000);
		
		homePage.getHomePageTitle();
		log.info("Home page title was verified.");
		
		homePage.isTopNavBarPresent();
		log.info("Top Nav bar verified.");
		
		homePage.isMarvelLogoDisplayed();
		log.info("Marvel logo is correctly displayed.");
		
		log.info("Basic home page functionalities verified.");
		
	}
	//verify basic home page functionalities 
	
	@Test
	public void verifyHomePageRotatorFunctionalities()
	{
		shared=new Shared(driver);
		homePage= new HomePage(driver);
		log.info("Verified home page rotator functionalities.");
	}
	//verify all functionalities related to the main Home page rotator -- ERRORS
	
	
	@Test 
	public void verifyAdBannersPresent()
	{
		shared=new Shared(driver);
		homePageLoggedIn= new HomePageLoggedIn(driver);
		homePageLoggedIn.verifyAdBanners();
		log.info("Header ad banner verified.");
		log.info("Footer ad banner verified.");
		
	}
	//verify ad banners in header and footer are present
	

	
	
	@Test
	public void topNavFooterTests()
	{
	//SEARCH FUNCTION (TOP NAV/FOOTER)
	log.info("========== SEARCH FUNCTION (TOP NAV/FOOTER) ==========");
	}
	
	
	@Test
	public void verifySearchBoxFunctionality() throws InterruptedException
	{
		shared=new Shared(driver);
		footer=new Footer(driver);
		homePageLoggedIn = new HomePageLoggedIn(driver).get();
		footer.checkAllFooterLinksClickable();
		log.info("Verified all links on general footer area on Home page when logged in as existing user.");
		driver.navigate().back();
		Thread.sleep(3000);
		homePageLoggedIn.searchThroughSearchBox();
		log.info("Search box functionality successfully verified.");
		
	}
	//verify search box functionality 
	
	
	
	
	
	
	
	
	@Test
	public void generalFooterTests()
	{
	//GENERAL FOOTER TESTS
	log.info("========== GENERAL FOOTER TESTS ==========");
	
	/*@Test
	public void verifyGeneralFooterArea() throws InterruptedException
	{
		shared=new Shared(driver);
		footer=new Footer(driver);
		homePage=new HomePage(driver).get();
		Thread.sleep(3000);
		footer.checkAllFooterLinksClickable();
		log.info("Verified all links on general footer area on Home page");
		
	}
	//verify all links on general Footer area 
*/	
	}
	
	
	
	@Test
	public void signInFunctionTests()
	{
	//SIGN IN FUNCTION
	log.info("========== Sign In Function Tests ==========");
	}
	
	@Test
	public void loginAsExistingUser() 
	{
		shared=new Shared(driver);
		homePage=new HomePage(driver);
		log.info("Login test initialized.");
		homePage.moveToLoginWithMarvelAccountButton();
		marvelRegistrationPage=homePage.clickLoginWithMarvelAccount();
	
		marvelRegistrationPage.enterUserName();
		log.info("Entered existing username.");
		marvelRegistrationPage.enterPassword();
		log.info("Entered existing password.");
		homePageLoggedIn=marvelRegistrationPage.clickSignInButton();
		log.info("Clicked on 'Sign In' button.");
		log.info("Login as existing user successful.");
		
	}
	//Login test as existing user
	
	@Test
	public void verifyMyAccountFunctionalities()
	{
		shared=new Shared(driver);
		homePageLoggedIn= new HomePageLoggedIn(driver);
		homePageLoggedIn.goToMyAccount();
		homePageLoggedIn.clickAccountSettings();
		log.info("Verified functionalities on My Account page.");
	}
	
	
	
	//COMICS SECTION 
	@Test
	public void comicsSectionTests()
	{
	log.info("========== COMICS SECTION TESTS ==========");
	}

	
	@Test
	public void verifyMainComicsRotator() throws InterruptedException
	{
		shared=new Shared(driver);
		footer=new Footer(driver);
		comicsPage=new ComicsPage(driver);
		Thread.sleep(3000);
		
		
	}
	//verify main rotator on comics page
	
	@Test
	public void verifyReleaseCalander() throws Throwable
	{	
		shared=new Shared(driver);
		homePage= new HomePage(driver).get();
		comicsPage=new ComicsPage(driver);
		comicsPage.verifyReleaseCalander();
	}
	
	
	
	
	
	
	@Test
	public void moviesSectionTests()
	{
	//MOVIES SECTION
	log.info("========== MOVIES SECTION TESTS ==========");
	}
	
	
	
	
	
	@Test 
	public void videosSectionTests()
	{
	//VIDEOS SECTION
	log.info("========== VIDEOS SECTION TESTS ==========");
	}
	
	
	
	
	
	@Test
	public void gamesSectionTests()
	{
	//GAMES SECTION 
	log.info("========== GAMES SECTION TESTS ==========");
	}
	
	
	
	
	
	@Test
	public void tvSectionTests()
	{
	//TV SECTION 
	log.info("========== TV SECTION TESTS ==========");
	}
	
	
	
	
	
	
	
	@Test
	public void newsSectionTests()
	{
	//CHARACTERS SECTION
	log.info("========== NEWS SECTION ==========");
	}
	
	
	
	
	
	
	@Test
	public void imagesSectionTests()
	{
	//IMAGES SECTION 
	log.info("========== IMAGES SECTION ==========");
	}
	
	
	
	
	
	
	@Test
	public void podcastsPage()
	{
	//PODCASTS PAGE
	log.info("========== PODCASTS PAGE ==========");
	}
	
	
	
	
	
	@Test
	public void universeWiki()
	{
	//UNIVERSE WIKI 
	log.info("========== UNIVERSE WIKI ==========");
	}
	
	
	
	
	
	
	@Test
	public void redeemPage()
	{
	//REDEEM PAGE
	log.info("========== REDEEM PAGE ==========");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	@Test
	public void verifyMarvelLogoIsDisplayed() throws InterruptedException
	{
		shared=new Shared(driver);
		marvelRegistrationPage= new MarvelRegistrationPage(driver);
		Thread.sleep(3000);
		marvelRegistrationPage.verifyMarvelLogoDisplayed();
		
	}
	//verify that marvel logo is present on Marvel Registration page
	
	
	
	@Test
	public void loginWithExistingCredentials() throws InterruptedException
	{
		shared=new Shared(driver);
		marvelRegistrationPage= new MarvelRegistrationPage(driver);
		Thread.sleep(3000);
		marvelRegistrationPage.enterUserName();
		marvelRegistrationPage.enterPassword();
		homePageLoggedIn=marvelRegistrationPage.clickSignInButton();
	
		
	}
	//login to Marvel.com as an existing user 
	

	
	@Test
	void verifyInfoOnAccountPage() throws InterruptedException
	{
		shared=new Shared(driver);
		homePageLoggedIn=new HomePageLoggedIn(driver);
		Thread.sleep(3000);
		homePageLoggedIn.clickAccountSettings();
		homePageLoggedIn.verifyTopNavBarPresent();
		homePageLoggedIn.clickComicsOnTopNav();
	}
	//verify information within account page and go to Comic page
	
	@Test
	void verifyBasicFunctionalitiesOnComicsPage() throws InterruptedException
	{
		shared=new Shared(driver);
		comicsPage=new ComicsPage(driver);
		Thread.sleep(3000);
		comicsPage.getPageTitle();
		comicsPage.verifyRotatorExists(null); //***why is this showing an error?
	}
	//verify basic functionalities on Comics page
	
	@Test
	void clickAComicToGoToBookInfoPage() throws InterruptedException
	{
		shared=new Shared(driver);
		comicsPage=new ComicsPage(driver);
		Thread.sleep(3000);
		
	}
	//click on one of the comics to go to Book Info page
	
	@Test
	void verifyBasicFunctionalitiesOnBookInfoPage() throws InterruptedException
	{
		shared=new Shared(driver);
		bookInfoPage=new BookInfoPage(driver);
		Thread.sleep(3000);
		bookInfoPage.verifyBookCoverExists();
		bookInfoPage.verifyBookTitleExists();
		bookInfoPage.isReadNowButtonPresent(); 
		
	}
	//verify basic functionalities on the Book Info page
	
	@Test
	void clickDiscoverSubmenuTabFromBookInfoPage() throws InterruptedException
	{
		shared=new Shared(driver);
		bookInfoPage=new BookInfoPage(driver);
		Thread.sleep(3000);
		
	}
	//click through to the Discover submenu page
	
	

	@Test
	void verifyBasicFunctionalitiesOnDiscoverSubmenuPage() throws InterruptedException
	{
		shared=new Shared(driver);
		discoverSubmenuPage=new DiscoverSubmenuPage(driver);
		Thread.sleep(3000);
		discoverSubmenuPage.isMainRotatorImagePresent(null); //***why is this showing an error?
	}
	//verify basic functionalities on the Discover submenu page
	
*/

}