package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class MarvelRegistrationPage 
{
WebDriver driver;
	
	Shared shared;

	
	
	
	
	@FindBy(xpath=".//*[@id='primary_nav']/h1/a")
	public WebElement marvelLogo;
	
	@FindBy(xpath=".//*[@id='signin_wrap']/div/div[1]/div[3]/input")
	public WebElement userNameTextBox;
	
	@FindBy(xpath=".//*[@id='signin_wrap']/div/div[1]/div[4]/input")
	public WebElement passwordTextBox;
	
	@FindBy(xpath=".//*[@id='signin_wrap']/div/div[1]/div[5]/input")
	public WebElement signInButton;
	

	public MarvelRegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void verifyMarvelLogoDisplayed()
	{
		shared=new Shared(driver);
		//return shared.isDisplayed(marvelLogo);
	}
	//verify that Marvel logo is displayed 
	
	public void enterUserName()
	{
		shared=new Shared(driver);
		shared.clearAndFillText(userNameTextBox, "sharminkazi");
	}
	//enter username in text box
	
	public void enterPassword()
	{
		shared=new Shared(driver);
		shared.clearAndFillText(passwordTextBox, "Shorna00");
	}
	//enter password in text box
	
	
	
	public HomePageLoggedIn clickSignInButton()
	{
		shared=new Shared(driver);
		shared.click(signInButton);
		return new HomePageLoggedIn(driver);
	}
	//click on sign in button -- new page will open: "HomePageLoggedIn" (will redirect to the Homepage as logged in user)
	
	

}
