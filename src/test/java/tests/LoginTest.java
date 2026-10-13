package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void verifyTestNGIsWorking() {
		System.out.println("My first TestNG test is running");
		Assert.assertEquals(1, 1);
	}
}
