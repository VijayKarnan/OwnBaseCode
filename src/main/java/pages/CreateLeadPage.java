package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {
	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCompanyName;

	public CreateLeadPage enterCompanyName(String cName) {
		type(eleCompanyName, cName);
		return this;

	}

	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLeadPage enterFirstName(String firstname) {
		type(eleFirstName, firstname);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement eleLastName;

	public CreateLeadPage enterLastName(String lastName) {
		type(eleLastName, lastName);
		return this;
	}

	@FindBy(how = How.NAME, using = "dataSourceId")
	private WebElement eleSource;

	public CreateLeadPage selectSource(String source) {
		selectDropDownUsingText(eleSource, source);
		return this;
	}

	// Marketing Campaign

	@FindBy(how = How.NAME, using = "marketingCampaignId")
	private WebElement eleMarketingCampaignId;

	public CreateLeadPage selectMarketingCampaignId(int n) {
		selectDropDownUsingIndex(eleMarketingCampaignId, 1);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_firstNameLocal")
	private WebElement eleCreateLeadForm_firstNameLocal;

	public CreateLeadPage enterCreateLeadForm_firstNameLocal(String firstName) {
		type(eleCreateLeadForm_firstNameLocal, firstName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_lastNameLocal")
	private WebElement eleCreateLeadForm_lastNameLocal;

	public CreateLeadPage enterCreateLeadForm_lastNameLocal(String lastName) {
		type(eleCreateLeadForm_lastNameLocal, lastName);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_personalTitle")
	private WebElement eleCreateLeadForm_personalTitle;

	public CreateLeadPage enterCreateLeadForm_personalTitle(String personalTitle) {
		type(eleCreateLeadForm_personalTitle, personalTitle);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalProfTitle")
	private WebElement eleCreateLeadForm_generalProfTitle;

	public CreateLeadPage enterCreateLeadForm_generalProfTitle(String generalProfTitle) {
		type(eleCreateLeadForm_generalProfTitle, generalProfTitle);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_departmentName")
	private WebElement eleCreateLeadForm_departmentName;

	public CreateLeadPage enterCreateLeadForm_departmentName(String departmentName) {
		type(eleCreateLeadForm_departmentName, departmentName);
		return this;
	}

	@FindBy(how = How.NAME, using = "annualRevenue")
	private WebElement eleAnnualRevenue;

	public CreateLeadPage enterAnnualRevenue(String annualRevenue) {
		type(eleAnnualRevenue, annualRevenue);
		return this;
	}

	// Preferred Currency

	@FindBy(how = How.NAME, using = "currencyUomId")
	private WebElement eleCurrencyUomId;

	public CreateLeadPage selectCurrencyUomId(String currencyUomId) {
		selectDropDownUsingText(eleCurrencyUomId, currencyUomId);
		return this;
	}

	// Industry

	@FindBy(how = How.NAME, using = "industryEnumId")
	private WebElement eleIndustryEnumId;

	public CreateLeadPage selectIndustryEnumId(String industryEnumId) {
		selectDropDownUsingText(eleIndustryEnumId, industryEnumId);
		return this;
	}

	// Number of Employees

	@FindBy(how = How.NAME, using = "numberEmployees")
	private WebElement eleNumberEmployees;

	public CreateLeadPage enterNumberEmployees(String numberEmployees) {
		type(eleNumberEmployees, numberEmployees);
		return this;
	}

	// Ownership

	@FindBy(how = How.NAME, using = "ownershipEnumId")
	private WebElement eleOwnershipEnumId;

	public CreateLeadPage selectOwnershipEnumId(String ownershipEnumId) {
		selectDropDownUsingText(eleOwnershipEnumId, ownershipEnumId);
		return this;
	}

	// SIC Code

	@FindBy(how = How.NAME, using = "sicCode")
	private WebElement eleSicCode;

	public CreateLeadPage enterSicCode(String sicCode) {
		type(eleSicCode, sicCode);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_tickerSymbol")
	private WebElement eleCreateLeadForm_tickerSymbol;

	public CreateLeadPage enterCreateLeadForm_tickerSymbol(String createLeadForm_tickerSymbol) {
		type(eleCreateLeadForm_tickerSymbol, createLeadForm_tickerSymbol);
		return this;
	}

	// Description

	@FindBy(how = How.ID, using = "createLeadForm_description")
	private WebElement eleCreateLeadForm_description;

	public CreateLeadPage enterCreateLeadForm_description(String createLeadForm_description) {
		type(eleCreateLeadForm_description, createLeadForm_description);
		return this;
	}

	// Important Note

	@FindBy(how = How.ID, using = "createLeadForm_importantNote")
	private WebElement eleCreateLeadForm_importantNote;

	public CreateLeadPage enterCreateLeadForm_importantNote(String createLeadForm_importantNote) {
		type(eleCreateLeadForm_importantNote, createLeadForm_importantNote);
		return this;
	}

	// Contact Information

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAreaCode")
	private WebElement eleCreateLeadForm_primaryPhoneAreaCode;

	public CreateLeadPage enterCreateLeadForm_primaryPhoneAreaCode(String createLeadForm_primaryPhoneAreaCode) {
		type(eleCreateLeadForm_primaryPhoneAreaCode, createLeadForm_primaryPhoneAreaCode);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	private WebElement eleCreateLeadForm_primaryPhoneNumber;

	public CreateLeadPage enterCreateLeadForm_primaryPhoneNumber(String createLeadForm_primaryPhoneNumber) {
		type(eleCreateLeadForm_primaryPhoneNumber, createLeadForm_primaryPhoneNumber);
		return this;
	}

	@FindBy(how = How.NAME, using = "primaryPhoneExtension")
	private WebElement elePrimaryPhoneExtension;

	public CreateLeadPage enterPrimaryPhoneExtension(String createLeadForm_primaryPhoneAreaCode) {
		type(elePrimaryPhoneExtension, createLeadForm_primaryPhoneAreaCode);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneAskForName")
	private WebElement eleCreateLeadForm_primaryPhoneAskForName;

	public CreateLeadPage enterCreateLeadForm_primaryPhoneAskForName(String firstName, String lastName) {
		type(eleCreateLeadForm_primaryPhoneAskForName, firstName.concat(lastName));
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	private WebElement eleCreateLeadForm_primaryEmail;

	public CreateLeadPage enterCreateLeadForm_primaryEmail(String createLeadForm_primaryEmail) {
		type(eleCreateLeadForm_primaryEmail, createLeadForm_primaryEmail);
		return this;
	}

	@FindBy(how = How.NAME, using = "primaryWebUrl")
	private WebElement elePrimaryWebUrl;

	public CreateLeadPage enterPrimaryWebUrl(String primaryWebUrl) {
		type(elePrimaryWebUrl, primaryWebUrl);
		return this;
	}

	// Primary Address

	@FindBy(how = How.ID, using = "createLeadForm_generalToName")
	private WebElement eleCreateLeadForm_generalToName;

	public CreateLeadPage enterCreateLeadForm_generalToName(String firstName, String lastName) {
		type(eleCreateLeadForm_generalToName, firstName.concat(lastName));
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAttnName")
	private WebElement eleCreateLeadForm_generalAttnName;

	public CreateLeadPage enterCreateLeadForm_generalAttnName(String firstName) {
		type(eleCreateLeadForm_generalAttnName, firstName);
		return this;
	}

	@FindBy(how = How.NAME, using = "generalAddress1")
	private WebElement eleGeneralAddress1;

	public CreateLeadPage enterGeneralAddress1(String generalAddress1) {
		type(eleGeneralAddress1, generalAddress1);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalAddress2")
	private WebElement eleCreateLeadForm_generalAddress2;

	public CreateLeadPage enterCreateLeadForm_generalAddress2(String createLeadForm_generalAddress2) {
		type(eleCreateLeadForm_generalAddress2, createLeadForm_generalAddress2);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalCity")
	private WebElement eleCreateLeadForm_generalCity;

	public CreateLeadPage enterCreateLeadForm_generalCity(String createLeadForm_generalCity) {
		type(eleCreateLeadForm_generalCity, createLeadForm_generalCity);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCode")
	private WebElement eleCreateLeadForm_generalPostalCode;

	public CreateLeadPage enterCreateLeadForm_generalPostalCode(String createLeadForm_generalPostalCode) {
		type(eleCreateLeadForm_generalPostalCode, createLeadForm_generalPostalCode);
		return this;
	}

	@FindBy(how = How.NAME, using = "generalCountryGeoId")
	private WebElement eleGeneralCountryGeoId;

	public CreateLeadPage selectGeneralCountryGeoId(String generalCountryGeoId) {
		selectDropDownUsingText(eleGeneralCountryGeoId, generalCountryGeoId);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalPostalCodeExt")
	private WebElement eleCreateLeadForm_generalPostalCodeExt;

	public CreateLeadPage enterCreateLeadForm_generalPostalCodeExt(String createLeadForm_generalPostalCode) {
		type(eleCreateLeadForm_generalPostalCodeExt, createLeadForm_generalPostalCode);
		return this;
	}

	@FindBy(how = How.ID, using = "createLeadForm_generalStateProvinceGeoId")
	private WebElement eleCreateLeadForm_generalStateProvinceGeoId;

	public CreateLeadPage enterCreateLeadForm_generalStateProvinceGeoId(
			String createLeadForm_generalStateProvinceGeoId) {
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//type(eleCreateLeadForm_generalStateProvinceGeoId, createLeadForm_generalStateProvinceGeoId);
		selectDropDownUsingText(eleCreateLeadForm_generalStateProvinceGeoId, createLeadForm_generalStateProvinceGeoId);
		return this;
	}

	// Clicking on Create Lead button
	
	@FindBy(how = How.NAME, using = "submitButton")
	private WebElement eleCreateLead;

	public ViewLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new ViewLeadPage(driver, test);
	}

	public CreateLeadPage clickCreateLeadFailure() {
		click(eleCreateLead);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "messages")
	private WebElement eleCreateLeadErrorMsg;

	public CreateLeadPage verifyErrorMsg(String expectedText) {
		verifyPartialText(eleCreateLeadErrorMsg, expectedText);
		return this;
	}

}
