/**
 * @Author Gladson Antony
 * @Date 04-Oct-2018 
 * @Time 8:32:32 PM
 */
package pageObjects.initializePageObjects;

import org.openqa.selenium.support.PageFactory;

import controllers.BaseMethod;
import pageObjects.pages.*;

public class PageFactoryInitializer extends BaseMethod
{
	
	public MSRNGPPortalSigninPageObjects MSRNGPPortalSignInPage()
	{
		return PageFactory.initElements(getWebDriver(), MSRNGPPortalSigninPageObjects.class);
	}

	public MSRNGPPortalPageObjects MSRNGPPortalPage()
	{
		return PageFactory.initElements(getWebDriver(),MSRNGPPortalPageObjects.class);
	}

	public MSRNGPPortalAssetOnboardingDashboardPageObjects MSRNGPPortalAOBDPage()
	{
		return PageFactory.initElements(getWebDriver(),MSRNGPPortalAssetOnboardingDashboardPageObjects.class);
	}

	public MSRNGPPortalHelpPageObjects MSRNGPHelpPage()
	{
		return PageFactory.initElements(getWebDriver(),MSRNGPPortalHelpPageObjects.class);
	}

}
