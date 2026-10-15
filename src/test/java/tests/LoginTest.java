package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifySuccessfulLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL after login: " + currentUrl);

		// Verify successful login by checking the presence of a specific element on the dashboard
		Assert.assertTrue(currentUrl.contains("/dashboard"), "Dashboard URL not Displayed after login.");
}
}