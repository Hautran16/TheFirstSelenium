package testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import common.TestBasic;

public class AutomationPracticeTest {
	
	public static void doScenario1() {
		TestBasic testBasic = new TestBasic();
		testBasic.openWebsite("http://automationpractice.com/index.php");
		System.out.println("Mo website thanh cong");
		testBasic.driver.findElement(By.id("contact-link")).click();
		String expectedTitle = "Contact us - My Store";
		String actualTitle = testBasic.driver.getTitle();
		System.out.println(actualTitle);
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Test case passed");
//		} else
//			System.out.println("Test case failed");
//		
		
		assertEquals(actualTitle, expectedTitle);
		

		testBasic.driver.navigate().back();
		String expectedHomeTitle = "My Store";
		String actualTitleHomeTitle = testBasic.driver.getTitle();
		System.out.println(actualTitleHomeTitle);
		assertEquals(actualTitleHomeTitle, expectedHomeTitle);
		System.out.println("Tc Passed");
		testBasic.driver.navigate().forward();
		testBasic.driver.close();
	}
	
	public static void doScenario1_new() {
		String expectContactUspageTitle = "Contact us - My Store";
		String expectHomepageTitle = "My Store";
		
		TestBasic testBasic = new TestBasic();
		testBasic.openWebsite("http://automationpractice.com/index.php");
		HomePage hompage = new HomePage(testBasic.driver);
		hompage.printMessage("Mo website thanh cong");
		ContactUsPage contactUsPage = hompage.clickContactUs();
		assertEquals(contactUsPage.getPageTitle(), expectContactUspageTitle);
		
		contactUsPage.clickBack();
		assertEquals(hompage.getPageTitle(), expectHomepageTitle);
		contactUsPage.driverWeb.navigate().back();
}

	public static void searchSuccessfully(String searchText) {
		
		TestBasic testBasic = new TestBasic();
		testBasic.openWebsite("https://www.google.com.vn/");
		testBasic.driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		testBasic.driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		
		WebElement searchResultElement = testBasic.driver.findElement(By.id("result-stats"));
		
		// Verìy pass/ fail
		if(searchResultElement.isDisplayed() ) {
			System.out.print("Test Case is Passed");
		} else {
			System.out.print("Test Case is Failed");
		}
	}
	
	// 

}

