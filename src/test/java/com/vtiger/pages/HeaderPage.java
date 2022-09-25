package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.commonMethods;

public class HeaderPage {
	
	public WebDriver driver;
	public commonMethods cm;
	private ExtentTest logger;
	
	public HeaderPage(WebDriver driver,ExtentTest logger)
	{
		this.driver = driver;
		this.logger = logger;
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver,logger);
	}
	
	@FindBy(linkText="Logout")
	WebElement lnkLogout;
	
	@FindBy(linkText="New Lead")
	WebElement lnkNewLead;
	
	@FindBy(linkText="Leads")
	WebElement lnkLeads;
	
	@FindBy(linkText="New Account")
	WebElement lnkNewAccount;
	
	public void clickNewAccount()
	{
		cm.ClickELement(lnkNewAccount,"New Account link has been clicked");
	}
	
	public void clickLogout()
	{
		cm.ClickELement(lnkLogout,"Logout link has been clicked");
	}
	
	public void clickLeads()
	{
		cm.ClickELement(lnkLeads,"Leads link has been clicked");
	}
	public void clickNewLead()
	{
		cm.ClickELement(lnkNewLead,"New Lead link has been clicked");
	}

}
