package pageObjects.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pageObjects.initializePageObjects.PageFactoryInitializer;
import utils.AllureAttachments;
import utils.ExplicitWaiting;

import java.security.AuthProvider;
import java.util.List;

public class MSRNGPPortalAssetOnboardingDashboardPageObjects extends PageFactoryInitializer
{
    @FindBy(xpath="//a[@href='/home']")
    private WebElement button_Home;

    @FindBy(xpath="//a[@href='/home']/following::a[contains(text(),'Menu')]")
    private WebElement dropdown_Menu;

    @FindAll({@FindBy(xpath="//a[@href='/home']/following::a[contains(text(),'Menu')]/following-sibling::ul//a")})
    private List<WebElement> dropdownMenuItems;

    @FindBy(xpath="//div[@id='two']//div//a[@class='btn btn-link'][contains(text(),'Logout')]")
    private WebElement button_Logout;

    @FindBy(xpath="//h2[contains(text(),'Onboarding Request Dashboard')]")
    private WebElement header_OnboardingRequestDashboard;

    @FindBy(xpath = "//div[contains(text(),'Search by Data Source Type')]")
    private WebElement header_DataSource;

    @FindBy(xpath="//label[contains(text(),'Select Data Source Type')]")
    private WebElement label_SelectDataSource;

    @FindBy(xpath="//input[contains(@placeholder,'Select Data Source Type')]")
    private WebElement select_DataSourceType;

    @FindBy(xpath = "//h2[contains(text(),'Onboarding Request Dashboard')]/following::div[@class='row'][1]")
    private WebElement select_Selected;

    @FindBy(xpath="//div[contains(text(),'SQL Server')]")
    private WebElement select_SQLServer;

    @FindBy(xpath="//div[contains(text(),'Azure SQL')]")
    private WebElement select_AzureSQL;

    @FindBy(xpath="//div[contains(text(),'File Share')]")
    private WebElement select_FileShare;

    @FindBy(xpath = "//span[@class='glyphicon glyphicon-repeat']")
    private WebElement reset_DataSource;

    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement field_Search;

    @FindBy(xpath = "//span[@title='Select Asset Type']")
    private WebElement help_AssetSelectType;

    @FindBy(xpath = "//div[@id='mySidenav']")
    private WebElement help_SideMenu;

    @FindBy(xpath = "//a[@class='closebtn']")
    private WebElement help_SideMenu_Close;

    @Step("To verify the Home Button in the Asset Onboarding Dashboard Page")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyHomeButton()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(button_Home,30);
        Assert.assertTrue(button_Home.isDisplayed(),"Home Button is not available in the Asset Onboarding Dashboard Page");
        AllureAttachments.saveWebElement(getWebDriver(),button_Home);
        return this;
    }

    @Step("To verify the Dropdown after the Home Button in the Asset Onboarding Dashboard Page")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyMenuDropDown()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(dropdown_Menu,30);
        Assert.assertTrue(dropdown_Menu.isDisplayed(),"Menu Dropdown is not available in the Asset Onboarding Dashboard Page");
        AllureAttachments.saveWebElement(getWebDriver(),dropdown_Menu);
        return this;
    }

    @Step("To Verify the mouse hover functionality of the Menu Items ")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyMouseHoverOnMenuItems()  throws Exception
    {
        mousehover(dropdown_Menu);
        System.out.println("Size of the DropdownMenu Items -->"+dropdownMenuItems.size());
        for (WebElement dd:dropdownMenuItems )
        {
            dd.getText();
            mousehover(dd);
            Thread.sleep(1000);
        }
        return this;
    }

    @Step("To Verify the Onboarding Request Dashboard Page Header ")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyPageHeader()  throws Exception
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(header_OnboardingRequestDashboard,30);
        Assert.assertTrue(header_OnboardingRequestDashboard.isDisplayed(),"Page Header Onboarding Request Dashboard is not displayed");
        AllureAttachments.saveWebElement(getWebDriver(),header_OnboardingRequestDashboard);
        return this;
    }

    @Step("To Verify the Search by Data Source Type Header is available or Not")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyDataSourceSearchTypeHeader()  throws Exception
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(header_DataSource,30);
        Assert.assertTrue(header_DataSource.isDisplayed(),"Search by Data Source Type Header is not displayed");
        AllureAttachments.saveWebElement(getWebDriver(),header_DataSource);
        return this;
    }

    @Step("To Verify the Select Data Source Type Label is available or Not")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifySelectDataSourceTypeLabel()  throws Exception
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(label_SelectDataSource,30);
        Assert.assertTrue(label_SelectDataSource.isDisplayed(),"Select Data Source Type Label is not displayed");
        AllureAttachments.saveWebElement(getWebDriver(),label_SelectDataSource);
        return this;
    }

    @Step("To Verify the Asset Select Type Help Button is present or not.")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyAssetSelectTypeHelpButton()  throws Exception
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(help_AssetSelectType,30);
        Assert.assertTrue(help_AssetSelectType.isDisplayed(),"Asset Select Type Help Button is not displayed");
        AllureAttachments.saveWebElement(getWebDriver(),help_AssetSelectType);
        return this;
    }

    @Step("To Click the Asset Select Type Help Button")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects clickOnAssetSelectTypeHelpButton()  throws Exception
    {
        help_AssetSelectType.click();
        return this;
    }

    @Step("To Verify the Asset Select Type Help Button Side Menu and Close it.")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyAssetSelectTypeSideMenu()  throws Exception
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(help_SideMenu,30);
        Assert.assertTrue(help_SideMenu.isDisplayed(),"Asset Select Type Help Button Side Menu is not displayed");
        AllureAttachments.saveWebElement(getWebDriver(),help_SideMenu);
        help_SideMenu_Close.click();
        return this;
    }

    @Step("To verify the Search Field")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyTheSearchField()
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(field_Search,30);
        Assert.assertTrue(field_Search.isDisplayed(),"Search Field is not displayed");
        AllureAttachments.saveWebElement(getWebDriver(),field_Search);
        return this;
    }

    @Step("To verify the Select Dropdown functionality for the Data Source Type")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects verifyDataSourceTypeDropdown()  throws Exception
    {
        ExplicitWaiting.explicitWaitVisibilityOfElement(select_DataSourceType,30);
        select_DataSourceType.click();
        select_SQLServer.click();
        AllureAttachments.saveWebElement(getWebDriver(),select_Selected);
        select_AzureSQL.click();
        AllureAttachments.saveWebElement(getWebDriver(),select_Selected);
        select_FileShare.click();
        AllureAttachments.saveWebElement(getWebDriver(),select_Selected);
        return this;
    }

    @Step("To Logout")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects logout()
    {
        JSclick(button_Logout);
        return this;
    }

    @Step("Click on Home Button")
    public MSRNGPPortalAssetOnboardingDashboardPageObjects clickOnHomeButton()
    {
        button_Home.click();
        return this;
    }
}
