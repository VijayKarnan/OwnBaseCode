package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindContactsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC010_DeactivateContactPage extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC010";
		testCaseName = "TC010_DeactivateContact";
		testDescription = "Deactivate Contact and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void deactivateContact(String uName,String pwd,String firstName,String title,String expectedText,String errorMSG)
	{
		FindContactsPage dcp=new LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickContacts()
		.clickFindContacts()
		.enterFirstName(firstName)
		.clickFindContacts();
		String leadIdValue=dcp.getFirstResultID();
		dcp.clickFirstResult()
		.verifyViewContactTitle(title)
		.clickDeactivate()
		.acceptDeactiveAlert()
		.verifyDeactivateMessage(expectedText)
		.clickFindContacts()
		.enterContactId(leadIdValue)
		.clickFindContacts()
		.verifyErrorMessage(errorMSG);
	}
}
