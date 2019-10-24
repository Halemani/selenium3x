package util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericMethods {
	WebDriver driver;

	// Constructor
	public genericMethods(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		WebElement foundElement = null;
		if (type.equals("id")) {
			foundElement = driver.findElement(By.id(locator));
		} else if (type.equals("xpath")) {
			foundElement = driver.findElement(By.xpath(locator));
		} else if (type.equals("linktext")) {
			foundElement = driver.findElement(By.linkText(locator));
		} else {
			System.out.println("Invalid type: " + type);
		}
		if (foundElement == null) {
			System.out.println("Element not found for locator: " + locator);
		} else {
			System.out.println("Element found for locator: " + locator);
		}
		return foundElement;
	}

	public List<WebElement> getElementsLists(String locator, String type) {
		type = type.toLowerCase();
		List<WebElement> foundElements = null;
		if (type.equals("id")) {
			foundElements = driver.findElements(By.id(locator));
		} else if (type.equals("xpath")) {
			foundElements = driver.findElements(By.xpath(locator));
		} else {
			System.out.println("Invalid type: " + type);
		}
		if (foundElements.isEmpty()) {
			System.out.println("Elements not found for locator: " + locator);
		} else {
			System.out.println("Elements found for locator: " + locator);
		}
		return foundElements;
	}

	public boolean isElementPresent(String locator, String type) {
		if (getElementsLists(locator, type).size() > 0) {
			return true;
		}
		return false;
	}

	public WebElement waitForElementVisible(By locator, int timeout) {
		WebElement ele = null;
		WebDriverWait expWait = new WebDriverWait(driver, timeout);
		ele = expWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return ele;
	}

	public void clickWhenReady(By locator, int timeout) {
		WebElement ele = null;
		WebDriverWait expWait = new WebDriverWait(driver, timeout);
		ele = expWait.until(ExpectedConditions.elementToBeClickable(locator));
		ele.click();
	}
}
