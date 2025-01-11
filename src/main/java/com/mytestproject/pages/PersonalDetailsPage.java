package com.mytestproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PersonalDetailsPage {

	WebDriver driver;
	private WebDriverWait wait;

	public PersonalDetailsPage	(WebDriver webDriver) {

//		this.driver = webDriver;
//		this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(xpath = "//strong[text()='Get OTP']")
	private WebElement getOTP;

	@FindBy(name = "emailOTP")
	private WebElement emailOTP;

	@FindBy(name = "pan")
	private WebElement enterPAN;

	@FindBy(xpath = "//button[text()= 'Verify']")
	private WebElement verifyPAN;

	@FindBy(xpath = "//span[@class='chakra-switch__thumb css-7roig']")
	private WebElement aadharManuallyCheckbox;

	@FindBy(name = "aadhar_number")
	private WebElement enterAadhar;

	@FindBy(name = "address_houseNumber")
	private WebElement enterHouseNumber;

	@FindBy(name = "address_subdistrict")
	private WebElement enterFullAddress;

	@FindBy(name = "gender")
	private WebElement enterGender;

	@FindBy(name = "address_pincode")
	private WebElement enterPINcode;

	@FindBy(name = "father_name")
	private WebElement enterFathersName;

	@FindBy(xpath = "//input[@id='search_input']")
	private WebElement InvestmentType;

	@FindBy(xpath = "//li[text()='Personal Loan']")
	private WebElement PersonalLoan;

	@FindBy(xpath = "//input[@name='pref_amount']")
	private WebElement amount;

	@FindBy(xpath = "//select[@name='pref_tenure']")
	private WebElement tenure;

	@FindBy(xpath = "//select[@name='pref_risk_appetite']")
	private WebElement riskappetite;

	@FindBy(xpath = "//input[@placeholder='Please Enter Amount']")
	private WebElement Amount;

	@FindBy(xpath = "//button[text()='Verify via Digilocker']")
	private WebElement Verify;

	@FindBy(xpath = "//label[contains(@class, 'next-btn')]")
	private WebElement clickNext;

	// Getter methods
	public WebElement getEmail() {
		return email;
	}

	public WebElement getGetOTP() {
		return getOTP;
	}

	public WebElement getEmailOTP() {
		return emailOTP;
	}

	public WebElement getEnterPAN() {
		return enterPAN;
	}

	public WebElement getVerifyPAN() {
		return verifyPAN;
	}

	public WebElement getAadharManuallyCheckbox() {
		return aadharManuallyCheckbox;
	}

	public WebElement getEnterAadhar() {
		return enterAadhar;
	}

	public WebElement getEnterHouseNumber() {
		return enterHouseNumber;
	}

	public WebElement getEnterFullAddress() {
		return enterFullAddress;
	}

	public WebElement getEnterPINcode() {
		return enterPINcode;
	}

	public WebElement getEnterFathersName() {
		return enterFathersName;
	}

	public WebElement getEnterGender() {
		return enterGender;
	}

	public WebElement getInvestmentType() {
		return InvestmentType;
	}

	public WebElement getAmount() {
		return Amount;
	}

	public WebElement getriskappetite() {
		return riskappetite;
	}

	public WebElement getClickNext() {
		return clickNext;
	}

	public void setPersonalDetailsPage(String newemail) throws InterruptedException {
		email.sendKeys(newemail);
		getOTP.click();
		Thread.sleep(1000);
		emailOTP.sendKeys("444555");
		enterPAN.sendKeys("CPJPK8139L");
		verifyPAN.click();
		aadharManuallyCheckbox.click();
		enterAadhar.sendKeys("333067206887");
		enterFathersName.sendKeys("Rajendra Singh");
		enterHouseNumber.sendKeys("abcd");
		enterFullAddress.sendKeys("xyz");
		Select select = new Select(enterGender);
		select.selectByVisibleText("Male");
		enterPINcode.sendKeys("273008");
		InvestmentType.click();
		Thread.sleep(1000);
		PersonalLoan.click();

		enterGender.click();

		amount.sendKeys("10000");
		Select select1 = new Select(tenure);
		select1.selectByVisibleText("1 months");

		Select select2 = new Select(riskappetite);
		select2.selectByVisibleText("Very Low");
		clickNext.click();
	}
}
