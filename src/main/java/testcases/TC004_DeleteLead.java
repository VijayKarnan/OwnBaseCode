package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_DeleteLead";
		testDescription = "Delete Lead and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLead(String userName,String password,String phoneNumber,String errorMSG) {
		
		FindLeadsPage flp=new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.clickPhoneNumber(phoneNumber)
		.clickFindLeads();
		String firstResLeadId=flp.getLeadId();
		flp.clickFirstLeadId()
		.clickDelete()
		.clickFindLeads()
		.enterFirstLeadId(firstResLeadId)
		.clickFindLeads()
		.verifyErrorMessage(errorMSG);
		}

}
