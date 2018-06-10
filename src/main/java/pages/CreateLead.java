package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {
		PageFactory.initElements(driver,this);
	}

	//Enter Company name
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	//Enter First name
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstname;
	public CreateLead enterFirstName(String data) {
		type(eleFirstname, data);
		return this;
	}

	//Enter last name
	@FindBy(how=How.ID, using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}

	//Select Source
	@FindBy(how=How.ID,using="createLeadForm_dataSourceId")
	private WebElement elesource;
	public CreateLead selectDropDown(String data) {
		selectDropDownUsingText(elesource, data);
		return this;
	}

	//Enter Email
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLead enterEmail(String data) {
		type(eleEmail,data);
		return this;
	}

	//Enter Phone Number
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement elePhone;
	public CreateLead enterPhoneNumber(String data) {
		type(elePhone,data);
		return this;
	}

	//Click Create lead
	@FindBy(how=How.NAME, using="submitButton")
	private WebElement eleCreateLeadButton;
	public ViewLead clickCreateLeadButton() {
		click(eleCreateLeadButton);
		return new ViewLead();

	}

}

