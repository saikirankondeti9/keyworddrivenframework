package testscripts.smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateSearchHotel2 extends BaseTest {
	@Test
	public void validateSearchWithInvalidC() {
		ApplicationKeywords aPK=new ApplicationKeywords();
		//BaseTest bT=new BaseTest();
		aPK.openBrowser();
		aPK.type("usernameTextBox_xpath", "saik");
		aPK.type("passwordTextBox_xpath", "1234");
		aPK.click("loginButton_xpath");
		aPK.validateTitle("OrangeHRM");
		
		
	}

}
