package com.mytestproject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mytestproject.pages.LandingPage;
import com.mytestproject.pages.LoginPage;

public class InvestorLoginTest {
	WebDriver driver;

	@BeforeClass
	void setUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://newdev.alphamoney.in/login");
		Thread.sleep(4000);
	}

	@AfterClass
	void tearDown() throws InterruptedException {
		driver.quit();
	}

	@Test
	void test01() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		LandingPage landp = new LandingPage(driver);

		lp.getOtp("7788449966");
		lp.submitOtp();

		Assert.assertEquals(driver.getTitle(), "Alpha Money");

		landp.signUpAsInvestor("Individual");

		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Alpha Money");

	}

	private InvestorLoginTest() {
		// TODO Auto-generated method stub

	}

}
