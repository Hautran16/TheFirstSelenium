package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	// Instance Variable = Biến toàn cục
	public WebDriver driver;
	
	public void openWebsite(String url) {
		System.setProperty("webdriver.chrome.driver", "/Users/mr.tuong/Dev/Automationtest/02Tool/chromedriver");
		driver = new ChromeDriver();	
		//open page: Truyen url
		driver.get(url);
		//driver.manage().window().maximize();
		
	}
	
	public void closeBrower() {
		driver.quit(); // Đóng toàn bộ cửa sổ
		driver.close(); // Đóng của sổ hiện tại
	}
	
	public static By getLocatorString(String locatorType, String locatorValue) {
		
		By result = null;
		
		switch (locatorType) {
		case "id":
			result = By.id(locatorValue);	
			break;
		case "name":
			result = By.name(locatorValue);	
			break;
		case "linkText":
			result = By.linkText(locatorValue);	
			break;
		case "cssSelector":
			result = By.cssSelector(locatorValue);	
			break;
		case "partialLinkText":
			result = By.partialLinkText(locatorValue);	
			break;
		case "tagName":
			result = By.tagName(locatorValue);	
			break;
		case "xpath":
			result = By.xpath(locatorValue);	
			break;

		default:
			result = null;
			break;
		}
		
		return result ;
	}
}
