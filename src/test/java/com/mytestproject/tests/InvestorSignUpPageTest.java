package com.mytestproject.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mytestproject.pages.InvestorSignUpPage;

public class InvestorSignUpPageTest {
	private WebDriver driver;
	InvestorSignUpPage investorSignUpPage;

	@Test
	public void investorSignUp() throws InterruptedException {
		investorSignUpPage = new InvestorSignUpPage(driver);
		investorSignUpPage.clickindividual();
		investorSignUpPage.termAndCondition();
		investorSignUpPage.consent();
		investorSignUpPage.continuebox();

	}
}
