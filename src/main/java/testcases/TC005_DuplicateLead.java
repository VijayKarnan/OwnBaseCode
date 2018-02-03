package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DuplicateLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_DuplicateLead";
		testDescription = "Duplicate Lead and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
}


	@Test(dataProvider="fetchData")
	public void duplicateLead(String userName,String password,String email,String errorMSG) {
		
		FindLeadsPage dlp=new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmail()
		.enterEmailAddress(email)
		.clickFindLeads();
		String firstResLeadName=dlp.getLeadName();
		dlp.clickFirstLeadName()
		.clickDuplicate()
		.verifyDuplicateLeadTitle(errorMSG)
		.clickCreateLead()
		.verifyFirstName(firstResLeadName);
		}

}