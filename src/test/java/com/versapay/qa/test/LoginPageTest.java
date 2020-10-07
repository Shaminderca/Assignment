package com.versapay.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.versapay.qa.base.TestBase;
import com.versapay.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage lp;

	@BeforeMethod
	void setUp() {
		initialisation();
		lp = new LoginPage();
	}

	@Test
	void loginMethodTest() {
		String heading = lp.loginMethod();
		Assert.assertEquals(heading, prop.getProperty("gmailHeading"));
	}

	@AfterMethod
	void tearDown() {
		driver.quit();
	}
}
