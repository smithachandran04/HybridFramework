package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends BaseTest {
	
	
	@Test
	public void TC03_createleadwithMandatoryFileds()
	{
		String TCName = "TC03_createleadwithMandatoryFileds";
		logger = extent.createTest(TCName);
		lp = new LoginPage(driver,logger);
		lp.login(data.get(TCName).get("Userid"),data.get(TCName).get("Password"));
		ldp = new LeadPage(driver,logger);
		ldp.clickNewLead();
		ldp.createLeadwithmandatoryFields(data.get(TCName).get("LastName"),data.get(TCName).get("Company"));
		ldp.clickLogout();
	}

}
