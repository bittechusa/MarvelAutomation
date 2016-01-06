package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class InterviewsSubmenuPage 
{
	
WebDriver driver;
	
	Shared shared = new Shared(driver);
	

	
	
	
	@FindBy(xpath=".//*[@id='videos-list-multi-row']/div[1]/div[2]/div[1]/div[1]/a/div")
	public WebElement firstInterview;
	
	public InterviewsSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WatchInterviewPage clickFirstinterview()
	{
		shared.click(firstInterview);
		
		return new WatchInterviewPage(driver);
	}
	

}
