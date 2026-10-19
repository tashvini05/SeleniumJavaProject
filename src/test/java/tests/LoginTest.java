package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.DashboardPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

	@Test
	public void verifySuccessfulLogin() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(ConfigReader.getProperty("username"));
		loginPage.enterPassword(ConfigReader.getProperty("password"));
		loginPage.clickLogin();

		System.out.println("URL after login: " + driver.getCurrentUrl());
		System.out.println("Page title after login: " + driver.getTitle());

		DashboardPage dashboardPage = new DashboardPage(driver);
		Assert.assertTrue(dashboardPage.isDashboardDisplayed(), "Dashboard not displayed after login.");
	}
}