package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Dulicate_Lead";
		testDescription="Duplicate Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC006";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLeads(String username, String password, String email, String firstName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmailTab()
		.enterEmailAddress(email)
		.clickFindLeadsButton()
		.clickFirstResultInSearch()
		.clickDuplicateLead()
		.clickCreateLead()
		.verifyCreatedLead(firstName);		
	}

}
