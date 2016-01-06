package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class AllCharactersSubmenuPage 
{
	
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	
	
	
	
	@FindBy(xpath=".//*[@id='54']/div[1]/a/div")
	public WebElement firstCharacter;
	
	public AllCharactersSubmenuPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public CharacterDetailPage clickFirstCharacter()
	{
		shared.click(firstCharacter);

		return new CharacterDetailPage(driver);
	}

}
