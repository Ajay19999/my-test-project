package com.mytestproject.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mytestproject.pages.BankDetailsPage;
import com.mytestproject.pages.InvestorSignUpPage;
import com.mytestproject.pages.KycPage;
import com.mytestproject.pages.LoginPage;
import com.mytestproject.pages.RegisterPage;
import com.alphamoney.utils.WebDriverFactory;
import com.mytestproject.pages.*;

public class SingleShowTest {
	WebDriver driver;
	LoginPage loginPage;
	RegisterPage registerPage;
	InvestorSignUpPage investorSignUpPage;

	KycPage kycPage;
	PersonalDetailsPage personDetailsPage;
	BankDetailsPage bankDetailsPage;

	@BeforeMethod
	void setUp() {
		driver = WebDriverFactory.getDriver();
		//driver = new WebDriver();
//		driver.manage().window().maximize();
		driver.get("https://stage.alphamoney.in/login");
	}

	@Test
	void investorJourney() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.getOtp("9847594380");
		loginPage.submitOtp();
		registerPage = new RegisterPage(driver);
		registerPage.signupasinvestor();
		investorSignUpPage = new InvestorSignUpPage(driver);
		investorSignUpPage.clickindividual();
		investorSignUpPage.consent();
		investorSignUpPage.termAndCondition();
		investorSignUpPage.continuebox();
		kycPage = new KycPage();
		kycPage.clickdoItNow();
		personDetailsPage = new PersonalDetailsPage(driver);
		personDetailsPage.setPersonalDetailsPage("ajaykumar1+99@alphamoney.in");
	}

}
