package com.mytestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvestorSignUpPage {

	private WebDriver driver;

	public InvestorSignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	By typeOfInvestor = By.xpath("//select[@name='employment_type']");

	By individual = By.xpath("//select[@name='employment_type']/option[@value='3']");

	By termAndCondition = By
			.xpath("//span[@class='chakra-checkbox__control css-xxkadm' and @aria-hidden='true' and @data-active='']");

	By consent = By
			.xpath("<span class=\"chakra-checkbox__control css-xxkadm\" aria-hidden=\"true\" data-active=\"\"></span>");

	By continuebox = By.xpath("//button[text()='Continue']");

	public void clickindividual() throws InterruptedException {
		driver.findElement(individual).click();
	}

	public void termAndCondition() throws InterruptedException {
		driver.findElement(termAndCondition).click();
	}

	public void consent() throws InterruptedException {
		driver.findElement(consent).click();
	}

	public void continuebox() throws InterruptedException {
		driver.findElement(continuebox).click();
	}

}
