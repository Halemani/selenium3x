package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.genericMethods;

public class genericMethodsDemo {
	private WebDriver driver;
	private String baseURL;
	private genericMethods gm;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver",
				"C:/myLearning/seleniumjava/selenium3x/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/pages/practice";
		gm = new genericMethods(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test(enabled = false)
	public void testerMe() {
		// Single ele
		// WebElement ele = gm.getElement("name", "id");

		// List of ele
		List<WebElement> elements = gm.getElementsLists("//input[@type='text']", "xpath");
		// ele.sendKeys("tester");
		int eleSize = elements.size();
		System.out.println(eleSize);
		for (int i = 0; i < eleSize; i++) {
			elements.get(i).sendKeys("tester" + i);
		}
	}

	@Test(enabled = true)
	public void testVisible() {
		boolean visible = gm.isElementPresent("//input[@type='text']", "xpath");
		System.out.println("Element is visible: " + visible);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
