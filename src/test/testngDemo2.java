package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngDemo2 {

	WebDriver driver;

	SoftAssert softAsserts = new SoftAssert();

	@Test(groups = { "group1" })
	@Parameters({ "browser" })
	public void testMethod1(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:/myLearning/seleniumjava/selenium3x/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/myLearning/seleniumjava/selenium3x/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		String baseUrl = "https://letskodeit.teachable.com/pages/practice";
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println("testmethod1");
		Assert.assertEquals("false", "fualse");
		System.out.println("end testmethod1");
	}

}
