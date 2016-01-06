package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class FirstNewsArticle 
{
	
WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[9]/a")
	public WebElement moreButtonMouseoverMenuOnTopNav;
	
	
	@FindBy(xpath=".//*[@id='marvel_topnav_ul']/li[9]/div/div[1]/ul/li[2]/a")
	public WebElement imagesTabOnMoreMouseOverMenu;
	
	public FirstNewsArticle(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public ImagesPage clickImagesTabOnMouseoverMenu()
	{
		shared.mouseOver(moreButtonMouseoverMenuOnTopNav);
		shared.click(imagesTabOnMoreMouseOverMenu);
		
		return new ImagesPage(driver);
	}
	
	
	
	
	

}
