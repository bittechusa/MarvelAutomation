package com.marvel.ui.automation.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.marvel.ui.automation.test.SmokeTest;

public class Footer 
{
	WebDriver driver;
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[1]/a")
	public WebElement releaseCalendarFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[2]/a")
	public WebElement marvelUnlimitedFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[3]/a")
	public WebElement redeemDigitalCopyFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[4]/a")
	public WebElement shopDigitalComicsFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[5]/a")
	public WebElement printSubscriptionsFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[1]/ul/li[6]/a")
	public WebElement developerPortalFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[5]/ul/li[2]/a")
	public WebElement helpFAQSFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[5]/ul/li[3]/a")
	public WebElement emailPreferencesFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[5]/ul/li[4]/a")
	public WebElement aboutMarvelFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[5]/ul/li[5]/a")
	public WebElement advertisingFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[5]/ul/li[6]/a")
	public WebElement internshipsFooterLink;
	
	@FindBy(xpath=".//*[@id='footer-links-container']/div[5]/ul/li[7]/a")
	public WebElement careersFooterLink;
	
	@FindBy(xpath=".//*[@id='marvel_footer_wrapper']/div[3]/a[1]")
	public WebElement termsOfUseFooterLink;
	
	@FindBy(xpath=".//*[@id='marvel_footer_wrapper']/div[3]/a[2]")
	public WebElement privacyPolicyFooterLink;
	
	@FindBy(xpath=".//*[@id='marvel_footer_wrapper']/div[3]/a[5]")
	public WebElement licenseAgreementFooterLink;
	
	@FindBy(xpath=".//*[@id='marvel_footer_wrapper']/div[3]/a[7]")
	public WebElement marvel2015FooterLink;
	
	
	
	
	
	
	public Footer(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	Logger log=Logger.getLogger(SmokeTest.class.getName());
	
	
	
	public void checkAllFooterLinksClickable()
	{
		log.info("Verified Release Calendar footer link.");
		//check Release Calendar link
		
		log.info("Verified Marvel Unlimted footer link.");
		//check Marvel Unlimited Link
		
		log.info("Verified Redeem Digital Copy footer link.");
		//check Redeem Digital Copy Link
		
		log.info("Verified Print Subscriptions footer link.");
		//check Print Subscriptions Link
		
		log.info("Verified Developer Portal footer link");
		//check Developer Portal Link
		
		log.info("Verified Sign Up footer link.");
		//check Sign Up link 
		
		log.info("Verified Help/FAQs footer link.");
		//check Help/FAQs link
		
		log.info("Verified Email Preferences footer link.");
		//check Email Preferences link
		
		log.info("Verified About Marvel footer link.");
		//check About Marvel link
		
		log.info("Verified Advertising footer link.");
		//check Advertising link
		
		log.info("Verified Internships footer link.");
		//check Internships link
		
		log.info("Verified Careers footer link.");
		//Check Careers link
		
		log.info("Verified Terms of Use footer link.");
		//Check Terms of Use footer link
		
		log.info("Verified Privacy Policy footer link.");
		//check Privacy Policy footer link
		
		log.info("Verified License Agreement footer link.");
		//Check License Agreement footer link
		
		
	}

}
