/**
 * @Author Gladson Antony
 * @Date 12-Oct-2018
 * @Time 8:34:32 PM
 */
package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import pageObjects.initializePageObjects.PageFactoryInitializer;


public class Test1 extends PageFactoryInitializer
{
	@Description("To verify the working of MSR NGP Portal")
	@Feature("MSR NGP Portal Verification")
	@Test
	public void testLogin() throws Exception
	{
		MSRNGPPortalSignInPage()
				.enterUserEmailID(EmailID)
				.clickOnNextButton()
				.clickOnSignInWithUserNameAndPassword()
				.enterPassword(Password)
				.clickOnSignIn();

		Thread.sleep(180000);

		MSRNGPPortalPage()
				.verifyUsername()
				.verifyPageHeader()
				.verifyFooterContactUs()
				.verifyFooterDataProtectionNotice()
				.verifyBodyAssetOnboardingRequestSystem()
				.verifyBodyFileShareRetensionDashboard()
				.verifyBodyDSRDashboard()
				.verifyBodyAssetOnboardingDashbaord()
				.verifyBodyFileShareDSRSearch()
				.verifyBodyHelp()
				.clickOnAssetOnboardingDashbaord();

		MSRNGPPortalAOBDPage()
				.verifyHomeButton()
				.verifyMenuDropDown()
				.verifyMouseHoverOnMenuItems()
				.verifyPageHeader()
				.verifyDataSourceSearchTypeHeader()
				.verifySelectDataSourceTypeLabel()
				.verifyDataSourceSearchTypeHeader()
				.verifyAssetSelectTypeHelpButton()
				.clickOnAssetSelectTypeHelpButton()
				.verifyAssetSelectTypeSideMenu()
				.verifyTheSearchField()
				.verifyDataSourceTypeDropdown()
				.clickOnHomeButton();

		MSRNGPPortalPage()
				.clickOnHelp();

		MSRNGPHelpPage()
				.verifyHeaderFAQ()
				.verifyHeaderHelp()
				.verifyNote()
				.verifyFAQMenuItems()
				.verifyHelpMenuItems()
				.verifyFooter();
	}
}
