package testcase;

import org.openqa.selenium.WebDriver;

import common.TestBasic;

public class Page {
	public WebDriver driverWeb;
	
	public Page(WebDriver dr) {
		this.driverWeb = dr;
	}

	public String getPageTitle() {
		return driverWeb.getTitle();
	}
	
}

