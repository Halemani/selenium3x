package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class desiredCapabilities {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",
				"C:/myLearning/seleniumjava/selenium3x/geckodriver/geckodriver.exe");
		FirefoxOptions ffOptions = new FirefoxOptions();
		ffOptions.setCapability("marionette", true);
//		DesiredCapabilities capability = DesiredCapabilities.firefox();		
//		capability.setBrowserName("firefox");
//		capability.setPlatform(Platform.WINDOWS);
//		driver = new FirefoxDriver(capability);
		
		driver = new FirefoxDriver(ffOptions);
		String url = "http://www.google.com";
		driver.manage().window().maximize();
		driver.get(url);
		driver.close();
	}

}
