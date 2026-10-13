package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;

public class LoginTest extends BaseTest {
	@Test
	public void verifyOrangeHRMLoginPage() {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
		System.out.println("Current URL: " + driver.getCurrentUrl());
		Assert.assertTrue(pageTitle.contains("OrangeHRM"), "OrangeHRM login page title was not displayed.");    
	}
}
