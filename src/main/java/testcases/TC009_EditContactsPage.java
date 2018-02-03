package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ViewContactPage;
import wdMethods.ProjectMethods;

public class TC009_EditContactsPage extends ProjectMethods{
	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC009";
		testCaseName = "TC009_EditContact";
		testDescription = "Edit Contact and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void editContact(String uName,String pwd,String firstName,String title,String updFirstName)
	{
		new LoginPage(driver,test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickContacts()
		.clickFindContacts()
		.enterFirstName(firstName)
		.clickFindContacts()
		.clickFirstResult()
		.verifyViewContactTitle(title)
		.clickEdit()
		.enterUpdatedFirstName(updFirstName)
		.clickUpdate()
		.verifyUpdName(updFirstName);		
		
		
	}

}
