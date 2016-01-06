package com.marvel.ui.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class DiscoverSubmenuPage 
{
WebDriver driver;
	
	Shared shared;
	
	
	
	
	
	
	@FindBy(xpath=".//*[@id='comics-selldigitalcomicsunlimited']/div[2]/div[1]/div[1]/div/a/span")
	public WebElement startNowButton;
	
	@FindBy(xpath=".//*[@id='comics-selldigitalcomicsunlimited']/div[2]/div[3]/div/div[3]/div[3]/a/span")
	public WebElement getTheAndroidAppButton; 
	
	@FindBy(xpath=".//*[@id='marvel_subnav_ul']/li[4]/a")
	public WebElement onSaleSubmenuTab;
	
	
	
	public DiscoverSubmenuPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void isMainRotatorImagePresent(By element)
	{
		shared = new Shared(driver);
		//shared.isDisplayed(mainRotator);
	}
	
	

	
	public OnSaleSubmenuPage clickOnSaleSubmenuTab()
	{
		shared = new Shared(driver);
		shared.click(onSaleSubmenuTab);
		
		return new OnSaleSubmenuPage(driver);
		
	}
	
	






}
