package testscripts.smoke;

import org.testng.annotations.Test;

import base.BaseTest;
import keywords.ApplicationKeywords;

public class ValidateSearchHotel3 extends BaseTest {
	@Test
	public void validateSearchWithInvalidCred() {
		ApplicationKeywords aPK=new ApplicationKeywords();
		//BaseTest bT=new BaseTest();
		aPK.openBrowser();
		aPK.type("usernameTextBox_xpath", "saikiran");
		aPK.type("passwordTextBox_xpath", "123456");
		aPK.click("loginButton_xpath");
		aPK.validateTitle("OrangeHRM");
		
		
	}

}
