package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_Edit_Lead";
		testDescription="Edit Company Name for L[eads";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String username, String pwd, String company,String firstName) {

		new LoginPage()
		.enterUserName(username)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstname(firstName)
		.clickFindLeadsButton()
		.clickFirstResultInSearch()
		.clickEditLeadButton()
		.updateCompanyname(company)
		.clickUpdateLeadButton()
		.verifyEditedCompanyName(company);
	}
}
