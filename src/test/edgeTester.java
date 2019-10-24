package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeTester {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\myLearning\\seleniumjava\\selenium3x\\edgedriver\\MicrosoftWebDriver.exe");
		
		driver = new EdgeDriver();
		
		driver.get("https://www.google.com");
	}

}
