package com.mytestproject.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytestproject.pages.LoginPage;

import com.mytestproject.pages.*;

public class PersonalDetailsTest {

	private WebDriver driver;
	private WebDriverWait wait;
	private LoginPage loginPage;
	//private DashboardPage dashboardPage;
	private PersonalDetailsPage personalDetailsPage;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.alphamoney.in/login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		loginPage = new LoginPage(driver);
		//dashboardPage = new DashboardPage(driver);
		personalDetailsPage = new PersonalDetailsPage(driver);
	}

	@Test
	public void testLoginAndNavigateToPersonalDetails() throws InterruptedException {

		String mobileNumber = "8900012343";
		loginPage.getOtp(mobileNumber);
		loginPage.submitOtp();

		wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getEmail()));
		personalDetailsPage.getEmail().sendKeys("ajaykumar5@alphamoney.in");
		personalDetailsPage.getGetOTP().click();

		wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getEmailOTP()));
		personalDetailsPage.getEmailOTP().sendKeys("444555");

		personalDetailsPage.getEnterPAN().sendKeys("AFWPC9267I");
		personalDetailsPage.getAadharManuallyCheckbox().click();
		personalDetailsPage.getEnterAadhar().sendKeys("333067206887");

		wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getEnterHouseNumber()));
		personalDetailsPage.getEnterHouseNumber().sendKeys("H N 50, naikachapra");
		personalDetailsPage.getEnterFullAddress().sendKeys("village-naikachhapra, Thana-kasia");
		personalDetailsPage.getEnterPINcode().sendKeys("274206");

		wait.until(ExpectedConditions.visibilityOf(personalDetailsPage.getEnterFathersName()));
		personalDetailsPage.getEnterFathersName().sendKeys("Rajendra singh");

		wait.until(ExpectedConditions.elementToBeClickable(personalDetailsPage.getEnterGender()));
		personalDetailsPage.getEnterGender().click();

		wait.until(ExpectedConditions.elementToBeClickable(personalDetailsPage.getClickNext()));
		personalDetailsPage.getClickNext().click();
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
