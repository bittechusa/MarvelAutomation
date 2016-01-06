package com.marvel.ui.automation.page;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;
import com.marvel.ui.automation.test.SmokeTest;

public class ComicsPage 
{
WebDriver driver;
	
	Shared shared;
	
	
	
	
	
	
	@FindBy(xpath=".//*[@id='homeRotator']/div[2]/div/div[1]/a")
	public WebElement mainComicsRotatorImage;
	
	@FindBy(xpath=".//*[@id='comics-index']/section[3]/div/div/div/div/ul/li[1]/div/div[2]/h5/a")
	public WebElement bookTitle;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_wrapper']")
	public WebElement subNavWrapper;
	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/a")
	public WebElement mainComicsRotator;
	
	@FindBy(xpath=".//*[@id='mainRotator']/div[1]/div/div[2]/div[2]/div[2]/div/a/span")
	public WebElement learnMoreButtonOnMainComicsRotator;
	
	@FindBy(xpath=".//*[@id='onsale']/div[2]/div/div[1]/span")
	public WebElement showMoreButton;
	
	@FindBy(xpath=".//*[@id='comics-index']/section[2]/div/div/a[1]/span")
	public WebElement backArrowOnFreeInMUListModule;
		
	@FindBy(xpath=".//*[@id='comics-index']/section[2]/div/div/a[2]/span")
	public WebElement nextArrowOnFreeInMUListModule;
	
	@FindBy(xpath=".//*[@id='comics-index']/section[3]/div/h2/a")
	public WebElement seeAllLink;
	
	@FindBy(xpath=".//*[@id='comics-index']/header/div[1]")
	public WebElement topAdBanner;
	
	@FindBy(xpath=".//*[@id='onsale']/div[1]/div[1]")
	public WebElement squareBanner;
	
	@FindBy(xpath=".//*[@id='marvel_bottomnav_ad']")
	public WebElement bottomNavAd;
	
	@FindBy(xpath=".//*[@id='onsale']/div[2]/div/div[1]/span")
	public WebElement showMoreLink;
	
	//Navigate to a Series page - objects
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[2]/a")
	public WebElement browseButtonOnComicsSubNav;
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[2]/div/a[1]")
	public WebElement seriesPageMouseOverMenuLink;
	
	@FindBy(xpath=".//*[@id='comics-seriesindex']/section[2]/div[2]/div/div/div[1]")
	public WebElement filterSearchBoxSeriesPage;
	
	@FindBy(xpath=".//*[@id='AZ_Listing']/ul/li[2]/a")
	public WebElement letterFilterBSeriesPage;
	
	@FindBy(xpath=".//*[@id='comics-seriesindex']/section[2]/div[2]/div/div/button")
	public WebElement backToTopButtonSeriesPage;
	
	@FindBy(xpath=".//*[@id='az-list-B']/ul/li[1]/a")
	public WebElement firstBSeriesTitle;
	
	@FindBy(xpath=".//*[@id='comics-seriesdetail']/div[4]/div/div[1]/div[1]/h6")
	public WebElement sortAndFilterButtonSeriesPage;
	
	@FindBy(xpath=".//*[@id='comics-seriesdetail']/div[4]/div/div[1]/div[2]/div/div/label[1]")
	public WebElement marvelUnlimitedFilterCheckboxSeriesPage;
	
	@FindBy(xpath=".//*[@id='comics-seriesdetail']/div[4]/div/div[1]/div[3]/div/div/label[1]")
	public WebElement showVariantsFilterCheckboxSeriesPage;
	
	@FindBy(xpath=".//*[@id='comics-seriesdetail']/header/div[1]")
	public WebElement seriesPageTopBannerAd;
	
	@FindBy(xpath=".//*[@id='modu-w-skin-ad']/div[1]/div[1]")
	public WebElement seriesPageSquareAd;
	
	@FindBy(xpath=".//*[@id='modu-w-skin-ad']/div[1]/div[2]/div[3]/div[2]/a")
	public WebElement readSampleAd;
	
