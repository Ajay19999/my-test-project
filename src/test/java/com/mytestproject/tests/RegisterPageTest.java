package com.mytestproject.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mytestproject.pages.RegisterPage;

public class RegisterPageTest {
	private WebDriver driver;
	RegisterPage registerPage;

	@Test

	public void clickOnApplyForLoan() throws InterruptedException {

		registerPage = new RegisterPage(driver);
		registerPage.applyForLoan();

	}
}
