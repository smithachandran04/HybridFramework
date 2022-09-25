package com.vtiger.tests;


import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;


public class LoginTest extends BaseTest {
	
	
	@Test
	public void TC02_validLogin()
	{	
		String TCName = "TC02_validLogin";
		logger = extent.createTest(TCName);
		lp = new LoginPage(driver,logger);
		lp.login(data.get(TCName).get("Userid"),data.get(TCName).get("Password"));	
		hp=new HomePage(driver,logger);
		hp.verifyPipeline();
		hp.clickLogout();
		
	}
	
	@Test
	public void TC01_InvalidLogin()
	{		
		String TCName = "TC01_InvalidLogin";
		logger = extent.createTest(TCName);
		lp = new LoginPage(driver,logger);
		lp.login(data.get(TCName).get("Userid"),data.get(TCName).get("Password"));	
		
		
	}

}
