package com.mytestproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BankDetailsPage {

	WebDriver driver;
	private WebDriverWait wait;

	public BankDetailsPage(WebDriver webDriver) {

//		this.driver = webDriver;
//		this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(name = "ifsc_code")
	WebElement enterBankIFSC;

	@FindBy(name = "PINCODE")
	WebElement enterPincode;

	@FindBy(name = "Bank Name")
	WebElement enterBankName;

	@FindBy(name = "Bank Branch")
	WebElement enterBankBranch;

	@FindBy(name = "Bank City")
	WebElement enterBankCity;

	@FindBy(name = "Account Number")
	WebElement enterAccountNumber;

	@FindBy(name = "Verify")
	WebElement clickVerify;

	@FindBy(xpath = "//label[contains(@class, 'next-btn')]")
	WebElement clickNext;

	public void setBankDetails() throws InterruptedException {

		enterBankIFSC.sendKeys("ICIC0002328");
		Thread.sleep(2000);
		enterAccountNumber.sendKeys("232801505105");
		Thread.sleep(2000);
		clickVerify.click();
		Thread.sleep(2000);
		clickNext.click();

	}

	public boolean verifyBankName() {
		boolean bankName = enterBankName.isDisplayed();
		return bankName;

	}
}