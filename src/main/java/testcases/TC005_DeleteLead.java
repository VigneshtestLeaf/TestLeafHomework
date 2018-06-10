package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Delete_Lead";
		testDescription="Delete Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String username, String password, String leadId, String leadName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstname(leadName)
		.clickFindLeadsButton()
		.clickFirstResultInSearch()
		.clickDeleteLeadbutton()
		.clickFindLeads()
		.enterLeadID(leadId)
		.clickFindLeadsButton()
		.isNoRecordsDisplayed();
	}

}
