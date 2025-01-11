package com.mytestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DocumentUploadPage {

	WebDriver driver;
	private WebDriverWait wait;

	public DocumentUploadPage(WebDriver webDriver) {

//			this.driver = webDriver;
//			this.wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div/button")
	WebElement photo;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/button")
	WebElement UploadPAN;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[3]/div/div[2]/div/button")
	WebElement UploadAadhaarFront;

	@FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div[2]/div/div[1]/div[4]/div/div[2]/div/button")
	WebElement UploadAadhaarBack;

	@FindBy(xpath = "//button[text()='Next']")
	WebElement next;

	public void getDocumentUpload() throws InterruptedException {
		
		//WebElement fileInput = driver.findElement(By.id("file-upload"));

		photo.click();
		

		String filePath = "/Users/santoshkumar/Desktop/Photo.png";
		photo.sendKeys(filePath);

		UploadPAN.click();

		UploadAadhaarFront.click();
		UploadAadhaarBack.click();
		next.click();

	}

}
