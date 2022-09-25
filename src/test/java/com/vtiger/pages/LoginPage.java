package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.common.commonMethods;

public class LoginPage {
	
	private WebDriver driver;
	public commonMethods cm;
	private ExtentTest logger;
	
	public LoginPage(WebDriver driver,ExtentTest logger)
	{
		this.driver = driver;
		this.logger=logger;
		PageFactory.initElements(driver, this);
		cm = new commonMethods(driver,logger);
	}
	
	@FindBy(name="user_name")
	WebElement tbuserid;
	
	@FindBy(name="user_password")
	WebElement tbpwd;
	
	@FindBy(name="login_theme")
	WebElement slcTheme;
	
	@FindBy(name="Login")
	WebElement btnLogin;
	
	public void login(String userid, String pwd)
	{
		setUserid(userid);
		setPassword(pwd);
		clickLogin();
	}
	
	public String verifyUsernameEditable(String val)
	{
		cm.EnterValue(tbuserid, val,"Text "+val+" has been entered into username field");
		return tbuserid.getAttribute("value");
	}
	
	public void setUserid(String val)
	{
		cm.EnterValue(tbuserid, val,"Text "+val+" has been entered into username field");
		
	}
	
	public void setPassword(String val)
	{
		cm.EnterValue(tbpwd, val,"Text "+val+" has been entered into password field");
	}
	
	public void clickLogin()
	{
		cm.ClickELement(btnLogin,"Login button has been clicked");
	}
	
	public void SelectDropdownValue(String val)
	{
		cm.SelectVisibleText(slcTheme, val,"Text "+val+" has been selected from Theme dropdown");
	}

}
