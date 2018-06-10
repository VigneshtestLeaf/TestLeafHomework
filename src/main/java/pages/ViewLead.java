package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {
		PageFactory.initElements(driver,this);
	}

	//Verify the Created Lead Name
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleLeadName;

	public ViewLead verifyCreatedLead(String data) {
		verifyPartialText(eleLeadName, data);
		return this;
	}
	
	//Click on Duplicate Lead Button
	@FindBy(how=How.LINK_TEXT, using="Duplicate Lead")
	private WebElement eleDuplicateLeadButton;
	public DuplicateLead clickDuplicateLead() {
		click(eleDuplicateLeadButton);
		return new DuplicateLead();
		
	}
	
	//Confirm Duplicate Lead Name is same as original
	@FindBy(how=How.ID, using="viewLead_firstName_sp")
	private WebElement eleFirstNameInViewLeadPage;
	public ViewLead confirmFirstName(String data) {
		verifyPartialText(eleFirstNameInViewLeadPage, data);
		return this;		
	}
	
	//Verify the Edited Company Name
	@FindBy(how=How.ID, using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	public ViewLead verifyEditedCompanyName(String data) {
		verifyPartialText(eleCompanyName, data);
		return this;
	}

	//Click on Edit leads
	@FindBy(how=How.LINK_TEXT, using="Edit")
	private WebElement eleEditLeadbutton;
	public EditLead clickEditLeadButton() {
		click(eleEditLeadbutton);
		return new EditLead();
	}
	
	//Click on Delete lead
	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eleDeleteButton;
	public MyLeads clickDeleteLeadbutton() {
		click(eleDeleteButton);
		return new MyLeads();
	}
}

