package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindContactsPage extends ProjectMethods{
	
	public FindContactsPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
	public FindContactsPage enterFirstName(String firstName)
	{
		type(eleFirstName,firstName);
		
		return this;
	}
	
	@FindBy(how=How.NAME,using="id")
	private WebElement eleContactId;
	
	public FindContactsPage enterContactId(String firstName)
	{
		type(eleContactId,firstName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Contacts']")
	private WebElement eleFindContacts;
	
	public FindContactsPage clickFindContacts()
	{
		click(eleFindContacts);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstResult;
	
	public ViewContactPage clickFirstResult()
	{
		click(eleFirstResult);
		return new ViewContactPage(driver,test);
	}
	
	public String getFirstResultID()
	{
		String leadId=getText(eleFirstResult);
		return leadId;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-toolbar x-small-editor']")
	private WebElement eleErrorMSG;
	
	public FindContactsPage verifyErrorMessage(String errorMSG)
	{
		verifyPartialText(eleErrorMSG, errorMSG);
		return this;
	}
}
