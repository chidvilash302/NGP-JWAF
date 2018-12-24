package pageObjects.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.AllureAttachments;
import utils.ExplicitWaiting;

import java.util.List;

public class MSRNGPPortalHelpPageObjects extends PageFactoryInitializer
{

    @FindBy(xpath="//h2[contains(text(),'FAQ')]")
    private WebElement header_FAQ;

    @FindBy(xpath="//div[@class='ng-scope']//h2[contains(text(),'Help')]")
    private WebElement header_Help;

    @FindBy(xpath="//a[contains(text(),'What is Personal Data?')]")
    private WebElement faq_WhatIsPersonalData;

    @FindBy(xpath="//a[contains(text(),'What is Deleting Personal data?')]")
    private WebElement faq_WhatIsDeletingPersonalData;

    @FindBy(xpath="//a[contains(text(),'What is De-Linked Data ?')]")
    private WebElement faq_WhatIsDeLinkedData;

    @FindBy(xpath="//a[contains(text(),'What is Online data?')]")
    private WebElement faq_WhatIsOnlineData;

    @FindBy(xpath="//a[contains(text(),'What is Offline data?')]")
    private WebElement faq_WhatIsOfflineData;

    @FindBy(xpath="//a[contains(text(),'What is Aggregate Data ?')]")
    private WebElement faq_WhatIsAggregateData;

    @FindBy(xpath="//a[contains(text(),'What is Bulk delete?')]")
    private WebElement faq_WhatIsBulkDelete;

    @FindBy(xpath="//a[contains(text(),'NGP requirements for Delete:')]")
    private WebElement faq_NGPRequirementsForDelete;

    @FindBy(xpath="//a[contains(text(),'Data Subjects')]")
    private WebElement help_DataSubjects;

    @FindBy(xpath="//a[contains(text(),'Privacy Tags Taxonomy')]")
    private WebElement help_PrivacyTagsTaxonomy;

    @FindBy(xpath="//a[contains(text(),'Data Types')]")
    private WebElement help_DataTypes;

    @FindBy(xpath="//a[contains(text(),'Alt Subjects')]")
    private WebElement help_AltSubjects;

    @FindBy(xpath="//a[contains(text(),'Identifiers')]")
    private WebElement help_Identifiers;

    @FindBy(xpath="//a[contains(text(),'MPS(Microsoft Privacy Standards)')]")
    private WebElement help_MPS;

    @FindBy(xpath="//a[contains(text(),'Contact Us')]")
    private WebElement footer_ContactUs;

    @FindBy(xpath="//a[contains(text(),'Data Protection Notice')]")
    private WebElement footer_DataProtectionNotice;

    @FindAll({@FindBy(xpath="//tbody//tr//td//a")})
    private List<WebElement> list_Subjects;

    @FindBy(xpath = "//a[contains(text(),'ngpxonboardhelp@microsoft.com')]")
    private WebElement note_ReachUs;

    @FindBy(xpath = "//div[@id='accordion']")
    private WebElement expanded_FAQMenuItem;

    @Step("To Verify the Footers")
    public MSRNGPPortalHelpPageObjects verifyFooter()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(footer_ContactUs,30);
        Assert.assertTrue(footer_ContactUs.isDisplayed(),"Footer --> Contact Us is not Present in the Help Screen");
        AllureAttachments.saveWebElement(getWebDriver(),footer_ContactUs);
        Assert.assertTrue(footer_DataProtectionNotice.isDisplayed(),"Footer --> Data Protection Notice is not present in the Help Screen");
        AllureAttachments.saveWebElement(getWebDriver(),footer_DataProtectionNotice);
        return this;
    }

    @Step("To Verify the Header --> FAQ")
    public MSRNGPPortalHelpPageObjects verifyHeaderFAQ()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(header_FAQ,60);
        Assert.assertTrue(header_FAQ.isDisplayed(),"Header --> FAQ is not available in the Help Screen");
        AllureAttachments.saveWebElement(getWebDriver(),header_FAQ);
        return this;
    }

    @Step("To Verify the Header --> HELP")
    public MSRNGPPortalHelpPageObjects verifyHeaderHelp()
    {
        Assert.assertTrue(header_Help.isDisplayed(),"Header --> Help is not available in the Help Screen");
        AllureAttachments.saveWebElement(getWebDriver(),header_Help);
        return this;
    }

    @Step("To verify the Note Section in the Help Screen")
    public MSRNGPPortalHelpPageObjects verifyNote()
    {
        Assert.assertTrue(note_ReachUs.isDisplayed(),"Note is not Displayed on the Help Screen");
        AllureAttachments.saveWebElement(getWebDriver(),note_ReachUs);
        return this;
    }

    @Step("To Verify the FAQ Menu Items")
    public MSRNGPPortalHelpPageObjects verifyFAQMenuItems()
    {
        faq_WhatIsPersonalData.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_WhatIsDeletingPersonalData.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_WhatIsDeLinkedData.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_WhatIsOnlineData.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_WhatIsOfflineData.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_WhatIsAggregateData.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_WhatIsBulkDelete.click();
        AllureAttachments.saveWebElement(getWebDriver(),expanded_FAQMenuItem);
        faq_NGPRequirementsForDelete.click();
        AllureAttachments.saveWebElement(getWebDriver(),faq_NGPRequirementsForDelete);
        return this;
    }

    @Step("To Verify the Help Menu Items")
    public MSRNGPPortalHelpPageObjects verifyHelpMenuItems()
    {
        Assert.assertTrue(help_DataSubjects.isDisplayed());
        AllureAttachments.saveWebElement(getWebDriver(),help_DataSubjects);
        Assert.assertTrue(help_PrivacyTagsTaxonomy.isDisplayed());
        AllureAttachments.saveWebElement(getWebDriver(),help_PrivacyTagsTaxonomy);
        Assert.assertTrue(help_DataTypes.isDisplayed());
        AllureAttachments.saveWebElement(getWebDriver(),help_DataTypes);
        Assert.assertTrue(help_AltSubjects.isDisplayed());
        AllureAttachments.saveWebElement(getWebDriver(),help_AltSubjects);
        Assert.assertTrue(help_Identifiers.isDisplayed());
        AllureAttachments.saveWebElement(getWebDriver(),help_Identifiers);
        Assert.assertTrue(help_MPS.isDisplayed());
        AllureAttachments.saveWebElement(getWebDriver(),help_MPS);
        return this;
    }


}
