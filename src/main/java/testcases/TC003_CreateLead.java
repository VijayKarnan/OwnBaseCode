package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "Create Lead and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName,String password,String cname, String firstName, String lastName, String source, String personalTitle,
			String generalProfTitle, String departmentName, String annualRevenue, String currencyUomId,
			String industryEnumId, String numberEmployees, String ownershipEnumId, String sicCode,
			String createLeadForm_tickerSymbol, String createLeadForm_description, String createLeadForm_importantNote,
			String createLeadForm_primaryPhoneAreaCode, String createLeadForm_primaryPhoneNumber,
			String createLeadForm_primaryEmail, String	primaryWebUrl, String generalAddress1, String createLeadForm_generalAddress2, String createLeadForm_generalCity,
			String createLeadForm_generalPostalCode, String generalCountryGeoId,String createLeadForm_generalStateProvinceGeoId) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(cname)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectSource(source)
		.selectMarketingCampaignId(1)
		.enterCreateLeadForm_firstNameLocal(firstName)
		.enterCreateLeadForm_lastNameLocal(lastName)
		.enterCreateLeadForm_personalTitle(personalTitle)
		.enterCreateLeadForm_generalProfTitle(generalProfTitle)
		.enterCreateLeadForm_departmentName(departmentName)
		.enterAnnualRevenue(annualRevenue)
		.selectCurrencyUomId(currencyUomId)
		.selectIndustryEnumId(industryEnumId)
		.enterNumberEmployees(numberEmployees)
		.selectOwnershipEnumId(ownershipEnumId)
		.enterSicCode(sicCode)
		.enterCreateLeadForm_tickerSymbol(createLeadForm_tickerSymbol)
		.enterCreateLeadForm_description(createLeadForm_description)
		.enterCreateLeadForm_importantNote(createLeadForm_importantNote)
		.enterCreateLeadForm_primaryPhoneAreaCode(createLeadForm_primaryPhoneAreaCode)
		.enterCreateLeadForm_primaryPhoneNumber(createLeadForm_primaryPhoneNumber)
		.enterPrimaryPhoneExtension(createLeadForm_primaryPhoneAreaCode)
		.enterCreateLeadForm_primaryPhoneAskForName(firstName,lastName )
		.enterCreateLeadForm_primaryEmail(createLeadForm_primaryEmail )
		.enterPrimaryWebUrl(primaryWebUrl)
		.enterCreateLeadForm_generalToName(firstName,lastName )
		.enterCreateLeadForm_generalAttnName(firstName)
		.enterGeneralAddress1(generalAddress1)
		.enterCreateLeadForm_generalAddress2(createLeadForm_generalAddress2)
		.enterCreateLeadForm_generalCity(createLeadForm_generalCity)
		.enterCreateLeadForm_generalPostalCode(createLeadForm_generalPostalCode)
		.selectGeneralCountryGeoId(generalCountryGeoId)
		.enterCreateLeadForm_generalPostalCodeExt(createLeadForm_generalPostalCode)
		.enterCreateLeadForm_generalStateProvinceGeoId(createLeadForm_generalStateProvinceGeoId)
		.clickCreateLead()
		.verifyCompanyName(cname);
			
	}

}