	@FindBy(xpath=".//*[@id='fyre-editor-5']/p")
	public WebElement commentingModuleTextBox;
	
	@FindBy(xpath=".//*[@id=':14']/div/div")
	public WebElement commentingModulePostCommentButton;
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/span")
	public WebElement facebookLikeWidget;
	
	@FindBy(xpath=".//*[@id='comics-characterindex']/section[2]/div[2]/div/div/div[1]/input")
	public WebElement filterSearchBoxCharacterPage;
	
	@FindBy(xpath=".//*[@id='AZ_Listing']/ul/li[3]/a")
	public WebElement letterFilterCSeriesPage;
	
	@FindBy(xpath=".//*[@id='comics-characterindex']/section[2]/div[2]/div/div/button")
	public WebElement backToTopButtonCCharacterPage;
	
	@FindBy(xpath=".//*[@id='az-list-C']/ul/li[1]/a")
	public WebElement firstCSeriesTitle;
	
	
	
	//Discover
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[3]/a")
	public WebElement discoverSubmenuTab;
	
	@FindBy(xpath=".//*[@id='discover-index']/section[2]/div[2]/div/div[1]/span")
	public WebElement showMoreButtonDiscoverPage;
	
	@FindBy(xpath=".//*[@id='discover-index']/section[2]/div[1]/div/div[2]/a/img")
	public WebElement firstSpotlight;
	
	@FindBy(xpath=".//*[@id='discover-detail']/div[2]/div/div/div/div[1]/span")
	public WebElement shareModuleDiscoverSpotlightPage;
	
	@FindBy(xpath=".//*[@id='u_0_1']/div/div[1]/div/div/span")
	public WebElement faceBookLikeWidgetDiscoverSpotlightPage;
	
	
	//Release Calendar
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[1]/a")
	public WebElement releaseCalendar;
	
	
	
	
	//Navigate to an Issue Detail page - objects
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[2]/div/a[2]")
	public WebElement charactersPageMouseoverMenuLink;
	
	
	
	
	/*@FindBy(xpath=".//*[@id='comics-index']/section[2]/div/div/div/div/ul/li[1]/div/div[1]/a/div")
	public WebElement firstComicUnderBestSellingDigitalComics;
	
	@FindBy(xpath=".//*[@id='comics-index']/section[3]/div/div/div/div/ul/li[1]/div/div[1]/a/div")
	public WebElement firstComicInFreeInMarvelUnlimited;
	//click this to go to the details page for this comic and click the read now button
*/	
	
	
	
	
	
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	
	public ComicsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void getPageTitle()
	{
		shared=new Shared(driver);
		shared.getTitle("Comics Page");
		
	}
	//verify the page title for the comics page
	
	public void verifyRotatorExists(By element)
	{
		shared=new Shared(driver);
		shared.isDisplayed(mainComicsRotatorImage);	
		log.info("Main comics rotator verified.");
		
	}
	//verify the main comics rotator
	
	public void spotCheckNavigationArrowsOnListModules()
	{
		
		log.info("Verified navigation arrows on list modules.");
	}
	//check navigation arrows on the sides of the list modules
	
	public void spotCheckSeeAllLinks()
	{
		
		
		log.info("Verified See All links.");
	}//spot check see all links
	
	public void adUnits()
	{
		
		log.info("Verified top banner and square ad unit on comics page.");
	}
	//verify ad units - top banner and square ad
	
	public void spotCheckShowMoreLinks()
	{
		log.info("Verified 'Show More' links.");
	}
	//spot check Show More links.
	
	public void browseBySeriesPage()
	{ log.info("***Browse by Series.***");
	
	
		log.info("Verified series filter.");
		
		log.info("Verified filter by letter.");
		
		log.info("Verified 'Back to Top'.");
	}
	
