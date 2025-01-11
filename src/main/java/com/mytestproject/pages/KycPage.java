package com.mytestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KycPage {

	private WebDriver driver;

	By doItLater = By.xpath(
			"<button type=\"submit\" class=\"chakra-button btn_theme_transparent css-taj3dd\">DO IT LATER</button>");
	By doItNow = By.xpath("<button type=\"submit\" class=\"chakra-button btn_theme css-taj3dd\">START NOW</button>");
	By tapToStartYourKyc = By.xpath("<a href=\"/borrower-complete-kyc\">Tap to start your KYC</a>");

	public void clickdoItLater() throws InterruptedException {
		driver.findElement(doItLater).click();
	}

	public void clickdoItNow() throws InterruptedException {
		driver.findElement(doItNow).click();
	}

	public void clicktapToStartYourKyc() throws InterruptedException {
		driver.findElement(tapToStartYourKyc).click();
	}

}
