package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateContactPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC008_CreateContact extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC008";
		testCaseName = "TC008_CreateContact";
		testDescription = "Create Contact and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
	}


@Test(dataProvider="fetchData")
public void createContact(String userName,String password,String firstName, String lastName,String firstNameLocal, String lastNameLocal, String personalTitle,
		String generalProfTitle, String departmentName, String currencyUomId,String formDescription,String formImportantNote,String createContactForm_primaryPhoneAreaCode,
		String createContactForm_primaryEmail,String createContactForm_primaryPhoneNumber,String createContactForm_generalAddress1,
		String createContactForm_generalCity,String createContactForm_generalPostalCode,
		String createContactForm_generalAddress2,String CreateContactForm_generalCountryGeoId,String createContactForm_generalStateProvinceGeoId) {
	
	CreateContactPage cc=new LoginPage(driver, test)
	.enterUserName(userName)
	.enterPassword(password)
	.clickLogin()
	.clickCRMSFA()
	.clickContacts()
	.clickCreateContact()
	.enterFirstName(firstName)
	.enterLastName(lastName)
	.enterFirstNameLocal(firstNameLocal)
	.enterLastNameLocal(lastNameLocal)
	.enterCreateContactForm_personalTitle(personalTitle)
	.enterCreateContactForm_generalProfTitle(generalProfTitle)
	.enterCreateContactForm_departmentName(departmentName)
	.selectContactForm_preferredCurrencyUomId(currencyUomId)
	.enterCreateContactForm_description(formDescription)
	.enterCreateContactForm_importantNote(formImportantNote)
	.enterCreateContactForm_primaryPhoneAreaCode(createContactForm_primaryPhoneAreaCode)
	.enterCreateContactForm_primaryPhoneExtension(createContactForm_primaryPhoneAreaCode)
	.enterCreateContactForm_primaryEmail(createContactForm_primaryEmail)
	.enterCreateContactForm_primaryPhoneNumber(createContactForm_primaryPhoneNumber)
	.enterCreateContactForm_primaryPhoneAskForName(firstName,lastName);
	String actualName=cc.getToNameField();
	cc.verifyeleGeneralToNameField(actualName)
	//.getToNameField()
	.enterCreateContactForm_generalAddress1(createContactForm_generalAddress1)
	.enterCreateContactForm_generalCity(createContactForm_generalCity)
	.enterCreateContactForm_generalPostalCode(createContactForm_generalPostalCode)
	.enterCreateContactForm_generalPostalCodeExtension(createContactForm_generalPostalCode)
	.enterCreateContactForm_generalAttnName(firstNameLocal.concat(lastNameLocal))
	.enterCreateContactForm_generalAddress2(createContactForm_generalAddress2)
	.selectCreateContactForm_generalCountryGeoId(CreateContactForm_generalCountryGeoId)
	.selectCreateContactForm_generalStateProvinceGeoId(createContactForm_generalStateProvinceGeoId)
	.clickCreateContact()
	.verifyFirstName(firstName);

}
}
