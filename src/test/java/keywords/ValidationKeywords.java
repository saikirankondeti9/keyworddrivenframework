package keywords;

import org.testng.Assert;

public class ValidationKeywords extends GenricKeywords {
	public void validateTitle(String expTitle) {
		Assert.assertEquals(driver.getTitle(), expTitle);
	}

}
