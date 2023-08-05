package testscripts.smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateSearchHotel extends BaseTest {
	@Test
	public void validatingSearchHotelPage() throws InterruptedException {
		
		ApplicationKeywords apcnKWDS=new ApplicationKeywords();
		apcnKWDS.openBrowser();
		apcnKWDS.type("usernameTextBox_xpath", "Admin");
		apcnKWDS.type("passwordTextBox_xpath", "admin123");
		apcnKWDS.click("loginButton_xpath");
		apcnKWDS.validateTitle("OrangeHRM");
		Thread.sleep(10);
	}

}
