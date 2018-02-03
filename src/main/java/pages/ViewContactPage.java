package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.How.*;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewContactPage extends ProjectMethods{
	
	public ViewContactPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="viewContact_firstName_sp")
	private WebElement eleViewContactFirstName;
	
	public ViewContactPage verifyFirstName(String firstName)
	{
		verifyExactText(eleViewContactFirstName,firstName);
		return this;
	}

	public ViewContactPage verifyViewContactTitle(String title)
	{
		verifyTitle(title);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEdit;
	
	public EditContactPage clickEdit()
	{
		click(eleEdit);
		return new EditContactPage(driver,test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Deactivate Contact")
	private WebElement eleDeactivate;
	
	public ViewContactPage clickDeactivate()
	{
		click(eleDeactivate);
		return this;
	}
	
	public ViewContactPage acceptDeactiveAlert()
	{
		acceptAlert();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//span[@class='subSectionWarning']")
	private WebElement eleDeactivateMSG;
	
	public ViewContactPage verifyDeactivateMessage(String expectedText)
	{
		verifyPartialText(eleDeactivateMSG, expectedText);
		return this;
	}
	@FindBy(how=How.ID,using="viewContact_firstName_sp")
	private WebElement eleviewContact_firstName_sp;
		
	public ViewContactPage verifyUpdName(String updFirstName)
	{
		verifyExactText(eleviewContact_firstName_sp, updFirstName);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Contacts")
	private WebElement eleFindContacts;
	
	public FindContactsPage clickFindContacts()
	{
		click(eleFindContacts);
		return new FindContactsPage(driver,test);
	}
	
	}
