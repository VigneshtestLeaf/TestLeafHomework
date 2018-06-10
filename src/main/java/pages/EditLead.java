package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {
		PageFactory.initElements(driver,this);
	}

	//Change Company name
	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	private WebElement eleCompanyName;

	public EditLead updateCompanyname(String data) {
		type(eleCompanyName, data);
		return this;
	}

	//Click on Edit leads
	@FindBy(how=How.XPATH, using="//input[@value='Update']")
	private WebElement eleUpdateLeadButton;
	public ViewLead clickUpdateLeadButton() {
		click(eleUpdateLeadButton);
		return new ViewLead();
	}
}

