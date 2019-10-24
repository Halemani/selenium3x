package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.genericMethods;

public class explicitWaitDemo {
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
		driver.get(baseURL);
	}

	@Test(enabled = false)
	public void explicitTester() {
		// Single ele
		WebElement loginButton = gm.getElement("Login", "linktext");
		loginButton.click();

		WebElement usernameTextBox = gm.waitForElementVisible(By.id("user_email"), 10);
		usernameTextBox.sendKeys("quantum");
	}

	@Test(enabled = true)
	public void explicitTester2() {
		// Single ele
		WebElement loginButton = gm.getElement("Login", "linktext");
		loginButton.click();

		gm.clickWhenReady(By.name("commit"), 10);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
