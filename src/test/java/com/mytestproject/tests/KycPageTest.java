package com.mytestproject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytestproject.pages.KycPage;
import com.mytestproject.pages.LoginPage;

public class KycPageTest {

	private WebDriver driver;
	KycPage kycPage;

	@Test

	@BeforeMethod
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.alphamoney.in/login");
	}

	@Test
	void testExistingUserLogin() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.getOtp("8900012342");
		lp.submitOtp();

		Assert.assertEquals(driver.getTitle(), "Alpha Money");
	}

	public void kycPageTest() throws InterruptedException {

		kycPage = new KycPage();

		kycPage.clickdoItLater();
		kycPage.clickdoItNow();
		kycPage.clicktapToStartYourKyc();

	}

}
