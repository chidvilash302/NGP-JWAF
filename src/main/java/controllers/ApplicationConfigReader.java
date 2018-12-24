/**
 * @Author Gladson Antony
 * @Date 13 OCT 2018
 */
package controllers;


import lombok.Getter;
import lombok.Setter;
import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource;

@Resource.Classpath("ApplicationConfig.properties")
public class ApplicationConfigReader 
{
	
	public ApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}
	
	@Property(value = "Browser")
	private @Getter @Setter String Browser;

	@Property(value="Url")
	private @Getter @Setter  String WebsiteUrl;

	@Property(value="PhoneNumber")
	private @Getter @Setter  String PhoneNumber;

	@Property(value="EMailID")
	private @Getter @Setter  String EMailID;

	@Property(value="Password")
	private @Getter @Setter  String Password;
	
	@Property(value="MaxPageLoadTime")
	private @Getter @Setter  int MaxPageLoadTime;
	
	@Property(value="ImplicitlyWait")
	private @Getter @Setter  int ImplicitlyWait;
	
	@Property(value="VideoFeature")
	private @Getter @Setter  String VideoFeature;

	public String getBrowser() {
		return Browser;
	}

	public void setBrowser(String browser) {
		Browser = browser;
	}

	public String getWebsiteUrl() {
		return WebsiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		WebsiteUrl = websiteUrl;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getEMailID() {
		return EMailID;
	}

	public void setEMailID(String EMailID) {
		this.EMailID = EMailID;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getMaxPageLoadTime() {
		return MaxPageLoadTime;
	}

	public void setMaxPageLoadTime(int maxPageLoadTime) {
		MaxPageLoadTime = maxPageLoadTime;
	}

	public int getImplicitlyWait() {
		return ImplicitlyWait;
	}

	public void setImplicitlyWait(int implicitlyWait) {
		ImplicitlyWait = implicitlyWait;
	}

	public String getVideoFeature() {
		return VideoFeature;
	}

	public void setVideoFeature(String videoFeature) {
		VideoFeature = videoFeature;
	}
}
