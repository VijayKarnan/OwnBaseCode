package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditContactPage extends ProjectMethods {

	public EditContactPage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="updateContactForm_firstName")
	private WebElement eleEditFormId;
	
	public EditContactPage enterUpdatedFirstName(String firstName)
	{
		type(eleEditFormId,firstName);
		return this;
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdate;
	
	public ViewContactPage clickUpdate()
	{
		click(eleUpdate);
		return new ViewContactPage(driver,test);
	}
}
