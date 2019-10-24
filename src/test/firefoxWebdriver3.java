package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxWebdriver3 {
	// C:\myLearning\seleniumjava\selenium3x\geckodriver

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:/myLearning/seleniumjava/selenium3x/geckodriver/geckodriver.exe");
		driver = new FirefoxDriver();
		String baseUrl = "http://www.google.com";

		driver.get(baseUrl);
	}
}
