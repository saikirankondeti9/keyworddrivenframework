package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	public static WebDriver driver;
	public static Properties configProp;
	public static Properties locatorProp;
	public FileInputStream fIS;
	public FileInputStream fIS2;
		@BeforeTest
	public void fileSetUp() throws IOException {
		fIS = new FileInputStream("src\\test\\resources\\properties\\configure.properties");
		configProp=new Properties();
		configProp.load(fIS);
		fIS2 = new FileInputStream("src\\test\\resources\\properties\\locators.properties");
		locatorProp = new Properties();
		locatorProp.load(fIS2);
	}
		@AfterMethod
		public void tearDown() throws InterruptedException {
			Thread.sleep(2000);
			driver.quit();
		}
		

}
