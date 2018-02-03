package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateContactPage extends ProjectMethods{
	public CreateContactPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how = How.ID, using = "firstNameField")
	private WebElement eleFirstName;

	public CreateContactPage enterFirstName(String firstName) {
		type(eleFirstName, firstName);
		return this;
	}

	@FindBy(how = How.ID, using = "lastNameField")
	private WebElement eleLastName;

	public CreateContactPage enterLastName(String lastName) {
		type(eleLastName, lastName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_firstNameLocal")
	private WebElement eleFirstNameLocal;

	public CreateContactPage enterFirstNameLocal(String firstNameLocal) {
		type(eleFirstNameLocal, firstNameLocal);
		return this;
	}

	@FindBy(how = How.ID, using = "createContactForm_lastNameLocal")
	private WebElement eleLastNameLocal;

	public CreateContactPage enterLastNameLocal(String lastNameLocal) {
		type(eleLastNameLocal, lastNameLocal);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_personalTitle")
	private WebElement eleCreateContactForm_personalTitle;

	public CreateContactPage enterCreateContactForm_personalTitle(String personalTitle) {
		type(eleCreateContactForm_personalTitle, personalTitle);
		return this;
	}

	@FindBy(how = How.ID, using = "createContactForm_generalProfTitle")
	private WebElement eleCreateContactForm_generalProfTitle;

	public CreateContactPage enterCreateContactForm_generalProfTitle(String generalProfTitle) {
		type(eleCreateContactForm_generalProfTitle, generalProfTitle);
		return this;
	}

	@FindBy(how = How.ID, using = "createContactForm_departmentName")
	private WebElement eleCreateContactForm_departmentName;

	public CreateContactPage enterCreateContactForm_departmentName(String departmentName) {
		type(eleCreateContactForm_departmentName, departmentName);
		return this;
	}
	@FindBy(how = How.ID, using = "createContactForm_preferredCurrencyUomId")
	private WebElement elecreateContactForm_preferredCurrencyUomId;

	public CreateContactPage selectContactForm_preferredCurrencyUomId(String currencyUomId) {
		selectDropDownUsingText(elecreateContactForm_preferredCurrencyUomId, currencyUomId);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_description")
	private WebElement eleCreateContactForm_description;

	public CreateContactPage enterCreateContactForm_description(String formDescription) {
		type(eleCreateContactForm_description, formDescription);
		return this;
	}	

	@FindBy(how = How.ID, using = "createContactForm_importantNote")
	private WebElement eleCreateContactForm_importantNote;

	public CreateContactPage enterCreateContactForm_importantNote(String formImportantNote) {
		type(eleCreateContactForm_importantNote, formImportantNote);
		return this;
	}
	
	
	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneAreaCode")
	private WebElement eleCreateContactForm_primaryPhoneAreaCode;

	public CreateContactPage enterCreateContactForm_primaryPhoneAreaCode(String createContactForm_primaryPhoneAreaCode) {
		type(eleCreateContactForm_primaryPhoneAreaCode, createContactForm_primaryPhoneAreaCode);
		return this;
	}


	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneExtension")
	private WebElement eleContactFormprimaryPhoneExtension;

	public CreateContactPage enterCreateContactForm_primaryPhoneExtension(String createContactForm_primaryPhoneExtension) {
		type(eleContactFormprimaryPhoneExtension, createContactForm_primaryPhoneExtension);
		return this;
	}

	@FindBy(how = How.ID, using = "createContactForm_primaryEmail")
	private WebElement eleCreateContactForm_primaryEmail;

	public CreateContactPage enterCreateContactForm_primaryEmail(String createContactForm_primaryEmail) {
		type(eleCreateContactForm_primaryEmail, createContactForm_primaryEmail);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneNumber")
	private WebElement eleCreateContactForm_primaryPhoneNumber;

	public CreateContactPage enterCreateContactForm_primaryPhoneNumber(String createContactForm_primaryPhoneNumber) {
		type(eleCreateContactForm_primaryPhoneNumber, createContactForm_primaryPhoneNumber);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_primaryPhoneAskForName")
	private WebElement eleCreateContactForm_primaryPhoneAskForName;

	public CreateContactPage enterCreateContactForm_primaryPhoneAskForName(String firstName, String lastName) {
		type(eleCreateContactForm_primaryPhoneAskForName, firstName.concat(lastName));
		return this;
	}
	
	@FindBy(how = How.ID, using = "generalToNameField")
	private WebElement eleGeneralToNameField;

	public CreateContactPage verifyeleGeneralToNameField(String firstName) {
		verifyPartialText(eleGeneralToNameField, firstName);
		return this;
	}
	
	public String getToNameField() {
		String toname=getText(eleGeneralToNameField);
		System.out.println(toname+"Welcome to the new world");
		return toname;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_generalAddress1")
	private WebElement eleCreateContactForm_generalAddress1;

	public CreateContactPage enterCreateContactForm_generalAddress1(String createContactForm_generalAddress1) {
		type(eleCreateContactForm_generalAddress1, createContactForm_generalAddress1);
		return this;
	}

	@FindBy(how = How.ID, using = "createContactForm_generalCity")
	private WebElement eleCreateContactForm_generalCity;

	public CreateContactPage enterCreateContactForm_generalCity(String createContactForm_generalCity) {
		type(eleCreateContactForm_generalCity, createContactForm_generalCity);
		return this;
	}

	@FindBy(how = How.ID, using = "createContactForm_generalPostalCode")
	private WebElement eleCreateContactForm_generalPostalCode;

	public CreateContactPage enterCreateContactForm_generalPostalCode(String createContactForm_generalPostalCode) {
		type(eleCreateContactForm_generalPostalCode, createContactForm_generalPostalCode);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_generalPostalCodeExt")
	private WebElement eleCreateContactForm_generalPostalCodeExt;

	public CreateContactPage enterCreateContactForm_generalPostalCodeExtension(String createContactForm_generalPostalCodeExt) {
		type(eleCreateContactForm_generalPostalCodeExt, createContactForm_generalPostalCodeExt);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_generalAttnName")
	private WebElement eleCreateContactForm_generalAttnName;

	public CreateContactPage enterCreateContactForm_generalAttnName(String createContactForm_generalAttnName) {
		type(eleCreateContactForm_generalAttnName, createContactForm_generalAttnName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_generalAddress2")
	private WebElement eleCreateContactForm_generalAddress2;

	public CreateContactPage enterCreateContactForm_generalAddress2(String createContactForm_generalAddress2) {
		type(eleCreateContactForm_generalAddress2, createContactForm_generalAddress2);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_generalCountryGeoId")
	private WebElement eleCreateContactForm_generalCountryGeoId;

	public CreateContactPage selectCreateContactForm_generalCountryGeoId(String CreateContactForm_generalCountryGeoId) {
		selectDropDownUsingText(eleCreateContactForm_generalCountryGeoId, CreateContactForm_generalCountryGeoId);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createContactForm_generalStateProvinceGeoId")
	private WebElement eleCreateContactForm_generalStateProvinceGeoId;

	public CreateContactPage selectCreateContactForm_generalStateProvinceGeoId(String createContactForm_generalStateProvinceGeoId) {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		selectDropDownUsingText(eleCreateContactForm_generalStateProvinceGeoId, createContactForm_generalStateProvinceGeoId);
		return this;
	}
	
	// Clicking on Create Lead button
	
		@FindBy(how = How.NAME, using = "submitButton")
		private WebElement eleCreateContact;

		public ViewContactPage clickCreateContact() {
			click(eleCreateContact);
			return new ViewContactPage(driver, test);
		}



}
