package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class TopMarvelHeroesSubmenuPage 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);

	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[9]/a")
	public WebElement moreMouseoverMenuOnTopNav;
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[9]/div/div[1]/ul/li[1]/a")
	public WebElement newsPageMoreMouseoverMenuTab;
	
	
	public TopMarvelHeroesSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public NewsPage clickOnNewsPageFromMoreMouseoverMenuTab()
	{
		shared.mouseOver(moreMouseoverMenuOnTopNav);
		shared.click(newsPageMoreMouseoverMenuTab);
		
		return new NewsPage(driver);
	}
	
	
	
	
	

}
