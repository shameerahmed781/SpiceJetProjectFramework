package com.spicejet.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ValidationBookingFieldsPage {

	public WebDriver driver;
	
	public ValidationBookingFieldsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'][normalize-space()='check-in']")
	WebElement checkinkey;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-18tvxmy r-adyw6z r-1kfrs79']")
	WebElement webcheckin;
	
	@FindBy (xpath = "//div[contains(text(),'flight status')]")
	WebElement flightstatuskey;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-18tvxmy r-adyw6z r-1kfrs79']")
	WebElement flightstatus;
	
	@FindBy (xpath = "//div[contains(text(),'manage booking')]")
	WebElement managebookingkey;
	
	@FindBy (xpath = "//div[@class='css-76zvg2 r-qsz3a2 r-18tvxmy r-adyw6z r-1kfrs79']")
	WebElement managebooking;
	
	public void clickoncheckin() {
		checkinkey.click();
	}
	
	public void validatewebcheckin() {
		String ExpectedText = "Web Check-In";
		Assert.assertEquals(ExpectedText, webcheckin.getText());
	}
	
	public void clickonflightstatus() {
		flightstatuskey.click();
	}
	
	public void validateflightstatus() {
		String ExpectedText = "Flight Status";
		Assert.assertEquals(ExpectedText, flightstatus.getText());
	}
	
	public void clickonmanagebooking() {
		managebookingkey.click();
	}
	
	public void validatemanagebooking() {
		String ExpectedText = "View / Manage Booking";
		Assert.assertEquals(ExpectedText, managebooking.getText());
	}

}
