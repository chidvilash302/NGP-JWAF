/**
 * @Author Gladson Antony
 * @Date 04-Oct-2018 
 * @Time 8:22:32 PM
 */
package pageObjects.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.qameta.allure.Step;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.AllureAttachments;
import utils.ExplicitWaiting;

public class MSRNGPPortalSigninPageObjects extends PageFactoryInitializer
{
	
	@FindBy(xpath="//div[contains(text(),'Sign in')]/following::input[@type='email']")
	private WebElement field_Email;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement button_Next;
	
	@FindBy(css="input[type='password']")
	private WebElement field_Password;
	
	@FindBy(css="#submitButton")
	private WebElement button_SignIn;
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")	
	private WebElement checkbox_KeepMeSignedIn;

	@FindBy(xpath="//p[contains(text(),'Sign in with a username and password instead')]")
    private WebElement link_SignInWithUsernameAndPasswordInstead;

	@FindBy(css="#passwordInput")
    private WebElement field_Password2;

	@FindBy(xpath="//a[contains(text(),'Sign in with PIN or smartcard')]")
    private WebElement link_SignInWithPinOrSmartcard;

    @FindBy(xpath="//a[contains(text(),'Sign in with your phone or token device')]")
    private WebElement link_SignInWithYourPhoneOrTokenDevice;


    @FindBy(xpath="//p[contains(text(),'Try a different verification option')]")
    private WebElement link_TryADifferentVerificationOption;

    @FindBy(xpath="//a[contains(text(),'Call me at +xx xxxxxx4556')]")
    private WebElement link_CallMeAtPhoneNumber;

	
	@Step("To Enter User Email-ID {0}")
	public MSRNGPPortalSigninPageObjects enterUserEmailID(String emailId) throws Exception
	{
		Assert.assertTrue(field_Email.isDisplayed());
		field_Email.clear();
		field_Email.sendKeys(emailId);
		//JS_SendKeys(emailId, field_Email);
		return this;
	}
	
	@Step("To Click on Next/Signin Button")
	public MSRNGPPortalSigninPageObjects clickOnNextButton()
	{
		Assert.assertTrue(button_Next.isDisplayed());
		button_Next.click();
		return this;
	}

    @Step("To Click on Sign In With UserName and Password")
    public MSRNGPPortalSigninPageObjects clickOnSignInWithUserNameAndPassword()
    {
        ExplicitWaiting.explicitWaitElementToBeClickable(link_SignInWithUsernameAndPasswordInstead,30);
        AllureAttachments.saveWebElement(getWebDriver(),link_SignInWithUsernameAndPasswordInstead);
        link_SignInWithUsernameAndPasswordInstead.click();
        return this;
    }
	
	@Step("To Enter the Password {0} ")
	public MSRNGPPortalSigninPageObjects enterPassword(String password) throws Exception
	{
        ExplicitWaiting.explicitWaitElementToBeClickable(field_Password2,30);
        field_Password2.clear();
        field_Password2.sendKeys(password);
		return this;
	}
	
	@Step("To Click on SignIn Button")
	public MSRNGPPortalSigninPageObjects clickOnSignIn() throws Exception
	{
	    ExplicitWaiting.explicitWaitElementToBeClickable(button_SignIn,30);
		AllureAttachments.saveWebElement(getWebDriver(),button_SignIn);
	    button_SignIn.click();
	    return this;
	}
}
