package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_EditLead extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006";
		testCaseName = "TC006_EditLead";
		testDescription = "Edit Company Name and Verify";
		category= "Smoke";
		authors	="Vijay";
		browserName ="chrome";
}
	@Test(dataProvider="fetchData")
	public void editLead(String userName,String password,String firstName,String updCompanyName,String title) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName(firstName)
		.clickFindLeads()
		.clickFirstLeadId()
		.clickEdit()
		.enterUpdLeadCompanyName(updCompanyName)
		.clickUpdate()
		.verifyViewLeadTitle(title)
		.verifyCompanyName(updCompanyName);
		}

}
