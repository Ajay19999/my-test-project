package com.mytestproject.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {

	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By applyForLoanBtn = By.xpath("//button[normalize-space()='Apply for loan']");
	By signUpAsInvestorBtn = By.xpath("//button[normalize-space()='Sign up as investor']");
	By investorTypeDropDown = By.xpath("//select[@name='employment_type']");
	By checkBox1 = By
			.xpath("//div[@class='column_gap css-k008qs']//span[@class='chakra-checkbox__control css-xxkadm']");
	By checkBox2 = By
			.xpath("//div[@class='column_gap css-1k55a1q']//span[@class='chakra-checkbox__control css-xxkadm']");
	By continueBtn = By.xpath("//button[@type='submit']");

	public void signUpAsInvestor(String investorType) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.elementToBeClickable(signUpAsInvestorBtn)).click();
		WebElement investorTypeElement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(investorTypeDropDown));
		Select sel = new Select(investorTypeElement);
		sel.selectByVisibleText(investorType);

		Thread.sleep(3000);

		wait.until(ExpectedConditions.elementToBeClickable(checkBox1)).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkBox2)).click();
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();

		Thread.sleep(2000);
	}

	public void verifyloanBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loanButton = wait.until(ExpectedConditions.visibilityOfElementLocated(applyForLoanBtn));
		loanButton.isDisplayed();
	}
}
