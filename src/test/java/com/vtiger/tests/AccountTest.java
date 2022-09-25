package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.AccountPage;
import com.vtiger.pages.LoginPage;

public class AccountTest extends BaseTest {
	
	
	
	@Test
	public void TC04_createNewAccount()
	{		
		String TCName = "TC04_createNewAccount";
		logger = extent.createTest(TCName);
		lp = new LoginPage(driver,logger);
		lp.login(data.get(TCName).get("Userid"),data.get(TCName).get("Password"));	
		ac = new AccountPage(driver,logger);
		ac.clickNewAccount();
		ac.createAccount(data.get(TCName).get("AccountName"));
		ac.clickLogout();
	}
	
	

}
