package com.marvel.ui.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.shared.Shared;

public class ImageGallery 
{
WebDriver driver;
	
	Shared shared = new Shared(driver);
	
	
	public ImageGallery(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	
	
	
	

}
