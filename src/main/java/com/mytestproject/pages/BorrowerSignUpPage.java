package com.mytestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BorrowerSignUpPage {

	private WebDriver driver;

	public BorrowerSignUpPage(WebDriver driver) {
		this.driver = driver;
	}

	By typeOfEmplyoment = By.xpath("//select[@name='employment_type']");

	By salaried = By.xpath("//select[@name='employment_type']/option[@value='1']\n" + "");

	By termAndCondition = By
			.xpath("//span[contains(@class, 'chakra-checkbox__control') and contains(@class, 'css-xxkadm')]\n" + "");
	By consent = By.xpath(
			"//span[@class='chakra-checkbox__control css-xxkadm' and @aria-hidden='true' and @data-active='']\n" + "");

	By continuebox = By.xpath("//button[text()='Continue']");

	public void clicksalaried() throws InterruptedException {
		driver.findElement(salaried).click();
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
