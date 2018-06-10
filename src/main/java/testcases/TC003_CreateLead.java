package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_Create_Lead";
		testDescription="Creating Leads";
		testNodes="Leads";
		category="Smoke";
		authors="Vignesh";
		browserName="chrome";
		dataSheetName="TC003";
	}


	@Test(dataProvider="fetchData")
	public void createLead(String username, String pwd, String company,String firstName, String lastname, String source, String email, String PhoneNumber) {

		new LoginPage()
		.enterUserName(username)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(company)
		.enterFirstName(firstName)
		.enterLastName(lastname)
		.selectDropDown(source)
		.enterEmail(email)
		.enterPhoneNumber(PhoneNumber)
		.clickCreateLeadButton()
		.verifyCreatedLead(firstName);	
	}
}
