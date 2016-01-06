package com.marvel.ui.automation.shared;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shared 
{
	public WebDriver driver ;
	Logger log=Logger.getLogger(Shared.class.getName());
	
	public Shared(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	//WebDriverWait wb = new WebDriverWait(driver, 10);
	
	
	public void mouseOver(WebElement ele)
	{
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	
	public void click(WebElement element)
	{
		try
		{
			element.click();
		}catch(Exception e)
		{
			log.info("not clicked");
		}
	}
	
	public void getTitle(String title)
    {
        if(driver.getTitle().contains(title))
        {
        log.info("Title is correct.");
        }
        else
        	log.info("ERROR: Page title was not matched.");
    }
	
	public void isDisplayed(WebElement element){
        try {
        	//boolean ele=element.isDisplayed();
             if(element.isDisplayed())
             {
            	 log.info("element is displayed");
             }
             
           // String text = element.getText();

           // log.info(text);
           
           // log.info(" Displayed ->"+b)
        }
        catch(Exception t)
        {
        	log.info("element is not displyed");
            
        }

    }

	
	public void clearAndFillText(WebElement element, String text)
	{
		element.clear();
		element.sendKeys(text);
		
	}
	
	public void type(WebElement element,String text)
	{
		try{
			element.sendKeys(text);
		}catch(NoSuchElementException e)
		{
			//log.info("element not found");
		}
		}
	
	
	
	
	public int numberOfElement(List<WebElement> elements)
    {
        int size =elements.size();
        return size;
    }


    public void clear(WebElement element)
    {
        element.clear();
    }


    public void fillText(WebElement element, String text)
    {
        element.sendKeys(text);
    }

    

    public String getText(WebElement element)
    {
        try {
            return element.getText();
        }catch (Throwable t){
            t.printStackTrace();
            return null;
        }
    }
        public void verifyText(String text)
        {
        	try
        	{
        		driver.getPageSource().contains(text);
        	}catch(Exception e)
        	{
        		//log.info("text not present");
        	}
        }
        public String getAttribute(WebElement element,String name)
        {
        	try{
        		return element.getAttribute(name);
        	}catch(Exception e)
        	{
        		//log.info("no attribute found");
        		return null;
        		
        	}
        	
        }
        
        public Boolean waitUntilElementDisplayed(WebElement element)
        {
            try {
                (new WebDriverWait(driver, getMaxTimeout()))
                        .until(ExpectedConditions.visibilityOf(element));
                return true;
            }
            catch(Exception e)
            {
                return false;
            }
        }

		private long getMaxTimeout() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
		
		
		
		
		
		

}
    
    



    

