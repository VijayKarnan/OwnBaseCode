package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007";
		testCaseName = "TC007_MergeLead";
		testDescription = "Merge two leads";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
	}
	@Test(dataProvider="fetchData")
	public void mergeLead(String userName,String password,String fromName,String toName,String errorMSG) {

		FindLeadsPage mlp=new LoginPage(driver, test)
				.enterUserName(userName)
				.enterPassword(password)
				.clickLogin()
				.clickCRMSFA()
				.clickLeads()
				.clickMergeLead()
				.clickFromLead()
				.switchWindow(1)
				.enterLeadName(fromName)
				.clickFindLeads();
		String fromLeadId=mlp.getLeadId();
		mlp.clickLeadId()
		.switchWindow(0)
		.clickToLead()
		.switchWindow(1)
		.enterLeadName(toName)
		.clickFindLeads()
		.clickLeadId()
		.switchWindow(0)
		.clickMerge()
		.acceptAlertPopup()
		.clickFindLead()
		.enterFirstLeadId(fromLeadId)
		.clickFindLeads()
		.verifyErrorMessage(errorMSG);




	}

}