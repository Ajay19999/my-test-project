package com.mytestproject.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mytestproject.pages.BorrowerSignUpPage;

public class BorrowerSignUpPageTest {
	private WebDriver driver;
	BorrowerSignUpPage borrowerSignUpPage;

	@Test

	public void borrowerSignUp() throws InterruptedException {

		borrowerSignUpPage = new BorrowerSignUpPage(driver);
		borrowerSignUpPage.clicksalaried();
		borrowerSignUpPage.termAndCondition();
		borrowerSignUpPage.consent();
		borrowerSignUpPage.continuebox();
	}
}
