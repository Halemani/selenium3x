package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeTester {
	
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\myLearning\\seleniumjava\\selenium3x\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
	}

}
