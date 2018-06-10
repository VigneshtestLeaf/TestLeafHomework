package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLead extends ProjectMethods{

	public DuplicateLead() {
		PageFactory.initElements(driver,this);
	}

	//Click Create Lead in Duplicate Lead Page
	@FindBy(how=How.XPATH, using="//input[@name='submitButton']")
	private WebElement eleCreateLeadButton;
	public ViewLead clickCreateLead() {
		click(eleCreateLeadButton);
		return new ViewLead();
	}
}

