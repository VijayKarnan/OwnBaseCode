package pages;

import java.util.concurrent.TimeUnit;
import java.lang.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods {

	public FindLeadsPage(RemoteWebDriver driver, ExtentTest test) {

		this.driver = driver;

		this.test = test;

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.LINK_TEXT, using = "Phone")

	private WebElement elePhone;

	public FindLeadsPage clickPhone() {

		click(elePhone);

		return this;

	}

	@FindBy(how = How.NAME, using = "phoneNumber")

	private WebElement elePhoneNumber;

	public FindLeadsPage clickPhoneNumber(String phoneNumber) {

		type(elePhoneNumber, phoneNumber);

		return this;

	}

	// Click Email

	@FindBy(how = How.LINK_TEXT, using = "Email")

	private WebElement eleEmail;

	public FindLeadsPage clickEmail() {

		click(eleEmail);

		return this;

	}

	// Entering Mail address

	@FindBy(how = How.NAME, using = "emailAddress")

	private WebElement eleEmailAddress;

	public FindLeadsPage enterEmailAddress(String emailAddr) {

		type(eleEmailAddress, emailAddr);

		return this;
	}
	
	//First Name
	
			
			@FindBy(how = How.XPATH, using = "(//input[@name='firstName'])[3]")

			private WebElement eleFirstName;

			public FindLeadsPage enterFirstName(String firstName) {

				type(eleFirstName, firstName);

				return this;

			}
			
			@FindBy(how = How.NAME, using = "firstName")

			private WebElement eleLeadName;

			public FindLeadsPage enterLeadName(String firstName) {

				type(eleLeadName, firstName);

				return this;

			}
			

	@FindBy(how = How.XPATH, using = "//button[text()='Find Leads']")

	private WebElement eleFindLeads;

	public FindLeadsPage clickFindLeads() {

		click(eleFindLeads);

		return this;

	}

	// Capture First Result Lead Id

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")

	private WebElement elefirstResLead;

	/*
	 * public FindLeadsPage captureLeadId () { firstResLeadId =
	 * getText(elefirstResLead); System.out.println(firstResLeadId);
	 * //this.firstResLeadId=firstResLeadId; return new FindLeadsPage(driver,
	 * test);
	 * 
	 * }
	 */

	public String getLeadId() {
		firstResLeadId = getText(elefirstResLead);
		return firstResLeadId;

	}

	// Capture First Result Lead Name

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")

	private WebElement elefirstResLeadName;

	public String getLeadName() {
		firstResLeadName = getText(elefirstResLeadName);
		return firstResLeadName;

	}

	// Click First Result Lead Id
	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")

	private WebElement eleFirstLeadId;

	public ViewLeadPage clickFirstLeadId() {

		click(eleFirstLeadId);

		return new ViewLeadPage(driver, test);

	}

	// Enter captured Lead Id

	@FindBy(how = How.NAME, using = "id")

	private WebElement eleFirstLeadIdValue;

	public FindLeadsPage enterFirstLeadId(String resultId) {

		type(eleFirstLeadIdValue, resultId);

		return this;

	}

	// Click First Result Lead Name

	@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")

	private WebElement eleFirstLeadName;

	public ViewLeadPage clickFirstLeadName() {

		click(eleFirstLeadName);

		return new ViewLeadPage(driver, test);

	}

	// Verify error msg

	@FindBy(how = How.CLASS_NAME, using = "x-paging-info")

	private WebElement eleErrorMessage;

	public FindLeadsPage verifyErrorMessage(String errorMSG) {

		verifyExactText(eleErrorMessage, errorMSG);
		return this;

	}
	
	
	// Click First Pop up  Result Lead Id
		@FindBy(how = How.XPATH, using = "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")

		private WebElement eleLeadId;

		public FindLeadsPage clickLeadId() {

			click(eleLeadId);

			return this;

		}
		
		
		//Parent Window
		public MergeLeadPage switchWindow(int index) {
			switchToWindow(index);

			return new MergeLeadPage(driver, test);
		}
		
		
		
}