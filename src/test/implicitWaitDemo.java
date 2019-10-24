package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.genericMethods;

public class implicitWaitDemo {
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

	@Test(enabled = true)
	public void implicitTester() {
		// Single ele
		WebElement loginButton = gm.getElement("Login", "linktext");
		loginButton.click();
		
		WebElement usernameTextBox = driver.findElement(By.id("user_email"));
		usernameTextBox.sendKeys("quantum");
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
