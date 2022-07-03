package testcase;

import org.openqa.selenium.WebDriver;

public class ContactUsPage extends Page{
	
	public ContactUsPage(WebDriver dr) {
		super(dr);
		this.driverWeb = dr;
	}

	public HomePage clickBack() {
		driverWeb.navigate().back();
		return new HomePage(this.driverWeb);
	}

}
