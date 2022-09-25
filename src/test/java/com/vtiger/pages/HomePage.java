package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;


public class HomePage extends HeaderPage {
	
	public HomePage(WebDriver driver,ExtentTest logger)
	{
		super(driver,logger);				
	}
	
	@FindBy(xpath="//*[text()='My Pipeline']")
	WebElement lblPipeline;
	
	public void verifyPipeline()
	{
		cm.CheckDisplay(lblPipeline,"Pipeline graph was displyed");
	}

}
