package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;

public class LeadPage extends HeaderPage {
	
	public LeadPage(WebDriver driver,ExtentTest logger)
	{
		super(driver,logger);				
	}
	
	@FindBy(name="lastname")
	WebElement tblastname;
	
	@FindBy(name="button")
	WebElement tbbutton;
	
	@FindBy(name="company")
	WebElement tbcompany;
	
	public void createLeadwithmandatoryFields(String lname, String comp)
	{
		setLastname(lname);
		setCompany(comp);
		ClickSave();
	}
	
	public void setLastname(String val)
	{
		cm.EnterValue(tblastname, val,"Text "+val +" has been entered into LastName field");
	}
	
	public void setCompany(String val)
	{
		cm.EnterValue(tbcompany, val,"Text "+val +" has been entered into Company field");
	}
	
	public void ClickSave()
	{
		cm.ClickELement(tbbutton,"Save button clicked");
	}


}
