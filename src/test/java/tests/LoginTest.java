package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;

public class LoginTest extends BaseTest {

	@Test
	public void verifySuccessfulLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLogin();

		DashboardPage dashboardPage = new DashboardPage(driver);
		Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard not displayed after login.");
	}
}