package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);

	}

	// Verify Partial Text
	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	private WebElement eleViewLeadCompanyName;

	public ViewLeadPage verifyCompanyName(String cName) {
		
		verifyPartialText(eleViewLeadCompanyName, cName);
		
		return this;

	}

	// Click Delete

	@FindBy(how = How.LINK_TEXT, using = "Delete")

	private WebElement eleDelete;

	public MyLeadsPage clickDelete() {

		click(eleDelete);

		return new MyLeadsPage(driver, test);

	}

	// Click Duplicate

	@FindBy(how = How.LINK_TEXT, using = "Duplicate Lead")

	private WebElement eleDuplicateLead;

	public DuplicateLeadPage clickDuplicate() {

		click(eleDuplicateLead);

		return new DuplicateLeadPage(driver, test);

	}

	// verifyExact First Name

	@FindBy(how = How.ID, using = "viewLead_firstName_sp")

	private WebElement eleViewLeadfirstNamesp;

	public ViewLeadPage verifyFirstName(String firstName) {

		verifyExactText(eleViewLeadfirstNamesp, firstName);

		return this;

	}

	// (verifyTitle("View Lead | opentaps CRM"))

	public ViewLeadPage verifyViewLeadTitle(String title) {

		verifyTitle(title);

		return this;

	}

	// Edit Lead Page

	@FindBy(how = How.LINK_TEXT, using = "Edit")

	private WebElement eleEdit;

	public EditLeadPage clickEdit() {

		click(eleEdit);

		return new EditLeadPage(driver, test);

	}
	
	//Click Find Leads
	
	@FindBy(how = How.LINK_TEXT, using = "Find Leads")

	private WebElement eleFindLeads;

	public FindLeadsPage clickFindLead() {

		click(eleFindLeads);

		return new FindLeadsPage(driver, test);

	}
	

}