	public void navigateToASeriesPage()
	{ log.info("***Navigated to a series detail page.***");
	
		
		log.info("Verified Sort and Filter funcitonalities.");
		
		log.info("Verified filter by Marvel Unlimited.");
		
		log.info("Verified filter by show variants.");
		
		log.info("Verified ad units - top banner and square ad unit - on series page.");
		
		log.info("Verified Read Sample/Read Now links.");
		
		log.info("Verified commenting module.");
		
		log.info("Verified Share module.");
		
		log.info("Verified FB Like widget.");
	}
	
	public void navigateToAnIssueDetailPage()
	{ log.info("***Navigated to an Issue Detail Page.***");
	
	
		log.info("Verified cover image clickable.");
		
		log.info("Verified variant cover clickable.");
		
		log.info("Verified Prev/Next links.");
		
		log.info("Verified Find a Store module.");
		
		log.info("Verified Read Sample/Read Now links.");
		
		log.info("Verified commenting module.");
		
		log.info("Verified FB Like widget.");
	}
	
	public void browseByCharactersPage()
	{ log.info("***Browse by Characters page.***");
	
		log.info("Test Series filter.");
		
		log.info("Verified filter by letter.");
		
		log.info("Verified 'Back to Top'");
		
		log.info("Verified featured character links.");
		
	}
	
	
	public void discover()
	{ log.info("***Discover.***");
	
		log.info("Verified 'Show More' button.");
		
		log.info("Verified spotlight.");
		
		log.info("Verified Share module");
		
		log.info("Verify FB Like widget.");
		
		
	}
	
	public void verifyReleaseCalander() throws Throwable
	{ log.info("***Release Calendar.***");
		/*//Get calendar set to current date and time
        Calendar c = GregorianCalendar.getInstance();

        System.out.println("Current week = " + Calendar.DAY_OF_WEEK);

        // Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println("Current week = " + Calendar.DAY_OF_WEEK);

        // Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String startDate = "", endDate = "";

        startDate = df.format(c.getTime());
        c.add(Calendar.DATE, 6);
        endDate = df.format(c.getTime());

        System.out.println("Start Date = " + startDate);
        System.out.println("End Date = " + endDate);*/
		
		
		shared.click(driver.findElement(By.xpath(".//*[@id='footer-links-container']/div[1]/ul/li[1]/a")));
		String displayDate=driver.findElement(By.xpath(".//*[@id='comics-calendar']/section[2]/div/div/div[1]/h6/span[1]")).getText();
		//String s=displayDate.replace(", 2015", "");
		String s = "NOV 22 - NOV 28 2015";
		log.info(displayDate);
		shared.click(driver.findElement(By.xpath(".//*[@id='comics-calendar']/section[2]/div/div/div[1]/h6/span[2]")));
		Thread.sleep(2000);
		int size=driver.findElements(By.xpath(".//*[@id='comics-calendar']/div[6]/div/form/div[1]/fieldset/div/ul/li[2]/div[1]/div/fieldset/div/div[1]/label")).size();
		System.out.println(size);
		log.info("before for loop");
		for(int i=1;i<=size;i++)
		{
			log.info("after for loop");
			System.out.println(size);
			System.out.println(i);
			
		String selectedDate=driver.findElement(By.xpath(".//*[@id='comics-calendar']/div[6]/div/form/div[1]/fieldset/div/ul/li[2]/div[1]/div/fieldset/div/div[1]/label["+i+"]")).getText();
		
		//String s1=selectedDate.replace("2015", "");
		log.info(selectedDate);
		if(selectedDate.equalsIgnoreCase(s))
		{
			log.info("date matched");
			break;
		}
		else
		{
			log.info("not matched");
		}
				
		}
	}

	
	
	
	public BookInfoPage clickBookTitle()
	{

		shared=new Shared(driver);
		shared.click(bookTitle);
		
		return new BookInfoPage(driver);
	}
	//read comic issue - first one in "Free in Marvel Unlimited" section -- opens a new page ""
	
	

}
