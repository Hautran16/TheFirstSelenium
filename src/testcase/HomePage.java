package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends Page{
	
	public HomePage(WebDriver dr) {
		super(dr);
		this.driverWeb = dr;
	}
	
	public void clickOnCreated() {
		System.out.println("Mo website thanh cong");
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	// Method có giá trị trả về
	public ContactUsPage clickContactUs() {
		System.out.println("Print AHHHDSHD");
		try {
			driverWeb.findElement(By.id("contact-link")).click();
			Thread.sleep(3000);
		} catch (Exception e) {

			System.out.println("Loi khong click");
			e.printStackTrace();
		}
		System.out.println(" driver test " + driverWeb);
		return new ContactUsPage(driverWeb);
	}
	
	public void clickForward() {
		driverWeb.navigate().forward();
	}
}
	