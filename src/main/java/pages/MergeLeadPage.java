package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);

	}
	
	//From Lead Id
		
	@FindBy(how = How.XPATH, using = "//img[@src='/images/fieldlookup.gif']")

	private WebElement eleFromLead;

	public MergeLeadPage clickFromLead() {

		click(eleFromLead);
		
		return this;

	}
	
	public FindLeadsPage switchWindow(int index)
	{
		switchToWindow(index);

		return new FindLeadsPage(driver, test);
	}
	
	//To Lead Id
	
	@FindBy(how = How.XPATH, using = "(//img[@src='/images/fieldlookup.gif'])[2]")

	private WebElement eleToLead;

	public MergeLeadPage clickToLead() {

		click(eleToLead);
		
		return this;

	}
	
	// Clicking on Merge button
	
	@FindBy(how = How.LINK_TEXT, using = "Merge")

	private WebElement eleMerge;

	public MergeLeadPage clickMerge() {

		click(eleMerge);
		
		return this;

	}
	
	public ViewLeadPage acceptAlertPopup() {

		acceptAlert();
		
		return new ViewLeadPage(driver,test);

	}
	
}
