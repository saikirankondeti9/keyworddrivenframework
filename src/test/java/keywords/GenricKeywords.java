package keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GenricKeywords extends BaseTest{
	public void openBrowser() {
		String browsername=configProp.getProperty("browser");
		switch(browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitwait"))));
		
	}
	public WebElement getElement(String locatorKey) {
		WebElement element=null;
		element=driver.findElement(getLocator(locatorKey));
		return element;
	}
	public void click(String locatorKey) {
		getElement(locatorKey).click();
	}
	public void type(String locatorKey,String text) {
		getElement(locatorKey).sendKeys(text);
	}
	public void selectOptionFromDropdown(String locatorKey,String option)
	{
		Select se=new Select(getElement(locatorKey));
	 se.selectByVisibleText(option);
	 //this logic also work
    // new Select(getElement(locatorKey)).selectByVisibleText(option);
	}
	public By getLocator(String locatorKey) {
		By by=null;
		if(locatorKey.endsWith("id")) {
			by=By.id(locatorProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("name")) {
			by=By.name(locatorProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("linktext")) {
			by=By.linkText(locatorProp.getProperty(locatorKey));
		}
		else if(locatorKey.endsWith("xpath")) {
			by=By.xpath(locatorProp.getProperty(locatorKey));
		}
		return by;
		
	}

}
