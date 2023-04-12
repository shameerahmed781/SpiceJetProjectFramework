package com.spicejet.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchforflightsRoundTripPage {

	public WebDriver driver;
	
	public SearchforflightsRoundTripPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//div[contains(text(),'round trip')]")
	WebElement roundtripbutton;
	
	@FindBy (xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")
	WebElement boardingFrom;
	
	@FindBy (xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[2]")
	WebElement destination;
	
	@FindBy (xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[1]")
	WebElement departuredate;
	
	@FindBy (xpath="(//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar'])[2]")
	WebElement returndatekey;
	
	@FindBy (xpath = "(//div[contains(text(),'31')])[2]")
	WebElement returndate;
	
	@FindBy (xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement SearchFlightbtn;
	
	public void RoundTripButton() {
		roundtripbutton.click();
	}
	
	public void clickBoardingFrom() {
		boardingFrom.click();
	}
	
	public void onBoardingFrom(String Boarding) {
		boardingFrom.sendKeys(Boarding);
	}
	
	public void clickDestinationTo() {
		destination.click();
	}
	
	public void destination(String Destination) throws Exception {
		Thread.sleep(3000);
		destination.sendKeys(Destination);
	}
	
	public void DepartDate() {
		departuredate.click();
	}
	
	public void ReturnDate() {
		returndatekey.click();
	}
	
	public void clickonReturnDate() {
		returndate.click();
	}
	
	public void SearchFlight() {
		SearchFlightbtn.click();
	}

}
