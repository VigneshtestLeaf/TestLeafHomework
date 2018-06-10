package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{

	public FindLeads() {
		PageFactory.initElements(driver, this);
	}

	//To Enter First name
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeads enterFirstname(String data) {
		type(eleFirstName, data);
		return this;
	}

	//To Enter Lead ID
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadID;
	public FindLeads enterLeadID(String data) {
		type(eleLeadID, data);
		return this;
	}

	//To Click on Find Leads
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	public FindLeads clickFindLeadsButton() {
		click(eleFindLeadsButton);		
		return this;
	}

	//To Click on Leads in Search Result
	@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
	private WebElement eleFirstResultInSearch;
	public ViewLead clickFirstResultInSearch() {
		click(eleFirstResultInSearch);		
		return new ViewLead();
	}
	//To Check if No Records Found text has appeared
	@FindBy(how=How.XPATH, using="//div[text()='No records to display']")
	private WebElement eleNoRecordsToDisplay;
	public FindLeads isNoRecordsDisplayed() {
		verifyPartialText(eleNoRecordsToDisplay, "No records to display");
		return this;
	}

	//To click on Email Tab
	@FindBy(how=How.XPATH, using="//span[text()='Email']")
	private WebElement eleEmailTabButton;
	public FindLeads clickEmailTab() {
		click(eleEmailTabButton);
		return this;		
	}
	
	//Enter email address in textbox
	@FindBy(how=How.XPATH, using="//input[@name='emailAddress']")
	private WebElement eleEmailAddressTextBox;
	public FindLeads enterEmailAddress(String data) {
		type(eleEmailAddressTextBox, data);
		return this;	
	}

}
