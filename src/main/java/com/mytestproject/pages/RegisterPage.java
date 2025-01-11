package com.mytestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	private WebDriver driver;

	public RegisterPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	By applyforloan = By.xpath("//button[text()='Apply for loan']");
	By signupasinvestor = By.xpath("//button[text()='Sign up as investor']");

	public void applyForLoan() throws InterruptedException {
		driver.findElement(applyforloan).click();
	}

	public void signupasinvestor() throws InterruptedException {
		driver.findElement(signupasinvestor).click();
	}

}
