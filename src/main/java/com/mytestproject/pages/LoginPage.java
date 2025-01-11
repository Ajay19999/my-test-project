package com.mytestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By mobileNum = By.id("mobile_number");
	By getOTPBtn = By.xpath("//button[normalize-space()='Get OTP']");
	By otp = By.id("otp");
	By submit = By.xpath("//button[normalize-space()='Submit']");
	By channelPartnerLink = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div/div[5]/h6/a");

	By resendOTPBtn = By.id("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div/div[3]/div/div/button");
	By cpmobilenumber = By.xpath("//*[@id=\"mobile_number\"]");
	By cpgetOTP = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div/div[2]");
	By cpotp = By.id("otp");
	By cpresendOTPBtn = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div/div[3]/div/button");
	By cpsubmit = By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div[2]/div/div[5]/div/button");

	public void getOtp(String mobNum) throws InterruptedException {
		WebElement element = driver.findElement(mobileNum);
		element.sendKeys("8346438737");
		driver.findElement(getOTPBtn).click();
		Thread.sleep(100);
	}

	public void submitOtp() throws InterruptedException {
		driver.findElement(otp).sendKeys("444555");
		driver.findElement(submit).click();
		Thread.sleep(12000);
	}

	public void resendOtp(String mobNum) throws InterruptedException {
		driver.findElement(mobileNum).sendKeys(mobNum);
		driver.findElement(resendOTPBtn).click();
	}

	public void navigateToChannelPartner() throws InterruptedException {
		driver.findElement(channelPartnerLink).click();

	}

	public void cpmobilenumber(String mobNum) {
		driver.findElement(cpmobilenumber).sendKeys(mobNum);
		driver.findElement(cpgetOTP).click();

	}

	public void cpSubmitOTP() {
		driver.findElement(cpgetOTP).sendKeys("444555");
		driver.findElement(cpsubmit).click();

	}

	public void cpgetOTP(String mobNum) {
		driver.findElement(mobileNum).sendKeys(mobNum);

		driver.findElement(getOTPBtn).click();

	}
}
