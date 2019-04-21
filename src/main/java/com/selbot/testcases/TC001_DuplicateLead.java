package com.selbot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selbot.pages.LoginPage;
import com.selbot.testng.api.base.Annotations;

public class TC001_DuplicateLead extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_CreateLead";
		testcaseDec = "Login, Create Lead and Verify";
		author = "Sarath";
		category = "smoke";
		excelFileName = "TC001_DuplicateLead";
	} 

	@Test(dataProvider="fetchData") 
	public void createLead(String uName, String pwd, String LeadID, String CompanyName) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassWord(pwd) 
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLead()
		.enterLeadID(LeadID)
		.clickFindLead()
		.clickLeadID()
		.clickDuplicateLead()
		.enterCompanyName(CompanyName)
		.clickCreateLead()
		.verifyCompanyName(CompanyName);
		
	}
	
}

