package pageObjects.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.AllureAttachments;
import utils.ExplicitWaiting;

public class MSRNGPPortalPageObjects extends PageFactoryInitializer
{

    @FindBy(xpath="//a[contains(text(),'MSR-Data Ownership Guardian')]")
    private WebElement header_MSRNGPTools;

    @FindBy(xpath="//*[contains(text(),'Welcome, Chidvilash Vakada')]")
    private WebElement username;

    @FindBy(xpath="//a[contains(text(),'Contact Us')]")
    private WebElement footer_ContactUs;

    @FindBy(xpath="//a[contains(text(),'Data Protection Notice')]")
    private WebElement footer_DataProtectionNotice;

    @FindBy(xpath="//h3[contains(text(),'Onboarding Request System')]")
    private WebElement body_AssetOnboardingRequestSystem;

    @FindBy(xpath="//h3[contains(text(),'File Share Retention Dashboard')]")
    private WebElement body_FileShareRetensionDashboard;

    @FindBy(xpath="//h3[contains(text(),'DSR Dashboard')]")
    private WebElement body_DSRDashboard;

    @FindBy(xpath="//h3[contains(text(),'Onboarding Dashboard')]")
    private WebElement body_AssetOnboardingDashbaord;

    @FindBy(xpath="//h3[contains(text(),'File Share DSR Search')]")
    private WebElement body_FileShareDSRSearch;

    @FindBy(xpath="//h3[contains(text(),'Help')]")
    private WebElement body_Help;

    @Step("To verify the user name Chidvilash Vakada")
    public MSRNGPPortalPageObjects verifyUsername()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(username,30);
        Assert.assertTrue(username.isDisplayed(),"User Name Chidvilash Vakada is not available in the Page Header");
        AllureAttachments.saveWebElement(getWebDriver(),username);
        return this;
    }

    @Step("To verify the Page Header --> MSRNGPTools")
    public MSRNGPPortalPageObjects verifyPageHeader()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(header_MSRNGPTools,30);
        Assert.assertTrue(header_MSRNGPTools.isDisplayed(),"Header -> MSRNGPTools is not available");
        //AllureAttachments.saveWebElement(getWebDriver(),header_MSRNGPTools);
        return this;
    }

    @Step("To verify the Page Footer --> Contact Us")
    public MSRNGPPortalPageObjects verifyFooterContactUs()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(footer_ContactUs,30);
        Assert.assertTrue(footer_ContactUs.isDisplayed(),"Footer -> Contact Us is not available");
        AllureAttachments.saveWebElement(getWebDriver(),footer_ContactUs);
        return this;
    }

    @Step("To verify the Page Footer --> Data Protection Notice")
    public MSRNGPPortalPageObjects verifyFooterDataProtectionNotice()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(footer_DataProtectionNotice,30);
        Assert.assertTrue(footer_DataProtectionNotice.isDisplayed(),"Footer -> Data Protection Notice is not available");
        AllureAttachments.saveWebElement(getWebDriver(),footer_DataProtectionNotice);
        return this;
    }

    @Step("To verify the Page Body --> Asset Onboarding Request System")
    public MSRNGPPortalPageObjects verifyBodyAssetOnboardingRequestSystem()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(body_AssetOnboardingRequestSystem,30);
        Assert.assertTrue(body_AssetOnboardingRequestSystem.isDisplayed(),"Body -> Asset Onboarding Request System is not available");
        AllureAttachments.saveWebElement(getWebDriver(),body_AssetOnboardingDashbaord);
        return this;
    }

    @Step("To verify the Page Body --> File Share Retension Dashboard")
    public MSRNGPPortalPageObjects verifyBodyFileShareRetensionDashboard()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(body_FileShareRetensionDashboard,30);
        Assert.assertTrue(body_FileShareRetensionDashboard.isDisplayed(),"Body -> File Share Retension Dashboard is not available");
        AllureAttachments.saveWebElement(getWebDriver(),body_FileShareRetensionDashboard);
        return this;
    }

    @Step("To verify the Page Body --> DSR Dashboard")
    public MSRNGPPortalPageObjects verifyBodyDSRDashboard()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(body_DSRDashboard,30);
        Assert.assertTrue(body_DSRDashboard.isDisplayed(),"Body -> DSR Dashboard is not available");
        AllureAttachments.saveWebElement(getWebDriver(),body_DSRDashboard);
        return this;
    }

    @Step("To verify the Page Body --> Asset Onboarding Dashboard")
    public MSRNGPPortalPageObjects verifyBodyAssetOnboardingDashbaord()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(body_AssetOnboardingDashbaord,30);
        Assert.assertTrue(body_AssetOnboardingDashbaord.isDisplayed(),"Body -> Asset Onboarding Dashboard is not available");
        AllureAttachments.saveWebElement(getWebDriver(),body_AssetOnboardingDashbaord);
        return this;
    }

    @Step("To verify the Page Body --> File Share DSR Search")
    public MSRNGPPortalPageObjects verifyBodyFileShareDSRSearch()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(body_FileShareDSRSearch,30);
        Assert.assertTrue(body_FileShareDSRSearch.isDisplayed(),"Body -> File Share DSR Search is not available");
        AllureAttachments.saveWebElement(getWebDriver(),body_FileShareDSRSearch);
        return this;
    }

    @Step("To verify the Page Body --> Help")
    public MSRNGPPortalPageObjects verifyBodyHelp()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(body_Help,30);
        Assert.assertTrue(body_Help.isDisplayed(),"Body -> Help is not available");
        AllureAttachments.saveWebElement(getWebDriver(),body_Help);
        return this;
    }

    @Step("To Click on Page Body --> Asset Onboarding Dashboard")
    public MSRNGPPortalPageObjects clickOnAssetOnboardingDashbaord()
    {
        ExplicitWaiting.explicitWaitElementToBeClickable(body_AssetOnboardingDashbaord,10);
        body_AssetOnboardingDashbaord.click();
        return this;
    }

    @Step("To Click on Page Body --> Home")
    public MSRNGPPortalPageObjects clickOnHelp()
    {
        ExplicitWaiting.explicitWaitElementToBeClickable(body_Help,10);
        body_Help.click();
        return this;
    }
}
